package mm_test;

/**
 * 重写 hashCode 方法
 * @Date: 2016年3月7日 下午4:29:23
 * 
 * @author zhangmengmeng01@baidu.com
 */
public class BmapPoint {

    // 经度
    private double lng;

    // 纬度
    private double lat;

    public BmapPoint() {
    }

    public BmapPoint(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public int hashCode() {
        // String lngs = lng + "";
        // String lats = lat + "";
        // return lngs.hashCode() + lats.hashCode();
        // return new Double(lng).hashCode() + new Double(lat).hashCode();
        return (int) (Double.doubleToLongBits(lng) ^ Double.doubleToLongBits(lng) >>> 32)
                + (int) (Double.doubleToLongBits(lat) ^ Double.doubleToLongBits(lat) >>> 32);
    }

    public boolean equals(Object obj) {
        if (obj instanceof BmapPoint) {
            BmapPoint bmapPoint = (BmapPoint) obj;
            return (bmapPoint.getLng() == lng && bmapPoint.getLat() == lat) ? true : false;
        } else {
            return false;
        }
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
