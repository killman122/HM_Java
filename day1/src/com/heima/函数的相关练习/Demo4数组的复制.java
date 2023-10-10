package com.heima.函数的相关练习;

import java.util.Arrays;

/*
    把一个数组中的元素复制到另一个数组中去
    分析:
        1.参数: int arr[]
        2.返回值: 有,类型数组
 */
public class Demo4数组的复制 {
    public static void main(String[] args) {
        int arr[] = {21,22,344,354,54,65,32,67,35,75};
        int[] brr = copyArray(arr);
        System.out.println(Arrays.toString(brr));
    }

    private static int[] copyArray(int[] arr) {
        int brr[] = new int[arr.length];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }

//    方法2直接调用数组的clone()方法直接复制数组中的元素到一个新的数组中
//    public static int[] copyArray(int arr[]){
//        int brr[] = new int[arr.length];
//        brr = arr.clone();
////        for (int i : arr) {
//////            brr.clone
////            System.out.println(i);
////        }
//        return brr;
//    }
}
