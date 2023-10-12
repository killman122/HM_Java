package com.heima.函数的相关练习;

import java.util.Arrays;

/*
    数组的反转:(不是将一个数组反向传递给另一个数组,而是交换本数组中的元素)
        int arr[] = {19,28,37,46,50};
        交换反转后的数组 arr={50,46,37,28,19}
 */
public class Demo5数组的反转 {
    public static void main(String[] args) {
        int arr[] = {19,28,37,46,50};
//        reverseArray(arr);//使用ctrl+alt+m进行代码抽取,抽取出一个新的函数
        for (int start = 0,end=arr.length-1;start<end;start++,end--) {//在for循环中可以将for循环中的初始化变量中用多个变量进行定义,最后的条件也可以有多个
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;//使用双头遍历赋值的方法,减少了循环的次数
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        //定义开始的索引
        int start = 0;
        //定义结束的索引
        int end = arr.length-1;

        //判断开始的索引小于结束的索引
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;//使用双头遍历赋值的方法,减少了循环的次数
            start++;
            end--;
        }

        //打印反转后的数组
//        System.out.println(arr);//使用该方法打印的是地址
        System.out.println(Arrays.toString(arr));
    }

}
