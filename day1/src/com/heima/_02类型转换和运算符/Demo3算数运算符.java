package com.heima._02类型转换和运算符;

/**
 * 算数运算符
 * + : 数学中的加
 * - : 数学中的减
 * * : 数学中的乘
 * / : 数学中的除
 * % : 数学中的求余数
 */
public class Demo3算数运算符 {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println(a+b); //30
        System.out.println(a-b); //-10
        System.out.println(a*b); //200
        System.out.println(a/b); //0 由于被除数小于出书所以得到的商为0
        System.out.println(a%b); //10
    }
}
