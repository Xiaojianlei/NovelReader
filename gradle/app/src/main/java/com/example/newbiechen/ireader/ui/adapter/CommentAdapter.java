package com.test.xiaojian.simple_reader.ui.adapter;

import android.content.Context;

import com.test.xiaojian.simple_reader.model.bean.CommentBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.CommentHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;
import com.test.xiaojian.simple_reader.widget.adapter.WholeAdapter;

/**
 * Created by xiaojian on 17-4-29.
 */

public class CommentAdapter extends WholeAdapter<CommentBean> {

    public CommentAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<CommentBean> createViewHolder(int viewType) {
        return new CommentHolder(false);
    }
}
