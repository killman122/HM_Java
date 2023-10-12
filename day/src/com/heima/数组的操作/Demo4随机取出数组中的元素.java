package com.heima.数组的操作;

import com.heima._02数组的动态初始化.Demo3动态初始化数组的遍历;

import java.util.Random;

/*
    某公司开发部有5名人员,要进行项目进展的汇报处理,现在采取随机排名的方式进行汇报,请先依次录入
    5名员工的编号,然后展示出一组随机的排名顺序

    在python中使用random.shuffle和simple方法都能够实现对应的功能
 */
public class Demo4随机取出数组中的元素 {
    public static void main(String[] args) {
        //使用数组 存储员工号
        int arr[] = {22, 33, 44, 55, 66, 77};
        //定义一个新的空数组,用来存放即将打乱后的数组
        int brr[] = new int[arr.length];
        //按照数组的长度随机生成随机数
        Random random = new Random();
        int i = 0;
        while (i < arr.length) {
            int n = random.nextInt(arr.length);
            boolean flag = true;//使用flag做标志位,当出现不符合情况的时候将flag置为false
            for (int aBrr : brr) {
                if (arr[n] == aBrr) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                brr[i] = arr[n];
                i++;
            }
        }
        for (int i1 : brr) {
            System.out.println(i1);
        }

//        //使用数组 存储员工号
//        int arr[] = {22,33,44,55,66,77};
//        //定义一个新的空数组,用来存放即将打乱后的数组
//        int brr[] = new int[arr.length];
//        //按照数组的长度随机生成随机数
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            int n = random.nextInt(arr.length);
//            System.out.println(n);
//            for (int i1 = 0; i1 < brr.length; i1++) {
//                if(arr[n]==brr[i1]){
//                    continue;
//                }
//                brr[i] = arr[n];
//            }
//        }
//        for (int i = 0; i < brr.length; i++) {
//            System.out.println(brr[i]);
//        }
    }
}
