package com.hengyu.www.文件.字节流;

/**
 * Date    :2023/3/12 15:53
 * Author  :Walter
 * File    : OutputStreamExample.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/com/hengyu/www/文件/字节流/OutputStreamExample.txt");
            byte[] bytesToWrite = "Hello, World!".getBytes();
            fileOutputStream.write(bytesToWrite);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

