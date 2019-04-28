package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.BookHelpsBean;
import com.test.xiaojian.simple_reader.model.flag.BookDistillate;
import com.test.xiaojian.simple_reader.model.flag.BookSort;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by xiaojian on 17-4-21.
 */

public interface DiscHelpsContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(List<BookHelpsBean> beans);
        void finishLoading(List<BookHelpsBean> beans);
        void showErrorTip();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void firstLoading(BookSort sort, int start, int limited, BookDistillate distillate);
        void refreshBookHelps(BookSort sort, int start, int limited, BookDistillate distillate);
        void loadingBookHelps(BookSort sort, int start,int limited,BookDistillate distillate);
        void saveBookHelps(List<BookHelpsBean> beans);
    }
}
