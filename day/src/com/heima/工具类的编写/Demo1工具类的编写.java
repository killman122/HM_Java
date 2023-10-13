package com.heima.工具类的编写;

import java.util.Arrays;
/*
    工具类的编写:
        1.构造方法私有化(提供私有的无参数构造方法就行,有参数则不能确认什么成员变量/属性填写在构造器中,所以编写无参数的构造方法),使用jvm默认提供的public无参构造方法
        2.工具类只能调用静态方法,指的是带有static关键字,成员方法静态化
        3.总之,就是构造方法/构造器私有化(防止使用new 的方式创建对象),成员方法静态化(能够通过类名调用相关的成员函数/成员方法)
        4.由于JVM会默认提供一个公有public 的无参构造器,使用默认的无参构造器就可以new出对象,所以一定需要创建一个private的私有构造器
 */
public class Demo1工具类的编写 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println(SumUtils.sum());
    }
}

class SumUtils{
    private SumUtils() {

    }
    public static int sum(){
        return 1+1;
    }
}