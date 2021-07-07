package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.AddImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.BitmapPrepareProducer;
import com.facebook.imagepipeline.producers.BranchOnSeparateImagesProducer;
import com.facebook.imagepipeline.producers.DataFetchProducer;
import com.facebook.imagepipeline.producers.DecodeProducer;
import com.facebook.imagepipeline.producers.DiskCacheReadProducer;
import com.facebook.imagepipeline.producers.DiskCacheWriteProducer;
import com.facebook.imagepipeline.producers.EncodedCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.EncodedMemoryCacheProducer;
import com.facebook.imagepipeline.producers.LocalAssetFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriThumbnailFetchProducer;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.LocalFileFetchProducer;
import com.facebook.imagepipeline.producers.LocalResourceFetchProducer;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import com.facebook.imagepipeline.producers.NetworkFetchProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.NullProducer;
import com.facebook.imagepipeline.producers.PartialDiskCacheProducer;
import com.facebook.imagepipeline.producers.PostprocessedBitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.PostprocessorProducer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.QualifiedResourceFetchProducer;
import com.facebook.imagepipeline.producers.ResizeAndRotateProducer;
import com.facebook.imagepipeline.producers.SwallowResultProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThrottlingProducer;
import com.facebook.imagepipeline.producers.ThumbnailBranchProducer;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.producers.WebpTranscodeProducer;

public class ProducerFactory {
    public static final int MAX_SIMULTANEOUS_REQUESTS = 5;
    public AssetManager mAssetManager;
    public final MemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
    public boolean mBitmapPrepareToDrawForPrefetch;
    public final int mBitmapPrepareToDrawMaxSizeBytes;
    public final int mBitmapPrepareToDrawMinSizeBytes;
    public final ByteArrayPool mByteArrayPool;
    public final CacheKeyFactory mCacheKeyFactory;
    public ContentResolver mContentResolver;
    public final boolean mDecodeCancellationEnabled;
    public final BufferedDiskCache mDefaultBufferedDiskCache;
    public final boolean mDownsampleEnabled;
    public final MemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
    public final ExecutorSupplier mExecutorSupplier;
    public final ImageDecoder mImageDecoder;
    public final PlatformBitmapFactory mPlatformBitmapFactory;
    public final PooledByteBufferFactory mPooledByteBufferFactory;
    public final ProgressiveJpegConfig mProgressiveJpegConfig;
    public final boolean mResizeAndRotateEnabledForNetwork;
    public Resources mResources;
    public final BufferedDiskCache mSmallImageBufferedDiskCache;

    public ProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4) {
        this.mContentResolver = context.getApplicationContext().getContentResolver();
        this.mResources = context.getApplicationContext().getResources();
        this.mAssetManager = context.getApplicationContext().getAssets();
        this.mByteArrayPool = byteArrayPool;
        this.mImageDecoder = imageDecoder;
        this.mProgressiveJpegConfig = progressiveJpegConfig;
        this.mDownsampleEnabled = z;
        this.mResizeAndRotateEnabledForNetwork = z2;
        this.mDecodeCancellationEnabled = z3;
        this.mExecutorSupplier = executorSupplier;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mBitmapMemoryCache = memoryCache;
        this.mEncodedMemoryCache = memoryCache2;
        this.mDefaultBufferedDiskCache = bufferedDiskCache;
        this.mSmallImageBufferedDiskCache = bufferedDiskCache2;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mPlatformBitmapFactory = platformBitmapFactory;
        this.mBitmapPrepareToDrawMinSizeBytes = i;
        this.mBitmapPrepareToDrawMaxSizeBytes = i2;
        this.mBitmapPrepareToDrawForPrefetch = z4;
    }

    public static AddImageTransformMetaDataProducer newAddImageTransformMetaDataProducer(Producer<EncodedImage> producer) {
        return new AddImageTransformMetaDataProducer(producer);
    }

    public static BranchOnSeparateImagesProducer newBranchOnSeparateImagesProducer(Producer<EncodedImage> producer, Producer<EncodedImage> producer2) {
        return new BranchOnSeparateImagesProducer(producer, producer2);
    }

    public static <T> NullProducer<T> newNullProducer() {
        return new NullProducer<>();
    }

    public static <T> SwallowResultProducer<T> newSwallowResultProducer(Producer<T> producer) {
        return new SwallowResultProducer<>(producer);
    }

    public <T> ThreadHandoffProducer<T> newBackgroundThreadHandoffProducer(Producer<T> producer, ThreadHandoffProducerQueue threadHandoffProducerQueue) {
        return new ThreadHandoffProducer<>(producer, threadHandoffProducerQueue);
    }

    public BitmapMemoryCacheGetProducer newBitmapMemoryCacheGetProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapMemoryCacheGetProducer(this.mBitmapMemoryCache, this.mCacheKeyFactory, producer);
    }

    public BitmapMemoryCacheKeyMultiplexProducer newBitmapMemoryCacheKeyMultiplexProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapMemoryCacheKeyMultiplexProducer(this.mCacheKeyFactory, producer);
    }

    public BitmapMemoryCacheProducer newBitmapMemoryCacheProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapMemoryCacheProducer(this.mBitmapMemoryCache, this.mCacheKeyFactory, producer);
    }

    public BitmapPrepareProducer newBitmapPrepareProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapPrepareProducer(producer, this.mBitmapPrepareToDrawMinSizeBytes, this.mBitmapPrepareToDrawMaxSizeBytes, this.mBitmapPrepareToDrawForPrefetch);
    }

    public DataFetchProducer newDataFetchProducer() {
        return new DataFetchProducer(this.mPooledByteBufferFactory);
    }

    public DecodeProducer newDecodeProducer(Producer<EncodedImage> producer) {
        return new DecodeProducer(this.mByteArrayPool, this.mExecutorSupplier.forDecode(), this.mImageDecoder, this.mProgressiveJpegConfig, this.mDownsampleEnabled, this.mResizeAndRotateEnabledForNetwork, this.mDecodeCancellationEnabled, producer);
    }

    public DiskCacheReadProducer newDiskCacheReadProducer(Producer<EncodedImage> producer) {
        return new DiskCacheReadProducer(this.mDefaultBufferedDiskCache, this.mSmallImageBufferedDiskCache, this.mCacheKeyFactory, producer);
    }

    public DiskCacheWriteProducer newDiskCacheWriteProducer(Producer<EncodedImage> producer) {
        return new DiskCacheWriteProducer(this.mDefaultBufferedDiskCache, this.mSmallImageBufferedDiskCache, this.mCacheKeyFactory, producer);
    }

    public EncodedCacheKeyMultiplexProducer newEncodedCacheKeyMultiplexProducer(Producer<EncodedImage> producer) {
        return new EncodedCacheKeyMultiplexProducer(this.mCacheKeyFactory, producer);
    }

    public EncodedMemoryCacheProducer newEncodedMemoryCacheProducer(Producer<EncodedImage> producer) {
        return new EncodedMemoryCacheProducer(this.mEncodedMemoryCache, this.mCacheKeyFactory, producer);
    }

    public LocalAssetFetchProducer newLocalAssetFetchProducer() {
        return new LocalAssetFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mAssetManager);
    }

    public LocalContentUriFetchProducer newLocalContentUriFetchProducer() {
        return new LocalContentUriFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mContentResolver);
    }

    public LocalContentUriThumbnailFetchProducer newLocalContentUriThumbnailFetchProducer() {
        return new LocalContentUriThumbnailFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mContentResolver);
    }

    public LocalExifThumbnailProducer newLocalExifThumbnailProducer() {
        return new LocalExifThumbnailProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mContentResolver);
    }

    public LocalFileFetchProducer newLocalFileFetchProducer() {
        return new LocalFileFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory);
    }

    public LocalResourceFetchProducer newLocalResourceFetchProducer() {
        return new LocalResourceFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mResources);
    }

    public LocalVideoThumbnailProducer newLocalVideoThumbnailProducer() {
        return new LocalVideoThumbnailProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mContentResolver);
    }

    public NetworkFetchProducer newNetworkFetchProducer(NetworkFetcher networkFetcher) {
        return new NetworkFetchProducer(this.mPooledByteBufferFactory, this.mByteArrayPool, networkFetcher);
    }

    public PartialDiskCacheProducer newPartialDiskCacheProducer(Producer<EncodedImage> producer) {
        return new PartialDiskCacheProducer(this.mDefaultBufferedDiskCache, this.mCacheKeyFactory, this.mPooledByteBufferFactory, this.mByteArrayPool, producer);
    }

    public PostprocessedBitmapMemoryCacheProducer newPostprocessorBitmapMemoryCacheProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new PostprocessedBitmapMemoryCacheProducer(this.mBitmapMemoryCache, this.mCacheKeyFactory, producer);
    }

    public PostprocessorProducer newPostprocessorProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new PostprocessorProducer(producer, this.mPlatformBitmapFactory, this.mExecutorSupplier.forBackgroundTasks());
    }

    public QualifiedResourceFetchProducer newQualifiedResourceFetchProducer() {
        return new QualifiedResourceFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mContentResolver);
    }

    public ResizeAndRotateProducer newResizeAndRotateProducer(Producer<EncodedImage> producer, boolean z, boolean z2) {
        return new ResizeAndRotateProducer(this.mExecutorSupplier.forBackgroundTasks(), this.mPooledByteBufferFactory, z && !this.mDownsampleEnabled, producer, z2);
    }

    public <T> ThrottlingProducer<T> newThrottlingProducer(Producer<T> producer) {
        return new ThrottlingProducer<>(5, this.mExecutorSupplier.forLightweightBackgroundTasks(), producer);
    }

    public ThumbnailBranchProducer newThumbnailBranchProducer(ThumbnailProducer<EncodedImage>[] thumbnailProducerArr) {
        return new ThumbnailBranchProducer(thumbnailProducerArr);
    }

    public WebpTranscodeProducer newWebpTranscodeProducer(Producer<EncodedImage> producer) {
        return new WebpTranscodeProducer(this.mExecutorSupplier.forBackgroundTasks(), this.mPooledByteBufferFactory, producer);
    }
}
