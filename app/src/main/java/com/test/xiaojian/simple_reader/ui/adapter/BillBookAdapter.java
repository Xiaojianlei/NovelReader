package com.test.xiaojian.simple_reader.ui.adapter;

import com.test.xiaojian.simple_reader.model.bean.BillBookBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.BillBookHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.BaseListAdapter;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;

/**
 * Created by xiaojian on 17-5-3.
 */

public class BillBookAdapter extends BaseListAdapter<BillBookBean> {
    @Override
    protected IViewHolder<BillBookBean> createViewHolder(int viewType) {
        return new BillBookHolder();
    }
}
