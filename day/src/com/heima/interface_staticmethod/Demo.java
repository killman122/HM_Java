package com.heima.interface_staticmethod;

public class Demo {
    public static void main(String[] args) {
        InterA.show();
        InnerAImpl inner = new InnerAImpl();
//        inner.show()
        //对于接口中静态方法的调用,只能使用接口名.方法名的方式调用,不能使用实现类的对象名.方法名的方式调用,由于接口是抽象的集合,所以也不能使用接口的对象名.方法名的方式调用
    }
}

interface InterA {
    public static void show() {//静态方法应该是可以通过对象名和类名的方式调用的,但是由于是接口抽象方法的集合,不能实例化对象
        System.out.println("show");
    }
}

class InnerAImpl implements InterA {

}