package com.heima.方法概述;

import java.util.Scanner;

public class Demo1方法定义格式2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        System.out.printf("sum="+sum);//注意在Java中不能使用类似与python中的逗号输出的方式将变量和字符串一起输出
    }
}
