package com.baidu.mm.concurrent;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/11.
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    public static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOfff!") + ").";
    }

    @Override public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
