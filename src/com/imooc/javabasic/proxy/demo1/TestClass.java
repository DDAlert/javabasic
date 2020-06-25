package com.imooc.javabasic.proxy.demo1;

public class TestClass implements TestInterface {

    @Override
    public void add() {
        System.out.println("这是一个add方法");
    }
}
