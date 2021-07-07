package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(21)
public class BitmapPool extends BasePool<Bitmap> {
    public BitmapPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        initialize();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getBucketedSize(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getSizeInBytes(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public Bitmap alloc(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Bitmap.Config.RGB_565);
    }

    public void free(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap);
        bitmap.recycle();
    }

    public int getBucketedSizeForValue(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap);
        return bitmap.getAllocationByteCount();
    }

    public boolean isReusable(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
