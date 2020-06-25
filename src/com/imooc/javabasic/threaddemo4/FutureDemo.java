package com.imooc.javabasic.threaddemo4;

import java.util.concurrent.*;

/**
 * 联系异步计算结果
 */
public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        //1：获取线程池对象
        ExecutorService es = Executors.newCachedThreadPool();
        //2：创建Callable类型的任务对象
        Future<Integer> f = es.submit(new MyCall(1, 2));
//        test1(f);
        boolean b = f.cancel(true);
        Integer v = f.get(1, TimeUnit.SECONDS);//等待时间太短，任务来不及执行完成，会出现异常
        System.out.println("任务执行的结果是："+ v);
    }

    public static void test1(Future<Integer> f) throws ExecutionException, InterruptedException {

        //3：判断任务是否已经完成
        boolean done = f.isDone();
        System.out.println("第一次判断任务是否已经完成："+done);
        boolean cancelled = f.isCancelled();
        System.out.println("第一次判断任务是否已经取消："+cancelled);
        Integer v = f.get();//一直等待任务的执行，知道完成为止
        System.out.println("任务执行的结果是："+v);
        boolean done2 = f.isDone();
        System.out.println("第二次判断任务是否已经完成："+done2);
        boolean cancelled2 = f.isCancelled();
        System.out.println("第二次判断任务是否已经取消："+cancelled2);
    }
}

class MyCall implements Callable<Integer>{

    //通过构造方法传递两个参数
    private int a;
    private int b;

    public MyCall(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public Integer call() throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println(name+"准备开始计算...");
        Thread.sleep(2000);
        System.out.println(name+"计算完成...");
        return a+b;
    }
}
