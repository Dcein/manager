package com.ding.skynet.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: start loading class
 * @Author: cc.ding
 * @Date: created in 2020/4/10 17:26
 */
@SpringBootApplication
public class SkyNetApplicationInitializer {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SpringApplication.run(SkyNetApplicationInitializer.class,args);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("[****************** SKY NET START SUCCESS ! TOTAL TIMES : %sms ******************]", endTime-startTime));
    }
}
