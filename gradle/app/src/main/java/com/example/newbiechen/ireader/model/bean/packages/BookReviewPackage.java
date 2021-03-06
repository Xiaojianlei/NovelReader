package com.test.xiaojian.simple_reader.model.bean.packages;

import com.test.xiaojian.simple_reader.model.bean.BaseBean;
import com.test.xiaojian.simple_reader.model.bean.BookReviewBean;

import java.util.List;

/**
 * Created by xiaojian on 17-4-21.
 */

public class BookReviewPackage extends BaseBean {

    private List<BookReviewBean> reviews;

    public List<BookReviewBean> getReviews() {
        return reviews;
    }

    public void setReviews(List<BookReviewBean> reviews) {
        this.reviews = reviews;
    }
}
