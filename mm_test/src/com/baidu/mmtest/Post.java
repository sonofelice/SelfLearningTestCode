package com.baidu.mmtest;

import java.util.List;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月16日 上午9:35:33
 *
 * @author zhangmengmeng01@baidu.com
 */
public class Post implements Entity, Taggable {

    public final static int KIND = 1001;

    private Taggable taggable;
    private int id;
    private String title;

    public Post(int id, String title) {
        this.id = id;
        this.title = title;
        this.taggable = new TaggableImpl(this);

    }

    @Override
    public void addTag(int tagId) {
        taggable.addTag(tagId);
    }

    @Override
    public List<Integer> getTags() {
        return taggable.getTags();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getKind() {
        return KIND;
    }

}
