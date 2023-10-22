package com.itheima.arraysort_demo.bubble_sort;

import java.util.Arrays;

/*
    冒泡排序 :将一组数据按照从小到人的顺序进行排序胃泡排序的原理 :相邻元素两两作比较 ，大的元素往后放
    注意
        1 如果有n个数进行排序，总共需要比较n-1次
        2 每一次比较完毕，下一次的比较就会少-个数据参与
    需求 : 将数组中的元素 {5,4,3,2,1}进行升序排序
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        //冒泡排序
        //第一轮排序
        //在数组的边界中减1为了防止数组的越界
//        for (int i = 0; i <arr.length-1; i++) {//i 能够取到的索引最大值为3
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i + 1];
//                arr[i + 1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        //第二轮排序
//        for (int i = 0; i <arr.length-1-1; i++) {//i 由于缺少一个元素,最后一个元素已经处理过,不需要在进行处理,所以总的长度还是需要在减少1
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i + 1];
//                arr[i + 1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        //第3轮排序
//        for (int i = 0; i <arr.length-1-1-1; i++) {//i 由于缺少一个元素,最后一个元素已经处理过,不需要在进行处理,所以总的长度还是需要在减少1
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i + 1];
//                arr[i + 1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        //第4轮排序
//        for (int i = 0; i <arr.length-1-1-1-1; i++) {//i 由于缺少一个元素,最后一个元素已经处理过,不需要在进行处理,所以总的长度还是需要在减少1
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i + 1];
//                arr[i + 1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        //由于需要循环四次,在总共5个元素并且所有的元素都是打乱顺序的情况下
        //第一的升级的结果
//        for (int x = 0; x < 4; x++) {
//            for (int i = 0; i <arr.length-1-x; i++) {//i 由于缺少一个元素,最后一个元素已经处理过,不需要在进行处理,所以总的长度还是需要在减少1
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i + 1];
//                    arr[i + 1] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
        //第二次升级结果
        //所以需要使用for循环嵌套
        //外层循环控制循环的次数,比较的轮数,5个元素比较4轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制每一轮比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换位置
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
