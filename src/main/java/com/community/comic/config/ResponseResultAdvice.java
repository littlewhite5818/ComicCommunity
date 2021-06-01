package com.community.comic.config;

import com.alibaba.fastjson.JSON;
import com.community.comic.utils.RetResponse;
import com.community.comic.utils.RetResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author：hanzhigang
 * @Date : 2021/5/30 5:50 PM
 */
@ControllerAdvice
// 当ResponseResultInterceptor被spring加载进factory中的时候，才进行
@ConditionalOnBean({ResponseResultInterceptor.class})
public class ResponseResultAdvice implements ResponseBodyAdvice<Object> {

    private static final String RESPONSE_RESULT = "RESPONSE_RESULT";
    private static final String REQUEST_ID = "request_Id";
    private static final Logger LOGGER = LoggerFactory.getLogger(ResponseResultAdvice.class);

    /**
     * 判断HttpServletRequest中是有否注解对象
     *
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
//        生成HttpServletRequest
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        final HttpServletRequest request = requestAttributes.getRequest();
//        取出HttpServletRequest中的注解
        return request.getAttribute(RESPONSE_RESULT) != null;
    }

    /**
     * 在数据返回之前更改格式
     * TODO 这里不对，不能运行
     */
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (!(o instanceof RetResult)){
            RetResult result = RetResponse.makeOKRsp(o);
            if(methodParameter.getGenericParameterType().equals(String.class)){
                return JSON.toJSONString(result);
            }
            return result;
        }
        return o;
    }
}
