package com.zxp.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Data
public class Person {
    private String name;
    private int age;
    private boolean boss;
    private Date birth;
    private Map<String,String> map;
    private List<String> list;
    private Dog dog;
}
