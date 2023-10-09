package com.heima._02循环结构;

public class Demo3while循环 {
    public static void main(String[] args) {
        //打印1-5
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
        int i = 1;
        //使用while循环打印1-5,注意在使用while前需要先对while中的循环变量进行初始化,一定要先定义这个变量,并且赋值,否则无法使用while
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        //使用循环打印5-1
        int j=5;
        while (j>=1){
            System.out.println(j);
            j--;
        }
    }
}

