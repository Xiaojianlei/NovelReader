package com.test.xiaojian.simple_reader.ui.adapter;

import com.test.xiaojian.simple_reader.model.bean.SectionBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.SectionHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.BaseListAdapter;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;

/**
 * Created by xiaojian on 17-4-16.
 */

public class SectionAdapter extends BaseListAdapter<SectionBean> {
    @Override
    protected IViewHolder<SectionBean> createViewHolder(int viewType) {
        return new SectionHolder();
    }
}
