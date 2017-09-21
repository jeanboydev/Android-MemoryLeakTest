package com.jeanboy.app.memoryleaktest;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by jeanboy on 2017/9/19.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
