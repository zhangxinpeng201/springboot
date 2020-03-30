package com.zxp.config;

import com.zxp.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:将此类作为配置类
 */
@Configuration
public class myConfig {
    @Bean
    public HelloService helloService01(){
        System.out.println("@bean配置类生效了");
        return new HelloService();
    }
}
