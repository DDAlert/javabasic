package com.imooc.javabasic.threaddemo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 练习Executor获取ExecutorService，然后调用方法提交任务；
 */
public class MyTest4 {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1(){
        //1:使用工厂类获取线程池对象
        ExecutorService es = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            es.submit(new MyRunnable4(i));
        }
    }
    public static void test2(){
        //1:使用工厂类获取线程池对象
        ExecutorService es = Executors.newSingleThreadExecutor(new ThreadFactory() {
            int n = 1;
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"自定义名称"+n++);
            }
        });
        for (int i = 0; i < 10; i++) {
            es.submit(new MyRunnable4(i));
        }
    }
}

/**
 * 任务类，包含一个任务编号，在任务中打印出是哪一个线程正在执行任务
 */
class MyRunnable4 implements Runnable{
    private int id;

    public MyRunnable4(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("线程："+Thread.currentThread().getName()+" 执行了任务..." + id);
    }
}


