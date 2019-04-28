package com.test.xiaojian.simple_reader.model.bean.packages;

import com.test.xiaojian.simple_reader.model.bean.BaseBean;
import com.test.xiaojian.simple_reader.model.bean.BookHelpsBean;

import java.util.List;

/**
 * Created by xiaojian on 17-4-20.
 */

public class BookHelpsPackage extends BaseBean {

    private List<BookHelpsBean> helps;

    public List<BookHelpsBean> getHelps() {
        return helps;
    }

    public void setHelps(List<BookHelpsBean> helps) {
        this.helps = helps;
    }

}
