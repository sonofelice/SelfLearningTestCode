package com.baidu.mm.concurrent;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/12.
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught: " +e);
    }
}
