package com.hengyu.www.抽象类;

/**
 * Date    :2023/2/23 18:27
 * Author  :Walter
 * File    : Abstract02 .java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

abstract class Abstract02 {

}

//子类
class Abstract02_1 extends Abstract02 {
    public Abstract02_1() {
        //抽象类无法实例化，但抽象类构造函数可以供子类使用
        super();
    }
}

//抽象类无法实例化
//Abstract02_1 abstract02_1 = new Abstract02_1();