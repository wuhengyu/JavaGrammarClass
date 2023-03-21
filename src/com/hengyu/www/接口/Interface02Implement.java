package com.hengyu.www.接口;

/**
 * Date    :2023/2/28 15:47
 * Author  :Walter
 * File    : Interface02Implement.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class Interface02Implement implements Interface02 {
    @Override
    public void interfaceMethod01() {
        System.out.println("interfaceMethod01");
    }

    @Override
    public void interfaceMethod02() {
        System.out.println("interfaceMethod02");
    }

    @Override
    public void interfaceMethod03() {
        System.out.println("interfaceMethod03");
    }

    //    接口默认方法
    @Override
    public void interfaceMethod06() {
        Interface02.super.interfaceMethod06();
    }

    //    接口默认方法
    @Override
    public void interfaceMethod07() {
        Interface02.super.interfaceMethod07();
    }

    public static void main(String[] args) {
        Interface02Implement interface02Implement = new Interface02Implement();
        interface02Implement.interfaceMethod01();
        interface02Implement.interfaceMethod02();
        interface02Implement.interfaceMethod03();
        interface02Implement.interfaceMethod06();
        interface02Implement.interfaceMethod07();
    }
}
