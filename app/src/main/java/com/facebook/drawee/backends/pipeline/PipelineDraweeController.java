package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.datasource.DataSource;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.backends.pipeline.info.ForwardingImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.ImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.ImageOriginRequestListener;
import com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener;
import com.facebook.drawee.backends.pipeline.info.ImagePerfMonitor;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.debug.DebugControllerOverlayDrawable;
import com.facebook.drawee.debug.listener.ImageLoadingTimeControllerListener;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import com.facebook.imagepipeline.listener.RequestListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class PipelineDraweeController extends AbstractDraweeController<CloseableReference<CloseableImage>, ImageInfo> {
    public static final Class<?> TAG = PipelineDraweeController.class;
    public CacheKey mCacheKey;
    @Nullable
    public ImmutableList<DrawableFactory> mCustomDrawableFactories;
    public Supplier<DataSource<CloseableReference<CloseableImage>>> mDataSourceSupplier;
    public final DrawableFactory mDefaultDrawableFactory;
    public boolean mDrawDebugOverlay;
    @Nullable
    public final ImmutableList<DrawableFactory> mGlobalDrawableFactories;
    @GuardedBy("this")
    @Nullable
    public ImageOriginListener mImageOriginListener;
    @Nullable
    public ImagePerfMonitor mImagePerfMonitor;
    @Nullable
    public final MemoryCache<CacheKey, CloseableImage> mMemoryCache;
    @GuardedBy("this")
    @Nullable
    public Set<RequestListener> mRequestListeners;
    public final Resources mResources;

    public PipelineDraweeController(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory drawableFactory, Executor executor, @Nullable MemoryCache<CacheKey, CloseableImage> memoryCache, @Nullable ImmutableList<DrawableFactory> immutableList) {
        super(deferredReleaser, executor, null, null);
        this.mResources = resources;
        this.mDefaultDrawableFactory = new DefaultDrawableFactory(resources, drawableFactory);
        this.mGlobalDrawableFactories = immutableList;
        this.mMemoryCache = memoryCache;
    }

    private void init(Supplier<DataSource<CloseableReference<CloseableImage>>> supplier) {
        this.mDataSourceSupplier = supplier;
        maybeUpdateDebugOverlay(null);
    }

    private Drawable maybeCreateDrawableFromFactories(@Nullable ImmutableList<DrawableFactory> immutableList, CloseableImage closeableImage) {
        Drawable createDrawable;
        if (immutableList == null) {
            return null;
        }
        Iterator<DrawableFactory> it = immutableList.iterator();
        while (it.hasNext()) {
            DrawableFactory next = it.next();
            if (next.supportsImageType(closeableImage) && (createDrawable = next.createDrawable(closeableImage)) != null) {
                return createDrawable;
            }
        }
        return null;
    }

    private void maybeUpdateDebugOverlay(@Nullable CloseableImage closeableImage) {
        ScaleTypeDrawable activeScaleTypeDrawable;
        if (this.mDrawDebugOverlay) {
            if (getControllerOverlay() == null) {
                DebugControllerOverlayDrawable debugControllerOverlayDrawable = new DebugControllerOverlayDrawable();
                addControllerListener(new ImageLoadingTimeControllerListener(debugControllerOverlayDrawable));
                setControllerOverlay(debugControllerOverlayDrawable);
            }
            if (getControllerOverlay() instanceof DebugControllerOverlayDrawable) {
                DebugControllerOverlayDrawable debugControllerOverlayDrawable2 = (DebugControllerOverlayDrawable) getControllerOverlay();
                debugControllerOverlayDrawable2.setControllerId(getId());
                DraweeHierarchy hierarchy = getHierarchy();
                ScalingUtils.ScaleType scaleType = null;
                if (!(hierarchy == null || (activeScaleTypeDrawable = ScalingUtils.getActiveScaleTypeDrawable(hierarchy.getTopLevelDrawable())) == null)) {
                    scaleType = activeScaleTypeDrawable.getScaleType();
                }
                debugControllerOverlayDrawable2.setScaleType(scaleType);
                if (closeableImage != null) {
                    debugControllerOverlayDrawable2.setDimensions(closeableImage.getWidth(), closeableImage.getHeight());
                    debugControllerOverlayDrawable2.setImageSize(closeableImage.getSizeInBytes());
                    return;
                }
                debugControllerOverlayDrawable2.reset();
            }
        }
    }

    public synchronized void addImageOriginListener(ImageOriginListener imageOriginListener) {
        if (this.mImageOriginListener instanceof ForwardingImageOriginListener) {
            ((ForwardingImageOriginListener) this.mImageOriginListener).addImageOriginListener(imageOriginListener);
        } else if (this.mImageOriginListener != null) {
            this.mImageOriginListener = new ForwardingImageOriginListener(this.mImageOriginListener, imageOriginListener);
        } else {
            this.mImageOriginListener = imageOriginListener;
        }
    }

    public synchronized void addRequestListener(RequestListener requestListener) {
        if (this.mRequestListeners == null) {
            this.mRequestListeners = new HashSet();
        }
        this.mRequestListeners.add(requestListener);
    }

    public void clearImageOriginListeners() {
        synchronized (this) {
            this.mImageOriginListener = null;
        }
    }

    public CacheKey getCacheKey() {
        return this.mCacheKey;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public DataSource<CloseableReference<CloseableImage>> getDataSource() {
        if (FLog.isLoggable(2)) {
            FLog.m894v(TAG, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        return this.mDataSourceSupplier.get();
    }

    public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier() {
        return this.mDataSourceSupplier;
    }

    @Nullable
    public synchronized RequestListener getRequestListener() {
        ImageOriginRequestListener imageOriginRequestListener = null;
        if (this.mImageOriginListener != null) {
            imageOriginRequestListener = new ImageOriginRequestListener(getId(), this.mImageOriginListener);
        }
        if (this.mRequestListeners == null) {
            return imageOriginRequestListener;
        }
        ForwardingRequestListener forwardingRequestListener = new ForwardingRequestListener(this.mRequestListeners);
        if (imageOriginRequestListener != null) {
            forwardingRequestListener.addRequestListener(imageOriginRequestListener);
        }
        return forwardingRequestListener;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public void initialize(Supplier<DataSource<CloseableReference<CloseableImage>>> supplier, String str, CacheKey cacheKey, Object obj, @Nullable ImmutableList<DrawableFactory> immutableList, @Nullable ImageOriginListener imageOriginListener) {
        super.initialize(str, obj);
        init(supplier);
        this.mCacheKey = cacheKey;
        setCustomDrawableFactories(immutableList);
        clearImageOriginListeners();
        addImageOriginListener(imageOriginListener);
    }

    public synchronized void initializePerformanceMonitoring(@Nullable ImagePerfDataListener imagePerfDataListener) {
        if (this.mImagePerfMonitor != null) {
            this.mImagePerfMonitor.reset();
        }
        if (imagePerfDataListener != null) {
            if (this.mImagePerfMonitor == null) {
                this.mImagePerfMonitor = new ImagePerfMonitor(RealtimeSinceBootClock.get(), this);
            }
            this.mImagePerfMonitor.addImagePerfDataListener(imagePerfDataListener);
            this.mImagePerfMonitor.setEnabled(true);
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public boolean isSameImageRequest(@Nullable DraweeController draweeController) {
        CacheKey cacheKey = this.mCacheKey;
        if (cacheKey == null || !(draweeController instanceof PipelineDraweeController)) {
            return false;
        }
        return Objects.equal(cacheKey, ((PipelineDraweeController) draweeController).getCacheKey());
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public void releaseDrawable(@Nullable Drawable drawable) {
        if (drawable instanceof DrawableWithCaches) {
            ((DrawableWithCaches) drawable).dropCaches();
        }
    }

    public synchronized void removeImageOriginListener(ImageOriginListener imageOriginListener) {
        if (this.mImageOriginListener instanceof ForwardingImageOriginListener) {
            ((ForwardingImageOriginListener) this.mImageOriginListener).removeImageOriginListener(imageOriginListener);
        } else if (this.mImageOriginListener != null) {
            this.mImageOriginListener = new ForwardingImageOriginListener(this.mImageOriginListener, imageOriginListener);
        } else {
            this.mImageOriginListener = imageOriginListener;
        }
    }

    public synchronized void removeRequestListener(RequestListener requestListener) {
        if (this.mRequestListeners != null) {
            this.mRequestListeners.remove(requestListener);
        }
    }

    public void setCustomDrawableFactories(@Nullable ImmutableList<DrawableFactory> immutableList) {
        this.mCustomDrawableFactories = immutableList;
    }

    public void setDrawDebugOverlay(boolean z) {
        this.mDrawDebugOverlay = z;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController, com.facebook.drawee.controller.AbstractDraweeController
    public void setHierarchy(@Nullable DraweeHierarchy draweeHierarchy) {
        super.setHierarchy(draweeHierarchy);
        maybeUpdateDebugOverlay(null);
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public String toString() {
        return Objects.toStringHelper(this).add("super", super.toString()).add("dataSourceSupplier", this.mDataSourceSupplier).toString();
    }

    public Drawable createDrawable(CloseableReference<CloseableImage> closeableReference) {
        Preconditions.checkState(CloseableReference.isValid(closeableReference));
        CloseableImage closeableImage = closeableReference.get();
        maybeUpdateDebugOverlay(closeableImage);
        Drawable maybeCreateDrawableFromFactories = maybeCreateDrawableFromFactories(this.mCustomDrawableFactories, closeableImage);
        if (maybeCreateDrawableFromFactories != null) {
            return maybeCreateDrawableFromFactories;
        }
        Drawable maybeCreateDrawableFromFactories2 = maybeCreateDrawableFromFactories(this.mGlobalDrawableFactories, closeableImage);
        if (maybeCreateDrawableFromFactories2 != null) {
            return maybeCreateDrawableFromFactories2;
        }
        Drawable createDrawable = this.mDefaultDrawableFactory.createDrawable(closeableImage);
        if (createDrawable != null) {
            return createDrawable;
        }
        throw new UnsupportedOperationException("Unrecognized image class: " + closeableImage);
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public CloseableReference<CloseableImage> getCachedImage() {
        CacheKey cacheKey;
        MemoryCache<CacheKey, CloseableImage> memoryCache = this.mMemoryCache;
        if (memoryCache == null || (cacheKey = this.mCacheKey) == null) {
            return null;
        }
        CloseableReference<CloseableImage> closeableReference = memoryCache.get(cacheKey);
        if (closeableReference == null || closeableReference.get().getQualityInfo().isOfFullQuality()) {
            return closeableReference;
        }
        closeableReference.close();
        return null;
    }

    public int getImageHash(@Nullable CloseableReference<CloseableImage> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.getValueHash();
        }
        return 0;
    }

    public ImageInfo getImageInfo(CloseableReference<CloseableImage> closeableReference) {
        Preconditions.checkState(CloseableReference.isValid(closeableReference));
        return closeableReference.get();
    }

    public void onImageLoadedFromCacheImmediately(String str, CloseableReference<CloseableImage> closeableReference) {
        super.onImageLoadedFromCacheImmediately(str, (Object) closeableReference);
        synchronized (this) {
            if (this.mImageOriginListener != null) {
                this.mImageOriginListener.onImageLoaded(str, 3, true);
            }
        }
    }

    public void releaseImage(@Nullable CloseableReference<CloseableImage> closeableReference) {
        CloseableReference.closeSafely(closeableReference);
    }
}
