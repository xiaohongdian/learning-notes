package com.xiaohongdian;

public class M {
    public static void main(String[] args) {
        /*DeadlockDemo deadlockDemo = new DeadlockDemo();
        deadlockDemo.demo();*/
        VolatileDemo volatileDemo = new VolatileDemo();
        //volatileDemo.visibilityDemo();
        volatileDemo.atomicityDemo();
    }
}
