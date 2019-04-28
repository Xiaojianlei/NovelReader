package com.test.xiaojian.simple_reader.event;

import com.test.xiaojian.simple_reader.model.flag.BookDistillate;
import com.test.xiaojian.simple_reader.model.flag.BookSort;
import com.test.xiaojian.simple_reader.model.flag.BookType;
import com.test.xiaojian.simple_reader.utils.Constant;

/**
 * Created by xiaojian on 17-4-21.
 */

public class SelectorEvent {

    public BookDistillate distillate;

    public BookType type;

    public BookSort sort;

    public SelectorEvent(BookDistillate distillate,
                         BookType type,
                         BookSort sort) {
        this.distillate = distillate;
        this.type = type;
        this.sort = sort;
    }
}
