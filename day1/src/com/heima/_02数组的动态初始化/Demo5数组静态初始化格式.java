package com.heima._02数组的动态初始化;
/*
    数组静态初始化格式:
        格式1:
            数据类型[] 数组名 = new 数据类型[]{值1,值2,值3,值4,值5};
            int [] arr = new int[]{1,2,3,4,5};
        格式2:
            数据类型[] 数组名 = {......}
            int[] arr = {1,2,3,4,...};
    静态初始化数组用来存放已知值的数组

    求数组的长度:
        格式:数组名.length

    遍历数组的通用格式:
        for(int i=0;i<数组名.length;i++){
            System.out.println(数组名[i]);
        }
 */
public class Demo5数组静态初始化格式 {
    public static void main(String[] args) {
//        数据类型[] 数组名 = new 数据类型[]{值1,值2,值3,值4,值5};
        int [] arr = new int[]{1,2,3,4,5};
//        数据类型[] 数组名 = {......}
        int[] brr = {1,2,3,4,5};
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------------------");
        int crr[] = {1,22,3,4,4,5,5,5,5,6,7,7,88,68,8,8,5,4,2,5,6,6};
//        方式1:使用for循环遍历数组
        for (int i : crr) { //这种输出数组中元素的方法和python中输出列表等可迭代对象的方法很像在python中使用的是for..in 的方法遍历
            System.out.println(i);
        }
//        方式2:求出数组的长度使用数组的长度在for循环中遍历数组中的元素输出
        System.out.println("数组的长度是"+crr.length);
        for (int i = 0; i < crr.length; i++) {
            System.out.println(crr[i]);
        }
    }
}
