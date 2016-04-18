package mm_test;

import java.util.Date;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年2月22日 上午11:47:58
 * 
 * @author zhangmengmeng01@baidu.com
 */
public class UserInfo {
    public String name;
    public int age;
    public String sex;
    Date birth;

    public UserInfo(String name, int age, String sex, Date birth) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birth = birth;
    }
}
