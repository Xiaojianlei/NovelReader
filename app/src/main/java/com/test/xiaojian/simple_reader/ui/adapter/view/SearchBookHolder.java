package com.test.xiaojian.simple_reader.ui.adapter.view;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.test.xiaojian.simple_reader.R;
import com.test.xiaojian.simple_reader.model.bean.packages.SearchBookPackage;
import com.test.xiaojian.simple_reader.ui.base.adapter.ViewHolderImpl;
import com.test.xiaojian.simple_reader.utils.Constant;

/**
 * Created by xiaojian on 17-6-2.
 */

public class SearchBookHolder extends ViewHolderImpl<SearchBookPackage.BooksBean> {

    private ImageView mIvCover;
    private TextView mTvName;
    private TextView mTvBrief;

    @Override
    public void initView() {
        mIvCover = findById(R.id.search_book_iv_cover);
        mTvName = findById(R.id.search_book_tv_name);
        mTvBrief = findById(R.id.search_book_tv_brief);
    }

    @Override
    public void onBind(SearchBookPackage.BooksBean data, int pos) {
        //显示图片
        Glide.with(getContext())
                .load(Constant.IMG_BASE_URL + data.getCover())
                .placeholder(R.drawable.ic_book_loading)
                .error(R.drawable.ic_load_error)
                .into(mIvCover);

        mTvName.setText(data.getTitle());

        mTvBrief.setText(getContext().getString(R.string.nb_search_book_brief,
                data.getLatelyFollower(),data.getRetentionRatio(),data.getAuthor()));
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_search_book;
    }
}
