package com.hengyu.www.集合框架;

import java.util.ArrayList;

/**
 * Date    :2023/3/12 13:53
 * Author  :Walter
 * File    : ArrayListSet.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class ArrayListSet {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        System.out.println(sites);
    }
}
