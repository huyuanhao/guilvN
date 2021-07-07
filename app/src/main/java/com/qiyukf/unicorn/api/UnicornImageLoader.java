package com.qiyukf.unicorn.api;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

public interface UnicornImageLoader {
    void loadImage(String str, int i, int i2, ImageLoaderListener imageLoaderListener);

    @Nullable
    Bitmap loadImageSync(String str, int i, int i2);
}
