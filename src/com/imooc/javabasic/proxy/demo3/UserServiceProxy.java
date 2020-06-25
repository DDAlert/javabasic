package com.imooc.javabasic.proxy.demo3;

public class UserServiceProxy implements UserService {
    private UserServiceImp userServiceImp;

    public void setUserServiceImp(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @Override
    public void add() {
        userServiceImp.add();
        log("add");
    }

    @Override
    public void delete() {
        userServiceImp.delete();
        log("delete");
    }

    @Override
    public void update() {
        userServiceImp.update();
        log("update");
    }

    @Override
    public void query() {
        userServiceImp.query();
        log("query");
    }

    //新增一个日志方法
    //日志方法
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
