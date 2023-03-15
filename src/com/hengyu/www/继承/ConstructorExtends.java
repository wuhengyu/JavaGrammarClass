package com.hengyu.www.继承;

/**
 * Date    :2023/3/15 11:37
 * Author  :Walter
 * File    : ConstructorExtends.java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */

class SuperClass {
    private int n;

    SuperClass() {
        System.out.println("父类无参构造器");
    }

    SuperClass(int n) {
        System.out.println("父类有参构造器:" + n);
        this.n = n;
    }
}

// ChildClass1 类继承
class ChildClass1 extends SuperClass {

    private int n;


    //    子类无参构造器调用父类有参构造器
    ChildClass1() { // 自动调用父类的无参数构造器
        System.out.println("子类无参数构造器");
    }

    //    子类有参构造器调用父类无参构造器
    public ChildClass1(int n) {
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("子类有参数构造器:" + n);
        this.n = n;
    }

    public int getN() {
        return n;
    }
}

// ChildClass2 类继承
class ChildClass2 extends SuperClass {
    private int n;

    //    子类无参构造器调用父类有参构造器
    ChildClass2() {
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("子类无参数构造器");
    }

    //    子类有参构造器调用父类无参构造器
    public ChildClass2(int n) { // 自动调用父类的无参数构造器
        System.out.println("子类有参数构造器:" + n);
        this.n = n;
    }

    public int getN() {
        return n;
    }
}

public class ConstructorExtends {
    public static void main(String args[]) {
        System.out.println("ChildClass1类继承");
        ChildClass1 cc1 = new ChildClass1();
//        成员变量是public修饰可以直接访问输出
//        System.out.println(cc1.n);
        ChildClass1 cc2 = new ChildClass1(100);
        System.out.println("对象cc2成员变量n：" + cc2.getN());

        System.out.println("\n");

        System.out.println("ChildClass2类继承");
        ChildClass2 cc3 = new ChildClass2();
        ChildClass2 cc4 = new ChildClass2(200);
        System.out.println("对象cc4成员变量n：" + cc4.getN());
    }
}
