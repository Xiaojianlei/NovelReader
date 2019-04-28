package com.test.xiaojian.simple_reader.ui.adapter;

import android.content.Context;

import com.test.xiaojian.simple_reader.model.bean.SortBookBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.BookSortListHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;
import com.test.xiaojian.simple_reader.widget.adapter.WholeAdapter;

/**
 * Created by xiaojian on 17-5-3.
 */

public class BookSortListAdapter extends WholeAdapter<SortBookBean>{
    public BookSortListAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<SortBookBean> createViewHolder(int viewType) {
        return new BookSortListHolder();
    }
}
