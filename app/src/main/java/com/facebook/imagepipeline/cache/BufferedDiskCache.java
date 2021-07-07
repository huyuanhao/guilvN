package com.facebook.imagepipeline.cache;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteStreams;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.p118pd.sdk.C7391o0OOOO0o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class BufferedDiskCache {
    public static final Class<?> TAG = BufferedDiskCache.class;
    public final FileCache mFileCache;
    public final ImageCacheStatsTracker mImageCacheStatsTracker;
    public final PooledByteBufferFactory mPooledByteBufferFactory;
    public final PooledByteStreams mPooledByteStreams;
    public final Executor mReadExecutor;
    public final StagingArea mStagingArea = StagingArea.getInstance();
    public final Executor mWriteExecutor;

    public BufferedDiskCache(FileCache fileCache, PooledByteBufferFactory pooledByteBufferFactory, PooledByteStreams pooledByteStreams, Executor executor, Executor executor2, ImageCacheStatsTracker imageCacheStatsTracker) {
        this.mFileCache = fileCache;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mPooledByteStreams = pooledByteStreams;
        this.mReadExecutor = executor;
        this.mWriteExecutor = executor2;
        this.mImageCacheStatsTracker = imageCacheStatsTracker;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean checkInStagingAreaAndFileCache(CacheKey cacheKey) {
        EncodedImage encodedImage = this.mStagingArea.get(cacheKey);
        if (encodedImage != null) {
            encodedImage.close();
            FLog.m894v(TAG, "Found image for %s in staging area", cacheKey.getUriString());
            this.mImageCacheStatsTracker.onStagingAreaHit(cacheKey);
            return true;
        }
        FLog.m894v(TAG, "Did not find image for %s in staging area", cacheKey.getUriString());
        this.mImageCacheStatsTracker.onStagingAreaMiss();
        try {
            return this.mFileCache.hasKey(cacheKey);
        } catch (Exception unused) {
            return false;
        }
    }

    private C7391o0OOOO0o<Boolean> containsAsync(final CacheKey cacheKey) {
        try {
            return C7391o0OOOO0o.OooO00o(new Callable<Boolean>() {
                /* class com.facebook.imagepipeline.cache.BufferedDiskCache.CallableC05041 */

                @Override // java.util.concurrent.Callable
                public Boolean call() throws Exception {
                    return Boolean.valueOf(BufferedDiskCache.this.checkInStagingAreaAndFileCache(cacheKey));
                }
            }, this.mReadExecutor);
        } catch (Exception e) {
            FLog.m912w(TAG, e, "Failed to schedule disk-cache read for %s", cacheKey.getUriString());
            return C7391o0OOOO0o.OooO00o(e);
        }
    }

    private C7391o0OOOO0o<EncodedImage> foundPinnedImage(CacheKey cacheKey, EncodedImage encodedImage) {
        FLog.m894v(TAG, "Found image for %s in staging area", cacheKey.getUriString());
        this.mImageCacheStatsTracker.onStagingAreaHit(cacheKey);
        return C7391o0OOOO0o.OooO00o((Object) encodedImage);
    }

    private C7391o0OOOO0o<EncodedImage> getAsync(final CacheKey cacheKey, final AtomicBoolean atomicBoolean) {
        try {
            return C7391o0OOOO0o.OooO00o(new Callable<EncodedImage>() {
                /* class com.facebook.imagepipeline.cache.BufferedDiskCache.CallableC05052 */

                /* JADX INFO: finally extract failed */
                @Override // java.util.concurrent.Callable
                public EncodedImage call() throws Exception {
                    if (!atomicBoolean.get()) {
                        EncodedImage encodedImage = BufferedDiskCache.this.mStagingArea.get(cacheKey);
                        if (encodedImage != null) {
                            FLog.m894v(BufferedDiskCache.TAG, "Found image for %s in staging area", cacheKey.getUriString());
                            BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaHit(cacheKey);
                        } else {
                            FLog.m894v(BufferedDiskCache.TAG, "Did not find image for %s in staging area", cacheKey.getUriString());
                            BufferedDiskCache.this.mImageCacheStatsTracker.onStagingAreaMiss();
                            try {
                                CloseableReference of = CloseableReference.m937of(BufferedDiskCache.this.readFromDiskCache(cacheKey));
                                try {
                                    EncodedImage encodedImage2 = new EncodedImage(of);
                                    CloseableReference.closeSafely(of);
                                    encodedImage = encodedImage2;
                                } catch (Throwable th) {
                                    CloseableReference.closeSafely(of);
                                    throw th;
                                }
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                        if (!Thread.interrupted()) {
                            return encodedImage;
                        }
                        FLog.m893v(BufferedDiskCache.TAG, "Host thread was interrupted, decreasing reference count");
                        if (encodedImage != null) {
                            encodedImage.close();
                        }
                        throw new InterruptedException();
                    }
                    throw new CancellationException();
                }
            }, this.mReadExecutor);
        } catch (Exception e) {
            FLog.m912w(TAG, e, "Failed to schedule disk-cache read for %s", cacheKey.getUriString());
            return C7391o0OOOO0o.OooO00o(e);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private PooledByteBuffer readFromDiskCache(CacheKey cacheKey) throws IOException {
        try {
            FLog.m894v(TAG, "Disk cache read for %s", cacheKey.getUriString());
            BinaryResource resource = this.mFileCache.getResource(cacheKey);
            if (resource == null) {
                FLog.m894v(TAG, "Disk cache miss for %s", cacheKey.getUriString());
                this.mImageCacheStatsTracker.onDiskCacheMiss();
                return null;
            }
            FLog.m894v(TAG, "Found entry in disk cache for %s", cacheKey.getUriString());
            this.mImageCacheStatsTracker.onDiskCacheHit();
            InputStream openStream = resource.openStream();
            try {
                PooledByteBuffer newByteBuffer = this.mPooledByteBufferFactory.newByteBuffer(openStream, (int) resource.size());
                openStream.close();
                FLog.m894v(TAG, "Successful read from disk cache for %s", cacheKey.getUriString());
                return newByteBuffer;
            } catch (Throwable th) {
                openStream.close();
                throw th;
            }
        } catch (IOException e) {
            FLog.m912w(TAG, e, "Exception reading from cache for %s", cacheKey.getUriString());
            this.mImageCacheStatsTracker.onDiskCacheGetFail();
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void writeToDiskCache(CacheKey cacheKey, final EncodedImage encodedImage) {
        FLog.m894v(TAG, "About to write to disk-cache for key %s", cacheKey.getUriString());
        try {
            this.mFileCache.insert(cacheKey, new WriterCallback() {
                /* class com.facebook.imagepipeline.cache.BufferedDiskCache.C05096 */

                @Override // com.facebook.cache.common.WriterCallback
                public void write(OutputStream outputStream) throws IOException {
                    BufferedDiskCache.this.mPooledByteStreams.copy(encodedImage.getInputStream(), outputStream);
                }
            });
            FLog.m894v(TAG, "Successful disk-cache write for key %s", cacheKey.getUriString());
        } catch (IOException e) {
            FLog.m912w(TAG, e, "Failed to write to disk-cache for key %s", cacheKey.getUriString());
        }
    }

    public C7391o0OOOO0o<Void> clearAll() {
        this.mStagingArea.clearAll();
        try {
            return C7391o0OOOO0o.OooO00o(new Callable<Void>() {
                /* class com.facebook.imagepipeline.cache.BufferedDiskCache.CallableC05085 */

                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    BufferedDiskCache.this.mStagingArea.clearAll();
                    BufferedDiskCache.this.mFileCache.clearAll();
                    return null;
                }
            }, this.mWriteExecutor);
        } catch (Exception e) {
            FLog.m912w(TAG, e, "Failed to schedule disk-cache clear", new Object[0]);
            return C7391o0OOOO0o.OooO00o(e);
        }
    }

    public C7391o0OOOO0o<Boolean> contains(CacheKey cacheKey) {
        if (containsSync(cacheKey)) {
            return C7391o0OOOO0o.OooO00o((Object) true);
        }
        return containsAsync(cacheKey);
    }

    public boolean containsSync(CacheKey cacheKey) {
        return this.mStagingArea.containsKey(cacheKey) || this.mFileCache.hasKeySync(cacheKey);
    }

    public boolean diskCheckSync(CacheKey cacheKey) {
        if (containsSync(cacheKey)) {
            return true;
        }
        return checkInStagingAreaAndFileCache(cacheKey);
    }

    public C7391o0OOOO0o<EncodedImage> get(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        EncodedImage encodedImage = this.mStagingArea.get(cacheKey);
        if (encodedImage != null) {
            return foundPinnedImage(cacheKey, encodedImage);
        }
        return getAsync(cacheKey, atomicBoolean);
    }

    public void put(final CacheKey cacheKey, EncodedImage encodedImage) {
        Preconditions.checkNotNull(cacheKey);
        Preconditions.checkArgument(EncodedImage.isValid(encodedImage));
        this.mStagingArea.put(cacheKey, encodedImage);
        final EncodedImage cloneOrNull = EncodedImage.cloneOrNull(encodedImage);
        try {
            this.mWriteExecutor.execute(new Runnable() {
                /* class com.facebook.imagepipeline.cache.BufferedDiskCache.RunnableC05063 */

                public void run() {
                    try {
                        BufferedDiskCache.this.writeToDiskCache(cacheKey, cloneOrNull);
                    } finally {
                        BufferedDiskCache.this.mStagingArea.remove(cacheKey, cloneOrNull);
                        EncodedImage.closeSafely(cloneOrNull);
                    }
                }
            });
        } catch (Exception e) {
            FLog.m912w(TAG, e, "Failed to schedule disk-cache write for %s", cacheKey.getUriString());
            this.mStagingArea.remove(cacheKey, encodedImage);
            EncodedImage.closeSafely(cloneOrNull);
        }
    }

    public C7391o0OOOO0o<Void> remove(final CacheKey cacheKey) {
        Preconditions.checkNotNull(cacheKey);
        this.mStagingArea.remove(cacheKey);
        try {
            return C7391o0OOOO0o.OooO00o(new Callable<Void>() {
                /* class com.facebook.imagepipeline.cache.BufferedDiskCache.CallableC05074 */

                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    BufferedDiskCache.this.mStagingArea.remove(cacheKey);
                    BufferedDiskCache.this.mFileCache.remove(cacheKey);
                    return null;
                }
            }, this.mWriteExecutor);
        } catch (Exception e) {
            FLog.m912w(TAG, e, "Failed to schedule disk-cache remove for %s", cacheKey.getUriString());
            return C7391o0OOOO0o.OooO00o(e);
        }
    }
}
