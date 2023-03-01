package com.hengyu.www.接口;

/**
 * Date    :2023/2/23 15:07
 * Author  :Walter
 * File    : AbstractImplementInterface.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

// 特殊的抽象类，完全抽象的，叫做接口。
interface MyMath {
    double PI = 3.1415926;

    int sum(int a, int b);

    int sub(int a, int b);
}

//声明为抽象类
abstract class NoAbstractImplementInterface1 implements MyMath {
}


//编译出错：要么声明为抽象类，要么实现抽象方法
//class NoAbstractImplementInterface2 implements MyMath {
//
//}

class NoAbstractImplementInterface3 implements MyMath {

//错误：正在尝试分配更低的访问权限; 以前为public
//	int sum(int a, int b){
//		return a + b;
//	}

    // 重写/覆盖/实现接口中的方法
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class AbstractImplementInterface implements MyMath {
    public static void main(String[] args) {
        NoAbstractImplementInterface3 abstractImplementInterface = new NoAbstractImplementInterface3();
        int result1 = abstractImplementInterface.sum(3, 4);
        System.out.println(result1);
        int result2 = abstractImplementInterface.sub(5, 1);
        System.out.println(result2);
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a * b;
    }
}