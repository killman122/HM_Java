package com.itheima.threadpool_demo;

import java.util.concurrent.*;

/*
    1. 创建线程池

    2. 定义Callable任务

    3. 创建Callable任务，提交任务给线程池

    4. 获取执行结果

<T> Future<T>  submit(Callable<T> task)  提交Callable任务方法

 返回值类型Future的作用就是为了获取任务执行的结果。
 Future是一个接口，里面存在一个get方法用来获取值。

 使用线程池计算 从0~n的和，并将结果返回,所以返回的类型是一个整数
 */
public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池对象,设置的线程池对象的大小最多有5个线程
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        //为线程池提交任务
        Future<Integer> future = threadPool.submit(new Calc(100));//使用submit()方法返回的是一个Future对象是多态的体现,因为Future是一个接口而不是一个普通的类
        Integer i = future.get();//获取到程序执行完毕的结果,由于get()方法具有阻塞的功能,所以会等待线程执行完毕后才会继续执行下面的代码
        //get方法的返回值就是继承Callable后重写call方法的返回值类型
        System.out.println(i);
        //关闭线程池,否则会一直等待任务
        threadPool.shutdown();
    }
}

//定义Callable任务类,创建一个类继承Callable接口
class Calc implements Callable<Integer> {//任务类中的泛型就是返回的结果类型,并且泛型中不能填写基本数据类型的数据,只能填写引用数据类型的数据
    private int n;

    public Calc(int n) {
        this.n = n;
    }

    //如果需要创建多个线程,则创建每个线程都会调用call方法,然而对于一个成员变量来说不需要被每个对象创建一个
    static int sum = 0;//将数据类型改为static只需要创建一个成员变量,所有的对象共享这一个成员变量,所以可以将其改为static类型
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //重写call()方法,call()方法的返回值类型为Integer类型

}