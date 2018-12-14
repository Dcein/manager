package com.ding.resource.controller.login;

import com.ding.common.constants.ResponseCodeAndMsg;
import com.ding.common.entity.SysUser;
import com.ding.common.service.SysUserService;
import com.ding.common.utils.common.CommonUtils;
import com.ding.common.vo.ajax.AjaxResultVo;
import com.ding.common.vo.user.UserLoginSessionVo;
import com.ding.resource.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <P>
 *     用户完成登陆至成功到主页面,登陆失败返回认证失败页面
 * </P>
 * @program: manager
 * @description: 登陆控制器
 * @author: DingCong
 * @create: 2018-11-29 13:34
 **/
@Slf4j
@Controller
public class LoginController extends BaseController {

    @Autowired
    private SysUserService userService;

    /**
     * 请求控制器
     * @param request
     * @param response
     * @return
     */
    @GetMapping({"","/","login"})
    public String login(HttpServletRequest request, HttpServletResponse response) {
        log.info("jump to user login page...");
        boolean mobileDevice = CommonUtils.isMobileDevice(request);
        return "login";
    }

    /**
     * 登录认证控制器
     * @param username
     * @param password
     * @param rememberMe
     * @return
     */
    @PostMapping("ajaxLogin")
    @ResponseBody
    public AjaxResultVo ajaxLogin(String username, String password, Boolean rememberMe) {

        //step1.获取用户token令牌
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);

        //step2.获取登陆对象
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.getTimeout();


        //step3.进行shiro核心realm安全认证平台
        try {
            subject.login(token);
            SysUser user = userService.getUserByUsernameAndPassword(username, password);
            UserLoginSessionVo sessionVo = new UserLoginSessionVo();
            sessionVo.setPassword(user.getUserPassword());
            sessionVo.setUserId(user.getId());
            setUserLoginInfoToSession(getHttpServletRequest(),sessionVo);
            return AjaxResultVo.success();
        } catch (AuthenticationException e) {
            String msg = ResponseCodeAndMsg.USER_LOGIN_ERROR.getMsg();
            if (StringUtils.isNotEmpty(e.getMessage())) {
                msg = e.getMessage();
            }
            return AjaxResultVo.error(msg);
        }
    }

    /**
     * 登陆认证失败,返回失败页面
     * @return
     */
    @GetMapping("/unAuth")
    public String unAuth() {
        return "unauth";
    }

    /**
     * 认证成功,进入首页内容页面
     * @return
     */
    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
