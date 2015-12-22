package threadtest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午4:10:33 类说明 :
 */
public class First {
    public static void main(String[] args) {
        // DoSomething ds1 = new DoSomething("萌萌");
        // DoSomething ds2 = new DoSomething("萝卜");
        //
        // Thread t1 = new Thread(ds1);
        // Thread t2 = new Thread(ds2);
        // t1.start();
        // t2.start();
        Thread t1 = new TestThread("萌萌");
        Thread t2 = new TestThread("萝卜");
        t1.start();
        t2.start();
    }
}
