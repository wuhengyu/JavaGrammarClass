package com.hengyu.www.抽象类;

import com.hengyu.www.接口.AbstractlInterface;

/**
 * Date    :2023/4/1 14:16
 * Author  :Walter
 * File    : Abstract06.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
abstract class Abstract06Abstract implements AbstractlInterface {


    @Override
    public void interfaceMethod01() {
        System.out.println("interfaceMethod01");
    }

    public void interfaceMethod02() {
        System.out.println("interfaceMethod02");
    }

    abstract void interfaceMethod03();
}

public class Abstract06 {

    void Abstract06Method1() {
        System.out.println("Abstract06Method1");
    }

    static void Abstract06Method2() {
        System.out.println("Abstract06Method2");
    }

    public static void main(String[] args) {
        Abstract06 abstract06 = new Abstract06();
        abstract06.Abstract06Method1();
        Abstract06.Abstract06Method2();
    }
}