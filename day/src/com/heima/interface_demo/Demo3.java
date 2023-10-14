package com.heima.interface_demo;

interface Interface1 extends Interface2,Interface3{//实现多继承,在接口和接口之间使用extends关键字,在类和类之间使用extends关键字,在类和接口之间使用implements关键字
    public default void start() {
        System.out.println("start方法执行");
    }

    public static void main(String[] args) {

    }


}

interface Interface2 {
}

interface Interface3 {
}

public class Demo3 {
}
