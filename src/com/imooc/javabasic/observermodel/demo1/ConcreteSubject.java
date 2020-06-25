package com.imooc.javabasic.observermodel.demo1;

/**
 * 具体的主题
 */
public class ConcreteSubject extends Subject {
    //具体的业务
    public void doSometing(){
        super.notifyObserver();
    }
}
