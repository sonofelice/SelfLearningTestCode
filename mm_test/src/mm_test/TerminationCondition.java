package mm_test;


/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年4月14日 下午8:25:43
 *
 * @author zhangmengmeng01@baidu.com
 */
public class TerminationCondition {

    
    public static void main(String[] args) {
        
        /**  
         * 测试 String 的  +
         * 和 StringBuilder  的 append 方法效率 
         * */
        
        long start1 = System.currentTimeMillis();
        String res1 = "";
        for (int i = 1; i < 100000; i++) {
            res1 += i;
        }
        System.out.println(System.currentTimeMillis()-start1);
        
        long start2 = System.currentTimeMillis();
        StringBuilder res2 = new StringBuilder();
        for(int i=1;i<100000;i++){
            res2.append(i);
        }
        System.out.println(System.currentTimeMillis()-start2);
        
        
        // 对应输出为：%test%
        String title = "test";
        System.out.println(String.format(" and name like '%%%s%%'", title));

    }
}
