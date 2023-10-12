package com.heima._02循环结构;

/*
    do-while循环:
        格式:
            初始化语句
            do{
                循环体语句;
                条件控制语句  一般使用自增或自减
            }while(条件判断语句)
        执行流程:
            1.执行初始化语句
            2.循环体语句
            3.条件控制语句
            4.条件判断语句    ==> true    循环体语句   ==>条件控制语句 ==>条件判断语句
                            ==> false   结束循环
 */
public class Demo5dowhile循环 {
    public static void main(String[] args) {
        int i = 1;
        //使用while循环打印1-5,注意在使用while前需要先对while中的循环变量进行初始化,一定要先定义这个变量,并且赋值,否则无法使用while
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        //使用循环打印5-1
        int j = 5;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        int k =1;
        do {
            System.out.println(k);
            k++;
        }while (k<=5);
    }
}
