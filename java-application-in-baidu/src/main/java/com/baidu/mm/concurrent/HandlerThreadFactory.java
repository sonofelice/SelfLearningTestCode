package com.baidu.mm.concurrent;

import java.util.concurrent.ThreadFactory;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/12.
 */
public class HandlerThreadFactory implements ThreadFactory {
    @Override public Thread newThread(Runnable r) {
        System.out.println(this + " creating new thread");
        Thread t = new Thread(r);
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        return t;
    }
}
