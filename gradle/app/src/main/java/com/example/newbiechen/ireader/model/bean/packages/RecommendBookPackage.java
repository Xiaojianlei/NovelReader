package com.test.xiaojian.simple_reader.model.bean.packages;

import com.test.xiaojian.simple_reader.model.bean.BaseBean;
import com.test.xiaojian.simple_reader.model.bean.CollBookBean;

import java.util.List;

/**
 * Created by xiaojian on 17-5-8.
 */

public class RecommendBookPackage extends BaseBean {

    private List<CollBookBean> books;

    public List<CollBookBean> getBooks() {
        return books;
    }

    public void setBooks(List<CollBookBean> books) {
        this.books = books;
    }
}
