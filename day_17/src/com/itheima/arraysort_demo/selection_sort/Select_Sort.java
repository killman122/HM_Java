package com.itheima.arraysort_demo.selection_sort;

import java.util.Arrays;

public class Select_Sort {
    public static void main(String[] args) {
        int [] arr = {55,11,44,22,33};
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //index代表当前元素中最小元素的索引
            int index = i;
            //拿到当前排序元素之后的所有内容
            for (int j = i+1;j < arr.length;j++){
                if (arr[index]>arr[j]){//也就是说当前元素不是最小元素,当前元素的后面的元素中有比当前元素小的元素
                    //将更小的元素索引赋值给index
                    index = j;
                }
            }
            //如果要确定的位置索引和最小元素的索引相等,说明不需要交换
            //元素交换
            if (i!=index){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
