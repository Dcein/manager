package com.ding.resource.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: manager
 * @description: 资源核心工具类
 * @author: DingCong
 * @create: 2018-11-29 14:39
 **/
public class WebMvcUtil {

    /**
     * 保存用户登陆信息至session会话
     * @param request
     * @param
     */
    public static void setUserInfoToSession(HttpServletRequest request){
        request.getSession().setAttribute("","");
        request.getSession().setMaxInactiveInterval(600);
    }
}
