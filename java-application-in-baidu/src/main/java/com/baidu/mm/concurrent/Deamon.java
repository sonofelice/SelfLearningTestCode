package com.baidu.mm.concurrent;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/12.
 */
public class Deamon implements Runnable {
    private Thread[] t = new Thread[10];

    @Override public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DeamonSpawn());
            t[i].start();
            System.out.println("DeamonSpawn " + i + " started!");
        }
        for (int i = 0; i < t.length; i++){
            System.out.println("t[" + i +"].isDeamon()= " + t[i].isDaemon() +",");
        }
        while (true)
            Thread.yield();
    }
}
