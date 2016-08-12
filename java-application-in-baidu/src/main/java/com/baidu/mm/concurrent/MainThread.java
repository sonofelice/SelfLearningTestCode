package com.baidu.mm.concurrent;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/11.
 */
public class MainThread {
    public static void main(String[] args) {
//        LiftOff launch = new LiftOff();
//        launch.run();
//
//        Thread t = new Thread(new LiftOff());
//        t.start();
//        System.out.println("waiting for liftoff!");
//

        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
            System.out.println("waiting for liftoff!");
        }
    }
}
