package com.sqli.base.di.modules;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class NavigatorModule {
    private Activity activity;

    public NavigatorModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Activity provideActivity() {
        return this.activity;
    }
}
