package com.baidu.mm.concurrent;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/12.
 */
public class ExceptionThread2 implements Runnable {
    @Override public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by " + t);
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
