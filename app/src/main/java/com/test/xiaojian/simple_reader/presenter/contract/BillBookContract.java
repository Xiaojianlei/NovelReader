package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.BillBookBean;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by xiaojian on 17-5-3.
 */

public interface BillBookContract {
    interface View extends BaseContract.BaseView{
        void finishRefresh(List<BillBookBean> beans);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshBookBrief(String billId);
    }
}
