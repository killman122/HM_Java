package com.heima.方法概述;

import com.heima._02类型转换和运算符.Demo3算数运算符;

import java.util.Arrays;

/*
    定义方法打印数组中的元素
    输出格式:[1,2,3,4,4,5,6,...]
 */
public class Demo2有参无返回值方法的练习 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
//        print(arr);
        pprint(arr);
    }

    public static void print(int arr[]) {
//        System.out.println(Arrays.toString(arr));
        String s = Arrays.toString(arr);
        s = s.replace("[", "{");
        s = s.replace("]", "}");
        System.out.println(s);
    }

    public static void pprint(int arr[]) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]);
                continue;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.print('}');
    }
}
