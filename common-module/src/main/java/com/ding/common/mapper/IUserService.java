package com.ding.common.mapper;

import com.ding.common.constants.BaseResponse;
import com.ding.common.model.user.User;

/**
 * 用户相关接口
 */
public interface IUserService {

    /**
     * 根据用户名和密码登录,返回等哭用户信息
     * @param username
     * @param password
     * @return
     */
    BaseResponse<User> login(String username ,String password);

    /**
     * 根据用户名称查询用户
     * @param username
     * @return
     */
    BaseResponse<User> getUserByUsername(String username);



}
