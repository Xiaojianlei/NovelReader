package com.test.xiaojian.simple_reader.ui.adapter;

import com.test.xiaojian.simple_reader.model.bean.CommentBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.CommentHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.BaseListAdapter;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;

/**
 * Created by xiaojian on 17-4-29.
 */

public class GodCommentAdapter extends BaseListAdapter<CommentBean>{
    @Override
    protected IViewHolder<CommentBean> createViewHolder(int viewType) {
        return new CommentHolder(true);
    }
}
