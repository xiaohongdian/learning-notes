package com.xiaohongdian.observerpattern;

public class ObserverDemo1 implements Observer {
    @Override
    public void update(Object o) {
        System.out.println(this.getClass()+"获得数据："+o);
    }
}
