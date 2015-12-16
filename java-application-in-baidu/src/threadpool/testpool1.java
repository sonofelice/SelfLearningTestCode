package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月27日 下午4:53:40 类说明 :
 */
public class testpool1 {
    public static void main(String[] args) {
        // ExecutorService pool = Executors.newFixedThreadPool(2);
        // ExecutorService pool = Executors.newSingleThreadExecutor();
        // ExecutorService pool = Executors.newCachedThreadPool();
        // pool = Executors.news

        BlockingQueue<Runnable> bqueue = new ArrayBlockingQueue<Runnable>(20);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 2, TimeUnit.MICROSECONDS, bqueue);

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();
        Thread t6 = new MyThread();
        Thread t7 = new MyThread();

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.execute(t6);
        pool.execute(t7);

        pool.shutdown();
    }
}
