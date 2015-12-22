package threadtest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午4:38:50 类说明 :
 */
public class Foo {
    private int x = 100;

    public int getX() {
        return x;
    }

    public int fix(int y) {
        synchronized (this) {
            x = x - y;
        }

        return x;
    }
}
