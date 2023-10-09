package com.heima._02随机数;

import java.util.Random;
import java.util.Scanner;

/*
    需求:自动生成一个1-100之间的数字,使用程序实现猜出这个数字是多少?
    分析:
        1.随机数   Random
        2.猜数字   Scanner
        3.死循环控制次数,直到猜对了
 */
public class Demo2随机数练习猜数字 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(101-1)+1;
        System.out.println("请猜写生成的随机数是多少");
        Scanner scanner = new Scanner(System.in);//对象创建一个就行,但是使用scanner中的方法nextInt()是循环的直到退出程序
        do {
            int guess_number = scanner.nextInt();
            if (num == guess_number){
                System.out.println("猜对了");
                break;
            }else if (num<guess_number){
                System.out.println("猜的数值比实际随机生成的数值要大");
            }else {
                System.out.println("猜的数值比实际生成的随机数数值要小");
            }
        }while (true);
    }
}
