package proxypattern;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月1日 下午12:30:46 类说明 :
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operate() {
        System.out.println("before operate...");
        subject.operate();
        System.out.println("after operate...");
    }

}
