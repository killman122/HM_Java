package com.heima.函数的相关练习;

/*
    定义功能完成数组的求和,一个功能要求求偶数和,一个功能要求求奇数和,一个功能要求求总和
 */
public class Demo1数组求和练习 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int odd_sum = sum_odd(arr); //奇数
        int even_sum = sum_even(arr);//偶数
        int sum = sum_all(arr);//总和
        System.out.println("数组中奇数元素的和为" + odd_sum);
        System.out.println("数组中偶数元素的和为" + even_sum);
        System.out.println("数组中奇数元素的和为" + sum);
    }

    private static int sum_all(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static int sum_even(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0)
                sum += i;
        }
        return sum;
    }

    private static int sum_odd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                sum += arr[i];
        }
        return sum;
    }


}
