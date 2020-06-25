package com.imooc.javabasic.proxy.demo2;

/**
 * 中介
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHous();
        fee();
        constract();
    }

    //看房
    public void seeHous(){
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fee(){
        System.out.println("收中介费");
    }

    //签合同
    public void constract(){
        System.out.println("签合同");
    }
}
