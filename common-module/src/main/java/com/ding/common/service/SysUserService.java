package com.ding.common.service;

import com.ding.common.constants.BaseResponse;
import com.ding.common.constants.BusinessConstant;
import com.ding.common.dao.SysUserMapper;
import com.ding.common.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: manager
 * @description: 用户登陆服务
 * @author: DingCong
 * @create: 2018-11-29 20:04
 **/
@Slf4j
@Service
public class SysUserService  {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 用户登录服务层
     * @param account 用户账号
     * @param password 用户密码
     * @return
     */
    public BaseResponse<SysUser> login(String account, String password){

        //step1.根据用户名查询用户
        BaseResponse res = new BaseResponse();
        SysUser sysUser = new SysUser();
        sysUser.setAccount(account);
        sysUser = sysUserMapper.selectOne(sysUser);

        //step2.用户若不存在,返回用户不存在异常信息
        if (null == sysUser.getId()){
            log.error("当前用户不存在！跳转注册页面");
        }

        //step3.用户存在查询用户状态,若果无效,返回用户无效异常信息
        String userFlag = sysUser.getUserStatus();
        if (BusinessConstant.USER_FLAG_INVAILD.equals(userFlag)){
            log.error("当前用户无效");

        }

        //step4.用户有效,开始校验用户的密码
        boolean passwordIsTrue = verifyPassword(sysUser, password);
        if (!passwordIsTrue){
            log.error("用户密码错误");

        }

        //step5.返回用户
        res.setData(sysUser);
        return res;
    }

    /**
     * 校验密码
     * @param password
     * @return
     */
    public boolean verifyPassword(SysUser user ,String password){

        //step1.初始化密码校验属性
        boolean b = false ;

        //step2.根据用户id查询用户密码
        SysUser sysUser = sysUserMapper.selectOne(user);
        String userPassword = sysUser.getUserPassword();
        if (password.equals(userPassword)){
            b = true;
        }
        return b;
    }


}
