package com.facebook.cache.common;

public class NoOpCacheEventListener implements CacheEventListener {
    public static NoOpCacheEventListener sInstance;

    public static synchronized NoOpCacheEventListener getInstance() {
        NoOpCacheEventListener noOpCacheEventListener;
        synchronized (NoOpCacheEventListener.class) {
            if (sInstance == null) {
                sInstance = new NoOpCacheEventListener();
            }
            noOpCacheEventListener = sInstance;
        }
        return noOpCacheEventListener;
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onCleared() {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onEviction(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onHit(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onMiss(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onReadException(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onWriteAttempt(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onWriteException(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onWriteSuccess(CacheEvent cacheEvent) {
    }
}
