package proxypattern;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月1日 上午11:59:54 类说明 :
 */
public class RealSubject implements Subject {

    @Override
    public void operate() {
        System.out.println("realsubject");
    }

}
