package com.imooc.javabasic.threaddemo3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * 测试ScheduledExecutorService接口中延迟执行任务和重复执行任务的功能
 */
public class ScheduledExecutorServiceDemo2 {
    public static void main(String[] args) {
        //1:获取一个具备延迟执行任务的线程池对象
        ScheduledExecutorService es = Executors.newScheduledThreadPool(3, new ThreadFactory() {
            int n = 1;
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"自定义线程名："+n++);
            }
        });
        //2:创建多个任务对象，提交对象，每个任务延迟2秒执行
            es.scheduleAtFixedRate(new MyRunnable2(1),1,2,TimeUnit.SECONDS);
        System.out.println("over");
    }
}

class MyRunnable2 implements Runnable{
    private int id;

    public MyRunnable2(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程："+Thread.currentThread().getName()+"执行了任务："+id);
    }
}