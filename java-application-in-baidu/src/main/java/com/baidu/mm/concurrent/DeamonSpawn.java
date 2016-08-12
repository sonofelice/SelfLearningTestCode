package com.baidu.mm.concurrent;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/12.
 */
public class DeamonSpawn implements Runnable {
    @Override public void run() {
        while (true){
            Thread.yield();
        }
    }
}
