package com.heima._02循环结构;
/*
需求:
    世界上最高的山峰珠穆朗玛峰
 */
public class Demo4while循环练习 {
    public static void main(String[] args) {
        //定义一个纸张的厚度,定义珠峰的高度
        //运算:只要纸张的厚度小于珠峰高度,就折叠,折叠一次纸张的厚度的2倍
        //折叠一次记录一下折叠的次数
        int count = 0;
        double paper = 0.1;
        double zf = 884430;
        while (paper<zf){
            paper*=2;
            count++;
        }
        System.out.println("折叠次数"+count);
    }
}
