package com.heima.finalDemo;
/*
    final 修饰的变量
    变量可以是基本数据类型: 变量值只能赋值一次,不允许修改
    变量可以是引用数据类型: 变量的地址值只能赋值一次,不允许修改,但是地址引用类型的内容可以修改
 */
public class FinalDemo1 {
    public static void main(String[] args) {
        final int NUM = 10;
//        NUM = 100;// 报错,不允许修改
        final int arr[] = {1,2,3};
        arr[1] = 0;
//        arr = new int[]{1,2,3,4};// 报错,不允许修改,将新创建的数组地址赋值给arr
    }
}
