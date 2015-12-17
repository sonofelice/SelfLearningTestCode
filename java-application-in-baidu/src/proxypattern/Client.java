package proxypattern;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月1日 下午12:33:22 类说明 :
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.operate();
    }

}
