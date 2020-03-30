package com.zxp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @Value("${person.name}")
    private String name;

    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world！"+name;
    }

    @ResponseBody
    @RequestMapping("/helloworld")
    public void helloworld(HttpServletRequest request){
        System.out.println(request.getAttribute("hello"));
        System.out.println("-------");
    }

}
