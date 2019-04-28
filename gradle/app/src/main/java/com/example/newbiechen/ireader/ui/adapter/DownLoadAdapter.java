package com.test.xiaojian.simple_reader.ui.adapter;

import com.test.xiaojian.simple_reader.model.bean.DownloadTaskBean;
import com.test.xiaojian.simple_reader.ui.adapter.view.DownloadHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.BaseListAdapter;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;

/**
 * Created by xiaojian on 17-5-12.
 */

public class DownLoadAdapter extends BaseListAdapter<DownloadTaskBean>{

    @Override
    protected IViewHolder<DownloadTaskBean> createViewHolder(int viewType) {
        return new DownloadHolder();
    }
}
