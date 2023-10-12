package com.heima.函数的相关练习;

import java.util.Scanner;

public class Demo3计算出数组中指定元素出现的次数 {
    public static void main(String[] args) {
       int []arr = {1,43,43,5,4,6,6,7,7,88,9,9,9,0,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个要查找次数的元素");
        int num = scanner.nextInt();
        int count = getCount(arr,num);
        System.out.println("数组中指定元素出现的次数为"+count);

    }

    private static int getCount(int[] arr, int num) {
        int count = 0;//可以在初始化变量的时候赋值或者不赋值,但是赋值可能会解决后续过程中由于目标不出现变量返回异常的问题
        for (int i : arr) {
            if (i==num){
                count++;
            }
        }
        return count;
    }
}
