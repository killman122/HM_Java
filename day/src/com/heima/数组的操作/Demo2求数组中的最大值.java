package com.heima.数组的操作;

import java.util.Arrays;

public class Demo2求数组中的最大值 {
    public static void main(String[] args) {
//        求数组中元素的最大值,我认为应该有内置的方法,不需要循环遍历数组中的所有内容
        int arr[] = {1,2,3,4,5,6,7,8,9,12};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值是"+max);
        System.out.println("另一种方式调用系统内置的取数组最大值的方法"+ Arrays.stream(arr).max());//这种方式貌似是输出数组中最大值的索引下标并返回,但是这种方法获取的数组下标没有办法直接在数组中调用输出数组元素
        System.out.println("另一种方式调用系统内置的取数组最大值的方法"+ Arrays.stream(arr).max().getAsInt());//这种方式貌似是输出数组中最大值的索引下标并返回,可以将这个数组下标存储在一个变量中,最后在传入数组中,在中间做出一个过渡
    }
}
