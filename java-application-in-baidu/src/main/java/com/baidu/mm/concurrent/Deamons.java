package com.baidu.mm.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/12.
 */
public class Deamons {
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Deamon());
        d.setDaemon(true);
        d.start();
        System.out.print("d.isDeamon() = " + d.isDaemon() +",");
        //设置不同的睡眠时间,执行结果可能不同,上面一条语句的执行可能再后台线程之前执行,可能穿插再后台线程执行过程中执行
        TimeUnit.SECONDS.sleep(3);
    }
}
