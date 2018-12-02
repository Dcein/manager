package com.ding.resource;

import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackages="com.ding")
@ServletComponentScan
@MapperScan(basePackages = "com.ding.common")
public class CoreServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(CoreServiceApplication.class,args);
        System.out.println("The project was startup already!");
    }

}
