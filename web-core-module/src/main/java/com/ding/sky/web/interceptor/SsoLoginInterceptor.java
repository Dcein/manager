package com.ding.sky.web.interceptor;

import com.ding.sky.system.constant.BusinessConstant;
import com.ding.sky.web.dto.request.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 单点登录拦截器
 * @Author: cc.ding
 * @Date: created in 2020/4/10 18:18
 */
@Slf4j
@Configuration
public class SsoLoginInterceptor extends HandlerInterceptorAdapter {

    /**
     * 登陆具体实现拦截器
     * return turn放行,执行controller,return false,完成拦截,响应结果
     * Interceptor -> preHandler -> return true -> controller -> postHandler -> afterCompletion
     * @param request
     * @param response
     * @param handler
     * @return
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        //step1.从会话中获取用户登陆信息
        log.info("执行登陆拦截器,当前拦截请求:" + request.getRequestURI());
        UserDto userLoginSessionVo = (UserDto) request.getSession().getAttribute(BusinessConstant.USER_LOGIN_SESSION_INFO);

        //step2.用户不存在,进行拦截
        if (null != userLoginSessionVo && null != userLoginSessionVo.getUserId()) {
            log.info("该用户已登录,放行访问资源");
            return true;
        }

        //step3.进行页面跳转
        String returnUrl = "/login";
        log.info("该用户未登陆,拦截跳转登陆地址:" + returnUrl);
        response.sendRedirect(returnUrl);
        return false;
    }



}
