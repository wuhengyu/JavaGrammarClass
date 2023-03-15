package com.hengyu.www.继承;

/**
 * Date    :2023/3/15 13:51
 * Author  :Walter
 * File    : SuperAndThis.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

class AnimalClass {
    void eat() {
        System.out.println("AnimalClass : eat");
    }
}

class Dog extends AnimalClass {
    void eat() {
        System.out.println("dog : eat");
    }

    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
    }
}

public class SuperAndThis {
    public static void main(String[] args) {
        AnimalClass animalClass = new AnimalClass();
        animalClass.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}