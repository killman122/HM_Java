package com.heima.函数的相关练习;

/*
    数组:int[] arr = {1,43,43,5,4,6,6,7,7,88,9,9,9,0,0,9};
    分析:
        1.定义一个变量空间,来保存最小值所在的数组
        2.对数组元素进行遍历
        3.取出数组中的所有数据,然后和最小值比较
        4.如果当前数据比最小值小,就得到当前数据赋值的最小值
        5.返回比较的最终结果
 */
public class Demo2求数组中的最小值 {
    public static void main(String[] args) {
        int[] arr = {1,43,43,5,4,6,6,7,7,88,9,9,9,-4,0,9};
        int min = getMin(arr);
        System.out.println(min);
    }

    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min>i){
                min = i;
            }
        }
        return min;
    }
}
