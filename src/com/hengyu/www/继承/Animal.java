package com.hengyu.www.继承;

/**
 * Date    :2023/3/15 0:59
 * Author  :Walter
 * File    : Animal.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class Animal {
    private final String name;
    private final int id;

    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}
