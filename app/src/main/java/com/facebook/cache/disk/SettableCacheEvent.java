package com.facebook.cache.disk;

import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheKey;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.io.IOException;
import javax.annotation.Nullable;

public class SettableCacheEvent implements CacheEvent {
    public static final int MAX_RECYCLED = 5;
    public static final Object RECYCLER_LOCK = new Object();
    public static SettableCacheEvent sFirstRecycledEvent;
    public static int sRecycledCount;
    public CacheKey mCacheKey;
    public long mCacheLimit;
    public long mCacheSize;
    public CacheEventListener.EvictionReason mEvictionReason;
    public IOException mException;
    public long mItemSize;
    public SettableCacheEvent mNextRecycledEvent;
    public String mResourceId;

    @ReturnsOwnership
    public static SettableCacheEvent obtain() {
        synchronized (RECYCLER_LOCK) {
            if (sFirstRecycledEvent == null) {
                return new SettableCacheEvent();
            }
            SettableCacheEvent settableCacheEvent = sFirstRecycledEvent;
            sFirstRecycledEvent = settableCacheEvent.mNextRecycledEvent;
            settableCacheEvent.mNextRecycledEvent = null;
            sRecycledCount--;
            return settableCacheEvent;
        }
    }

    private void reset() {
        this.mCacheKey = null;
        this.mResourceId = null;
        this.mItemSize = 0;
        this.mCacheLimit = 0;
        this.mCacheSize = 0;
        this.mException = null;
        this.mEvictionReason = null;
    }

    @Override // com.facebook.cache.common.CacheEvent
    @Nullable
    public CacheKey getCacheKey() {
        return this.mCacheKey;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public long getCacheLimit() {
        return this.mCacheLimit;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public long getCacheSize() {
        return this.mCacheSize;
    }

    @Override // com.facebook.cache.common.CacheEvent
    @Nullable
    public CacheEventListener.EvictionReason getEvictionReason() {
        return this.mEvictionReason;
    }

    @Override // com.facebook.cache.common.CacheEvent
    @Nullable
    public IOException getException() {
        return this.mException;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public long getItemSize() {
        return this.mItemSize;
    }

    @Override // com.facebook.cache.common.CacheEvent
    @Nullable
    public String getResourceId() {
        return this.mResourceId;
    }

    public void recycle() {
        synchronized (RECYCLER_LOCK) {
            if (sRecycledCount < 5) {
                reset();
                sRecycledCount++;
                if (sFirstRecycledEvent != null) {
                    this.mNextRecycledEvent = sFirstRecycledEvent;
                }
                sFirstRecycledEvent = this;
            }
        }
    }

    public SettableCacheEvent setCacheKey(CacheKey cacheKey) {
        this.mCacheKey = cacheKey;
        return this;
    }

    public SettableCacheEvent setCacheLimit(long j) {
        this.mCacheLimit = j;
        return this;
    }

    public SettableCacheEvent setCacheSize(long j) {
        this.mCacheSize = j;
        return this;
    }

    public SettableCacheEvent setEvictionReason(CacheEventListener.EvictionReason evictionReason) {
        this.mEvictionReason = evictionReason;
        return this;
    }

    public SettableCacheEvent setException(IOException iOException) {
        this.mException = iOException;
        return this;
    }

    public SettableCacheEvent setItemSize(long j) {
        this.mItemSize = j;
        return this;
    }

    public SettableCacheEvent setResourceId(String str) {
        this.mResourceId = str;
        return this;
    }
}
