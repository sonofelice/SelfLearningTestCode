package threadpool;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月27日 下午4:54:17 类说明 :
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is now running");
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
