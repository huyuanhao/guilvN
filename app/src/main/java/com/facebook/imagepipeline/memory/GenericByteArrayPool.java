package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class GenericByteArrayPool extends BasePool<byte[]> implements ByteArrayPool {
    public final int[] mBucketSizes;

    public GenericByteArrayPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        SparseIntArray sparseIntArray = poolParams.bucketSizes;
        this.mBucketSizes = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.mBucketSizes[i] = sparseIntArray.keyAt(i);
        }
        initialize();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getBucketedSize(int i) {
        if (i > 0) {
            int[] iArr = this.mBucketSizes;
            for (int i2 : iArr) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new BasePool.InvalidSizeException(Integer.valueOf(i));
    }

    public int getMinBufferSize() {
        return this.mBucketSizes[0];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getSizeInBytes(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public byte[] alloc(int i) {
        return new byte[i];
    }

    public void free(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
    }

    public int getBucketedSizeForValue(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        return bArr.length;
    }
}
