package com.itheima.lock;

public class DeadLock {
    public static void main(String[] args) {
        String 筷子A = "筷子A";
        String 筷子B = "筷子B";
        new Thread(()->{
            while (true){
                synchronized (筷子A){
                    System.out.println(Thread.currentThread().getName()+"拿到了"+筷子A+"等待筷子B");
                    synchronized (筷子B){
                        System.out.println(Thread.currentThread().getName()+"拿到了"+筷子B+"并且加上之前的筷子A");
                        System.out.println(Thread.currentThread().getName()+"吃饭");
                    }//释放筷子B
                }//释放筷子A
            }
        },"小明").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (筷子B){
                        System.out.println(Thread.currentThread().getName()+"拿到了"+筷子B);
                        synchronized (筷子A){
                            System.out.println(Thread.currentThread().getName()+"拿到了"+筷子A+"并且加上之前拿到的筷子B");
                            System.out.println(Thread.currentThread().getName()+"吃饭");
                        }//释放筷子A
                    }//释放筷子B
                }
            }
        },"小红").start();
    }
}
