package com.heima.permission;

public class Son extends Father{
    public void method(){
        show0();
        show1();
        show2();
//        show3();私有的方法调用失败,但是除了私有属性外的其余属性都可以通过同一个module同一个package下的子类对象调用
    }
}
