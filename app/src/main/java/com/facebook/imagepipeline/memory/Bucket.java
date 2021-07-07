package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@VisibleForTesting
@NotThreadSafe
public class Bucket<V> {
    public static final String TAG = "BUCKET";
    public final boolean mFixBucketsReinitialization;
    public final Queue mFreeList;
    public int mInUseLength;
    public final int mItemSize;
    public final int mMaxLength;

    public Bucket(int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        Preconditions.checkState(i > 0);
        Preconditions.checkState(i2 >= 0);
        Preconditions.checkState(i3 < 0 ? false : z2);
        this.mItemSize = i;
        this.mMaxLength = i2;
        this.mFreeList = new LinkedList();
        this.mInUseLength = i3;
        this.mFixBucketsReinitialization = z;
    }

    public void addToFreeList(V v) {
        this.mFreeList.add(v);
    }

    public void decrementInUseCount() {
        Preconditions.checkState(this.mInUseLength > 0);
        this.mInUseLength--;
    }

    @Nullable
    public V get() {
        V pop = pop();
        if (pop != null) {
            this.mInUseLength++;
        }
        return pop;
    }

    public int getFreeListSize() {
        return this.mFreeList.size();
    }

    public int getInUseCount() {
        return this.mInUseLength;
    }

    public void incrementInUseCount() {
        this.mInUseLength++;
    }

    public boolean isMaxLengthExceeded() {
        return this.mInUseLength + getFreeListSize() > this.mMaxLength;
    }

    @Nullable
    public V pop() {
        return (V) this.mFreeList.poll();
    }

    public void release(V v) {
        Preconditions.checkNotNull(v);
        boolean z = false;
        if (this.mFixBucketsReinitialization) {
            if (this.mInUseLength > 0) {
                z = true;
            }
            Preconditions.checkState(z);
            this.mInUseLength--;
            addToFreeList(v);
            return;
        }
        int i = this.mInUseLength;
        if (i > 0) {
            this.mInUseLength = i - 1;
            addToFreeList(v);
            return;
        }
        FLog.m875e(TAG, "Tried to release value %s from an empty bucket!", v);
    }
}
