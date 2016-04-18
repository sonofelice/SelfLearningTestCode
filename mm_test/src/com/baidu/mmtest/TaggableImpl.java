package com.baidu.mmtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月16日 上午9:31:41
 *
 * @author zhangmengmeng01@baidu.com
 */
public class TaggableImpl implements Taggable {

    private Entity target;

    public TaggableImpl(Entity target) {
        this.target = target;
    }

    @Override
    public void addTag(int tagId) {
        int id = target.getId();
        int kind = target.getKind();
        System.out.println("insert into  ... values " + id + "," + kind + "," + tagId + ")");
    }

    @Override
    public List<Integer> getTags() {
        return new ArrayList<Integer>();
    }
}
