package com.hengyu.www.集合框架;

import java.util.ArrayList;

/**
 * Date    :2023/3/12 13:55
 * Author  :Walter
 * File    : ArrayListRemove.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);
    }
}
