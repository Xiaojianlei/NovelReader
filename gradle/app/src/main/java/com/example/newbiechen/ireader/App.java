package com.test.xiaojian.simple_reader;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.test.xiaojian.simple_reader.service.DownloadService;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by xiaojian on 17-4-15.
 */

public class App extends Application {
    private static Context sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        startService(new Intent(getContext(), DownloadService.class));

        // 初始化内存分析工具
        if (!LeakCanary.isInAnalyzerProcess(this)) {
            LeakCanary.install(this);
        }
    }

    public static Context getContext(){
        return sInstance;
    }
}