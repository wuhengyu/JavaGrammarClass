package com.hengyu.www.集合框架;

import java.util.ArrayList;

/**
 * Date    :2023/3/12 13:53
 * Author  :Walter
 * File    : ArrayListForEach.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (String i : sites
        ) {
            System.out.println(i);
        }
    }
}
