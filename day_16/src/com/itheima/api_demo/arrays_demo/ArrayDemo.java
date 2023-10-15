package com.itheima.api_demo.arrays_demo;

import java.util.Arrays;
import java.util.Random;

/*
    Arrays类: 数组的工具类
        构造方法: private Arrays(){}

        成员方法:
            public static void sort(int[] arr) : 对数组的内容进行升序排序
            public static String toString(int[] arr) : 把数组中的内容以指定的格式字符串进行返回
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {34,22,11,44,55,66};
        //public static String toString(int[] arr) : 把数组中的内容以指定的格式字符串进行返回
        String result = Arrays.toString(arr);
        System.out.println(result);
        //public static void sort(int[] arr) : 对数组的内容进行升序排序
        Arrays.sort(arr);
        System.out.println(arr);
        String string = Arrays.toString(arr);
        System.out.println(
                string
        );
        Random random = new Random();
        for (int i1 = 0; i1 < arr.length; i1++) {
            arr[i1] = random.nextInt(101 - 10) + 10;//生成随机在10-100之间的整数并存在数组中
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(myToString(arr));//由于在类中默认情况下通过类直接调用

    }

    public static String myToString(int[] arr){
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                result.append(arr[i] + "]");
            }else{
                result.append(arr[i]).append(", ");
            }
        }
        return result.toString();
    }

}
