package com.hengyu.www.数据类型.装箱;

/**
 * Date    :2023/3/12 19:05
 * Author  :Walter
 * File    : BoxingExample.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

//将基本数据类型转换为对象
public class BoxingExample {

    public static void main(String[] args) {

        byte b = 10;
        Byte byteObj = Byte.valueOf(b);

        short s = 20;
        Short shortObj = Short.valueOf(s);

        int i = 30;
        Integer intObj = Integer.valueOf(i);

        long l = 40L;
        Long longObj = Long.valueOf(l);

        float f = 50.0f;
        Float floatObj = Float.valueOf(f);

        double d = 60.0;
        Double doubleObj = Double.valueOf(d);

        boolean g = true;
        Boolean booleanObj = Boolean.valueOf(g);

        char c = 'a';
        Character charObj = Character.valueOf(c);

        int k = 30;
        Integer intObj2 = new Integer(k);

    }
}
