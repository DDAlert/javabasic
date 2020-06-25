package com.imooc.javabasic.observermodel.demo1;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("收到消息，进行处理");
    }
}
