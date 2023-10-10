package com.heima.二维数组;

/*
    某公司季度,和月份统计数据如下:单位(万元)
    第一季度:22,66,44
    第二季度:77,33,88
    第三季度:25,45,65
    第四季度:11,66,99
 */
//public class Demo1二维数组 {
//    public static void main(String[] args) {
//        int arr[][] = new int[4][3];
//        System.out.println(arr);
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////            for (int j = 0; j < arr[0].length; j++) {
////                System.out.println(arr[i][j]);
////            }
////        }
//        //改进版本的一维数组的遍历
//        for (int i = 0; i < arr.length; i++) {
//            //当数组中的元素不一定是定长时,该方法会有奇效
////            int brr[] = arr[i];
//            //内层循环遍历每个数组中的每个元素
//            for (int i1 = 0; i1 < arr[i].length; i1++) {
//                System.out.println(arr[i][i1]);
//            }
//
//        }
//    }
//}


import java.math.BigDecimal;

public class Demo1二维数组 {
    public static void main(String[] args) {
//        int arr[][] = new int[4][3];
        int arr[][] = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
//1.遍历数组,获取每个月的销售额度
//        获取每一个一维数组
        for (int i = 0; i < arr.length; i++) {
            //获取每一个一维数组中的元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("每个月的销售额度为"+arr[i][j]);
            }
        }
        System.out.println(arr);

        //求出二维数组的长度,也就是二维数组中的元素个数,使用双层for循环
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
            }
        }
        BigDecimal bigDecimal = new BigDecimal(count);//参数中也可放字符串
        BigDecimal s = new BigDecimal("" + count);
//        s.divide(c)   //bigDecimal 对象具有除法可以直接调用求平均值,之后可以调用round()方法设置保留的小数位数
    }
}
