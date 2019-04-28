package com.test.xiaojian.simple_reader.ui.adapter;

import com.test.xiaojian.simple_reader.model.bean.packages.SearchBookPackage;
import com.test.xiaojian.simple_reader.ui.adapter.view.SearchBookHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.BaseListAdapter;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;

/**
 * Created by xiaojian on 17-6-2.
 */

public class SearchBookAdapter extends BaseListAdapter<SearchBookPackage.BooksBean>{
    @Override
    protected IViewHolder<SearchBookPackage.BooksBean> createViewHolder(int viewType) {
        return new SearchBookHolder();
    }
}
