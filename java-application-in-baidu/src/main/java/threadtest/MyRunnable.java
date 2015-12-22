package threadtest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午4:44:52 类说明 :
 */
public class MyRunnable implements Runnable {
    private Foo fo = new Foo();

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread ta = new Thread(r, "Thread-A");
        Thread tb = new Thread(r, "Thread_B");
        ta.start();
        tb.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            this.fix(30);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":current x value = " + fo.getX());
        }
    }

    public int fix(int y) {
        return fo.fix(y);
    }

}
