package com.ding.common.constants;

import lombok.Data;

/**
 * @program: manager
 * @description: 基础响应
 * @author: DingCong
 * @create: 2018-11-29 20:27
 **/
@Data
public class BaseResponse<T> {

    private String responseCode ="000000";

    private String responseMsg = "SUCCESS!";

    private T data;

    public BaseResponse(){

    }

    public BaseResponse(T data){
        this.data = data;
    }

    public BaseResponse(String responseCode, String responseMsg){
        this.responseCode =responseCode;
        this.responseMsg = responseMsg;
    }

    public BaseResponse(String responseCode, String responseMsg, T data){
        this.responseCode =responseCode;
        this.responseMsg = responseMsg;
        this.data =data;
    }

}
