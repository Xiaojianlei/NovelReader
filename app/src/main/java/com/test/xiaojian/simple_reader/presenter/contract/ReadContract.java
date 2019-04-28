package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.BookChapterBean;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;
import com.test.xiaojian.simple_reader.widget.page.TxtChapter;

import java.util.List;

/**
 * Created by xiaojian on 17-5-16.
 */

public interface ReadContract extends BaseContract{
    interface View extends BaseContract.BaseView {
        void showCategory(List<BookChapterBean> bookChapterList);
        void finishChapter();
        void errorChapter();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void loadCategory(String bookId);
        void loadChapter(String bookId,List<TxtChapter> bookChapterList);
    }
}
