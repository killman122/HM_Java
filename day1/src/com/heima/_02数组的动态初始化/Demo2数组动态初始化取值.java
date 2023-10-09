package com.heima._02数组的动态初始化;

/*
    动态初始化数组取值:
        格式:数组数据类型   变量名 = 数组名[索引];
    索引:
        索引是数组中每个初始化控件的编号,索引从0开始编号   到数组的长度减1,数组索引每次递增1
    动态初始化数组有默认值:  无论数组的数据类型是属于什么整型     默认值都是 0
    byte short int long  类型的默认值都是 0
    float double 类型的默认值都是 0.0
    boolean 类型的默认值是 false
    char 类型的默认值是 \u0000
    String引用数据类型的默认值是 null
 */
public class Demo2数组动态初始化取值 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        System.out.println(arr);
//        数组的索引就是 0 1 2
//        格式: 数组数据类型    变量名 = 数组名[索引];
//        int 类型数组的默认取值为0
        int a = arr[1];
        System.out.println(a);
        int b = arr[0];
        System.out.println(a);
        int c = arr[2];
        System.out.println(a);
        System.out.println("-----------------------");
        byte[] brr = new byte[3];
        System.out.println(brr[0]);
        System.out.println(brr[1]);
        System.out.println(brr[2]);
        System.out.println("-----------------------");
        short[] crr = new short[3];
        System.out.println(crr[0]);
        System.out.println(crr[1]);
        System.out.println(crr[2]);
        System.out.println("-----------------------");
        long drr[] = new long[3];
        System.out.println(drr[0]);
        System.out.println(drr[1]);
        System.out.println(drr[2]);
        System.out.println("-----------------------");
        float err[] = new float[3];
        System.out.println(err[0]);
        System.out.println(err[1]);
        System.out.println(err[2]);
        System.out.println("-----------------------");
        double[] frr = new double[3];
        System.out.println(frr[0]);
        System.out.println(frr[1]);
        System.out.println(frr[2]);
        System.out.println("-----------------------");
        char[] grr = new char[3];
        System.out.println(grr[0]);
        System.out.println(grr[1]);
        System.out.println(grr[2]);
        System.out.println("-----------------------");
        boolean hrr[] = new boolean[3];
        System.out.println(hrr[0]);
        System.out.println(hrr[1]);
        System.out.println(hrr[2]);
        System.out.println("-----------------------");
        String[]irr = new String[3];
        System.out.println(irr[0]);
        System.out.println(irr[1]);
        System.out.println(irr[2]);
    }
}
