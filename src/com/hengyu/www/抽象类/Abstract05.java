package com.hengyu.www.抽象类;

import com.hengyu.www.接口.AbstractlInterface;

/**
 * Date    :2023/4/1 14:16
 * Author  :Walter
 * File    : Abstract05.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
abstract class Abstract05Abstract implements AbstractlInterface {


    @Override
    public void interfaceMethod01() {
        System.out.println("interfaceMethod01");
    }

    public void interfaceMethod02() {
        System.out.println("interfaceMethod02");
    }

    abstract void interfaceMethod03();
}

public class Abstract05 {

//    Abstract05Abstract是抽象类，不能实例化
//    Abstract05Abstract abstract05Abstract = new Abstract05Abstract();
//    @Override
//    public void interfaceMethod03() {
//        System.out.println("interfaceMethod03");
//    }


    //    这种方式只是创建了一个抽象类的实例，而实例化的对象是一个匿名内部类，因此，在外部类中无法直接访问该实例的成员变量和方法，
//    需要通过接口中定义的方法来访问。此外，在匿名内部类中，可以实现接口的所有方法，包括抽象方法和默认方法，还可以新增自己的成员变量和方法。
    Abstract05Abstract abstract05Abstract = new Abstract05Abstract() {
        @Override
        public void interfaceMethod03() {
            System.out.println("interfaceMethod03");
        }
    };

    public static void main(String[] args) {
        Abstract05 abstract05 = new Abstract05();
        abstract05.abstract05Abstract.interfaceMethod03();
    }
}