package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.BookDetailBean;
import com.test.xiaojian.simple_reader.model.bean.BookListBean;
import com.test.xiaojian.simple_reader.model.bean.CollBookBean;
import com.test.xiaojian.simple_reader.model.bean.HotCommentBean;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by xiaojian on 17-5-4.
 */

public interface BookDetailContract {
    interface View extends BaseContract.BaseView{
        void finishRefresh(BookDetailBean bean);
        void finishHotComment(List<HotCommentBean> beans);
        void finishRecommendBookList(List<BookListBean> beans);

        void waitToBookShelf();
        void errorToBookShelf();
        void succeedToBookShelf();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshBookDetail(String bookId);
        //添加到书架上
        void addToBookShelf(CollBookBean collBook);
    }
}
