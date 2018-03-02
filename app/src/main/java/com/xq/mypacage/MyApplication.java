package com.xq.mypacage;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by lenovo on 2018/3/2.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
