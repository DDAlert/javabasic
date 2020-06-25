package com.imooc.javabasic.thread;

import javax.xml.transform.Source;

public class DeadLockDemo {
    public static void main(String[] args) {
        dead_lock();
    }

    private static void dead_lock() {
        String resource1 = "resource1";
        String resource2 = "resource2";
        Thread thread1 = new Thread(){
            public void run(){
                synchronized (resource1){
                    //先获取resource1
                    System.out.println("thread1 lock resource1");
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //尝试获取resource2
                    synchronized (resource2){
                        System.out.println("thread1 lock resource1");
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                synchronized (resource2){
                    //先获取resource1
                    System.out.println("thread2 lock resource2");
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //尝试获取resource2
                    synchronized (resource1){
                        System.out.println("thread2 lock resource1");
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
