package com.heima._02数组的动态初始化;

/*
    动态初始化数组的遍历:
        1.索引是连续的,每次递增1
        2.使用循环遍历获取数组的索引
        3.使用循环遍历获取数组的索引对应的值
 */
public class Demo3动态初始化数组的遍历 {
    public static void main(String[] args) {
        //定义一个数组长度为5
        int arr[] = new int[5];
        System.out.println(arr);
        //数组的索引就是 0 1 2 3 4
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
//        打印数组
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
//        打印数组的方式2
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
