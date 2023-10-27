package com.itheima.threadpool_demo;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    使用线程池模拟游泳教练教学生游泳。游泳馆（线程池）内有3名教练（线程），游泳馆招收了5名学员学习游泳（任务）

    ### **实现步骤：**

    1. 创建线程池指定3个线程

    2. 定义学员类实现Runnable，

    3. 创建学员对象给线程池

    ### 如何定义线程池
    使用工具类Executors的静态方法：

    public static ExecutorService newFixedThreadPool (int num) 指定线程池最大线程池数量获取线程池,返回一个线程池对象
 */
public class Test1 {
    public static void main(String[] args) {
        //获取线程池,返回的是线程池接口类型的对象实质上就是多态的应用,ExecutorService是接口,接口没有对象,所以返回的一定时接口的实现类对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //给线程池提交任务
        executorService.submit(new Student("小m"));//submit中的参数可以是Callable接口的实现类对象,也可以是Runnable接口的实现类对象
        executorService.submit(new Student("小a"));//submit中的参数可以是Callable接口的实现类对象,也可以是Runnable接口的实现类对象
        executorService.submit(new Student("小b"));//submit中的参数可以是Callable接口的实现类对象,也可以是Runnable接口的实现类对象
        executorService.submit(new Student("小c"));//submit中的参数可以是Callable接口的实现类对象,也可以是Runnable接口的实现类对象
        executorService.submit(new Student("小d"));//submit中的参数可以是Callable接口的实现类对象,也可以是Runnable接口的实现类对象
        //关闭线程池,否则会一直等待任务
        executorService.shutdown();
    }

}
//定义学员类实现Runnable
class Student implements Runnable{
    public Student(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在教"+name+"学习游泳");//由于这里的Student类的run()中重写的任务需要提交到线程池中,所以实质上使用currentThread()获取的线程为线程池中创建的线程
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}