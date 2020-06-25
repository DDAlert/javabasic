package com.imooc.javabasic.observermodel.demo3;

/**
 * 定义一个被观察者，就是主题
 */
public interface Subject {
    //订阅的操作，新增
    public void add(Observer observer);
    //取消订阅的操作
    public void remove(Observer observer);
    //通知的操作
    public void notifyupdate();
}
