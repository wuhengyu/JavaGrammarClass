package com.hengyu.www.散列表;

import java.util.HashMap;

/**
 * Date    :2023/3/12 14:02
 * Author  :Walter
 * File    : HashMapForEach.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public class HashMapForEach {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");

//        输出key
        for (Integer i : Sites.keySet()
        ) {
            System.out.println(i);
        }

//        输出value
        for (String i : Sites.values()
        ) {
            System.out.println(i);
        }
    }
}
