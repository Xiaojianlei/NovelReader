package com.test.xiaojian.simple_reader.presenter.contract;

import com.test.xiaojian.simple_reader.model.bean.packages.SearchBookPackage;
import com.test.xiaojian.simple_reader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by xiaojian on 17-6-2.
 */

public interface SearchContract extends BaseContract {

    interface View extends BaseView{
        void finishHotWords(List<String> hotWords);
        void finishKeyWords(List<String> keyWords);
        void finishBooks(List<SearchBookPackage.BooksBean> books);

        void errorBooks();
    }

    interface Presenter extends BasePresenter<View>{
        void searchHotWord();
        //搜索提示
        void searchKeyWord(String query);
        //搜索书籍
        void searchBook(String query);
    }
}
