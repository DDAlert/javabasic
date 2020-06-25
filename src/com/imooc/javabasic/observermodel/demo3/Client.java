package com.imooc.javabasic.observermodel.demo3;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        RealObserver realObserver1 = new RealObserver();
        RealObserver realObserver2 = new RealObserver();
        realSubject.add(realObserver1);
        realSubject.add(realObserver2);
        realSubject.notifyupdate();

    }
}
