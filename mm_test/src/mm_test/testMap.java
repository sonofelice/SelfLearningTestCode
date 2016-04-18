package mm_test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月3日 下午3:29:57
 * 
 * @author zhangmengmeng01@baidu.com
 */
public class testMap {
    public static void main(String[] args) {
        Map<Long, String> test = new HashMap<Long, String>();
        test.put((long) 1, "mmm");
        test.put((long) 1, "woai");
        System.out.println(test);
    }
}
