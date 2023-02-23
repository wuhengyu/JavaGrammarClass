package com.hengyu.www.接口;

/**
 * Date    :2023/2/23 14:57
 * Author  :Walter
 * File    : Interface01 .java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

//接口中的方法是抽象，所以不能有方法体
//省略修饰符public abstract

interface Interface01 {

    public static final int i = 100;
    int z = 1;//z也是一个常量而不是变量 不能修改

    int sum(int a, int b);//可以省略，默认系统会给你加上

    void dosome();//可以执行通过

    //void dosome2(){};//不可以执行通过，不能有方法体
}




