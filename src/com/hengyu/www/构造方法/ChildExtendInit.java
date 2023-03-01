package com.hengyu.www.构造方法;

/**
 * Date    :2023/2/24 0:33
 * Author  :Walter
 * File    : ChildExtendInit.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

class ChildFather {
    String name;

    //    无参构造方法
    public ChildFather() {

    }

    //    有参构造方法，未定义无参构造方法
    public ChildFather(String name) {
        this.name = name;
    }
}

public class ChildExtendInit extends ChildFather {

    int x = 10;

    //    有参构造方法
    public ChildExtendInit(String name) {
//        super(name);
    }

    //    无参构造方法
//    报错只需要在父类写上默认的无参构造方法
    public ChildExtendInit() {
//        super();

    }

    public static void main(String[] args) {
        ChildExtendInit childExtendInit = new ChildExtendInit();
        System.out.println("ChildExtendInit");
    }
}
