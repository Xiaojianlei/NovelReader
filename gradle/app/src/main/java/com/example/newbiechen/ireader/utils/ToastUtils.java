package com.test.xiaojian.simple_reader.utils;

import android.widget.Toast;

import com.test.xiaojian.simple_reader.App;

/**
 * Created by xiaojian on 17-5-11.
 */

public class ToastUtils {

    public static void show(String msg){
        Toast.makeText(App.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
