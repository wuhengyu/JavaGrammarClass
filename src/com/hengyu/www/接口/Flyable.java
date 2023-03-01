package com.hengyu.www.接口;

/**
 * Date    :2023/2/24 18:36
 * Author  :Walter
 * File    : Flyable.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
interface Flyable {
    void fly();

    void land();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void land() {
        System.out.println("Bird is landing");
    }

    public static void main(String[] args) {
        Flyable flyable1 = new Bird();
        flyable1.fly();
        flyable1.land();
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is flying");
    }

    public void land() {
        System.out.println("Airplane is landing");
    }

    public static void main(String[] args) {
        Flyable flyable2 = new Airplane();
        flyable2.fly();
        flyable2.land();
    }
}



