package com.heima.数组的操作;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    键盘录入一个大于等于10的数字,是数组的长度
    如果键盘中录入的数字小于10,提示用户重新输入
 */
public class Demo5数组的作业 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len_arr = 0;
        while (true) {
            System.out.println("请输入一个大于等于10的数字：");
            len_arr = scanner.nextInt();//只要scanner对象存在,重复调用方法就能够实现重复接收数据
            if (len_arr < 10) {
                System.out.println("输入有误，你输入的数字小于10，请重新输入");
            } else {
                break;
            }
        }
        int arr[] = new int[len_arr];
        System.out.println("输出创建的数组对象的长度,但是还没有为数组对象进行赋值");
//        创建随机数对象
        Random random = new Random();
        //生成随机数在22--99之间的随机数
        for (int i = 0; i < arr.length; i++) {
            int num_Random = random.nextInt(100 - 22) + 22;
            arr[i] = num_Random;
        }
        System.out.println("至此数组中的元素赋值成功");
//      数组至此创建完成
        //输出数组中的元素在一行中显示
        System.out.println(Arrays.toString(arr));
        //打印数组中的元素,5个元素作为一行
        //定义统计变量count
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            System.out.println(arr[i]);//打印输出数组后的元素
            if (count%5==0){//当count数为5也就是数组中出现了5个元素一组,需要实现换行
                System.out.println();
            }
        }
    }
}