package com.test.xiaojian.simple_reader.ui.adapter;

import android.content.Context;

import com.test.xiaojian.simple_reader.model.bean.BookReviewBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.DiscReviewHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;
import com.test.xiaojian.simple_reader.widget.adapter.WholeAdapter;

/**
 * Created by xiaojian on 17-4-21.
 */

public class DiscReviewAdapter extends WholeAdapter<BookReviewBean> {

    public DiscReviewAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookReviewBean> createViewHolder(int viewType) {
        return new DiscReviewHolder();
    }
}
