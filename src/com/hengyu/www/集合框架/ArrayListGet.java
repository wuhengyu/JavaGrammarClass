package com.hengyu.www.集合框架;

import java.util.ArrayList;

/**
 * Date    :2023/3/12 13:51
 * Author  :Walter
 * File    : ArrayListGet.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class ArrayListGet {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));  // 访问第二个元素
    }
}
