package com.ding.resource.shiro.realm;

import com.ding.common.constants.BusinessConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @program: manager
 * @description: 用户shiro鉴权核心类
 * <p>
 *     当上层调用 subject.login(token)时,会进入此类中进行用户登陆安全校验认证
 * </p>
 * @author: DingCong
 * @create: 2018-11-29 19:47
 **/
@Slf4j
public class UserRealm extends AuthorizingRealm {

    /**
     * 用户授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("用户开始授权");

        return null;
    }

    /**
     * 用户登陆认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //step1.根据令牌获取用户名
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;
        String username = upToken.getUsername();
        String password = BusinessConstant.EMPTY;

        //step2.根据令牌获取用户密码
        if (upToken.getPassword() != null){
            password = new String(upToken.getPassword());
        }


        log.info("用户登陆安全认证");
        return null;
    }
}
