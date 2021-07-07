package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.OOMSoftReference;
import com.facebook.common.references.ResourceReleaser;
import java.util.concurrent.Semaphore;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class SharedByteArray implements MemoryTrimmable {
    @VisibleForTesting
    public final OOMSoftReference<byte[]> mByteArraySoftRef;
    @VisibleForTesting
    public final int mMaxByteArraySize;
    @VisibleForTesting
    public final int mMinByteArraySize;
    public final ResourceReleaser<byte[]> mResourceReleaser;
    @VisibleForTesting
    public final Semaphore mSemaphore;

    public SharedByteArray(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams) {
        Preconditions.checkNotNull(memoryTrimmableRegistry);
        boolean z = false;
        Preconditions.checkArgument(poolParams.minBucketSize > 0);
        Preconditions.checkArgument(poolParams.maxBucketSize >= poolParams.minBucketSize ? true : z);
        this.mMaxByteArraySize = poolParams.maxBucketSize;
        this.mMinByteArraySize = poolParams.minBucketSize;
        this.mByteArraySoftRef = new OOMSoftReference<>();
        this.mSemaphore = new Semaphore(1);
        this.mResourceReleaser = new ResourceReleaser<byte[]>() {
            /* class com.facebook.imagepipeline.memory.SharedByteArray.C05351 */

            public void release(byte[] bArr) {
                SharedByteArray.this.mSemaphore.release();
            }
        };
        memoryTrimmableRegistry.registerMemoryTrimmable(this);
    }

    private synchronized byte[] allocateByteArray(int i) {
        byte[] bArr;
        this.mByteArraySoftRef.clear();
        bArr = new byte[i];
        this.mByteArraySoftRef.set(bArr);
        return bArr;
    }

    private byte[] getByteArray(int i) {
        int bucketedSize = getBucketedSize(i);
        byte[] bArr = this.mByteArraySoftRef.get();
        return (bArr == null || bArr.length < bucketedSize) ? allocateByteArray(bucketedSize) : bArr;
    }

    public CloseableReference<byte[]> get(int i) {
        boolean z = true;
        Preconditions.checkArgument(i > 0, "Size must be greater than zero");
        if (i > this.mMaxByteArraySize) {
            z = false;
        }
        Preconditions.checkArgument(z, "Requested size is too big");
        this.mSemaphore.acquireUninterruptibly();
        try {
            return CloseableReference.m938of(getByteArray(i), this.mResourceReleaser);
        } catch (Throwable th) {
            this.mSemaphore.release();
            throw Throwables.propagate(th);
        }
    }

    @VisibleForTesting
    public int getBucketedSize(int i) {
        return Integer.highestOneBit(Math.max(i, this.mMinByteArraySize) - 1) * 2;
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType memoryTrimType) {
        if (this.mSemaphore.tryAcquire()) {
            try {
                this.mByteArraySoftRef.clear();
            } finally {
                this.mSemaphore.release();
            }
        }
    }
}
