package com.zxp;

import com.zxp.bean.Person;
import com.zxp.controller.HelloController;
import com.zxp.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTest {
    Logger logger = LoggerFactory.getLogger(springBootStarter.class);

    @Autowired
    Person person;
    @Autowired
    HelloController helloController;

    public String num;

    @Autowired(required = false)
    public HttpServletRequest request;

    @Autowired
    ApplicationContext ioc;


    @Test
    public void test02(){
        System.out.println(ioc.containsBean("helloService01")+"*********");
        System.out.println(ioc.containsBean("helloService01")+"*********");
        System.out.println(ioc.containsBean("helloService01")+"*********");
    }
    @Test
    public void test01(){
        logger.trace("trace ---------------springboot");
        logger.debug("debug ---------------springboot");
        logger.info("info ---------------springboot");
        logger.warn("warn ---------------springboot");
        logger.error("error ---------------springboot");
        System.out.println(person);
        request.setAttribute("hello","world");
        helloController.helloworld(request);
        //helloController.hello();
        if(num == null){
            System.out.println("error");
        }
    }
}
