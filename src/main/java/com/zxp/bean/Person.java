package com.zxp.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

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
public class Person {
    private String name;
    private int age;
    private boolean boss;
    private Date birth;
    private Map<String,String> map;
    private List<String> list;
    private Dog dog;
}
