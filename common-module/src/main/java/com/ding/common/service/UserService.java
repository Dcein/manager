package com.ding.common.service;

import com.ding.common.mapper.IUserService;
import com.ding.common.constants.BaseResponse;
import com.ding.common.model.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: manager
 * @description: 用户登陆服务
 * @author: DingCong
 * @create: 2018-11-29 20:04
 **/
@Slf4j
@Service
public class UserService implements IUserService{

    /**
     * 根据用户名和密码进行登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public BaseResponse<User> login(String username, String password) {
        return null;
    }

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    @Override
    public BaseResponse<User> getUserByUsername(String username) {
        return null;
    }
}
