package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public class DefaultBitmapPoolParams {
    public static final SparseIntArray DEFAULT_BUCKETS = new SparseIntArray(0);
    public static final int MAX_SIZE_SOFT_CAP = 0;

    public static PoolParams get() {
        return new PoolParams(0, getMaxSizeHardCap(), DEFAULT_BUCKETS);
    }

    public static int getMaxSizeHardCap() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
