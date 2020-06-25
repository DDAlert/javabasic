package com.imooc.javabasic.threaddemo2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 练习Executor获取ExecutorService，然后调用方法提交任务；
 */
public class MyTest {
    public static void main(String[] args) {
        //1:使用工厂类获取线程池对象
        ExecutorService es = Executors.newCachedThreadPool();
        //2:提交任务
        for (int i = 0; i < 10; i++) {
            es.submit(new MyRunnable(i));
        }
    }
}
/**
 * 任务类，包含一个任务编号，在任务中打印出是哪一个线程正在执行任务
 */
class MyRunnable implements Runnable{
    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("线程："+Thread.currentThread().getName()+" 执行了任务..." + id);
    }
}
