package com.itheima.thread_demo.thread_method;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
    实现线程的第三种方式 : 实现Callable接口
 */
public class MyThread03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建Callable的实现类对象任务对象
        MyCallable myCallable = new MyCallable();
        //使用FutureTask类来包装Callable接口的实现类对象,FutureTask的泛型取决于下面的实现类中的对象的泛型/重写call()方法的返回值,创建桥梁连接Callable和线程Thread的Runnable接口
        FutureTask<String> task = new FutureTask<>(myCallable);//FutureTask是Runnable接口的实现类(子类型),所以可以将其作为参数传入到Thread类的构造方法中
        //创建线程对象
        Thread thread = new Thread(task);
        thread.start();//由于此处的线程没有放入任务对象,所以执行没有任何的效果

        //使用Callable接口后线程执行完毕的结果获取,使用get方法获取线程执行完毕的结果,此方法会抛出异常,所以需要使用try...catch...语句进行异常的处理
        String s = task.get();//get方法具有阻塞的功能,当线程没有执行完毕时,会一直等待线程执行完毕后才会继续执行下面的代码
        System.out.println(s);//但是如果将get方法获取线程执行结果删除,则还是会出现资源竞争交替执行线程的现象,因为线程执行完毕后并没有获取线程执行完毕的结果,所以不会阻塞,所以会出现资源竞争的现象

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
//创建类实现Callable接口
class MyCallable implements Callable<String> {//Callable接口的泛型是下面call方法的返回值类型
    //此方法中的泛型是call方法的返回值类型,是线程执行完毕的结果
    @Override
    public String call() throws Exception {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        return Thread.currentThread().getName()+"执行完毕";
    }
}