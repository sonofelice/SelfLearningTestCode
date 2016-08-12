package com.baidu.mm.concurrent;

import java.util.concurrent.Callable;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/11.
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }
    @Override public String call() throws Exception {
        return "Result of TaskWithResult " + id;
    }
}
