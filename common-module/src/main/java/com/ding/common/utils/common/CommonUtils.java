package com.ding.common.utils.common;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: manager
 * @description: 公共工具包
 * @author: DingCong
 * @create: 2018-12-06 10:28
 **/
public class CommonUtils {

    /**
     * <p>
     * 判断是否为移动端设备,通过判断设备标识来判断设备类型,对移动端和PC端实现不同的操作时可使用此方法
     * android : 所有android设备
     * mac os  : iphone ipad
     * windows phone:Nokia等windows系统的手机
     * </p>
     * @param request
     * @return
     */
    public static boolean isMobileDevice(HttpServletRequest request) {
        String requestHeader = request.getHeader("user-agent");
        String[] deviceArray = new String[]{"android", "mac os", "windows phone"};
        if (requestHeader == null)
            return false;
        requestHeader = requestHeader.toLowerCase();
        for (int i = 0; i < deviceArray.length; i++) {
            if (requestHeader.indexOf(deviceArray[i]) > 0) {
                return true;
            }
        }
        return false;
    }
}
