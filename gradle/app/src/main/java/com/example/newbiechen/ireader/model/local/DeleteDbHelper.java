package com.test.xiaojian.simple_reader.model.local;

import com.test.xiaojian.simple_reader.model.bean.AuthorBean;
import com.test.xiaojian.simple_reader.model.bean.ReviewBookBean;
import com.test.xiaojian.simple_reader.model.bean.BookCommentBean;
import com.test.xiaojian.simple_reader.model.bean.BookHelpfulBean;
import com.test.xiaojian.simple_reader.model.bean.BookHelpsBean;
import com.test.xiaojian.simple_reader.model.bean.BookReviewBean;

import java.util.List;

/**
 * Created by xiaojian on 17-4-28.
 */

public interface DeleteDbHelper {
    void deleteBookComments(List<BookCommentBean> beans);
    void deleteBookReviews(List<BookReviewBean> beans);
    void deleteBookHelps(List<BookHelpsBean> beans);
    void deleteAuthors(List<AuthorBean> beans);
    void deleteBooks(List<ReviewBookBean> beans);
    void deleteBookHelpful(List<BookHelpfulBean> beans);
    void deleteAll();
}
