package com.baidu.mm.innerclass;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月24日 下午6:51:35
 *
 * @author zhangmengmeng01@baidu.com
 */
public class Parcel9 {
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
    }

}
