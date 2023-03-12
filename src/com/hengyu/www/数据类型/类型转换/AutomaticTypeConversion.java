package com.hengyu.www.数据类型.类型转换;

/**
 * Date    :2023/3/12 19:29
 * Author  :Walter
 * File    : AutomaticTypeConversion.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    : 自动类型转换
 */

//必须满足转换前的数据类型的位数要低于转换后的数据类型
//byte,short,char—> int —> long—> float —> double
public class AutomaticTypeConversion {
    public static void main(String[] args) {
        char c1 = 'a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2 + 1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);
    }
}
