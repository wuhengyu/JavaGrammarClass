package com.hengyu.www.数据类型.类型转换;

/**
 * Date    :2023/3/12 19:32
 * Author  :Walter
 * File    : CompulsionTypeConversion.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class CompulsionTypeConversion {
    public static void main(String[] args) {
        int i1 = 123;
        byte b = (byte) i1;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于" + b);
    }
}
