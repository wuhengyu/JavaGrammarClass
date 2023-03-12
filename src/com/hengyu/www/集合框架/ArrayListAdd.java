package com.hengyu.www.集合框架;

/**
 * Date    :2023/3/12 13:48
 * Author  :Walter
 * File    : ArrayListAdd.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import java.util.ArrayList; // 引入 ArrayListGet 类

public class ArrayListAdd {

    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
    }
}
