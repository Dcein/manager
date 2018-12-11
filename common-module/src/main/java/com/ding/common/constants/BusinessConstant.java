package com.ding.common.constants;

/**
 * @program: manager
 * @description: 资源模块业务常量类
 * @author: DingCong
 * @create: 2018-11-29 14:58
 **/
public class BusinessConstant {

    /**
     * 用户登陆会话信息
     */
    public static final String USER_LOGIN_SESSION_INFO = "userLoginSessionInfo";

    /**
     * 空值属性
     */
    public static final String EMPTY = "";

    /**
     * 用户状态有效
     */
    public static final String USER_FLAG_VAILD = "1";

    /**
     * 用户状态无效
     */
    public static final String USER_FLAG_INVAILD = "0";

    /**
     * 拦截器排除拦截路径
     */
    public static final String[] INTERCEPTOR_EXCLUDE_PATTEN = {"/ajaxLogin","/error","/login","/css/**","/js/**","/resource/**","/ajax/**","/fonts/**","/img/**","/sounds/**"};

    /**
     * 拦截所有路径
     */
    public static final String INTERCEPTOR_ALL_PATTERN = "/**";

    /**
     * 用户接口服务常量
     */
    public static final String SYS_USER_MAPPER = "sysUserMapper";
}
