package com.hengyu.www.接口;

/**
 * Date    :2023/2/24 0:00
 * Author  :Walter
 * File    : MulpitleInterface.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

interface MulpitleInterface1 {
}

interface MulpitleInterface2 {
}

interface MulpitleInterface3 extends MulpitleInterface1, MulpitleInterface2 { //接口和接口支持多继承。
}
