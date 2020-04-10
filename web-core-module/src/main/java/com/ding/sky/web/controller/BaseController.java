package com.ding.sky.web.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 基类控制器
 * @Author: cc.ding
 * @Date: created in 2020/4/10 18:02
 */
public class BaseController {

    /**
     * 获取HttpServletRequest
     * @return request
     */
    public HttpServletRequest getHttpServletRequest(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }


}
