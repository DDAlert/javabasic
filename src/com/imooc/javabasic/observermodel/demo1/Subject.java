package com.imooc.javabasic.observermodel.demo1;

import java.util.Vector;

/**
 * 观察者模式，主题
 */
public class Subject {
    //观察者数组
    private Vector<Observer> vector = new Vector<>();

    //增加一个观察者
    public void addObserver(Observer observer){
        this.vector.add(observer);
    }
    //删除一个观察者
    public void deleteObserver(Observer observer){
        this.vector.remove(observer);
    }
    //通知所有观察者
    public void notifyObserver(){
        for (Observer observer : this.vector) {
            observer.update();
        }
    }
}
