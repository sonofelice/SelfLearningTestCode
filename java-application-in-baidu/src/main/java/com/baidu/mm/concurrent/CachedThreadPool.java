package com.baidu.mm.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/11.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0;i<5;i++){

            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
