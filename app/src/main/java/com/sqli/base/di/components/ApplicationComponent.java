package com.sqli.base.di.components;

import com.sqli.base.BaseApplication;
import com.sqli.base.di.modules.ApplicationModule;

import dagger.Component;

@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    BaseApplication application = null;

    void inject(BaseApplication application);
}
