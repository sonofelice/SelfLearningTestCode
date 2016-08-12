package com.baidu.mm.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/11.
 */
public class DeanomFromFactory implements Runnable{
    @Override public void run() {
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + "  " + this);
            } catch (InterruptedException e) {
                System.out.println("Intruppted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DeamonThreadFactory());
        for (int i = 0; i<10;i ++){
            exec.execute(new DeanomFromFactory());
        }
        System.out.println("all start");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
