package com.ding.common.api;

import com.ding.common.constants.BaseResponse;
import com.ding.common.model.user.User;

/**
 * 用户相关接口
 */
public interface IUserService {

    /**
     * 根据用户名称查询用户
     * @param username
     * @return
     */
    BaseResponse<User> getUserByUsername(String username);



}
