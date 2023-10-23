package com.itheima.throws_demo;

public class Exception_ThrowDemo {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        printArray(arr);//出现空指针异常在调用方法printArr时
    }
    /*
        使用NullPointerException异常类声明是运行时期异常
              1.表示告知调用者当前的方法可能会出现这些异常,在调用时需要注意
              2.如果代码中没有出现任何异常,那么代码会正常执行
              3.如果代码中出现了异常，那么会把异常交给本方法调用者处理
     */
    public static void printArray(int[] arr) throws NullPointerException{//在Exception异常类和它的子类中,出了,RuntimeException是运行时异常
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
