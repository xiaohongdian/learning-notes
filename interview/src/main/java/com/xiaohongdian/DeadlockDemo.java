package com.xiaohongdian;

public class DeadlockDemo {

    /**
     * 使用jps -l查看进程号，jstack +进程号 查看堆栈信息
     */
    public void demo() {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(()->{
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName()+"1");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName()+"2");
                }
            }
        });
        Thread thread2 = new Thread(()->{
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName()+"1");
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName()+"2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
