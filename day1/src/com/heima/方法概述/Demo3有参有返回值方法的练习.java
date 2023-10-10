package com.heima.方法概述;

import java.util.Scanner;

/*
    键盘输入两个数字,求出两个数之间的最大值并返回给调用者
 */
public class Demo3有参有返回值方法的练习 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max = max_num(num1,num2);
        System.out.printf("在两个数中的最大值是"+max);
    }
    public static int max_num(int num1,int num2){
        int max_num = 0;
        return (max_num > num1 ? max_num : num1)>num2?(max_num > num1 ? max_num : num1):num2;
    }
}
