package com.hengyu.www.构造方法;

/**
 * Date    :2023/2/23 0:21
 * Author  :Walter
 * File    : OverLodingData .java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

//两个构造方法名字相同，参数列表不同，因此构成了方法重载

public class OverLodingData {
    public int year;
    public int month;
    public int day;

    //不带参数的构造方法
    public OverLodingData() {
        this.year = 2022;
        this.month = 11;
        this.day = 13;
    }

    //带有三个参数的构造方法：
    public OverLodingData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("调用构造方法");
    }

    public void printDate() {
        System.out.println(year + "-" + month + "-" + day);
    }

    public static void main(String[] args) {
        //创建两个个对象
        OverLodingData overLodingData = new OverLodingData(2022,11,13);
        OverLodingData overLodingData1 = new OverLodingData();
        overLodingData.printDate();
    }
}
