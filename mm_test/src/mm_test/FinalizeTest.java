package mm_test;

/**
 * finalize()方法测试
 * 
 * @Date: 2016年4月14日 下午8:22:29
 *
 * @author zhangmengmeng01@baidu.com
 */
public class FinalizeTest {
    boolean checkOut = false;

    FinalizeTest(boolean checkOut) {
        this.checkOut = checkOut;
    }

    void checkIn() {
        checkOut = true;
    }

    protected void finalize() {
        if (checkOut) {
            System.out.println("Error:check out");
        }
    }
}
