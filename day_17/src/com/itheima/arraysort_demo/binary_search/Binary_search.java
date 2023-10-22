package com.itheima.arraysort_demo.binary_search;

public class Binary_search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binary_search(arr, 1));
    }

    //方法的功能是,接收一个数组和一个元素,返回此元素在数组中出现的索引,但是实质上Java中arrs中自带了二分查找
    public static int binary_search(int[] arr, int num) {//其中num表示要查找的元素,arr表示需要查找的数组序列
        int min = 0;
        int max = arr.length - 1;
        //循环查找,但是需要min<=max
        while (min <= max) {
            int mid = (min + max)/2;
            if (arr[mid]==num) return mid;
            else if (num>arr[mid]){
                min = mid+1;
            }else if (num<arr[mid]){
                max = mid-1;
            }
        }
        //当查找后的min>max则返回-1,并退出循环查找
        return -1;
    }
}
