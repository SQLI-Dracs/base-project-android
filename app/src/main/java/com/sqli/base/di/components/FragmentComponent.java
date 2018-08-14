package com.sqli.base.di.components;

import com.sqli.base.di.modules.FragmentModule;

import dagger.Component;

@Component(dependencies = {ApplicationComponent.class, NavigatorComponent.class}, modules = {FragmentModule.class})
public interface FragmentComponent {
    //TODO fragment injections
}
