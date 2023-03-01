package com.hengyu.www.接口;

/**
 * Date    :2023/2/22 22:45
 * Author  :Walter
 * File    : Animal .java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

//public修饰符对于接口来说是多余的
interface Animal {
    void eat();

    void travel();
}

/*class Pig implements Animal {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void travel() {
        System.out.println("travel");
    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.eat();
        pig.travel();

    }
}*/

//抽象类可以不实现或者只实现部分抽象方法
abstract class Pig implements Animal {

    public void eat() {
        System.out.println("eat");
    }

//    @Override
//    public void travel() {
//        System.out.println("travel");
//    }

//    public static void main(String[] args) {
////        抽象方法不能实例化
//        Pig pig = new Pig();
//        pig.eat();
//        pig.travel();
//    }
}