package com.heima.数组的操作;
/*
    需求:某部门5名员工的销售额分别是:16,26,36,6,100,计算出部门的销售额
    分析:
        1.定义变量用来存储数组中最终的和
        2.遍历数组获取数组中的每一个元素
        3.累加求和
        4.打印输出结果(输出最终的和)
 */
public class Demo1数组操作 {
    public static void main(String[] args) {
        int arr[] = {16,26,36,6,100};
        //定义变量用来存储数组中最终的和
        int sum=0;
        //遍历数组获取数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("输出的最后的结果值是"+sum);
    }
}
