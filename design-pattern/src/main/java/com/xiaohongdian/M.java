package com.xiaohongdian;

import com.xiaohongdian.observerpattern.Observer;
import com.xiaohongdian.observerpattern.ObserverDemo1;
import com.xiaohongdian.observerpattern.Subject;
import com.xiaohongdian.observerpattern.SubjectDemo;

public class M {
    public static void main(String[] args) {
        SubjectDemo subject = new SubjectDemo();
        Observer observer1 = new ObserverDemo1();
        Observer observer2 = new ObserverDemo1();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.changeData();
        subject.changeData();
    }
}
