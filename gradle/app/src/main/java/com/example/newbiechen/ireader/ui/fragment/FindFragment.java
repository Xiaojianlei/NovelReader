package com.test.xiaojian.simple_reader.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.xiaojian.simple_reader.R;
import com.test.xiaojian.simple_reader.model.bean.SectionBean;
import com.test.xiaojian.simple_reader.model.flag.FindType;
import com.test.xiaojian.simple_reader.ui.activity.BillboardActivity;
import com.test.xiaojian.simple_reader.ui.activity.BookListActivity;
import com.test.xiaojian.simple_reader.ui.activity.BookSortActivity;
import com.test.xiaojian.simple_reader.ui.adapter.SectionAdapter;
import com.test.xiaojian.simple_reader.ui.base.BaseFragment;
import com.test.xiaojian.simple_reader.widget.itemdecoration.DividerItemDecoration;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by xiaojian on 17-4-15.
 */

public class FindFragment extends BaseFragment {
    /******************view************************/
    @BindView(R.id.find_rv_content)
    RecyclerView mRvContent;
    /*******************Object***********************/
    SectionAdapter mAdapter;

    @Override
    protected int getContentId() {
        return R.layout.fragment_find;
    }

    @Override
    protected void initWidget(Bundle savedInstanceState) {
        setUpAdapter();
    }

    private void setUpAdapter(){
        ArrayList<SectionBean> sections = new ArrayList<>();
        for (FindType type : FindType.values()){
            sections.add(new SectionBean(type.getTypeName(),type.getIconId()));
        }

        mAdapter = new SectionAdapter();
        mRvContent.setHasFixedSize(true);
        mRvContent.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvContent.addItemDecoration(new DividerItemDecoration(getContext()));
        mRvContent.setAdapter(mAdapter);
        mAdapter.addItems(sections);
    }


    @Override
    protected void initClick() {
        mAdapter.setOnItemClickListener(
                (view,pos) -> {
                    FindType type = FindType.values()[pos];
                    Intent intent;
                    //跳转
                    switch (type){
                        case TOP:
                            intent = new Intent(getContext(),BillboardActivity.class);
                            startActivity(intent);
                            break;
                        case SORT:
                            intent = new Intent(getContext(), BookSortActivity.class);
                            startActivity(intent);
                            break;
                        case TOPIC:
                            intent = new Intent(getContext(), BookListActivity.class);
                            startActivity(intent);
                            break;
                    }
                }
        );

    }
}
