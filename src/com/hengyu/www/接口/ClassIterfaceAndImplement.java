package com.hengyu.www.接口;


/**
 * Date    :2023/2/24 0:19
 * Author  :Walter
 * File    : ClassIterfaceAndImplement.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

public class ClassIterfaceAndImplement {
    public static void main(String[] args) {
        Flyables f = new Cat("小狗");
        f.fly();
    }
}

// 动物父类
class Animals {
    public final String name;

    public Animals(String name) {
        this.name = name;
    }
}

//接口Flyable和抽象方法fly
interface Flyables {
    void fly();
}

// 子类猫
// Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，让猫变的可以飞翔。
class Cat extends Animals implements Flyables {
    public Cat(String name) {
        super(name);
        System.out.println("Cat构造方法，这是一只" + name);
    }

    public void fly() {
        System.out.println("起飞");
    }
}
