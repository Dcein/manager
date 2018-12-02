package com.ding.resource.controller.base;

import com.ding.common.vo.user.UserLoginSessionVo;
import com.ding.resource.utils.ResourceUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: manager
 * @description: web层通用基础控制器
 * @author: DingCong
 * @create: 2018-11-29 13:35
 **/
public class BaseController {

    /**
     * 设置用户的信息至session
     * @param request
     * @param userLoginSessionVo
     */
    public void setUserLoginInfoToSession(HttpServletRequest request, UserLoginSessionVo userLoginSessionVo){
        ResourceUtil.setUserInfoToSession(request,userLoginSessionVo);
    }

    /**
     * 获取HttpServletRequest
     * @return
     */
    public HttpServletRequest getHttpServletRequest(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;

    }
}
