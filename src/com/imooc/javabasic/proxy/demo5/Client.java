package com.imooc.javabasic.proxy.demo5;

import com.imooc.javabasic.proxy.demo3.UserServiceImp;
import com.imooc.javabasic.proxy.demo3.UserService;

import java.util.LinkedHashSet;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImp userService = new UserServiceImp();
        //代理角色
        ProxyInvocationHandler ph = new ProxyInvocationHandler();
        ph.setTarget(userService);
        UserService proxy = (UserService) ph.getProxy();
        proxy.delete();

    }
}
