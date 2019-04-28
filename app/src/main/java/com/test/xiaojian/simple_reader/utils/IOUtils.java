package com.test.xiaojian.simple_reader.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by xiaojian on 17-5-11.
 */

public class IOUtils {

    public static void close(Closeable closeable){
        if (closeable == null) return;
        try {
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
            //close error
        }
    }
}
