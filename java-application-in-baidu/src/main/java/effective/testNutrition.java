package effective;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月3日 下午6:43:10 类说明 :
 */
public class testNutrition {
    public static void main(String[] args) {
        NutritionFacts co = new NutritionFacts.Builder(240, 8).calories(100).sodium(23).carbohydrate(27).build();
        System.out.println("888");
    }
}
