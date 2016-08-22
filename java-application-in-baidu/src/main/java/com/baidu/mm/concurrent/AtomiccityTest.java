package com.baidu.mm.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/16.
 */
public class AtomiccityTest implements Runnable{
    private int i = 0;

    public synchronized int getValue() {
        return i;
    }

    public synchronized void evenIncrement() {
        i++;
        i++;
    }
    public void run(){
        while (true){
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();;
        AtomiccityTest at = new AtomiccityTest();
        exec.execute(at);
        while (true){
            int val = at.getValue();
            if (val%2 != 0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
