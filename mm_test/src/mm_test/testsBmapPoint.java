package mm_test;

import java.util.HashMap;
import java.util.Map;

/**
 * 验证重写了 hashCode 方法之后是否能获取到自己想要的对象
 * @Date: 2016年3月7日 下午4:29:57
 * 
 * @author zhangmengmeng01@baidu.com
 */
public class testsBmapPoint {
    public static void main(String[] args) {
        Map<BmapPoint, Long> bmap = new HashMap<BmapPoint, Long>();

        BmapPoint bp1 = new BmapPoint(3.14, 3.25);
        BmapPoint bp2 = new BmapPoint(3.14, 3.25);
        BmapPoint bp3 = new BmapPoint(3.25, 3.14);

        bmap.put(bp2, (long) 2);

        System.out.println(bmap.get(bp1));
        System.out.println(bmap.get(bp2));
        //System.out.println(bmap.get(bp3));

    }
}
