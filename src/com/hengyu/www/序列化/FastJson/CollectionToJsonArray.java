package com.hengyu.www.序列化.FastJson;

/**
 * Date    :2023/3/13 22:10
 * Author  :Walter
 * File    : CollectionToJsonArray.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;
import java.util.List;

public class CollectionToJsonArray {
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

    public static void main(String[] args) {
        List<CollectionToJsonArray> collectionToJsonArrayList = new ArrayList<>();

        CollectionToJsonArray collectionToJsonArray1 = new CollectionToJsonArray();
        collectionToJsonArray1.setName("John");
        collectionToJsonArray1.setAge(30);

        CollectionToJsonArray collectionToJsonArray2 = new CollectionToJsonArray();
        collectionToJsonArray2.setName("Tom");
        collectionToJsonArray2.setAge(25);

        collectionToJsonArrayList.add(collectionToJsonArray1);
        collectionToJsonArrayList.add(collectionToJsonArray2);

        String jsonString = JSON.toJSONString(collectionToJsonArrayList);
        System.out.println(jsonString);  // [{"age":30,"name":"John"},{"age":25,"name":"Tom"}]

        List<CollectionToJsonArray> myClassList2 = JSON.parseArray(jsonString, CollectionToJsonArray.class);
        for (CollectionToJsonArray myClass : myClassList2) {
            System.out.println(myClass.getName() + " " + myClass.getAge());
        }
    }
}
