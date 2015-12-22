package threadtest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午4:19:30 类说明 :
 */
public class test {
    public static void main(String[] args) {
        User u = new User("萌萌", 100);
        MyThread t1 = new MyThread("Thread A", u, 10);
        MyThread t2 = new MyThread("Thread B", u, -20);
        MyThread t3 = new MyThread("Thread C", u, -80);
        MyThread t4 = new MyThread("Thread D", u, 30);
        MyThread t5 = new MyThread("Thread E", u, 60);
        MyThread t6 = new MyThread("Thread E", u, 10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
