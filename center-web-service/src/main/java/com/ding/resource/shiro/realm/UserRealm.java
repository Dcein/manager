package com.ding.resource.shiro.realm;

import com.ding.common.constants.BaseResponse;
import com.ding.common.constants.BusinessConstant;
import com.ding.common.constants.ResponseConstant;
import com.ding.common.mapper.IUserService;
import com.ding.common.model.user.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: manager
 * @description: shiro登录及权限验证
 * @author: DingCong
 * @create: 2018-11-29 13:34
 **/
@Slf4j
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;

    /**
     * @param principalCollection
     * @return AuthorizationInfo
     * @description 权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("进入权限验证");
        return null;
    }

    /**
     * @param authenticationToken
     * @return AuthenticationInfo
     * @throws AuthenticationException
     * @description 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //step1.获取用户登录令牌
        log.info("进入登录验证");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        //step2.从令牌获取登录用户名
        String username = token.getUsername();

        //step3.丛令牌获取用户登录密码
        String password = BusinessConstant.EMPTY;
        if (token.getPassword() != null) {
            password = new String(token.getPassword());
        }

        //step4.进行登录验证
        User user = null;
        try {
            BaseResponse<User> login = userService.login(username, password);
            if (ResponseConstant.SUCCESS.getCode().equals(login.getResponseCode())){
                user = login.getData();
            }
        } catch (Exception e) {
            throw new AuthenticationException(e.getMessage(), e);
        }

        //step5.返回登录认证结果信息
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
        return info;
    }
}
