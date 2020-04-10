package com.ding.resource;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <P>
 *     现在JavaConfig配置方式在逐步取代xml配置方式;
 *     而WebApplicationInitializer可以看做是Web.xml的替代,它是一个接口。通过实现WebApplicationInitializer，
 *     在其中可以添加servlet，listener等，在加载Web项目的时候会加载这个接口实现类，从而起到web.xml相同的作用
 * </P>
 * @author DingCong
 */
public class CoreServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CoreServletInitializer.class);
    }
}
