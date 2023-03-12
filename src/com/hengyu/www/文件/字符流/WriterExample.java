package com.hengyu.www.文件.字符流;

/**
 * Date    :2023/3/12 15:55
 * Author  :Walter
 * File    : WriterExample.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import java.io.*;

public class WriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("WriterExample.txt");
            String stringToWrite = "Hello, World!";
            fileWriter.write(stringToWrite);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

