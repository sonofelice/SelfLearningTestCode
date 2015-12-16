package producerconsumer;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午6:53:58 类说明 :
 */
public class Godown {
    public static final int max_size = 100;
    public int curnum;

    Godown() {
    }

    Godown(int curnum) {
        this.curnum = curnum;
    }

    public synchronized void produce(int neednum) {
        while (neednum + curnum > max_size) {
            System.out.println("要生产的数量" + neednum + "超过剩余库存数量" + (max_size - curnum) + "暂时不能执行生产任务");
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        curnum += neednum;
        System.out.println("已经生产了" + neednum + "个产品，现库存量为：" + curnum);
        notifyAll();
    }

    public synchronized void consume(int neednum) {
        while (curnum < neednum) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        curnum -= neednum;
        System.out.println("已经消费了" + neednum + "个产品，现存储量为：" + curnum);
        notifyAll();
    }
}
