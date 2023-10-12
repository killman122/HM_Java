package com.heima._02类型转换和运算符;

public class Demo8三元运算符求三个数之间的最小值 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int max = (a>b?a:b)>c?(a>b?a:b):c;
//        int max = Math.max((a > b ? a : b), c);
        System.out.println("max数最大值为"+max);
    }
}
