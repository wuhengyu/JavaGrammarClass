package com.hengyu.www.继承;

/**
 * Date    :2023/3/15 13:51
 * Author  :Walter
 * File    : ImplementsKeywords.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

interface A {
    public void eat();

    public void sleep();
}

interface B {
    public void show();
}

public class ImplementsKeywords implements A, B {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        ImplementsKeywords implementsKeywords = new ImplementsKeywords();
        implementsKeywords.eat();
        implementsKeywords.show();
        implementsKeywords.sleep();
    }

}