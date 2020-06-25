package com.imooc.javabasic.proxy.demo4;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色:现在还没有，ProxyInvocationHandler只是一个处理程序
        ProxyInvocationHandler ph = new ProxyInvocationHandler();
        //通过调用ProxyInvocationHandler处理程序来处理我们要调用的接口对象
        ph.setRent(host);
        Rent proxy = (Rent) ph.getProxy();
        proxy.rent();
    }
}
