package com.zxp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:bean.xml"})//让我们自己写的配置文件bean.xml生效
@SpringBootApplication
public class springBootStarter {



    public static void main(String[] args) {

        SpringApplication.run(springBootStarter.class,args);
    }
}
