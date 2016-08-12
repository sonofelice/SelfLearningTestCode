package com.baidu.mm.concurrent;

import java.util.concurrent.ThreadFactory;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/11.
 */
public class DeamonThreadFactory implements ThreadFactory {
    @Override public Thread newThread(Runnable r) {

        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
