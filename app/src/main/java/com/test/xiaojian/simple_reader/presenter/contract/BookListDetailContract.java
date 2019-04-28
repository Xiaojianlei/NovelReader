package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.BookListDetailBean;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;

/**
 * Created by xiaojian on 17-5-1.
 */

public interface BookListDetailContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(BookListDetailBean bean);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshBookListDetail(String detailId);
    }
}
