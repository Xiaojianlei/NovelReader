package com.test.xiaojian.simple_reader.model.bean.packages;

import com.test.xiaojian.simple_reader.model.bean.BaseBean;

import java.util.List;

/**
 * Created by xiaojian on 17-6-2.
 */

public class HotWordPackage extends BaseBean {


    private List<String> hotWords;

    public List<String> getHotWords() {
        return hotWords;
    }

    public void setHotWords(List<String> hotWords) {
        this.hotWords = hotWords;
    }
}
