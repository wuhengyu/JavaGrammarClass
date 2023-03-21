package com.hengyu.www.接口;

/**
 * Date    :2023/2/28 14:44
 * Author  :Walter
 * File    : Interface02.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

public interface Interface02 {

    String interfaceVariable = "interfaceVariable String";
    int interfaceInteger = 100;

//    接口中的成员变量只能是 public static final 类型的
//    被隐式的指定为 public static final 变量
    public static final String interfaceVariable2 = "interfaceVariable String2";

    //    隐式的指定为 public abstract
    public void interfaceMethod01();

    //    隐式的指定为 public abstract
    public void interfaceMethod02();

    //    隐式的指定为 public abstract
    public abstract void interfaceMethod03();

    //   非法修饰符组合: 'abstract' and 'static'
//    接口里可以有静态方法和方法体
    public static void interfaceMethod04() {
        System.out.println("接口里可以有静态方法和方法体!");
    }

    //    接口里可以有静态方法和方法体
    static void interfaceMethod05() {
        System.out.println("接口里可以有静态方法和方法体!");
    }

    //    接口默认方法1
    default void interfaceMethod06() {
        System.out.println("接口默认方法!");
    }

    //    接口默认方法2
    default void interfaceMethod07() {
        System.out.println("接口默认方法!");
    }

//    报错，接口抽象方法不能含有方法体
//    public void abstractMethod(){}

//    接口不能包含静态代码块，但是可以在接口中定义静态方法和静态变量，这些静态成员会在类加载时被初始化
//    编译报错：java接口中不允许有初始化程序
//    static {
//        System.out.println("接口静态代码块!");
//    }
}
