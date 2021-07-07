package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.imageutils.BitmapUtil;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(21)
public class ArtBitmapFactory extends PlatformBitmapFactory {
    public final BitmapPool mBitmapPool;

    public ArtBitmapFactory(BitmapPool bitmapPool) {
        this.mBitmapPool = bitmapPool;
    }

    @Override // com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory
    public CloseableReference<Bitmap> createBitmapInternal(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = (Bitmap) this.mBitmapPool.get(BitmapUtil.getSizeInByteForBitmap(i, i2, config));
        Bitmaps.reconfigureBitmap(bitmap, i, i2, config);
        return CloseableReference.m938of(bitmap, this.mBitmapPool);
    }
}
