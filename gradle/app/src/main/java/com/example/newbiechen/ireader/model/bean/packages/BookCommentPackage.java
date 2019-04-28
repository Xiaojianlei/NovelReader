package com.test.xiaojian.simple_reader.model.bean.packages;

import com.test.xiaojian.simple_reader.model.bean.BaseBean;
import com.test.xiaojian.simple_reader.model.bean.BookCommentBean;

import java.util.List;

/**
 * Created by xiaojian on 17-4-20.
 */
public class BookCommentPackage extends BaseBean {

    private List<BookCommentBean> posts;

    public List<BookCommentBean> getPosts() {
        return posts;
    }

    public void setPosts(List<BookCommentBean> posts) {
        this.posts = posts;
    }
}
