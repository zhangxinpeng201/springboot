package com.zxp.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties(prefix = "person") 将配置文件中所有属性的值映射到组件中来，prefix是指配置文件中
 * 哪个属性,必须要将配置文件加入到spring组件当中，使用@Component
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
@PropertySource(value = {"classpath:person.properties"})
//@Validated//进行校验
public class Person {
    //@Value("${person.name}")
    //@Email//名字必须是邮箱格式
    private String name;
    //@Value("#{11*5}")
    private int age;
    //@Value("true")
    private boolean boss;
    private Date birth;
    private Map<String,String> map;
    private List<String> list;
    private Dog dog;
}
