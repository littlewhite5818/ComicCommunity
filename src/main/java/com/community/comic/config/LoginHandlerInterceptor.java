package com.community.comic.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author：hanzhigang
 * @Date : 2021/5/29 8:36 PM
 * 登陆拦截器
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        登陆成功后，应有用户的session
        Object userName = request.getSession().getAttribute("userName");
        if(userName == null){
            request.setAttribute("msg","没有权限，请先登陆！！");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return true;
        }
        return true;
    }
}
