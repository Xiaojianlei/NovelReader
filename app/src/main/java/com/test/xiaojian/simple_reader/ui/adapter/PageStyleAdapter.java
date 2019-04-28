package com.test.xiaojian.simple_reader.ui.adapter;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.test.xiaojian.simple_reader.ui.adapter.view.PageStyleHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.BaseListAdapter;
import com.test.xiaojian.simple_reader.ui.base.adapter.BaseViewHolder;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;
import com.test.xiaojian.simple_reader.widget.page.PageStyle;

/**
 * Created by xiaojian on 17-5-19.
 */

public class PageStyleAdapter extends BaseListAdapter<Drawable> {
    private int currentChecked;

    @Override
    protected IViewHolder<Drawable> createViewHolder(int viewType) {
        return new PageStyleHolder();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        IViewHolder iHolder = ((BaseViewHolder) holder).holder;
        PageStyleHolder pageStyleHolder = (PageStyleHolder) iHolder;
        if (currentChecked == position){
            pageStyleHolder.setChecked();
        }
    }

    public void setPageStyleChecked(PageStyle pageStyle){
        currentChecked = pageStyle.ordinal();
    }

    @Override
    protected void onItemClick(View v, int pos) {
        super.onItemClick(v, pos);
        currentChecked = pos;
        notifyDataSetChanged();
    }
}
