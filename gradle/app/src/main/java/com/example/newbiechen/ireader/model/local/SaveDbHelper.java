package com.test.xiaojian.simple_reader.model.local;

import com.test.xiaojian.simple_reader.model.bean.AuthorBean;
import com.test.xiaojian.simple_reader.model.bean.DownloadTaskBean;
import com.test.xiaojian.simple_reader.model.bean.packages.BillboardPackage;
import com.test.xiaojian.simple_reader.model.bean.ReviewBookBean;
import com.test.xiaojian.simple_reader.model.bean.BookCommentBean;
import com.test.xiaojian.simple_reader.model.bean.BookHelpfulBean;
import com.test.xiaojian.simple_reader.model.bean.BookHelpsBean;
import com.test.xiaojian.simple_reader.model.bean.BookReviewBean;
import com.test.xiaojian.simple_reader.model.bean.packages.BookSortPackage;

import java.util.List;

/**
 * Created by xiaojian on 17-4-28.
 */

public interface SaveDbHelper {
    void saveBookComments(List<BookCommentBean> beans);
    void saveBookHelps(List<BookHelpsBean> beans);
    void saveBookReviews(List<BookReviewBean> beans);
    void saveAuthors(List<AuthorBean> beans);
    void saveBooks(List<ReviewBookBean> beans);
    void saveBookHelpfuls(List<BookHelpfulBean> beans);

    void saveBookSortPackage(BookSortPackage bean);
    void saveBillboardPackage(BillboardPackage bean);
    /*************DownloadTask*********************/
    void saveDownloadTask(DownloadTaskBean bean);
}
