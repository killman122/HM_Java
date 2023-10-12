package com.heima.二维数组;

import java.util.Random;

/*
    定义 getNewArr() 静态方法:要求传入一个int类型的数组arr,遍历数组,将数组中小于10的元素替换成0,然后返回修改之后的数组

    在main方法中完成:
        1.定义一个长度为5的int类型的数组
        2.随机生成5个随机数存入数组(随机数的范围在5到50之间),并把数组中的元素打印在控制台
        3.调用getNewArr方法,在控制台打印返回后的数组中的元素
 */
public class Demo2数组的作业 {
    public static void main(String[] args) {
        //定义一个长度为5的int类型的数组
        int arr[] = new int[5];
        //随机生成5个随机数存入数组(随机数的范围在5-50之间),并把数组中的元素打印在控制台
        //对于对象的生成只需要一次即可,但是对于对象中的调用可以很多次,不需要在重复创建对象
        Random random = new Random();
        for (int i = 0; i < 5; i++) {//注意random方法中是没有边界值的算入
            int num = random.nextInt(51 - 5)+5;
        }
    }
}
