package com.ding.sky.web.annotation;

import java.lang.annotation.*;

/**
 * @Description: 登陆注解
 * @Author: cc.ding
 * @Date: created in 2020/4/10 18:13
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SsoLogin {
}
