package com.hengyu.www.抽象类;

/**
 * Date    :2023/2/23 18:32
 * Author  :Walter
 * File    : Abstract03.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

abstract class Abstract03 {
    private final String name;
    private final int age;

    public Abstract03(int age, String name) {
        this.name = name;
        this.age = age;
    }
}

//没有默认可用的构造函数
//class Abstract03_1 extends Abstract03{
//    抽象子类继承抽象类后，抽象类定义了有参构造函数而没有无参构造函数，子类定义找不到无参构造函数会出错
//    public Abstract03_1(){
//        super();
//    }
//}