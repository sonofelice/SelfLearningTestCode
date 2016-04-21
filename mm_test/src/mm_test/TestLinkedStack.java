package mm_test;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年4月21日 上午10:59:21
 *
 * @author zhangmengmeng01@baidu.com
 */
public class TestLinkedStack {
    public static void main(String args[]) {
        LinkedStack<String> lss = new LinkedStack<String>();
        for (String s : "Sono Felice mm".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
        System.out.println("test");
    }

}
