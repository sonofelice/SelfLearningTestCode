package threadtest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月24日 下午5:43:15 类说明 :
 */
public class User {
    private String code;
    private int cash;

    User(String code, int cash) {
        this.code = code;
        this.cash = cash;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void oper(int x) {
        try {
            Thread.sleep(10L);
            synchronized (this) {
                this.cash += x;
                System.out.println(Thread.currentThread().getName() + "is over,add \"" + x + "\"currtent cash is :"
                        + cash);
                Thread.sleep(10L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "User{" + "code=" + code + '\"' + ",cash=" + cash + '}';
    }
}
