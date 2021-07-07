package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.info.ImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.Set;
import javax.annotation.Nullable;

public class PipelineDraweeControllerBuilder extends AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<CloseableImage>, ImageInfo> {
    @Nullable
    public ImmutableList<DrawableFactory> mCustomDrawableFactories;
    @Nullable
    public ImageOriginListener mImageOriginListener;
    @Nullable
    public ImagePerfDataListener mImagePerfDataListener;
    public final ImagePipeline mImagePipeline;
    public final PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;

    /* renamed from: com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder$1 */
    public static /* synthetic */ class C04831 {

        /* renamed from: $SwitchMap$com$facebook$drawee$controller$AbstractDraweeControllerBuilder$CacheLevel */
        public static final /* synthetic */ int[] f962x8d44a530;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel[] r0 = com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder.C04831.f962x8d44a530 = r0
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel r1 = com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder.C04831.f962x8d44a530     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel r1 = com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel.DISK_CACHE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder.C04831.f962x8d44a530     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel r1 = com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel.BITMAP_MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder.C04831.<clinit>():void");
        }
    }

    public PipelineDraweeControllerBuilder(Context context, PipelineDraweeControllerFactory pipelineDraweeControllerFactory, ImagePipeline imagePipeline, Set<ControllerListener> set) {
        super(context, set);
        this.mImagePipeline = imagePipeline;
        this.mPipelineDraweeControllerFactory = pipelineDraweeControllerFactory;
    }

    public static ImageRequest.RequestLevel convertCacheLevelToRequestLevel(AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        int i = C04831.f962x8d44a530[cacheLevel.ordinal()];
        if (i == 1) {
            return ImageRequest.RequestLevel.FULL_FETCH;
        }
        if (i == 2) {
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        if (i == 3) {
            return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cacheLevel + "is not supported. ");
    }

    private CacheKey getCacheKey() {
        ImageRequest imageRequest = (ImageRequest) getImageRequest();
        CacheKeyFactory cacheKeyFactory = this.mImagePipeline.getCacheKeyFactory();
        if (cacheKeyFactory == null || imageRequest == null) {
            return null;
        }
        if (imageRequest.getPostprocessor() != null) {
            return cacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, getCallerContext());
        }
        return cacheKeyFactory.getBitmapCacheKey(imageRequest, getCallerContext());
    }

    @Nullable
    public RequestListener getRequestListener(DraweeController draweeController) {
        if (draweeController instanceof PipelineDraweeController) {
            return ((PipelineDraweeController) draweeController).getRequestListener();
        }
        return null;
    }

    public PipelineDraweeControllerBuilder setCustomDrawableFactories(@Nullable ImmutableList<DrawableFactory> immutableList) {
        this.mCustomDrawableFactories = immutableList;
        return (PipelineDraweeControllerBuilder) getThis();
    }

    public PipelineDraweeControllerBuilder setCustomDrawableFactory(DrawableFactory drawableFactory) {
        Preconditions.checkNotNull(drawableFactory);
        return setCustomDrawableFactories(ImmutableList.m843of(drawableFactory));
    }

    public PipelineDraweeControllerBuilder setImageOriginListener(@Nullable ImageOriginListener imageOriginListener) {
        this.mImageOriginListener = imageOriginListener;
        return (PipelineDraweeControllerBuilder) getThis();
    }

    public PipelineDraweeControllerBuilder setPerfDataListener(@Nullable ImagePerfDataListener imagePerfDataListener) {
        this.mImagePerfDataListener = imagePerfDataListener;
        return (PipelineDraweeControllerBuilder) getThis();
    }

    public DataSource<CloseableReference<CloseableImage>> getDataSourceForRequest(DraweeController draweeController, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        return this.mImagePipeline.fetchDecodedImage(imageRequest, obj, convertCacheLevelToRequestLevel(cacheLevel), getRequestListener(draweeController));
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    public PipelineDraweeController obtainController() {
        PipelineDraweeController pipelineDraweeController;
        FrescoSystrace.beginSection("obtainController");
        try {
            DraweeController oldController = getOldController();
            String generateUniqueControllerId = AbstractDraweeControllerBuilder.generateUniqueControllerId();
            if (oldController instanceof PipelineDraweeController) {
                pipelineDraweeController = (PipelineDraweeController) oldController;
            } else {
                pipelineDraweeController = this.mPipelineDraweeControllerFactory.newController();
            }
            pipelineDraweeController.initialize(obtainDataSourceSupplier(pipelineDraweeController, generateUniqueControllerId), generateUniqueControllerId, getCacheKey(), getCallerContext(), this.mCustomDrawableFactories, this.mImageOriginListener);
            pipelineDraweeController.initializePerformanceMonitoring(this.mImagePerfDataListener);
            return pipelineDraweeController;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public PipelineDraweeControllerBuilder setCustomDrawableFactories(DrawableFactory... drawableFactoryArr) {
        Preconditions.checkNotNull(drawableFactoryArr);
        return setCustomDrawableFactories(ImmutableList.m843of(drawableFactoryArr));
    }

    @Override // com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder
    public PipelineDraweeControllerBuilder setUri(@Nullable Uri uri) {
        if (uri == null) {
            return (PipelineDraweeControllerBuilder) super.setImageRequest(null);
        }
        return (PipelineDraweeControllerBuilder) super.setImageRequest(ImageRequestBuilder.newBuilderWithSource(uri).setRotationOptions(RotationOptions.autoRotateAtRenderTime()).build());
    }

    @Override // com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder
    public PipelineDraweeControllerBuilder setUri(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return (PipelineDraweeControllerBuilder) super.setImageRequest(ImageRequest.fromUri(str));
        }
        return setUri(Uri.parse(str));
    }
}
