package com.heima._02类型转换和运算符;

public class Demo1自动类型转换 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        // byte 类型的数据不能直接转换为char数据类型,但是可以使用强制类型转换的函数
        char c = (char) a;
        long d = a; //可以将小的数据类型的数据赋值给大的数据类型的数据使得,小的数据类型通过隐式类型转换给大的数据类型数据
        double e = a; //将小的数据类型byte类型数据a转换给大的数据类型double,注意double是最大的数据类型
    }
}
