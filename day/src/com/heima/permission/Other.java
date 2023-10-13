package com.heima.permission;

public class Other {
    public void method() {
        Father father = new Father();
        father.show0();
        father.show1();
        father.show2();
//        father.show3();//私有的方法调用失败,但是除了私有属性外的其余属性都可以通过同一个module同一个package下的不同类中的对象调用
    }
}
