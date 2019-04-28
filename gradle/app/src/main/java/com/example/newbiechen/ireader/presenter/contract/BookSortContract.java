package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.packages.BookSortPackage;
import com.test.xiaojian.simple_reader.model.bean.packages.BookSubSortPackage;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;

/**
 * Created by xiaojian on 17-4-23.
 */

public interface BookSortContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(BookSortPackage sortPackage, BookSubSortPackage subSortPackage);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshSortBean();
    }
}
