package com.imooc.javabasic.proxy.demo4;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东租房");
    }
}
