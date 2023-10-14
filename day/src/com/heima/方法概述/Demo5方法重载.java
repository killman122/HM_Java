package com.heima.方法概述;
import java.util.Arrays;
import java.util.Scanner;

/*
    方法的重载:
        1.在同一个类中,方法名相同
        2.方法的参数列表不同(参数的个数或者参数的类型不同)
        3.方法的返回值类型不做要求,和返回值的类型无关,只要满足1,2两个条件即可
 */
public class Demo5方法重载 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        double crr[] = {1.0,2,3,4,5,6.0,7,8,9};
        System.out.println(Arrays.toString(crr));
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();

    }
    /*
        定义方法,求两个int类型数据的和
            返回值:void
            参数:int a
     */
    public static void sum(){

    }
    public static void sum(int a,int b){

    }
    public static void sum(double a,int b){

    }

}
