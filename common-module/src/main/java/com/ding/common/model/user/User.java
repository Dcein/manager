package com.ding.common.model.user;

import com.ding.common.model.BaseModel;
import lombok.Data;

/**
 * @program: manager
 * @description: 用户模型
 * @author: DingCong
 * @create: 2018-11-29 14:07
 **/
@Data
public class User extends BaseModel{

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String userNickName;

    /**
     * 用户身份标识
     */
    private Character userFlag;

    /**
     * 用户性别
     */
    private String userSex;

    /**
     * 用户喜好
     */
    private String userHobby;


}
