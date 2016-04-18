package com.baidu.mmtest;

import java.util.List;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月16日 上午9:30:50
 *
 * @author zhangmengmeng01@baidu.com
 */
public interface Taggable {
    public void addTag(int tagId);

    public List<Integer> getTags();
}
