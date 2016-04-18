package mm_test;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年2月26日 下午3:17:20
 * 
 * @author zhangmengmeng01@baidu.com
 */
public enum testEnum {

    HAS_STATION(1, "有站"), HAS_NO_STATION(2, "无站");

    private Integer value;

    private String desc;

    private testEnum(Integer value, String desc) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getDesc() {
        return desc;
    }

    public static void main(String[] args) {
        System.out.println(testEnum.HAS_NO_STATION.getDesc());
    }
}
