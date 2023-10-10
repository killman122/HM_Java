package com.heima.位运算符;

/*
    需求:已知两个整数变量a=10,b=20,使用程序将这两个变量的数据交换,最终输出a=20,b=10;
    前提:不允许使用第三方变量
 */
public class 位运算符 {
    public static void main(String[] args) {
//        method();
        //不使用第三方变量实现数据的交换,似乎使用位运算符^能够实现较小的数的,当两个数之间进行异或运算,其中一个数为较大数,一个数为较小数,则两个数之间的异或值为两数之和
        int a = 10;//但是当出现3个及其以上数之间的异或时,两个如a^b^b 则获得的数据为单独的a,可以用在两个或者多个变量直接的交换上
        int b = 20;
        a = a ^ b;//10^20
        b = a ^ b;//10^20^20 = 10
        a = a ^ b;//a =10^20^10=20
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    private static void method() {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
