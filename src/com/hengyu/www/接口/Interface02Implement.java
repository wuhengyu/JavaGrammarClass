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

    }

    @Override
    public void interfaceMethod02() {

    }

    @Override
    public void interfaceMethod03() {

    }

    @Override
    public void interfaceMethod06() {
        Interface02.super.interfaceMethod06();
    }

    @Override
    public void interfaceMethod07() {
        Interface02.super.interfaceMethod07();
    }
}
