package com.test.xiaojian.simple_reader.ui.adapter;

import com.test.xiaojian.simple_reader.model.bean.CollBookBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.CollBookHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;
import com.test.xiaojian.simple_reader.widget.adapter.WholeAdapter;

/**
 * Created by xiaojian on 17-5-8.
 */

public class CollBookAdapter extends WholeAdapter<CollBookBean> {

    @Override
    protected IViewHolder<CollBookBean> createViewHolder(int viewType) {
        return new CollBookHolder();
    }

}
