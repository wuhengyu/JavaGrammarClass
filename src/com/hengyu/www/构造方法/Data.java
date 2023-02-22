package com.hengyu.www.构造方法;

/**
 * Date    :2023/2/23 0:03
 * Author  :Walter
 * File    : Data .java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

//构造方法的概念:
//构造方法（也称为构造器）是一个特殊的成员方法，名字必须与类名相同
//构造方法在创建对象时由编译器自动调用，并且在整个对象的生命周期内只调用一次
//构造方法的作用就是对对象中的成员进行初始化，并不负责给对象开辟空间。

//构造方法的特性:
//因为如果构造方法的名字与类名不相同，JAVA的编译器就会将该方法归结为成员方法，而不会将其认定为构造方法
//构造方法是无返回值类型的，但是成员方法是必须有返回值类型
//创建对象时由编译器自动调用，并且在对象的生命周期内只调用一次
//构造方法可以重载（用户可以根据自己的需求提供不同参数的构造方法）
//如果用户没有显式定义构造方法，编译器就会默认生成一份构造方法，而且默认生成的构造方法一定是无参的
//构造方法中，可以通过this调用其他的构造方法来简化代码


public class Data {
    public int year;
    public int month;
    public int day;

    public Data(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("调用构造方法");

    }

    public void printDate(){
        System.out.println(year +"-"+ month +"-"+ day);
    }

    public static void main(String[] args) {
        Data date = new Data(2023, 2, 23);
        date.printDate();
    }

}
