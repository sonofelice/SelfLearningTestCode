package producerconsumer;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午7:28:55 类说明 :
 */
public class Producer extends Thread {
    private int neednum;
    private Godown godown;

    Producer(int neednum, Godown godown) {
        this.neednum = neednum;
        this.godown = godown;
    }

    public void run() {
        godown.produce(neednum);
    }
}
