package threadpool;

import java.util.concurrent.Callable;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月27日 下午5:51:08 类说明 :
 */
public class MyCallable implements Callable {
    private String oid;

    MyCallable(String oid) {
        this.oid = oid;
    }

    @Override
    public Object call() throws Exception {
        return oid + "the return content";
    }
}
