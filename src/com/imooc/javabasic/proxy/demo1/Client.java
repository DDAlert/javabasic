package com.imooc.javabasic.proxy.demo1;

public class Client {
    public static void main(String[] args) {
        //真实角色
        TestClass testClass = new TestClass();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(testClass);
        //动态生成代理类
        TestInterface proxy = (TestInterface) pih.getProxy();
        proxy.add();
    }
}
