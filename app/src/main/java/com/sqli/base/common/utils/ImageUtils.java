package com.sqli.base.common.utils;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import javax.inject.Inject;

public class ImageUtils {

    @Inject
    public ImageUtils() {
    }

    public void loadImageInto(ImageView imageView, String url){
        Picasso.get()
                .load(url)
                .placeholder(com.sqli.base.R.color.white_translucid)
                .error(com.sqli.base.R.color.colorPrimaryDark)
                .into(imageView);
    }
}
