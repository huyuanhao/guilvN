package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;

@DoNotStrip
public class NativeRoundingFilter {
    static {
        ImagePipelineNativeLoader.load();
    }

    @DoNotStrip
    public static native void nativeToCircleFilter(Bitmap bitmap);

    public static void toCircle(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap);
        nativeToCircleFilter(bitmap);
    }
}
