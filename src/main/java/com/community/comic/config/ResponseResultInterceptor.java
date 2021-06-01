package com.community.comic.config;

import com.community.comic.utils.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author：hanzhigang
 * @Date : 2021/5/30 5:04 PM
 */
@Component
// 在yml中配置
@ConditionalOnProperty(name = {"response-result.enabled"}, havingValue = "true", matchIfMissing = true)
public class ResponseResultInterceptor implements HandlerInterceptor {

    private static final String RESPONSE_RESULT = "RESPONSE_RESULT";
    private static final String REQUEST_ID = "request_Id";
    private static final String REQUEST_TIME = "REQUEST_TIME";
    private static final Logger LOGGER = LoggerFactory.getLogger(ResponseResultInterceptor.class);


    /**
     * 业务处理之前进行预处理，根据访问的class或method是否被标记，来定义的final内容放入HttpServletRequst中
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
//            将handler转换为HandlerMethod
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
//            获取访问的class
            final Class<?> clazz = handlerMethod.getBeanType();
//            获得method方法
            final Method method = handlerMethod.getMethod();
            if (method.isAnnotationPresent(ResponseData.class)) {
//                进行标记
                request.setAttribute(RESPONSE_RESULT, method.getDeclaredAnnotation(ResponseData.class));
                request.setAttribute(REQUEST_TIME, System.currentTimeMillis());

            } else if (clazz.isAnnotationPresent(ResponseData.class)) {
//                进行标记
                request.setAttribute(RESPONSE_RESULT, clazz.getDeclaredAnnotation(ResponseData.class));
                request.setAttribute(REQUEST_TIME, System.currentTimeMillis());
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if (handler instanceof HandlerMethod) {
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            final Class<?> clazz = handlerMethod.getBeanType();
            final Method method = handlerMethod.getMethod();
            if (method.isAnnotationPresent(ResponseData.class) || clazz.isAnnotationPresent(ResponseData.class)) {
                final String requestId = response.getHeader(REQUEST_ID);
                final int statusCode = response.getStatus();
                final long requestTime = (long) request.getAttribute(REQUEST_TIME);
                if (statusCode != HttpStatus.OK.value()) {
                    LOGGER.error("RequestID: {}, Method: {}, Response Time: {}ms. HttpStatus: {}", requestId, method.getName(), System.currentTimeMillis() - requestTime, statusCode);
                } else {
                    LOGGER.info("RequestID: {}, Method: {}, Response Time: {}ms.", requestId, method.getName(), System.currentTimeMillis() - requestTime);
                }
            }
        }
    }
}
