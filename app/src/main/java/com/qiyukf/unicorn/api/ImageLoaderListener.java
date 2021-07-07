package com.qiyukf.unicorn.api;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.Serializable;

public interface ImageLoaderListener extends Serializable {
    void onLoadComplete(@NonNull Bitmap bitmap);

    void onLoadFailed(Throwable th);
}
