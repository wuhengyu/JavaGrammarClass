package com.hengyu.www.接口;

/**
 * Date    :2023/2/24 0:08
 * Author  :Walter
 * File    : ClassImplementMultipleInterface.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

interface A {
    void m1();
}

interface B {
    void m2();
}

interface C {
    void m3();
}

// 实现多个接口，其实就类似于多继承。
class ClassImplementMultipleInterface implements A, B, C {
    // 实现A接口的m1()
    public void m1() {

    }

    // 实现B接口中的m2()
    public void m2() {
        System.out.println("实现B接口m2抽象方法");
    }

    // 实现接口C中的m3()
    public void m3() {

    }
}
