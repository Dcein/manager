package com.ding.resource.config;

import com.ding.common.constants.BusinessConstant;
import com.ding.resource.interceptor.LoginInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * @program: manager
 * @description: 拦截器配置,拦截每一个请求资源
 * @author: DingCong
 * @create: 2018-12-06 16:27
 **/
@Slf4j
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){

        //No.1.登陆拦截器进行注册
        registry.addInterceptor(loginInterceptor)

                //拦截器须拦截的请求
                .addPathPatterns(BusinessConstant.INTERCEPTOR_ALL_PATTERN)

                //拦截器排除拦截请求
                .excludePathPatterns(Arrays.asList(BusinessConstant.INTERCEPTOR_EXCLUDE_PATTEN));

    }
}
