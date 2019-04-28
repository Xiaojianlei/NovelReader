package com.test.xiaojian.simple_reader.ui.adapter;

import android.content.Context;

import com.test.xiaojian.simple_reader.model.bean.BookCommentBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.DiscCommentHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;
import com.test.xiaojian.simple_reader.widget.adapter.WholeAdapter;

/**
 * Created by xiaojian on 17-4-20.
 */

public class DiscCommentAdapter extends WholeAdapter<BookCommentBean> {

    public DiscCommentAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookCommentBean> createViewHolder(int viewType) {
        return new DiscCommentHolder();
    }
}
