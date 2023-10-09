package com.heima.数组的操作;

import java.util.Arrays;

public class Demo3求数组的最小值 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 33, 4, 44, 5};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("数组中的最小值是" + min);
        System.out.println("---------------------------");
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("数组中的最小值是" + min);
        System.out.println("---------------------------");
        int min_index = Arrays.stream(arr).min().getAsInt();//使用该流式方法获取的数据是整个数组中的最大值,而不是返回数组中最小值的下标
        System.out.println("数组中的最小值是" + min_index);
    }
}
