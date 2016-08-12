package com.baidu.mm.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/11.
 */
public class SimpleDeamons implements Runnable {
    @Override public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread deamon = new Thread(new SimpleDeamons());
            deamon.setDaemon(true);
            deamon.start();
        }
        System.out.println("All Deamons start");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
