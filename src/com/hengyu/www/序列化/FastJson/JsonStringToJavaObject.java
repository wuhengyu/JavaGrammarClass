package com.hengyu.www.序列化.FastJson;

/**
 * Date    :2023/3/12 23:58
 * Author  :Walter
 * File    : JsonStringToJavaObject.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    : JSON字符串反序列化为Person对象
 */

import com.alibaba.fastjson2.JSON;

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class JsonStringToJavaObject {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John\",\"age\":30}";
        Person Person = JSON.parseObject(jsonString, Person.class);

        System.out.println(Person.getName());
        System.out.println(Person.getAge());
    }
}
