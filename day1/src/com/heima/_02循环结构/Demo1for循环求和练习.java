package com.heima._02循环结构;

public class Demo1for循环求和练习 {
    public static void main(String[] args) {
        //求1-100之间的所有数字之和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("1-100之间的所有数字之和为:"+sum);
    }
}
