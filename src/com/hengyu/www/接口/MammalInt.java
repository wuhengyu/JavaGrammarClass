package com.hengyu.www.接口;
/**
* Date    :2023/2/22 00:12
* Author  :Walter
* File    :MammalInt.java
* License :(C)Copyright Walter
* Version 1.0
* Desc    :
*/

public class MammalInt implements Animal{
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void travel() {
        System.out.println("travel");
    }

    public static void main(String[] args) {
        MammalInt manalint  = new MammalInt();
        manalint.eat();
        manalint.travel();
    }
}
