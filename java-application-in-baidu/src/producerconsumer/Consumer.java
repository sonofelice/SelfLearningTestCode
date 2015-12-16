package producerconsumer;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午7:29:04 类说明 :
 */
public class Consumer extends Thread {
    private int neednum;
    private Godown godown;

    Consumer(int neednum, Godown godown) {
        this.neednum = neednum;
        this.godown = godown;
    }

    public void run() {
        godown.consume(neednum);
    }
}
