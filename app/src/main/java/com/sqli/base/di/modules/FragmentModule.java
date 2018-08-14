package com.sqli.base.di.modules;

import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {
    private Fragment baseFragment;

    public FragmentModule(Fragment baseFragment) {
        this.baseFragment = baseFragment;
    }

    @Provides
    Fragment provideFragment() {
        return this.baseFragment;
    }
}
