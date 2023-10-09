package com.heima._02循环结构;

public class Demo2for循环逢7必过 {
    public static void main(String[] args) {
        //遍历1-100 之间的数字,判断是否包含7,如果包含7,打印该数字,或者是7的倍数,或者个位上是7,或者10位上是7
        for (int i = 1; i <= 100; i++) {
            if(i%7==0||i%10==7||i/10%10==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
