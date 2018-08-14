package com.sqli.base.di.modules;

import android.content.Context;

import com.sqli.base.BaseApplication;
import com.sqli.base.common.utils.ImageUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private BaseApplication baseApplication;

    public ApplicationModule(BaseApplication baseApplication) {
        this.baseApplication = baseApplication;
    }

    @Provides
    BaseApplication provideApplication() {
        return baseApplication;
    }

    @Provides
    Context provideContext() {
        return baseApplication;
    }

    @Provides
    ImageUtils provideImageUtils() {
        return new ImageUtils();
    }
}
