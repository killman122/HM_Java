package com.heima._02类型转换和运算符;

/*
    三元运算符:
    格式: 关系表达式? 表达式1:表达式2
 */
public class Demo7三元运算符 {
    public static void main(String[] args) {
        int a = 11;
        int b = 10;
//        求两个数的最大值
//        int max = Math.max(a, b);
        int max = a > b ? a : b;
//      求两个数的最小值
        int min = Math.min(a, b);
//        int min = a < b ? a : b;
        System.out.println(max);

    }
}
