package com.sqli.base.common;

import android.app.Activity;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.Lazy;

public class Navigator {

    private Lazy<Activity> activity;

    @Inject
    public Navigator(Lazy<Activity> activity) {
        this.activity = activity;
    }

    // TODO screen loads

    public void showError(Throwable throwable) {
        Toast.makeText(activity.get(), throwable.getMessage(), Toast.LENGTH_LONG).show();
    }

    public void showError(String message) {
        Toast.makeText(activity.get(), message, Toast.LENGTH_LONG).show();
    }

}
