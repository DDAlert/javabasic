package com.imooc.javabasic.threaddemo5;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //创建一个线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                20,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(1),
                new ThreadFactory() {
                    int id = 1;
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r,"ATM"+id++);
                    }
                }
        );
        for (int i = 0; i < 2; i++) {
            DrawMoneyTask task = new DrawMoneyTask("客户" + i, 800);
            pool.submit(task);
        }
        pool.shutdown();
    }
}
