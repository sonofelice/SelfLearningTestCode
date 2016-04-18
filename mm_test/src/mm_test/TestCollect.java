package mm_test;


/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年2月22日 上午11:47:30
 * 
 * @author zhangmengmeng01@baidu.com
 */
public class TestCollect {
    public static int i=1;
    
    static{
       // i =3;
    }
    public TestCollect(){
       // i=4;
    }
    public static void main(String[] args) {
        TestCollect tc = new TestCollect();
        System.out.println(tc.i);
    }
}
