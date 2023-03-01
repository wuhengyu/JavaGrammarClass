package com.hengyu.www.接口;

/**
 * Date    :2023/3/1 11:32
 * Author  :Walter
 * File    : InterfaceSameMethodImplement.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
interface InterfaceSameMethodImplement1 {
    void InterfaceSameMethodNoDefault();
}

interface InterfaceSameMethodImplement2 {

    void InterfaceSameMethodNoDefault();
}

interface InterfaceSameMethodImplement3 {

    default void InterfaceSameMethodDefault() {
    }
}

interface InterfaceSameMethodImplement4 {

    default void InterfaceSameMethodDefault() {
    }
}

public class InterfaceSameMethodImplement implements InterfaceSameMethodImplement1, InterfaceSameMethodImplement2,
        InterfaceSameMethodImplement3, InterfaceSameMethodImplement4 {


    //    实现接口非默认相同抽象方法
    @Override
    public void InterfaceSameMethodNoDefault() {
        System.out.println("InterfaceSameMethod");
    }


    //    实现接口相同默认方法
    @Override
    public void InterfaceSameMethodDefault() {
        InterfaceSameMethodImplement3.super.InterfaceSameMethodDefault();
    }
}