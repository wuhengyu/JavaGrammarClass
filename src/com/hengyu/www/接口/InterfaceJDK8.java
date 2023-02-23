package com.hengyu.www.接口;

/**
 * Date    :2023/2/23 19:28
 * Author  :Walter
 * File    : InterfaceJDK8 .java
 * License :(C)Copyright Walter
 * Version : 1.0
 * Desc    :
 */
public interface InterfaceJDK8 {

    /*接口的普通抽象方法*/
    public void common(String str);

    /*jdk1.8 默认方法:
    允许在已有的接口中添加新方法，而同时又保持了与旧版本代码的兼容性，
        默认方法与抽象方法不同之处在于抽象方法必须要求实现，但是默认方法则没有要求实现，
    相反，接口提供了一个默认实现，这样所有的接口实现者将会默认继承他
       （如果有必要的话，可以覆盖这个默认实现）。
    接口的默认方法：得到接口的实现类对象，直接用对象的引用.方法名。默认方法可以被实现类覆盖。
    */
    default public void defaultMethod(String str) {
        System.out.println("InterfaceJDK8:" + str);
    }


    /*jdk1.8 静态方法：
    允许在已有的接口中添加静态方法，接口的静态方法属于接口本身，不被继承，也不需要提供方法的实现。
        */
    public static void staticMethod(String str) {
        System.out.println("InterfaceJDK8:" + str);
    }

}
