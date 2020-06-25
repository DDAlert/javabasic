package com.imooc.javabasic.proxy.demo2;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        //除了租房，还可以做其他的一些操作
        proxy.rent();
    }
}
