package com.imooc.javabasic.observermodel.demo3;

import java.util.ArrayList;

public class RealSubject implements Subject {
    private  ArrayList<Observer> list = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyupdate() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
