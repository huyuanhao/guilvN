package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;

public class ImageRequestBuilder {
    @Nullable
    public BytesRange mBytesRange = null;
    public ImageRequest.CacheChoice mCacheChoice = ImageRequest.CacheChoice.DEFAULT;
    public boolean mDiskCacheEnabled = true;
    public ImageDecodeOptions mImageDecodeOptions = ImageDecodeOptions.defaults();
    public boolean mLocalThumbnailPreviewsEnabled = false;
    public ImageRequest.RequestLevel mLowestPermittedRequestLevel = ImageRequest.RequestLevel.FULL_FETCH;
    public boolean mMemoryCacheEnabled = true;
    @Nullable
    public Postprocessor mPostprocessor = null;
    public boolean mProgressiveRenderingEnabled = ImagePipelineConfig.getDefaultImageRequestConfig().isProgressiveRenderingEnabled();
    @Nullable
    public RequestListener mRequestListener;
    public Priority mRequestPriority = Priority.HIGH;
    @Nullable
    public ResizeOptions mResizeOptions = null;
    @Nullable
    public RotationOptions mRotationOptions = null;
    public Uri mSourceUri = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    public static ImageRequestBuilder fromRequest(ImageRequest imageRequest) {
        return newBuilderWithSource(imageRequest.getSourceUri()).setImageDecodeOptions(imageRequest.getImageDecodeOptions()).setBytesRange(imageRequest.getBytesRange()).setCacheChoice(imageRequest.getCacheChoice()).setLocalThumbnailPreviewsEnabled(imageRequest.getLocalThumbnailPreviewsEnabled()).setLowestPermittedRequestLevel(imageRequest.getLowestPermittedRequestLevel()).setPostprocessor(imageRequest.getPostprocessor()).setProgressiveRenderingEnabled(imageRequest.getProgressiveRenderingEnabled()).setRequestPriority(imageRequest.getPriority()).setResizeOptions(imageRequest.getResizeOptions()).setRequestListener(imageRequest.getRequestListener()).setRotationOptions(imageRequest.getRotationOptions());
    }

    public static ImageRequestBuilder newBuilderWithResourceId(int i) {
        return newBuilderWithSource(UriUtil.getUriForResourceId(i));
    }

    public static ImageRequestBuilder newBuilderWithSource(Uri uri) {
        return new ImageRequestBuilder().setSource(uri);
    }

    public ImageRequest build() {
        validate();
        return new ImageRequest(this);
    }

    public ImageRequestBuilder disableDiskCache() {
        this.mDiskCacheEnabled = false;
        return this;
    }

    public ImageRequestBuilder disableMemoryCache() {
        this.mMemoryCacheEnabled = false;
        return this;
    }

    @Nullable
    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public ImageRequest.CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public ImageDecodeOptions getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public ImageRequest.RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    @Nullable
    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    @Nullable
    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    public Priority getRequestPriority() {
        return this.mRequestPriority;
    }

    @Nullable
    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    @Nullable
    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public boolean isDiskCacheEnabled() {
        return this.mDiskCacheEnabled && UriUtil.isNetworkUri(this.mSourceUri);
    }

    public boolean isLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mMemoryCacheEnabled;
    }

    public boolean isProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    @Deprecated
    public ImageRequestBuilder setAutoRotateEnabled(boolean z) {
        if (z) {
            return setRotationOptions(RotationOptions.autoRotate());
        }
        return setRotationOptions(RotationOptions.disableRotation());
    }

    public ImageRequestBuilder setBytesRange(@Nullable BytesRange bytesRange) {
        this.mBytesRange = bytesRange;
        return this;
    }

    public ImageRequestBuilder setCacheChoice(ImageRequest.CacheChoice cacheChoice) {
        this.mCacheChoice = cacheChoice;
        return this;
    }

    public ImageRequestBuilder setImageDecodeOptions(ImageDecodeOptions imageDecodeOptions) {
        this.mImageDecodeOptions = imageDecodeOptions;
        return this;
    }

    public ImageRequestBuilder setLocalThumbnailPreviewsEnabled(boolean z) {
        this.mLocalThumbnailPreviewsEnabled = z;
        return this;
    }

    public ImageRequestBuilder setLowestPermittedRequestLevel(ImageRequest.RequestLevel requestLevel) {
        this.mLowestPermittedRequestLevel = requestLevel;
        return this;
    }

    public ImageRequestBuilder setPostprocessor(Postprocessor postprocessor) {
        this.mPostprocessor = postprocessor;
        return this;
    }

    public ImageRequestBuilder setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
        return this;
    }

    public ImageRequestBuilder setRequestListener(RequestListener requestListener) {
        this.mRequestListener = requestListener;
        return this;
    }

    public ImageRequestBuilder setRequestPriority(Priority priority) {
        this.mRequestPriority = priority;
        return this;
    }

    public ImageRequestBuilder setResizeOptions(@Nullable ResizeOptions resizeOptions) {
        this.mResizeOptions = resizeOptions;
        return this;
    }

    public ImageRequestBuilder setRotationOptions(@Nullable RotationOptions rotationOptions) {
        this.mRotationOptions = rotationOptions;
        return this;
    }

    public ImageRequestBuilder setSource(Uri uri) {
        Preconditions.checkNotNull(uri);
        this.mSourceUri = uri;
        return this;
    }

    public void validate() {
        Uri uri = this.mSourceUri;
        if (uri != null) {
            if (UriUtil.isLocalResourceUri(uri)) {
                if (!this.mSourceUri.isAbsolute()) {
                    throw new BuilderException("Resource URI path must be absolute.");
                } else if (!this.mSourceUri.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.mSourceUri.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new BuilderException("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new BuilderException("Resource URI must not be empty");
                }
            }
            if (UriUtil.isLocalAssetUri(this.mSourceUri) && !this.mSourceUri.isAbsolute()) {
                throw new BuilderException("Asset URI path must be absolute.");
            }
            return;
        }
        throw new BuilderException("Source must be set!");
    }
}
