package com.facebook.imagepipeline.core;

import android.content.Context;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;

public class ImagePipelineExperiments {
    public boolean mBitmapPrepareToDrawForPrefetch;
    public final int mBitmapPrepareToDrawMaxSizeBytes;
    public final int mBitmapPrepareToDrawMinSizeBytes;
    public final boolean mDecodeCancellationEnabled;
    public final Supplier<Boolean> mLazyDataSource;
    public final boolean mPartialImageCachingEnabled;
    public final ProducerFactoryMethod mProducerFactoryMethod;
    public final boolean mUseBitmapPrepareToDraw;
    public final boolean mUseDownsamplingRatioForResizing;
    public final WebpBitmapFactory mWebpBitmapFactory;
    public final WebpBitmapFactory.WebpErrorLogger mWebpErrorLogger;
    public final boolean mWebpSupportEnabled;

    public static class Builder {
        public boolean mBitmapPrepareToDrawForPrefetch = false;
        public int mBitmapPrepareToDrawMaxSizeBytes = 0;
        public int mBitmapPrepareToDrawMinSizeBytes = 0;
        public final ImagePipelineConfig.Builder mConfigBuilder;
        public boolean mDecodeCancellationEnabled = false;
        public Supplier<Boolean> mLazyDataSource;
        public boolean mPartialImageCachingEnabled = false;
        public ProducerFactoryMethod mProducerFactoryMethod;
        public boolean mUseBitmapPrepareToDraw = false;
        public boolean mUseDownsamplingRatioForResizing = false;
        public WebpBitmapFactory mWebpBitmapFactory;
        public WebpBitmapFactory.WebpErrorLogger mWebpErrorLogger;
        public boolean mWebpSupportEnabled = false;

        public Builder(ImagePipelineConfig.Builder builder) {
            this.mConfigBuilder = builder;
        }

        public ImagePipelineExperiments build() {
            return new ImagePipelineExperiments(this);
        }

        public boolean isPartialImageCachingEnabled() {
            return this.mPartialImageCachingEnabled;
        }

        public ImagePipelineConfig.Builder setBitmapPrepareToDraw(boolean z, int i, int i2, boolean z2) {
            this.mUseBitmapPrepareToDraw = z;
            this.mBitmapPrepareToDrawMinSizeBytes = i;
            this.mBitmapPrepareToDrawMaxSizeBytes = i2;
            this.mBitmapPrepareToDrawForPrefetch = z2;
            return this.mConfigBuilder;
        }

        public ImagePipelineConfig.Builder setDecodeCancellationEnabled(boolean z) {
            this.mDecodeCancellationEnabled = z;
            return this.mConfigBuilder;
        }

        public ImagePipelineConfig.Builder setLazyDataSource(Supplier<Boolean> supplier) {
            this.mLazyDataSource = supplier;
            return this.mConfigBuilder;
        }

        public ImagePipelineConfig.Builder setPartialImageCachingEnabled(boolean z) {
            this.mPartialImageCachingEnabled = z;
            return this.mConfigBuilder;
        }

        public ImagePipelineConfig.Builder setProducerFactoryMethod(ProducerFactoryMethod producerFactoryMethod) {
            this.mProducerFactoryMethod = producerFactoryMethod;
            return this.mConfigBuilder;
        }

        public ImagePipelineConfig.Builder setUseDownsampligRatioForResizing(boolean z) {
            this.mUseDownsamplingRatioForResizing = z;
            return this.mConfigBuilder;
        }

        public ImagePipelineConfig.Builder setWebpBitmapFactory(WebpBitmapFactory webpBitmapFactory) {
            this.mWebpBitmapFactory = webpBitmapFactory;
            return this.mConfigBuilder;
        }

        public ImagePipelineConfig.Builder setWebpErrorLogger(WebpBitmapFactory.WebpErrorLogger webpErrorLogger) {
            this.mWebpErrorLogger = webpErrorLogger;
            return this.mConfigBuilder;
        }

        public ImagePipelineConfig.Builder setWebpSupportEnabled(boolean z) {
            this.mWebpSupportEnabled = z;
            return this.mConfigBuilder;
        }
    }

    public static class DefaultProducerFactoryMethod implements ProducerFactoryMethod {
        @Override // com.facebook.imagepipeline.core.ImagePipelineExperiments.ProducerFactoryMethod
        public ProducerFactory createProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4) {
            return new ProducerFactory(context, byteArrayPool, imageDecoder, progressiveJpegConfig, z, z2, z3, executorSupplier, pooledByteBufferFactory, memoryCache, memoryCache2, bufferedDiskCache, bufferedDiskCache2, cacheKeyFactory, platformBitmapFactory, i, i2, z4);
        }
    }

    public interface ProducerFactoryMethod {
        ProducerFactory createProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4);
    }

    public static Builder newBuilder(ImagePipelineConfig.Builder builder) {
        return new Builder(builder);
    }

    public boolean getBitmapPrepareToDrawForPrefetch() {
        return this.mBitmapPrepareToDrawForPrefetch;
    }

    public int getBitmapPrepareToDrawMaxSizeBytes() {
        return this.mBitmapPrepareToDrawMaxSizeBytes;
    }

    public int getBitmapPrepareToDrawMinSizeBytes() {
        return this.mBitmapPrepareToDrawMinSizeBytes;
    }

    public ProducerFactoryMethod getProducerFactoryMethod() {
        return this.mProducerFactoryMethod;
    }

    public boolean getUseBitmapPrepareToDraw() {
        return this.mUseBitmapPrepareToDraw;
    }

    public boolean getUseDownsamplingRatioForResizing() {
        return this.mUseDownsamplingRatioForResizing;
    }

    public WebpBitmapFactory getWebpBitmapFactory() {
        return this.mWebpBitmapFactory;
    }

    public WebpBitmapFactory.WebpErrorLogger getWebpErrorLogger() {
        return this.mWebpErrorLogger;
    }

    public boolean isDecodeCancellationEnabled() {
        return this.mDecodeCancellationEnabled;
    }

    public Supplier<Boolean> isLazyDataSource() {
        return this.mLazyDataSource;
    }

    public boolean isPartialImageCachingEnabled() {
        return this.mPartialImageCachingEnabled;
    }

    public boolean isWebpSupportEnabled() {
        return this.mWebpSupportEnabled;
    }

    public ImagePipelineExperiments(Builder builder) {
        this.mWebpSupportEnabled = builder.mWebpSupportEnabled;
        this.mWebpErrorLogger = builder.mWebpErrorLogger;
        this.mDecodeCancellationEnabled = builder.mDecodeCancellationEnabled;
        this.mWebpBitmapFactory = builder.mWebpBitmapFactory;
        this.mUseDownsamplingRatioForResizing = builder.mUseDownsamplingRatioForResizing;
        this.mUseBitmapPrepareToDraw = builder.mUseBitmapPrepareToDraw;
        this.mBitmapPrepareToDrawMinSizeBytes = builder.mBitmapPrepareToDrawMinSizeBytes;
        this.mBitmapPrepareToDrawMaxSizeBytes = builder.mBitmapPrepareToDrawMaxSizeBytes;
        this.mBitmapPrepareToDrawForPrefetch = builder.mBitmapPrepareToDrawForPrefetch;
        this.mPartialImageCachingEnabled = builder.mPartialImageCachingEnabled;
        if (builder.mProducerFactoryMethod == null) {
            this.mProducerFactoryMethod = new DefaultProducerFactoryMethod();
        } else {
            this.mProducerFactoryMethod = builder.mProducerFactoryMethod;
        }
        this.mLazyDataSource = builder.mLazyDataSource;
    }
}
