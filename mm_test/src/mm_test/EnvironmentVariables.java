package mm_test; 

import java.util.Map;

/** 
 * 打印系统变量
 * @Date: 2016年4月18日 下午7:17:57 
 *
 * @author zhangmengmeng01@baidu.com
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
 