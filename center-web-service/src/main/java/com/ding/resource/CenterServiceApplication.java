package com.ding.resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.ding.*.mapper")
public class CenterServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(CenterServiceApplication.class,args);
        System.out.println("The project was startup already!");
    }

}
