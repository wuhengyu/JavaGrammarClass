package com.hengyu.www.多线程;

/**
 * Date    :2023/3/12 21:55
 * Author  :Walter
 * File    : MyRunnableClass.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

public class MyRunnableClass {
    // 在主线程中创建MyRunnable对象并启动线程
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 定义线程的具体行为
        System.out.println("MyRunnableClass is running");
    }
}

