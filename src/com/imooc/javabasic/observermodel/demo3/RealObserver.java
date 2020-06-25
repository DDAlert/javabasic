package com.imooc.javabasic.observermodel.demo3;

public class RealObserver implements Observer {
    @Override
    public void update() {
        System.out.println("牛奶厂有牛奶啦，快来呀");
    }
}
