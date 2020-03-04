package com.xiaohongdian.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectDemo implements Subject {

    private List<Observer> observerList = new ArrayList();

    private int data;

    @Override
    public void addObserver(Observer observer) {
        if (observer!=null) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index>-1) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observerList) {
            observer.update(data);
        }
    }

    public void changeData() {
        data++;
        notifyObservers();
    }
}
