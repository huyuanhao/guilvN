package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpSupportStatus;
import com.facebook.imagepipeline.bitmaps.HoneycombBitmapCreator;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheTrimStrategy;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.DefaultBitmapMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.cache.DefaultEncodedMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.cache.NoOpImageCacheStatsTracker;
import com.facebook.imagepipeline.core.ImagePipelineExperiments;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoderConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.memory.PoolConfig;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.p118pd.sdk.C5982OoooOoO;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ImagePipelineConfig {
    public static DefaultImageRequestConfig sDefaultImageRequestConfig = new DefaultImageRequestConfig();
    public final Bitmap.Config mBitmapConfig;
    public final Supplier<MemoryCacheParams> mBitmapMemoryCacheParamsSupplier;
    public final CountingMemoryCache.CacheTrimStrategy mBitmapMemoryCacheTrimStrategy;
    public final CacheKeyFactory mCacheKeyFactory;
    public final Context mContext;
    public final boolean mDiskCacheEnabled;
    public final boolean mDownsampleEnabled;
    public final Supplier<MemoryCacheParams> mEncodedMemoryCacheParamsSupplier;
    public final ExecutorSupplier mExecutorSupplier;
    public final FileCacheFactory mFileCacheFactory;
    public final int mHttpNetworkTimeout;
    public final ImageCacheStatsTracker mImageCacheStatsTracker;
    @Nullable
    public final ImageDecoder mImageDecoder;
    @Nullable
    public final ImageDecoderConfig mImageDecoderConfig;
    public final ImagePipelineExperiments mImagePipelineExperiments;
    public final Supplier<Boolean> mIsPrefetchEnabledSupplier;
    public final DiskCacheConfig mMainDiskCacheConfig;
    public final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
    public final NetworkFetcher mNetworkFetcher;
    @Nullable
    public final PlatformBitmapFactory mPlatformBitmapFactory;
    public final PoolFactory mPoolFactory;
    public final ProgressiveJpegConfig mProgressiveJpegConfig;
    public final Set<RequestListener> mRequestListeners;
    public final boolean mResizeAndRotateEnabledForNetwork;
    public final DiskCacheConfig mSmallImageDiskCacheConfig;

    public static class Builder {
        public Bitmap.Config mBitmapConfig;
        public Supplier<MemoryCacheParams> mBitmapMemoryCacheParamsSupplier;
        public CountingMemoryCache.CacheTrimStrategy mBitmapMemoryCacheTrimStrategy;
        public CacheKeyFactory mCacheKeyFactory;
        public final Context mContext;
        public boolean mDiskCacheEnabled;
        public boolean mDownsampleEnabled;
        public Supplier<MemoryCacheParams> mEncodedMemoryCacheParamsSupplier;
        public ExecutorSupplier mExecutorSupplier;
        public final ImagePipelineExperiments.Builder mExperimentsBuilder;
        public FileCacheFactory mFileCacheFactory;
        public int mHttpConnectionTimeout;
        public ImageCacheStatsTracker mImageCacheStatsTracker;
        public ImageDecoder mImageDecoder;
        public ImageDecoderConfig mImageDecoderConfig;
        public Supplier<Boolean> mIsPrefetchEnabledSupplier;
        public DiskCacheConfig mMainDiskCacheConfig;
        public MemoryTrimmableRegistry mMemoryTrimmableRegistry;
        public NetworkFetcher mNetworkFetcher;
        public PlatformBitmapFactory mPlatformBitmapFactory;
        public PoolFactory mPoolFactory;
        public ProgressiveJpegConfig mProgressiveJpegConfig;
        public Set<RequestListener> mRequestListeners;
        public boolean mResizeAndRotateEnabledForNetwork;
        public DiskCacheConfig mSmallImageDiskCacheConfig;

        public ImagePipelineConfig build() {
            return new ImagePipelineConfig(this);
        }

        public ImagePipelineExperiments.Builder experiment() {
            return this.mExperimentsBuilder;
        }

        public boolean isDiskCacheEnabled() {
            return this.mDiskCacheEnabled;
        }

        public boolean isDownsampleEnabled() {
            return this.mDownsampleEnabled;
        }

        public Builder setBitmapMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> supplier) {
            this.mBitmapMemoryCacheParamsSupplier = (Supplier) Preconditions.checkNotNull(supplier);
            return this;
        }

        public Builder setBitmapMemoryCacheTrimStrategy(CountingMemoryCache.CacheTrimStrategy cacheTrimStrategy) {
            this.mBitmapMemoryCacheTrimStrategy = cacheTrimStrategy;
            return this;
        }

        public Builder setBitmapsConfig(Bitmap.Config config) {
            this.mBitmapConfig = config;
            return this;
        }

        public Builder setCacheKeyFactory(CacheKeyFactory cacheKeyFactory) {
            this.mCacheKeyFactory = cacheKeyFactory;
            return this;
        }

        public Builder setDiskCacheEnabled(boolean z) {
            this.mDiskCacheEnabled = z;
            return this;
        }

        public Builder setDownsampleEnabled(boolean z) {
            this.mDownsampleEnabled = z;
            return this;
        }

        public Builder setEncodedMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> supplier) {
            this.mEncodedMemoryCacheParamsSupplier = (Supplier) Preconditions.checkNotNull(supplier);
            return this;
        }

        public Builder setExecutorSupplier(ExecutorSupplier executorSupplier) {
            this.mExecutorSupplier = executorSupplier;
            return this;
        }

        public Builder setFileCacheFactory(FileCacheFactory fileCacheFactory) {
            this.mFileCacheFactory = fileCacheFactory;
            return this;
        }

        public Builder setHttpConnectionTimeout(int i) {
            this.mHttpConnectionTimeout = i;
            return this;
        }

        public Builder setImageCacheStatsTracker(ImageCacheStatsTracker imageCacheStatsTracker) {
            this.mImageCacheStatsTracker = imageCacheStatsTracker;
            return this;
        }

        public Builder setImageDecoder(ImageDecoder imageDecoder) {
            this.mImageDecoder = imageDecoder;
            return this;
        }

        public Builder setImageDecoderConfig(ImageDecoderConfig imageDecoderConfig) {
            this.mImageDecoderConfig = imageDecoderConfig;
            return this;
        }

        public Builder setIsPrefetchEnabledSupplier(Supplier<Boolean> supplier) {
            this.mIsPrefetchEnabledSupplier = supplier;
            return this;
        }

        public Builder setMainDiskCacheConfig(DiskCacheConfig diskCacheConfig) {
            this.mMainDiskCacheConfig = diskCacheConfig;
            return this;
        }

        public Builder setMemoryTrimmableRegistry(MemoryTrimmableRegistry memoryTrimmableRegistry) {
            this.mMemoryTrimmableRegistry = memoryTrimmableRegistry;
            return this;
        }

        public Builder setNetworkFetcher(NetworkFetcher networkFetcher) {
            this.mNetworkFetcher = networkFetcher;
            return this;
        }

        public Builder setPlatformBitmapFactory(PlatformBitmapFactory platformBitmapFactory) {
            this.mPlatformBitmapFactory = platformBitmapFactory;
            return this;
        }

        public Builder setPoolFactory(PoolFactory poolFactory) {
            this.mPoolFactory = poolFactory;
            return this;
        }

        public Builder setProgressiveJpegConfig(ProgressiveJpegConfig progressiveJpegConfig) {
            this.mProgressiveJpegConfig = progressiveJpegConfig;
            return this;
        }

        public Builder setRequestListeners(Set<RequestListener> set) {
            this.mRequestListeners = set;
            return this;
        }

        public Builder setResizeAndRotateEnabledForNetwork(boolean z) {
            this.mResizeAndRotateEnabledForNetwork = z;
            return this;
        }

        public Builder setSmallImageDiskCacheConfig(DiskCacheConfig diskCacheConfig) {
            this.mSmallImageDiskCacheConfig = diskCacheConfig;
            return this;
        }

        public Builder(Context context) {
            this.mDownsampleEnabled = false;
            this.mResizeAndRotateEnabledForNetwork = true;
            this.mHttpConnectionTimeout = -1;
            this.mExperimentsBuilder = new ImagePipelineExperiments.Builder(this);
            this.mDiskCacheEnabled = true;
            this.mContext = (Context) Preconditions.checkNotNull(context);
        }
    }

    public static class DefaultImageRequestConfig {
        public boolean mProgressiveRenderingEnabled;

        public boolean isProgressiveRenderingEnabled() {
            return this.mProgressiveRenderingEnabled;
        }

        public void setProgressiveRenderingEnabled(boolean z) {
            this.mProgressiveRenderingEnabled = z;
        }

        public DefaultImageRequestConfig() {
            this.mProgressiveRenderingEnabled = false;
        }
    }

    public static DefaultImageRequestConfig getDefaultImageRequestConfig() {
        return sDefaultImageRequestConfig;
    }

    public static DiskCacheConfig getDefaultMainDiskCacheConfig(Context context) {
        return DiskCacheConfig.newBuilder(context).build();
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

    @VisibleForTesting
    public static void resetDefaultRequestConfig() {
        sDefaultImageRequestConfig = new DefaultImageRequestConfig();
    }

    public static void setWebpBitmapFactory(WebpBitmapFactory webpBitmapFactory, ImagePipelineExperiments imagePipelineExperiments, BitmapCreator bitmapCreator) {
        WebpSupportStatus.sWebpBitmapFactory = webpBitmapFactory;
        WebpBitmapFactory.WebpErrorLogger webpErrorLogger = imagePipelineExperiments.getWebpErrorLogger();
        if (webpErrorLogger != null) {
            webpBitmapFactory.setWebpErrorLogger(webpErrorLogger);
        }
        if (bitmapCreator != null) {
            webpBitmapFactory.setBitmapCreator(bitmapCreator);
        }
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    public Supplier<MemoryCacheParams> getBitmapMemoryCacheParamsSupplier() {
        return this.mBitmapMemoryCacheParamsSupplier;
    }

    public CountingMemoryCache.CacheTrimStrategy getBitmapMemoryCacheTrimStrategy() {
        return this.mBitmapMemoryCacheTrimStrategy;
    }

    public CacheKeyFactory getCacheKeyFactory() {
        return this.mCacheKeyFactory;
    }

    public Context getContext() {
        return this.mContext;
    }

    public Supplier<MemoryCacheParams> getEncodedMemoryCacheParamsSupplier() {
        return this.mEncodedMemoryCacheParamsSupplier;
    }

    public ExecutorSupplier getExecutorSupplier() {
        return this.mExecutorSupplier;
    }

    public ImagePipelineExperiments getExperiments() {
        return this.mImagePipelineExperiments;
    }

    public FileCacheFactory getFileCacheFactory() {
        return this.mFileCacheFactory;
    }

    public ImageCacheStatsTracker getImageCacheStatsTracker() {
        return this.mImageCacheStatsTracker;
    }

    @Nullable
    public ImageDecoder getImageDecoder() {
        return this.mImageDecoder;
    }

    @Nullable
    public ImageDecoderConfig getImageDecoderConfig() {
        return this.mImageDecoderConfig;
    }

    public Supplier<Boolean> getIsPrefetchEnabledSupplier() {
        return this.mIsPrefetchEnabledSupplier;
    }

    public DiskCacheConfig getMainDiskCacheConfig() {
        return this.mMainDiskCacheConfig;
    }

    public MemoryTrimmableRegistry getMemoryTrimmableRegistry() {
        return this.mMemoryTrimmableRegistry;
    }

    public NetworkFetcher getNetworkFetcher() {
        return this.mNetworkFetcher;
    }

    @Nullable
    public PlatformBitmapFactory getPlatformBitmapFactory() {
        return this.mPlatformBitmapFactory;
    }

    public PoolFactory getPoolFactory() {
        return this.mPoolFactory;
    }

    public ProgressiveJpegConfig getProgressiveJpegConfig() {
        return this.mProgressiveJpegConfig;
    }

    public Set<RequestListener> getRequestListeners() {
        return Collections.unmodifiableSet(this.mRequestListeners);
    }

    public DiskCacheConfig getSmallImageDiskCacheConfig() {
        return this.mSmallImageDiskCacheConfig;
    }

    public boolean isDiskCacheEnabled() {
        return this.mDiskCacheEnabled;
    }

    public boolean isDownsampleEnabled() {
        return this.mDownsampleEnabled;
    }

    public boolean isResizeAndRotateEnabledForNetwork() {
        return this.mResizeAndRotateEnabledForNetwork;
    }

    public ImagePipelineConfig(Builder builder) {
        Supplier<MemoryCacheParams> supplier;
        CountingMemoryCache.CacheTrimStrategy cacheTrimStrategy;
        Bitmap.Config config;
        CacheKeyFactory cacheKeyFactory;
        FileCacheFactory fileCacheFactory;
        Supplier<MemoryCacheParams> supplier2;
        ImageCacheStatsTracker imageCacheStatsTracker;
        Supplier<Boolean> supplier3;
        DiskCacheConfig diskCacheConfig;
        MemoryTrimmableRegistry memoryTrimmableRegistry;
        int i;
        NetworkFetcher networkFetcher;
        PoolFactory poolFactory;
        ProgressiveJpegConfig progressiveJpegConfig;
        Set<RequestListener> set;
        DiskCacheConfig diskCacheConfig2;
        ExecutorSupplier executorSupplier;
        WebpBitmapFactory loadWebpBitmapFactoryIfExists;
        this.mImagePipelineExperiments = builder.mExperimentsBuilder.build();
        if (builder.mBitmapMemoryCacheParamsSupplier == null) {
            supplier = new DefaultBitmapMemoryCacheParamsSupplier((ActivityManager) builder.mContext.getSystemService(C5982OoooOoO.OooO0o0));
        } else {
            supplier = builder.mBitmapMemoryCacheParamsSupplier;
        }
        this.mBitmapMemoryCacheParamsSupplier = supplier;
        if (builder.mBitmapMemoryCacheTrimStrategy == null) {
            cacheTrimStrategy = new BitmapMemoryCacheTrimStrategy();
        } else {
            cacheTrimStrategy = builder.mBitmapMemoryCacheTrimStrategy;
        }
        this.mBitmapMemoryCacheTrimStrategy = cacheTrimStrategy;
        if (builder.mBitmapConfig == null) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = builder.mBitmapConfig;
        }
        this.mBitmapConfig = config;
        if (builder.mCacheKeyFactory == null) {
            cacheKeyFactory = DefaultCacheKeyFactory.getInstance();
        } else {
            cacheKeyFactory = builder.mCacheKeyFactory;
        }
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mContext = (Context) Preconditions.checkNotNull(builder.mContext);
        if (builder.mFileCacheFactory == null) {
            fileCacheFactory = new DiskStorageCacheFactory(new DynamicDefaultDiskStorageFactory());
        } else {
            fileCacheFactory = builder.mFileCacheFactory;
        }
        this.mFileCacheFactory = fileCacheFactory;
        this.mDownsampleEnabled = builder.mDownsampleEnabled;
        if (builder.mEncodedMemoryCacheParamsSupplier == null) {
            supplier2 = new DefaultEncodedMemoryCacheParamsSupplier();
        } else {
            supplier2 = builder.mEncodedMemoryCacheParamsSupplier;
        }
        this.mEncodedMemoryCacheParamsSupplier = supplier2;
        if (builder.mImageCacheStatsTracker == null) {
            imageCacheStatsTracker = NoOpImageCacheStatsTracker.getInstance();
        } else {
            imageCacheStatsTracker = builder.mImageCacheStatsTracker;
        }
        this.mImageCacheStatsTracker = imageCacheStatsTracker;
        this.mImageDecoder = builder.mImageDecoder;
        if (builder.mIsPrefetchEnabledSupplier == null) {
            supplier3 = new Supplier<Boolean>() {
                /* class com.facebook.imagepipeline.core.ImagePipelineConfig.C05231 */

                @Override // com.facebook.common.internal.Supplier
                public Boolean get() {
                    return true;
                }
            };
        } else {
            supplier3 = builder.mIsPrefetchEnabledSupplier;
        }
        this.mIsPrefetchEnabledSupplier = supplier3;
        if (builder.mMainDiskCacheConfig == null) {
            diskCacheConfig = getDefaultMainDiskCacheConfig(builder.mContext);
        } else {
            diskCacheConfig = builder.mMainDiskCacheConfig;
        }
        this.mMainDiskCacheConfig = diskCacheConfig;
        if (builder.mMemoryTrimmableRegistry == null) {
            memoryTrimmableRegistry = NoOpMemoryTrimmableRegistry.getInstance();
        } else {
            memoryTrimmableRegistry = builder.mMemoryTrimmableRegistry;
        }
        this.mMemoryTrimmableRegistry = memoryTrimmableRegistry;
        if (builder.mHttpConnectionTimeout < 0) {
            i = 30000;
        } else {
            i = builder.mHttpConnectionTimeout;
        }
        this.mHttpNetworkTimeout = i;
        if (builder.mNetworkFetcher == null) {
            networkFetcher = new HttpUrlConnectionNetworkFetcher(this.mHttpNetworkTimeout);
        } else {
            networkFetcher = builder.mNetworkFetcher;
        }
        this.mNetworkFetcher = networkFetcher;
        this.mPlatformBitmapFactory = builder.mPlatformBitmapFactory;
        if (builder.mPoolFactory == null) {
            poolFactory = new PoolFactory(PoolConfig.newBuilder().build());
        } else {
            poolFactory = builder.mPoolFactory;
        }
        this.mPoolFactory = poolFactory;
        if (builder.mProgressiveJpegConfig == null) {
            progressiveJpegConfig = new SimpleProgressiveJpegConfig();
        } else {
            progressiveJpegConfig = builder.mProgressiveJpegConfig;
        }
        this.mProgressiveJpegConfig = progressiveJpegConfig;
        if (builder.mRequestListeners == null) {
            set = new HashSet<>();
        } else {
            set = builder.mRequestListeners;
        }
        this.mRequestListeners = set;
        this.mResizeAndRotateEnabledForNetwork = builder.mResizeAndRotateEnabledForNetwork;
        if (builder.mSmallImageDiskCacheConfig == null) {
            diskCacheConfig2 = this.mMainDiskCacheConfig;
        } else {
            diskCacheConfig2 = builder.mSmallImageDiskCacheConfig;
        }
        this.mSmallImageDiskCacheConfig = diskCacheConfig2;
        this.mImageDecoderConfig = builder.mImageDecoderConfig;
        int flexByteArrayPoolMaxNumThreads = this.mPoolFactory.getFlexByteArrayPoolMaxNumThreads();
        if (builder.mExecutorSupplier == null) {
            executorSupplier = new DefaultExecutorSupplier(flexByteArrayPoolMaxNumThreads);
        } else {
            executorSupplier = builder.mExecutorSupplier;
        }
        this.mExecutorSupplier = executorSupplier;
        this.mDiskCacheEnabled = builder.mDiskCacheEnabled;
        WebpBitmapFactory webpBitmapFactory = this.mImagePipelineExperiments.getWebpBitmapFactory();
        if (webpBitmapFactory != null) {
            setWebpBitmapFactory(webpBitmapFactory, this.mImagePipelineExperiments, new HoneycombBitmapCreator(getPoolFactory()));
        } else if (this.mImagePipelineExperiments.isWebpSupportEnabled() && WebpSupportStatus.sIsWebpSupportRequired && (loadWebpBitmapFactoryIfExists = WebpSupportStatus.loadWebpBitmapFactoryIfExists()) != null) {
            setWebpBitmapFactory(loadWebpBitmapFactoryIfExists, this.mImagePipelineExperiments, new HoneycombBitmapCreator(getPoolFactory()));
        }
    }
}
