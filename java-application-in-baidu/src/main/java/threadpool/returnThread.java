package threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月27日 下午5:49:29 类说明 :
 */
public class returnThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Callable c1 = new MyCallable("A");
        Callable c2 = new MyCallable("B");

        Future f1 = pool.submit(c1);
        Future f2 = pool.submit(c2);

        System.out.println(">>>" + f1.get().toString());
        System.out.println(">>>" + f2.get().toString());
        pool.shutdown();

    }

}
