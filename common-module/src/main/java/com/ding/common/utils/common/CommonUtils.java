package com.ding.common.utils.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: manager
 * @description: 公共工具包
 * @author: DingCong
 * @create: 2018-12-06 10:28
 **/
public class CommonUtils {

    protected static Logger log = LoggerFactory.getLogger(CommonUtils.class);

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
        if (requestHeader == null){
            return false;
        }
        requestHeader = requestHeader.toLowerCase();
        for (int i = 0; i < deviceArray.length; i++) {
            if (requestHeader.indexOf(deviceArray[i]) > 0) {
                log.info("本设备为移动端设备");
                return true;
            }
        }
        log.info("本设备为PC端设备");
        return false;
    }

    /**
     * 判断一个对象为空
     * @param obj
     * @return
     */
    public static boolean isNull(Object obj){
        return obj == null;
    }

    /**
     * 判断一个对象不为空
     * @param obj
     * @return
     */
    public static boolean isNotNull(Object obj){
        return !isNull(obj);
    }
}
