package com.hengyu.www.散列表;

import java.util.HashMap;

/**
 * Date    :2023/3/12 14:02
 * Author  :Walter
 * File    : HashMapGet.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class HashMapGet {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites.get(1));

        HashMap<String, String> Sites2 = new HashMap<String, String>();
        // 添加键值对
        Sites2.put("one", "Google");
        Sites2.put("two", "Runoob");
        Sites2.put("three", "Taobao");
        Sites2.put("four", "Zhihu");
        System.out.println(Sites2.get("one"));
    }
}
