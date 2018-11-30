package com.ding.resource.controller.login;

import com.ding.common.constants.ResponseConstant;
import com.ding.common.vo.ajax.AjaxResultVo;
import com.ding.resource.controller.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.ding.common.vo.ajax.AjaxResultVo.error;
import static com.ding.common.vo.ajax.AjaxResultVo.success;

/**
 * @program: manager
 * @description: 登陆控制器
 * @author: DingCong
 * @create: 2018-11-29 13:34
 **/
@Controller
@Slf4j
public class LoginController extends BaseController {

    @GetMapping({"/",""})
    public String login(HttpServletRequest request, HttpServletResponse response) {
        log.info("jump to user login page...");
        return "login";
    }

    @PostMapping("login")
    @ResponseBody
    public AjaxResultVo ajaxLogin(String username, String password, Boolean rememberMe) {

        //step1.获取用户token令牌
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);

        //step2.获取登陆对象
        Subject subject = SecurityUtils.getSubject();

        //step3.进行shiro核心realm安全认证平台
        try {
            subject.login(token);
            return success();
        } catch (AuthenticationException e) {
            String msg = ResponseConstant.USER_LOGIN_ERROR.getMsg();
            if (StringUtils.isNotEmpty(e.getMessage())) {
                msg = e.getMessage();
            }
            return error(msg);
        }
    }

    @GetMapping("/unAuth")
    public String unAuth()
    {
        return "/unauth";
    }
}
