package com.imooc.javabasic.proxy.demo3;

public class Client {
    public static void main(String[] args) {
        UserServiceImp userServiceImp = new UserServiceImp();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserServiceImp(userServiceImp);
        proxy.add();

    }

}
