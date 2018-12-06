package com.ding.common.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @program: manager
 * @description: 从spring容器中获取bean
 * @author: DingCong
 * @create: 2018-12-06 17:41
 **/
@Component
public class SpringContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * 注入上下文环境
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContext.applicationContext = applicationContext;
    }

    /**
     * 返回上下文环境
     * @return
     */
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    /**
     * 通过名称获取bean
     * @param beanName
     * @param <T>
     * @return
     */
    public static <T> T getBean(String beanName){
        return (T)applicationContext.getBean(beanName);
    }
}
