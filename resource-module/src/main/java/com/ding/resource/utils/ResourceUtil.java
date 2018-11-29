package com.ding.resource.utils;

import com.ding.common.constants.ResourceConstant;
import com.ding.common.vo.user.UserLoginSessionVo;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: manager
 * @description: 资源核心工具类
 * @author: DingCong
 * @create: 2018-11-29 14:39
 **/
public class ResourceUtil {

    /**
     * 保存用户登陆信息至session会话
     * @param request
     * @param userLoginSessionVo
     */
    public static void setUserInfoToSession(HttpServletRequest request,UserLoginSessionVo userLoginSessionVo){
        request.getSession().setAttribute(ResourceConstant.USER_LOGIN_SESSION_INFO,userLoginSessionVo);
    }
}
