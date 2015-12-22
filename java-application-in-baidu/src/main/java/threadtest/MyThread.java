package threadtest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午5:49:26 类说明 :
 */
public class MyThread extends Thread {
    private User u;
    private int y = 0;

    MyThread(String name, User u, int y) {
        super(name);
        this.u = u;
        this.y = y;
    }

    public void run() {
        u.oper(y);
    }
}
