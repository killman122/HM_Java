package com.heima._02类型转换和运算符;

public class Demo2强制类型转换 {
    public static void main(String[] args) {
        int a = 130; //当数据的最大值超过了要转换的小的数据类型的精度后,byte为-128~127 130-127=3 超出了3 由于精度之间首尾相连 +1 得到-128 再+1 得到-127 再+1 得到-126
        byte b = (byte) a;
        System.out.println(b);
        int c =120; //虽然int类型属于大的数据类型在和byte数据类型的比较中,但是由于120在byte数据类型的精度-127~128的范围之中
        byte d = (byte) c;
        System.out.println(d);
    }
}
