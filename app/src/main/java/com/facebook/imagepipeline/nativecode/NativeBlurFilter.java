package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;

@DoNotStrip
public class NativeBlurFilter {
    static {
        ImagePipelineNativeLoader.load();
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        Preconditions.checkNotNull(bitmap);
        boolean z = true;
        Preconditions.checkArgument(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @DoNotStrip
    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
