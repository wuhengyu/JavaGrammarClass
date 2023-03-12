package com.hengyu.www.序列化.FastJson;

/**
 * Date    :2023/3/12 23:58
 * Author  :Walter
 * File    : JavaObjectToJsonString.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import

class User {


    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}

public class JavaObjectToJsonString {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Tom");
        user.setAge(25);
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
    }
}
