package com.hengyu.www.文件.字符流;

/**
 * Date    :2023/3/12 15:55
 * Author  :Walter
 * File    : ReaderExample.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import java.io.*;

public class ReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/com/hengyu/www/文件/字节流/example.txt");
            int charRead;
            while ((charRead = fileReader.read()) != -1) {
                System.out.print((char) charRead);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

