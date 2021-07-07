package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public class DefaultByteArrayPoolParams {
    public static final int DEFAULT_BUCKET_SIZE = 5;
    public static final int DEFAULT_IO_BUFFER_SIZE = 16384;
    public static final int MAX_SIZE_HARD_CAP = 1048576;
    public static final int MAX_SIZE_SOFT_CAP = 81920;

    public static PoolParams get() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new PoolParams(MAX_SIZE_SOFT_CAP, 1048576, sparseIntArray);
    }
}
