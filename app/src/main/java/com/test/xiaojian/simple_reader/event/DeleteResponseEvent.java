package com.test.xiaojian.simple_reader.event;

import com.test.xiaojian.simple_reader.model.bean.CollBookBean;

/**
 * Created by xiaojian on 17-5-27.
 */

public class DeleteResponseEvent {
    public boolean isDelete;
    public CollBookBean collBook;
    public DeleteResponseEvent(boolean isDelete,CollBookBean collBook){
        this.isDelete = isDelete;
        this.collBook = collBook;
    }
}
