package com.hengyu.www.接口;

/**
 * Date    :2023/2/28 22:12
 * Author  :Walter
 * File    : InterfaceDefaultImplement.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    : 两个包含具有相同方法签名的默认方法的接口
 */
interface InterfaceDefault1 {

    default void InterfaceDefaultMethod() {
        System.out.println("InterfaceDefaultMethod from InterfaceDefault1");
    }

}

interface InterfaceDefault2 {

    default void InterfaceDefaultMethod() {
        System.out.println("InterfaceDefaultMethod from InterfaceDefault2");
    }
}

public class InterfaceDefaultImplement implements InterfaceDefault1, InterfaceDefault2 {

    //    调用接口默认方法的解决方案：
    @Override
    public void InterfaceDefaultMethod() {
        InterfaceDefault1.super.InterfaceDefaultMethod();
    }


//    重新实现接口默认方法的解决方案：
//    @Override
//    public void InterfaceDefaultMethod() {
//        System.out.println("InterfaceDefaultMethod");
//    }


//    在实现类中重新声明默认方法的解决方案：
//    重新声明了一个默认方法，这种方式可能会导致意外行为
//    这种方式可能会导致意外行为，因为如果其他类尝试使用实现类中的默认方法，则可能会导致歧义
//    避免在实现类中重新声明默认方法
//    扩展方法只能在接口中使用原来这个修饰符在修饰方法的时候，只能修饰接口中的方法，普通方法是不能使用的
//    default void InterfaceDefaultMethod() {
//        System.out.println("InterfaceDefaultMethod from InterfaceDefaultImplement");
//    }

}
