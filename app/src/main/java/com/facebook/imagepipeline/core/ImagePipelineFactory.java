package com.facebook.imagepipeline.core;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.AndroidPredicates;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Suppliers;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider;
import com.facebook.imagepipeline.bitmaps.ArtBitmapFactory;
import com.facebook.imagepipeline.bitmaps.EmptyJpegGenerator;
import com.facebook.imagepipeline.bitmaps.GingerbreadBitmapFactory;
import com.facebook.imagepipeline.bitmaps.HoneycombBitmapFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BitmapCountingMemoryCacheFactory;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.EncodedCountingMemoryCacheFactory;
import com.facebook.imagepipeline.cache.EncodedMemoryCacheFactory;
import com.facebook.imagepipeline.cache.InstrumentedMemoryCache;
import com.facebook.imagepipeline.decoder.DefaultImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.platform.ArtDecoder;
import com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder;
import com.facebook.imagepipeline.platform.KitKatPurgeableDecoder;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class ImagePipelineFactory {
    public static final Class<?> TAG = ImagePipelineFactory.class;
    public static ImagePipelineFactory sInstance;
    public AnimatedFactory mAnimatedFactory;
    public CountingMemoryCache<CacheKey, CloseableImage> mBitmapCountingMemoryCache;
    public InstrumentedMemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
    public final ImagePipelineConfig mConfig;
    public CountingMemoryCache<CacheKey, PooledByteBuffer> mEncodedCountingMemoryCache;
    public InstrumentedMemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
    public ImageDecoder mImageDecoder;
    public ImagePipeline mImagePipeline;
    public BufferedDiskCache mMainBufferedDiskCache;
    public FileCache mMainFileCache;
    public PlatformBitmapFactory mPlatformBitmapFactory;
    public PlatformDecoder mPlatformDecoder;
    public ProducerFactory mProducerFactory;
    public ProducerSequenceFactory mProducerSequenceFactory;
    public BufferedDiskCache mSmallImageBufferedDiskCache;
    public FileCache mSmallImageFileCache;
    public final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;

    public ImagePipelineFactory(ImagePipelineConfig imagePipelineConfig) {
        this.mConfig = (ImagePipelineConfig) Preconditions.checkNotNull(imagePipelineConfig);
        this.mThreadHandoffProducerQueue = new ThreadHandoffProducerQueue(imagePipelineConfig.getExecutorSupplier().forLightweightBackgroundTasks());
    }

    public static PlatformBitmapFactory buildPlatformBitmapFactory(PoolFactory poolFactory, PlatformDecoder platformDecoder) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            return new ArtBitmapFactory(poolFactory.getBitmapPool());
        }
        if (i >= 11) {
            return new HoneycombBitmapFactory(new EmptyJpegGenerator(poolFactory.getPooledByteBufferFactory()), platformDecoder);
        }
        return new GingerbreadBitmapFactory();
    }

    public static PlatformDecoder buildPlatformDecoder(PoolFactory poolFactory, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            int flexByteArrayPoolMaxNumThreads = poolFactory.getFlexByteArrayPoolMaxNumThreads();
            return new ArtDecoder(poolFactory.getBitmapPool(), flexByteArrayPoolMaxNumThreads, new Pools.OooO0O0(flexByteArrayPoolMaxNumThreads));
        } else if (!z || i >= 19) {
            return new KitKatPurgeableDecoder(poolFactory.getFlexByteArrayPool());
        } else {
            return new GingerbreadPurgeableDecoder();
        }
    }

    @Nullable
    private AnimatedFactory getAnimatedFactory() {
        if (this.mAnimatedFactory == null) {
            this.mAnimatedFactory = AnimatedFactoryProvider.getAnimatedFactory(getPlatformBitmapFactory(), this.mConfig.getExecutorSupplier(), getBitmapCountingMemoryCache());
        }
        return this.mAnimatedFactory;
    }

    private ImageDecoder getImageDecoder() {
        ImageDecoder imageDecoder;
        if (this.mImageDecoder == null) {
            if (this.mConfig.getImageDecoder() != null) {
                this.mImageDecoder = this.mConfig.getImageDecoder();
            } else {
                AnimatedFactory animatedFactory = getAnimatedFactory();
                ImageDecoder imageDecoder2 = null;
                if (animatedFactory != null) {
                    imageDecoder2 = animatedFactory.getGifDecoder(this.mConfig.getBitmapConfig());
                    imageDecoder = animatedFactory.getWebPDecoder(this.mConfig.getBitmapConfig());
                } else {
                    imageDecoder = null;
                }
                if (this.mConfig.getImageDecoderConfig() == null) {
                    this.mImageDecoder = new DefaultImageDecoder(imageDecoder2, imageDecoder, getPlatformDecoder());
                } else {
                    this.mImageDecoder = new DefaultImageDecoder(imageDecoder2, imageDecoder, getPlatformDecoder(), this.mConfig.getImageDecoderConfig().getCustomImageDecoders());
                    ImageFormatChecker.getInstance().setCustomImageFormatCheckers(this.mConfig.getImageDecoderConfig().getCustomImageFormats());
                }
            }
        }
        return this.mImageDecoder;
    }

    public static ImagePipelineFactory getInstance() {
        return (ImagePipelineFactory) Preconditions.checkNotNull(sInstance, "ImagePipelineFactory was not initialized!");
    }

    private ProducerFactory getProducerFactory() {
        if (this.mProducerFactory == null) {
            this.mProducerFactory = this.mConfig.getExperiments().getProducerFactoryMethod().createProducerFactory(this.mConfig.getContext(), this.mConfig.getPoolFactory().getSmallByteArrayPool(), getImageDecoder(), this.mConfig.getProgressiveJpegConfig(), this.mConfig.isDownsampleEnabled(), this.mConfig.isResizeAndRotateEnabledForNetwork(), this.mConfig.getExperiments().isDecodeCancellationEnabled(), this.mConfig.getExecutorSupplier(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), this.mConfig.getCacheKeyFactory(), getPlatformBitmapFactory(), this.mConfig.getExperiments().getBitmapPrepareToDrawMinSizeBytes(), this.mConfig.getExperiments().getBitmapPrepareToDrawMaxSizeBytes(), this.mConfig.getExperiments().getBitmapPrepareToDrawForPrefetch());
        }
        return this.mProducerFactory;
    }

    private ProducerSequenceFactory getProducerSequenceFactory() {
        boolean z = Build.VERSION.SDK_INT >= 24 && this.mConfig.getExperiments().getUseBitmapPrepareToDraw();
        if (this.mProducerSequenceFactory == null) {
            this.mProducerSequenceFactory = new ProducerSequenceFactory(this.mConfig.getContext().getApplicationContext().getContentResolver(), getProducerFactory(), this.mConfig.getNetworkFetcher(), this.mConfig.isResizeAndRotateEnabledForNetwork(), this.mConfig.getExperiments().isWebpSupportEnabled(), this.mThreadHandoffProducerQueue, this.mConfig.getExperiments().getUseDownsamplingRatioForResizing(), z, this.mConfig.getExperiments().isPartialImageCachingEnabled(), this.mConfig.isDiskCacheEnabled());
        }
        return this.mProducerSequenceFactory;
    }

    private BufferedDiskCache getSmallImageBufferedDiskCache() {
        if (this.mSmallImageBufferedDiskCache == null) {
            this.mSmallImageBufferedDiskCache = new BufferedDiskCache(getSmallImageFileCache(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mSmallImageBufferedDiskCache;
    }

    public static synchronized boolean hasBeenInitialized() {
        boolean z;
        synchronized (ImagePipelineFactory.class) {
            z = sInstance != null;
        }
        return z;
    }

    public static synchronized void initialize(Context context) {
        synchronized (ImagePipelineFactory.class) {
            initialize(ImagePipelineConfig.newBuilder(context).build());
        }
    }

    public static void setInstance(ImagePipelineFactory imagePipelineFactory) {
        sInstance = imagePipelineFactory;
    }

    public static synchronized void shutDown() {
        synchronized (ImagePipelineFactory.class) {
            if (sInstance != null) {
                sInstance.getBitmapMemoryCache().removeAll(AndroidPredicates.True());
                sInstance.getEncodedMemoryCache().removeAll(AndroidPredicates.True());
                sInstance = null;
            }
        }
    }

    @Nullable
    public DrawableFactory getAnimatedDrawableFactory(Context context) {
        AnimatedFactory animatedFactory = getAnimatedFactory();
        if (animatedFactory == null) {
            return null;
        }
        return animatedFactory.getAnimatedDrawableFactory(context);
    }

    public CountingMemoryCache<CacheKey, CloseableImage> getBitmapCountingMemoryCache() {
        if (this.mBitmapCountingMemoryCache == null) {
            this.mBitmapCountingMemoryCache = BitmapCountingMemoryCacheFactory.get(this.mConfig.getBitmapMemoryCacheParamsSupplier(), this.mConfig.getMemoryTrimmableRegistry(), this.mConfig.getBitmapMemoryCacheTrimStrategy());
        }
        return this.mBitmapCountingMemoryCache;
    }

    public InstrumentedMemoryCache<CacheKey, CloseableImage> getBitmapMemoryCache() {
        if (this.mBitmapMemoryCache == null) {
            this.mBitmapMemoryCache = BitmapMemoryCacheFactory.get(getBitmapCountingMemoryCache(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mBitmapMemoryCache;
    }

    public CountingMemoryCache<CacheKey, PooledByteBuffer> getEncodedCountingMemoryCache() {
        if (this.mEncodedCountingMemoryCache == null) {
            this.mEncodedCountingMemoryCache = EncodedCountingMemoryCacheFactory.get(this.mConfig.getEncodedMemoryCacheParamsSupplier(), this.mConfig.getMemoryTrimmableRegistry());
        }
        return this.mEncodedCountingMemoryCache;
    }

    public InstrumentedMemoryCache<CacheKey, PooledByteBuffer> getEncodedMemoryCache() {
        if (this.mEncodedMemoryCache == null) {
            this.mEncodedMemoryCache = EncodedMemoryCacheFactory.get(getEncodedCountingMemoryCache(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mEncodedMemoryCache;
    }

    public ImagePipeline getImagePipeline() {
        if (this.mImagePipeline == null) {
            this.mImagePipeline = new ImagePipeline(getProducerSequenceFactory(), this.mConfig.getRequestListeners(), this.mConfig.getIsPrefetchEnabledSupplier(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), this.mConfig.getCacheKeyFactory(), this.mThreadHandoffProducerQueue, Suppliers.m852of(false), this.mConfig.getExperiments().isLazyDataSource());
        }
        return this.mImagePipeline;
    }

    public BufferedDiskCache getMainBufferedDiskCache() {
        if (this.mMainBufferedDiskCache == null) {
            this.mMainBufferedDiskCache = new BufferedDiskCache(getMainFileCache(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mMainBufferedDiskCache;
    }

    public FileCache getMainFileCache() {
        if (this.mMainFileCache == null) {
            this.mMainFileCache = this.mConfig.getFileCacheFactory().get(this.mConfig.getMainDiskCacheConfig());
        }
        return this.mMainFileCache;
    }

    public PlatformBitmapFactory getPlatformBitmapFactory() {
        if (this.mPlatformBitmapFactory == null) {
            this.mPlatformBitmapFactory = buildPlatformBitmapFactory(this.mConfig.getPoolFactory(), getPlatformDecoder());
        }
        return this.mPlatformBitmapFactory;
    }

    public PlatformDecoder getPlatformDecoder() {
        if (this.mPlatformDecoder == null) {
            this.mPlatformDecoder = buildPlatformDecoder(this.mConfig.getPoolFactory(), this.mConfig.getExperiments().isWebpSupportEnabled());
        }
        return this.mPlatformDecoder;
    }

    public FileCache getSmallImageFileCache() {
        if (this.mSmallImageFileCache == null) {
            this.mSmallImageFileCache = this.mConfig.getFileCacheFactory().get(this.mConfig.getSmallImageDiskCacheConfig());
        }
        return this.mSmallImageFileCache;
    }

    public static synchronized void initialize(ImagePipelineConfig imagePipelineConfig) {
        synchronized (ImagePipelineFactory.class) {
            if (sInstance != null) {
                FLog.m909w(TAG, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            sInstance = new ImagePipelineFactory(imagePipelineConfig);
        }
    }
}
