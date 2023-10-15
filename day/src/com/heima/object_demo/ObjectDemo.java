package com.heima.object_demo;
/*
    Object类:
        类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有的对象,包括数组都实现这个类中的方法

        成员方法: public String toString() 返回该对象的字符串表示
        重写toString方法的作用:将对象转换为字符串,可以让我们在使用输出语句输出对象时,输出对象的属性值
        结论: 如果一个类没有重写toString,那么打印这个类的对象时,打印的是这个对象在内存中的地址值
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student student = new Student("柳岩",38);
        System.out.println(student);//com.heima.object_demo.Student@4554617c
        //如果想要查看不是对象在内存中的地址中的数据,需要重写toString方法
        //重写toString方法的快捷键:alt+insert,也可以自己使用@overwrite的注解在重写这个方法
        //自己重写toString方法可以返回类中的成员变量的值,也可以返回自己想要的字符串
    }
}
