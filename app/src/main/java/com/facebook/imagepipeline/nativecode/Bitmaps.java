package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.imageutils.BitmapUtil;
import java.nio.ByteBuffer;

@DoNotStrip
public class Bitmaps {
    static {
        ImagePipelineNativeLoader.load();
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        Preconditions.checkArgument(bitmap2.getConfig() == bitmap.getConfig());
        Preconditions.checkArgument(bitmap.isMutable());
        Preconditions.checkArgument(bitmap.getWidth() == bitmap2.getWidth());
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        Preconditions.checkArgument(z);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    public static ByteBuffer getByteBuffer(Bitmap bitmap, long j, long j2) {
        Preconditions.checkNotNull(bitmap);
        return nativeGetByteBuffer(bitmap, j, j2);
    }

    @DoNotStrip
    public static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    @DoNotStrip
    public static native ByteBuffer nativeGetByteBuffer(Bitmap bitmap, long j, long j2);

    @DoNotStrip
    public static native void nativePinBitmap(Bitmap bitmap);

    @DoNotStrip
    public static native void nativeReleaseByteBuffer(Bitmap bitmap);

    public static void pinBitmap(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap);
        nativePinBitmap(bitmap);
    }

    @TargetApi(19)
    public static void reconfigureBitmap(Bitmap bitmap, int i, int i2, Bitmap.Config config) {
        Preconditions.checkArgument(bitmap.getAllocationByteCount() >= (i * i2) * BitmapUtil.getPixelSizeForBitmapConfig(config));
        bitmap.reconfigure(i, i2, config);
    }

    public static void releaseByteBuffer(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap);
        nativeReleaseByteBuffer(bitmap);
    }
}
