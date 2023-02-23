package com.hengyu.www.抽象类;

/**
 * Date    :2023/2/23 17:48
 * Author  :Walter
 * File    : Abstract01 .java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */


//抽象类无法实例化，无法创建对象
//抽象类是被子类来继承的
public class Abstract01 {
    public static void main(String[] args) {
        //错误，不可创建对象
//        new a();
    }
}

//定义一个抽象类
abstract class a {

}

//不是抽象类可以继承抽象类并且实例化
class b extends a {
}

//抽象子类可以继承抽象类
abstract class c extends a {
}

