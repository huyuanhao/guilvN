package com.facebook.react.common;

import androidx.core.util.Pools;

public class ClearableSynchronizedPool<T> implements Pools.OooO00o<T> {
    public final Object[] mPool;
    public int mSize = 0;

    public ClearableSynchronizedPool(int i) {
        this.mPool = new Object[i];
    }

    @Override // androidx.core.util.Pools.OooO00o
    public synchronized T acquire() {
        if (this.mSize == 0) {
            return null;
        }
        int i = this.mSize - 1;
        this.mSize = i;
        T t = (T) this.mPool[i];
        this.mPool[i] = null;
        return t;
    }

    public synchronized void clear() {
        for (int i = 0; i < this.mSize; i++) {
            this.mPool[i] = null;
        }
        this.mSize = 0;
    }

    @Override // androidx.core.util.Pools.OooO00o
    public synchronized boolean release(T t) {
        if (this.mSize == this.mPool.length) {
            return false;
        }
        this.mPool[this.mSize] = t;
        this.mSize++;
        return true;
    }
}
