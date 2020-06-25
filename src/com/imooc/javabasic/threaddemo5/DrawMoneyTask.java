package com.imooc.javabasic.threaddemo5;

public class DrawMoneyTask implements Runnable{
    //存款数量
    private static int allMoney=1000;
    //用户名称
    private String userName;
    //取多少钱
    private int money;

    public DrawMoneyTask(String userName,int money) {
        this.userName = userName;
        this.money = money;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(userName+"正在使用"+name+"取钱...");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (DrawMoneyTask.class){
            if (money <= allMoney){
                allMoney = allMoney-money;
                System.out.println(userName+"取出了"+money+",剩余"+allMoney);
            }else {
                System.out.println(userName+"取钱失败，余额不足，剩余"+allMoney+",想取"+money);
            }
        }

    }
}
