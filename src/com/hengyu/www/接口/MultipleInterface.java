package com.hengyu.www.接口;

/**
 * Date    :2023/2/24 0:00
 * Author  :Walter
 * File    : MultipleInterface.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

//接口与接口之间可以多继承，一个类也可以多个接口
interface MulpitleInterface1 {
}

interface MulpitleInterface2 {
}

interface MulpitleInterface3 extends MulpitleInterface1, MulpitleInterface2 { //接口和接口支持多继承。
}
