package com.hengyu.www.继承;

/**
 * Date    :2023/3/15 13:51
 * Author  :Walter
 * File    :ExtendsKeywords.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

class AnimalClass2 {
    private final String name;

    private final int id;

    public String work;

    public AnimalClass2(String myName, int myid, String work) {
        this.name = myName;
        this.id = myid;
        this.work = work;
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    private void play() {
        System.out.println("play");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
}

public class ExtendsKeywords extends AnimalClass2 {

    //    子类有参构造器调用父类有参构造器
    public ExtendsKeywords(String myName, int myid) {
        super("wuhengyuFather", 30, "test");
//        子类构造方法调用父类的非private的属性
        System.out.println(super.work);
//        子类构造方法调用父类的非private的方法
        super.eat();
        System.out.println("子类有参构造器" + myName + "," + myid);

//       子类构造方法调用父类的private的方法，错误
//        super.play();
    }

    public static void main(String[] args) {
        ExtendsKeywords extendsKeywords1 = new ExtendsKeywords("wuhengyuChild1", 15);
//        子类对象调用父类的非private的方法
        extendsKeywords1.eat();
//        子类对象调用父类的非private的方法
        extendsKeywords1.sleep();
//        子类对象调用父类的private的方法，错误
//        extendsKeywords1.play();

//        子类对象调用父类的非private的属性
        System.out.println(extendsKeywords1.work);
//        父类私有变量name和id，子类无法直接调用父类属性
//        System.out.println(extendsKeywords1.name);


        ExtendsKeywords extendsKeywords2 = new ExtendsKeywords("wuhengyuChild2", 15);
        extendsKeywords2.eat();
        extendsKeywords2.sleep();
    }
}