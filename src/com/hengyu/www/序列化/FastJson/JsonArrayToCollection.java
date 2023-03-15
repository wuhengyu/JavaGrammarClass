package com.hengyu.www.序列化.FastJson;

import com.alibaba.fastjson2.JSON;

import java.util.List;

/**
 * Date    :2023/3/13 22:58
 * Author  :Walter
 * File    : JsonArrayToCollection.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

public class JsonArrayToCollection {
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

    @Override
    public String toString() {
        return "JsonArrayToCollection{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        String json = "[{\"name\": \"John\", \"age\": 30}, {\"name\": \"Mary\", \"age\": 25}, {\"name\": \"Tom\", \"age\": 40}]";
        List<JsonArrayToCollection> jsonArrayToCollection = JSON.parseArray(json, JsonArrayToCollection.class);
//        foreach循环遍历
        for (JsonArrayToCollection jsonArray : jsonArrayToCollection
        ) {
            System.out.println(jsonArray);
        }
//        打印对象tostring
        System.out.println(jsonArrayToCollection);
//        打印其中一个element
        System.out.println(jsonArrayToCollection.get(1));
    }
}


