package com.xiaohongdian;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * volatile demo
 */
public class VolatileDemo {

    private volatile int n;
    private AtomicInteger an = new AtomicInteger();

    /**
     * volatile 可见性demo
     */
    public void visibilityDemo() {
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n++;
            System.out.println("n="+n);
        });
        thread.start();
        while (n==0) {

        }
        System.out.println("main结束运行");
    }

    /**
     * volatile 不保证原子性
     */
    public void atomicityDemo() {
        for (int i = 0;i<20;i++) {
            Thread thread = new Thread(()->{
                for (int j = 0;j<100;j++) {
                    n++;
                    an.getAndIncrement();
                }
            });
            thread.start();
        }

        Thread.yield();
        System.out.println(n);
        System.out.println(an.get());
    }

}
