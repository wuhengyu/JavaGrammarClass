package com.hengyu.www.文件;

/**
 * Date    :2023/3/12 16:05
 * Author  :Walter
 * File    : IOExample.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

import java.io.*;

public class IOExample {
    public static void main(String[] args) {
        // 字节流读取文件
        try (FileInputStream inputStream = new FileInputStream("src/com/hengyu/www/文件/文本/FileInputStream.txt")) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 字节流写入文件
        try (FileOutputStream outputStream = new FileOutputStream("src/com/hengyu/www/文件/文本/FileOutputStream.txt")) {
            String data = "Hello, World!";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 字符流读取文件
        try (FileReader reader = new FileReader("src/com/hengyu/www/文件/文本/FileReader.txt")) {
            char[] buffer = new char[1024];
            int length;
            while ((length = reader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 字符流写入文件
        try (FileWriter writer = new FileWriter("src/com/hengyu/www/文件/文本/FileWriter.txt")) {
            String data = "Hello, World!";
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

