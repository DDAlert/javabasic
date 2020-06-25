package com.imooc.javabasic.threaddemo;

import java.util.List;

/**
 * 需求：
 * 编写一个线程类，需要继承Thread类，设计一个线程的属性用于保存线程的名字；
 * 设计一个集合用于保存所有的任务；
 */

public class MyWorker extends Thread{
    private String name;//保存线程的名字
    private List<Runnable> tasks;//保存所有的任务
    //利用构造方法，给成员变量赋值
    public MyWorker(String name,List<Runnable> tasks){
        super(name);
        this.tasks = tasks;
    }
    @Override
    public void run() {
        //判读集合中是否有任务，只要有，就一直执行任务
        while (tasks.size() > 0){
            Runnable r = tasks.remove(0);
            r.run();
        }
    }
}
