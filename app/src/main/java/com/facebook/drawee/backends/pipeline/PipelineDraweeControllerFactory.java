package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class PipelineDraweeControllerFactory {
    public DrawableFactory mAnimatedDrawableFactory;
    @Nullable
    public Supplier<Boolean> mDebugOverlayEnabledSupplier;
    public DeferredReleaser mDeferredReleaser;
    @Nullable
    public ImmutableList<DrawableFactory> mDrawableFactories;
    public MemoryCache<CacheKey, CloseableImage> mMemoryCache;
    public Resources mResources;
    public Executor mUiThreadExecutor;

    public void init(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory drawableFactory, Executor executor, MemoryCache<CacheKey, CloseableImage> memoryCache, @Nullable ImmutableList<DrawableFactory> immutableList, @Nullable Supplier<Boolean> supplier) {
        this.mResources = resources;
        this.mDeferredReleaser = deferredReleaser;
        this.mAnimatedDrawableFactory = drawableFactory;
        this.mUiThreadExecutor = executor;
        this.mMemoryCache = memoryCache;
        this.mDrawableFactories = immutableList;
        this.mDebugOverlayEnabledSupplier = supplier;
    }

    public PipelineDraweeController internalCreateController(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory drawableFactory, Executor executor, MemoryCache<CacheKey, CloseableImage> memoryCache, @Nullable ImmutableList<DrawableFactory> immutableList) {
        return new PipelineDraweeController(resources, deferredReleaser, drawableFactory, executor, memoryCache, immutableList);
    }

    public PipelineDraweeController newController() {
        PipelineDraweeController internalCreateController = internalCreateController(this.mResources, this.mDeferredReleaser, this.mAnimatedDrawableFactory, this.mUiThreadExecutor, this.mMemoryCache, this.mDrawableFactories);
        Supplier<Boolean> supplier = this.mDebugOverlayEnabledSupplier;
        if (supplier != null) {
            internalCreateController.setDrawDebugOverlay(supplier.get().booleanValue());
        }
        return internalCreateController;
    }
}
