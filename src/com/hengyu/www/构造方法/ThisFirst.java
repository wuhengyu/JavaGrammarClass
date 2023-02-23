package com.hengyu.www.构造方法;

/**
 * Date    :2023/2/23 12:21
 * Author  :Walter
 * File    : ThisFirst .java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class ThisFirst {
    public int year;
    public int month;
    public int day;

    public ThisFirst() {
//        这里通过this调用了带有三个参数的构造方法
//        System.out.println("第一条语句");

//        this()必须是构造方法中的第一条语句
        this(2023, 12, 22);
    }

    public ThisFirst(int year, int month, int day) {
//        this不能形成环，递归循环调用
//        this();

        this.year = year;
        this.month = month;
        this.day = day;

    }
}
