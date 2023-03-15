package com.hengyu.www.序列化.FastJson;

/**
 * Date    :2023/3/12 23:58
 * Author  :Walter
 * File    : JavaObjectToJsonString.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import com.alibaba.fastjson2.*;
import com.alibaba.fastjson2.annotation.JSONField;

import java.util.Date;

class User {

    @JSONField(name = "full-name")
    private final String Name;

    @JSONField(format = "yyyy-MM-dd")
    private final Date Birthday;
    @JSONField(serialize = false)
    private final int Age;

    User(String name, int age, Date birthday) {
        Name = name;
        Age = age;
        Birthday = birthday;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public Date getBirthday() {
        return Birthday;
    }

}

public class JavaObjectToJsonString {
    public static void main(String[] args) {
        User user = new User("Tom", 25, new Date());
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
    }
}
