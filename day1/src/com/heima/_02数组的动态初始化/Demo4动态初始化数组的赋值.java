package com.heima._02数组的动态初始化;
/*
    动态初始化数组的赋值:
        格式:
            数组名[索引] = 值;
 */
public class Demo4动态初始化数组的赋值 {
    public static void main(String[] args) {
        int arr[]=new int[3];//在Java中对数组的初始化貌似没有C++和python列表的更加简单
        // 数组名[索引] = 值;
//        注意:在对数组中的某个数据进行赋值后,那么该变量则无法进行默认值的赋值 并且对于数组中变量的赋值不能中断,也就是说对于数组元素的赋值不能间断的赋值
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
