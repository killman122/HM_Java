package com.heima._02类型转换和运算符;

public class Demo6短路逻辑运算符 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //普通逻辑运算符,通过测试可以发现,在普通逻辑运算符中,&运算符前的值已经为false,但是依旧会运算&运算符后面的,对于|运算符也是同理,只是将|前的值从false转为true
        //        System.out.println(a++>30&b++>30);
        //短路逻辑运算符,当运算符前的数据已经计算为false,那么将不会计算运算符后的数据,对于||运算符也是同理,只是将|前的值从false转为true
        System.out.println(a++ > 30 && b++ > 30);
        System.out.println(a);
        System.out.println(b);
    }
}
