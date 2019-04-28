package com.test.xiaojian.simple_reader.ui.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.test.xiaojian.simple_reader.ui.adapter.view.CategoryHolder;
import com.test.xiaojian.simple_reader.ui.base.EasyAdapter;
import com.test.xiaojian.simple_reader.ui.base.adapter.IViewHolder;
import com.test.xiaojian.simple_reader.widget.page.TxtChapter;

/**
 * Created by xiaojian on 17-6-5.
 */

public class CategoryAdapter extends EasyAdapter<TxtChapter> {
    private int currentSelected = 0;
    @Override
    protected IViewHolder<TxtChapter> onCreateViewHolder(int viewType) {
        return new CategoryHolder();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        CategoryHolder holder = (CategoryHolder) view.getTag();

        if (position == currentSelected){
            holder.setSelectedChapter();
        }

        return view;
    }

    public void setChapter(int pos){
        currentSelected = pos;
        notifyDataSetChanged();
    }
}
