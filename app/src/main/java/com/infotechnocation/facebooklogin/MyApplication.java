package com.infotechnocation.facebooklogin;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by Prajin Bajracharya on 1/5/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
