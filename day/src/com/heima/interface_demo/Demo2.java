package com.heima.interface_demo;
/*
        接口中的成员组成:
            1.成员变量: 默认都是public static final修饰的常量,并且必须赋值,不能被修改(static 静态可共享,final 最终的,不可修改)
            2.构造方法: 接口没有构造方法,因为接口主要是对行为进行抽象,而不是对事物进行描述,而构造方法是对事物进行描述的
            3.成员方法: 默认都是public abstract修饰的抽象方法
 */

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(InterA.num);//在调用接口中的常量时,可以直接使用接口名.常量名的方式进行调用,推断出这里的常量是静态的,否则在未创建对象的情况下是不能调用成员变量的,并且是没有数值的
        //InterA.num = 20;//接口中的常量是不能被修改的,因为接口中的常量final修饰的,是一个自定义常量,只能被赋值一次,不能被修改
    }
}

interface InterA {
    final static int num = 10;//修饰符 'static' 对于接口字段是冗余的,当使用一些修饰符或关键字时如果在编写后显示出的是灰色的,则代表这个关键字冗余,JDK已经默认添加了关键字
//    private static final int num0 = 1;//此处不允许使用修饰符 'private',在接口中定义的静态成员变量具有默认的访问修饰符public,因此在定义时不允许使用private修饰符
}