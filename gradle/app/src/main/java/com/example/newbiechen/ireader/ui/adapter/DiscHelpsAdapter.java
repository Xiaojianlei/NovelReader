package com.test.xiaojian.simple_reader.ui.adapter;

import android.content.Context;

import com.test.xiaojian.simple_reader.model.bean.BookHelpsBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.DiscHelpsHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;
import com.test.xiaojian.simple_reader.widget.adapter.WholeAdapter;

/**
 * Created by xiaojian on 17-4-21.
 */

public class DiscHelpsAdapter extends WholeAdapter<BookHelpsBean>{

    public DiscHelpsAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookHelpsBean> createViewHolder(int viewType) {
        return new DiscHelpsHolder();
    }
}
