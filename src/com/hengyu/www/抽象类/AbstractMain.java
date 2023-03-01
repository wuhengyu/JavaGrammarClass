package com.hengyu.www.抽象类;

/**
 * Date    :2023/2/24 19:16
 * Author  :Walter
 * File    : AbstractMain.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class AbstractMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // 输出 "Woof"
        cat.makeSound(); // 输出 "Meow"
    }
}
