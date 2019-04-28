package com.test.xiaojian.simple_reader.event;

import com.test.xiaojian.simple_reader.model.bean.CollBookBean;

/**
 * Created by xiaojian on 17-5-27.
 */

public class DeleteTaskEvent {
    public CollBookBean collBook;

    public DeleteTaskEvent(CollBookBean collBook){
        this.collBook = collBook;
    }
}
