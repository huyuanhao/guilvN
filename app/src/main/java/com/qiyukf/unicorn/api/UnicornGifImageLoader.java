package com.qiyukf.unicorn.api;

import android.widget.ImageView;
import java.io.Serializable;

public interface UnicornGifImageLoader extends Serializable {
    void loadGifImage(String str, ImageView imageView, String str2);
}
