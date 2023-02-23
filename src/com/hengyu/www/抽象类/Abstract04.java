package com.hengyu.www.抽象类;

/**
 * Date    :2023/2/23 18:37
 * Author  :Walter
 * File    : Abstract04.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

public class Abstract04 {
    public static void main(String[] args) {
//        Employee是抽象类，不能实例化
//        Person p = new Employee();
    }
}

abstract class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //此方法各个子类都可以使用
    public void commonMethod1() {
        System.out.println("---------commonMethod1-------");
    }

    //采用 abstract 定义抽象方法，没有{}，以分号结尾
    public abstract void printInfo();
}

//抽象类的子类可以是抽象类。也可以是非抽象类
abstract class Employee extends Person {
    //再次声明该方法为抽象的
    public abstract void printInfo();
}

//一个非抽象的类，继承抽象类，必须将抽象类中的抽象方法进行覆盖/重写/实现
class Student extends Person {
    //实现抽象的方法
    public void printInfo() {
        System.out.println("Student.printInfo()");
    }
}

