package com.ding.sky.web.dto.request;

import com.ding.sky.web.dto.BaseDto;
import lombok.Data;

/**
 * @Description: 登陆用户类
 * @Author: cc.ding
 * @Date: created in 2020/4/10 18:21
 */
@Data
public class UserDto extends BaseDto {

    //用户id
    private String userId;

    //登陆用户名
    private String loginName;

    //登陆密码
    private String password;
}
