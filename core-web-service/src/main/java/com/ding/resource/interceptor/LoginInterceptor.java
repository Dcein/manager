package com.ding.resource.interceptor;

import com.ding.common.constants.BusinessConstant;
import com.ding.common.dao.SysUserMapper;
import com.ding.common.spring.SpringContext;
import com.ding.common.vo.user.UserLoginSessionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: manager
 * @description: 登陆拦截器
 * @author: DingCong
 * @create: 2018-11-29 13:18
 **/
@Slf4j
@Configuration
public class LoginInterceptor extends HandlerInterceptorAdapter {

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

        //step1.获取用户登陆信息
        log.info("执行登陆拦截器,当前拦截请求:" + request.getRequestURI());
        UserLoginSessionVo userLoginSessionVo = (UserLoginSessionVo) request.getSession().getAttribute(BusinessConstant.USER_LOGIN_SESSION_INFO);

        //step2.用户不存在,进行拦截
        if (null != userLoginSessionVo && null != userLoginSessionVo.getUserId()) {
            log.info("该用户已登录,放行访问资源");
            return true;
        }

        //step3.进行页面跳转
        String returnUrl = "/";
        log.info("该用户未登陆,拦截跳转登陆地址:" + returnUrl);
        response.sendRedirect(returnUrl);
        return false;
    }


}
