package com.hengyu.www.文件.字节流;

/**
 * Date    :2023/3/12 15:45
 * Author  :Walter
 * File    : InputStreamExample.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/com/hengyu/www/文件/字节流/example.txt");
            int byteRead;
            while ((byteRead = fileInputStream.read()) != -1) {
                System.out.print((char) byteRead);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

