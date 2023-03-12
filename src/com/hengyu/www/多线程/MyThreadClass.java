package com.hengyu.www.多线程;

/**
 * Date    :2023/3/12 21:54
 * Author  :Walter
 * File    : MyThreadClass.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
class MyThread extends Thread {
    @Override
    public void run() {
        // 定义线程的具体行为
        System.out.println("MyThreadClass is running");
    }
}


public class MyThreadClass {
    // 在主线程中创建MyThread对象并启动线程
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

