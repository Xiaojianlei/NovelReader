package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.BookCommentBean;
import com.test.xiaojian.simple_reader.model.flag.BookDistillate;
import com.test.xiaojian.simple_reader.model.flag.BookSort;
import com.test.xiaojian.simple_reader.model.flag.CommunityType;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by xiaojian on 17-4-20.
 */

public interface DiscCommentContact {

    interface View extends BaseContract.BaseView{
        void finishRefresh(List<BookCommentBean> beans);
        void finishLoading(List<BookCommentBean> beans);
        void showErrorTip();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void firstLoading(CommunityType block, BookSort sort, int start, int limited, BookDistillate distillate);
        void refreshComment(CommunityType block, BookSort sort, int start, int limited, BookDistillate distillate);
        void loadingComment(CommunityType block, BookSort sort, int start, int limited, BookDistillate distillate);
        void saveComment(List<BookCommentBean> beans);
    }
}
