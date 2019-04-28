package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.SortBookBean;
import com.test.xiaojian.simple_reader.model.flag.BookSortListType;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by xiaojian on 17-5-3.
 */

public interface BookSortListContract {
    interface View extends BaseContract.BaseView{
        void finishRefresh(List<SortBookBean> beans);
        void finishLoad(List<SortBookBean> beans);
        void showLoadError();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshSortBook(String gender, BookSortListType type, String major, String minor, int start, int limit);
        void loadSortBook(String gender,BookSortListType type,String major,String minor,int start,int limit);
    }
}
