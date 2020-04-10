package com.ding.common.vo.user;

import lombok.Data;

/**
 * @program: manager
 * @description: 用户登陆信息vo
 * @author: DingCong
 * @create: 2018-11-29 14:26
 **/
@Data
public class UserLoginSessionVo {

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户登录密码
     */
    private String password;
}
