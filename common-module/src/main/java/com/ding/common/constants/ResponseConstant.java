package com.ding.common.constants;

/**
 * @program: manager
 * @description: 响应常量
 * @author: DingCong
 * @create: 2018-11-29 14:54
 **/
public enum  ResponseConstant {

    SUCCESS("000000","SUCCESS"),

    USER_LOGIN_ERROR("100000","用户名或密码错误");

    private String code;

    private String msg;

    private ResponseConstant(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



}
