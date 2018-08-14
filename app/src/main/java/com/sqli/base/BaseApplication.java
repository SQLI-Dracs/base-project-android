package com.sqli.base;

import android.app.Application;

import com.sqli.base.di.components.ApplicationComponent;
import com.sqli.base.di.components.DaggerApplicationComponent;
import com.sqli.base.di.modules.ApplicationModule;

public class BaseApplication extends Application {

    ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        component.inject(this);


    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
