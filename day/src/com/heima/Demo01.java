package com.heima;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("善学如春起之苗");
        // 创建浮点型变量,在创建一个浮点型变量时,无论是使用F还是f都能够创建一个java的浮点类型数据,但是一般情况下建议大写
        float f1 = 3.12f;
        float f2 = -3.12F;
        System.out.println(f1);
        System.out.println(f2);
        //定义两个double类型的变量,分别赋值,并输出在控制台
        double d1 = -3.4;
        double d2 = 3.4;
        System.out.println(d1);
        System.out.println(d2);
        //定义byte类型的变量,值为整数,只要在byte数据范围中即可,byte范围:-128~127
        byte b = 66;
        System.out.println(b);
        //定义short类型的变量,值为整数,只要在short数据范围中即可,short范围:-32768~32767
        short s = 12342;
        System.out.println(s);
        //浮点数的默认类型是double
        double d = 123.23;
        System.out.println(d);
        //布尔类型数据只有两个取值
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
    }
}
