package com.facebook.drawee.backends.pipeline.info;

import com.facebook.common.internal.Objects;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;

public class ImagePerfData {
    public static final int UNSET = -1;
    @Nullable
    public final Object mCallerContext;
    public final long mControllerCancelTimeMs;
    public final long mControllerFailureTimeMs;
    public final long mControllerFinalImageSetTimeMs;
    @Nullable
    public final String mControllerId;
    public final long mControllerIntermediateImageSetTimeMs;
    public final long mControllerSubmitTimeMs;
    @Nullable
    public final ImageInfo mImageInfo;
    public final int mImageOrigin;
    @Nullable
    public final ImageRequest mImageRequest;
    public final long mImageRequestEndTimeMs;
    public final long mImageRequestStartTimeMs;
    public final boolean mIsCanceled;
    public final boolean mIsPrefetch;
    public final boolean mIsSuccessful;
    @Nullable
    public final String mRequestId;

    public ImagePerfData(@Nullable String str, @Nullable String str2, @Nullable ImageRequest imageRequest, @Nullable Object obj, @Nullable ImageInfo imageInfo, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, boolean z, boolean z2, boolean z3) {
        this.mControllerId = str;
        this.mRequestId = str2;
        this.mImageRequest = imageRequest;
        this.mCallerContext = obj;
        this.mImageInfo = imageInfo;
        this.mControllerSubmitTimeMs = j;
        this.mControllerIntermediateImageSetTimeMs = j2;
        this.mControllerFinalImageSetTimeMs = j3;
        this.mControllerFailureTimeMs = j4;
        this.mControllerCancelTimeMs = j5;
        this.mImageRequestStartTimeMs = j6;
        this.mImageRequestEndTimeMs = j7;
        this.mImageOrigin = i;
        this.mIsCanceled = z;
        this.mIsSuccessful = z2;
        this.mIsPrefetch = z3;
    }

    public String createDebugString() {
        return Objects.toStringHelper(this).add("controller ID", this.mControllerId).add("request ID", this.mRequestId).add("controller submit", this.mControllerSubmitTimeMs).add("controller final image", this.mControllerFinalImageSetTimeMs).add("controller failure", this.mControllerFailureTimeMs).add("controller cancel", this.mControllerCancelTimeMs).add("start time", this.mImageRequestStartTimeMs).add("end time", this.mImageRequestEndTimeMs).add("origin", ImageOriginUtils.toString(this.mImageOrigin)).add("canceled", this.mIsCanceled).add("successful", this.mIsSuccessful).add("prefetch", this.mIsPrefetch).add("caller context", this.mCallerContext).add("image request", this.mImageRequest).add("image info", this.mImageInfo).toString();
    }

    @Nullable
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public long getControllerFailureTimeMs() {
        return this.mControllerFailureTimeMs;
    }

    public long getControllerFinalImageSetTimeMs() {
        return this.mControllerFinalImageSetTimeMs;
    }

    @Nullable
    public String getControllerId() {
        return this.mControllerId;
    }

    public long getControllerIntermediateImageSetTimeMs() {
        return this.mControllerIntermediateImageSetTimeMs;
    }

    public long getControllerSubmitTimeMs() {
        return this.mControllerSubmitTimeMs;
    }

    public long getFinalImageLoadTimeMs() {
        if (isSuccessful()) {
            return getImageRequestEndTimeMs() - getImageRequestStartTimeMs();
        }
        return -1;
    }

    @Nullable
    public ImageInfo getImageInfo() {
        return this.mImageInfo;
    }

    public int getImageOrigin() {
        return this.mImageOrigin;
    }

    @Nullable
    public ImageRequest getImageRequest() {
        return this.mImageRequest;
    }

    public long getImageRequestEndTimeMs() {
        return this.mImageRequestEndTimeMs;
    }

    public long getImageRequestStartTimeMs() {
        return this.mImageRequestStartTimeMs;
    }

    public long getIntermediateImageLoadTimeMs() {
        if (isSuccessful()) {
            return getControllerIntermediateImageSetTimeMs() - getControllerSubmitTimeMs();
        }
        return -1;
    }

    @Nullable
    public String getRequestId() {
        return this.mRequestId;
    }

    public boolean isCanceled() {
        return this.mIsCanceled;
    }

    public boolean isPrefetch() {
        return this.mIsPrefetch;
    }

    public boolean isSuccessful() {
        return this.mIsSuccessful;
    }
}
