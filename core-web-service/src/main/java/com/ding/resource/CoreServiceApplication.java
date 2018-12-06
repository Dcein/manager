package com.ding.resource;

import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * <p>
 *     @SpringBootApplication:
 *     是一个复合注解，包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration。
 *     @SpringBootConfiguration:
 *     继承自@Configuration，二者功能也一致，标注当前类是配置类，并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入到srping容器中，并且实例名就是方法名。
 *     @EnableAutoConfiguration:
 *     作用启动自动的配置，@EnableAutoConfiguration注解的意思就是Springboot根据你添加的jar包来配置你项目的默认配置，比如根据spring-boot-starter-web
 *     来判断你的项目是否需要添加了webmvc和tomcat，就会自动的帮你配置web项目中所需要的默认配置。
 *     @ComponentScan:
 *     扫描当前包及其子包下被@Component，@Controller，@Service，@Repository注解标记的类并纳入到spring容器中进行管理。
 *     是以前的<context:component-scan>（以前使用在xml中使用的标签，用来扫描包配置的平行支持）。
 * </p>
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackages="com.ding")
@ServletComponentScan
@MapperScan(basePackages = "com.ding.common")
public class CoreServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(CoreServiceApplication.class,args);
        System.out.println("The project was startup already!");
    }

}
