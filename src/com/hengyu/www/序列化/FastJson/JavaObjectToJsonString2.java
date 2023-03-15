package com.hengyu.www.序列化.FastJson;

/**
 * Date    :2023/3/12 23:58
 * Author  :Walter
 * File    : JavaObjectToJsonString.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.annotation.JSONField;

import java.util.Date;

class User2 {

    @JSONField(ordinal = 1)
    private String Name;

    @JSONField(ordinal = 2)
    private Date Birthday;

    @JSONField(ordinal = 3)
    private int Age;


    @JSONField(name = "NAME")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setBirthday(Date birthday) {
        this.Birthday = birthday;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    @JSONField(name = "AGE", serialize = false)
    public int getAge() {
        return Age;
    }

    @JSONField(name = "BIRTHDAT")
    public Date getBirthday() {
        return Birthday;
    }

}

public class JavaObjectToJsonString2 {
    public static void main(String[] args) {
        User2 user2 = new User2();
        user2.setAge(25);
        user2.setBirthday(new Date());
        user2.setName("wuhengyu");
        String jsonString2 = JSON.toJSONString(user2);
        System.out.println(jsonString2);
    }
}
