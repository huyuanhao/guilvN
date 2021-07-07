package com.facebook.drawee.backends.pipeline.info;

import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;

public class ImagePerfState {
    @Nullable
    public Object mCallerContext;
    public long mControllerCancelTimeMs = -1;
    public long mControllerFailureTimeMs = -1;
    public long mControllerFinalImageSetTimeMs = -1;
    @Nullable
    public String mControllerId;
    public long mControllerIntermediateImageSetTimeMs = -1;
    public long mControllerSubmitTimeMs = -1;
    @Nullable
    public ImageInfo mImageInfo;
    public int mImageLoadStatus = -1;
    public int mImageOrigin = -1;
    @Nullable
    public ImageRequest mImageRequest;
    public long mImageRequestEndTimeMs = -1;
    public long mImageRequestStartTimeMs = -1;
    public boolean mIsCanceled;
    public boolean mIsPrefetch;
    public boolean mIsSuccessful;
    @Nullable
    public String mRequestId;

    public int getImageLoadStatus() {
        return this.mImageLoadStatus;
    }

    public void reset() {
        this.mRequestId = null;
        this.mImageRequest = null;
        this.mCallerContext = null;
        this.mImageInfo = null;
        this.mControllerSubmitTimeMs = -1;
        this.mControllerFinalImageSetTimeMs = -1;
        this.mControllerFailureTimeMs = -1;
        this.mControllerCancelTimeMs = -1;
        this.mImageRequestStartTimeMs = -1;
        this.mImageRequestEndTimeMs = -1;
        this.mImageOrigin = -1;
        this.mIsCanceled = false;
        this.mIsSuccessful = false;
        this.mIsPrefetch = false;
        this.mImageLoadStatus = -1;
    }

    public void setCallerContext(@Nullable Object obj) {
        this.mCallerContext = obj;
    }

    public void setCanceled(boolean z) {
        this.mIsCanceled = z;
    }

    public void setControllerCancelTimeMs(long j) {
        this.mControllerCancelTimeMs = j;
    }

    public void setControllerFailureTimeMs(long j) {
        this.mControllerFailureTimeMs = j;
    }

    public void setControllerFinalImageSetTimeMs(long j) {
        this.mControllerFinalImageSetTimeMs = j;
    }

    public void setControllerId(@Nullable String str) {
        this.mControllerId = str;
    }

    public void setControllerIntermediateImageSetTimeMs(long j) {
        this.mControllerIntermediateImageSetTimeMs = j;
    }

    public void setControllerSubmitTimeMs(long j) {
        this.mControllerSubmitTimeMs = j;
    }

    public void setImageInfo(@Nullable ImageInfo imageInfo) {
        this.mImageInfo = imageInfo;
    }

    public void setImageLoadStatus(int i) {
        this.mImageLoadStatus = i;
    }

    public void setImageOrigin(int i) {
        this.mImageOrigin = i;
    }

    public void setImageRequest(@Nullable ImageRequest imageRequest) {
        this.mImageRequest = imageRequest;
    }

    public void setImageRequestEndTimeMs(long j) {
        this.mImageRequestEndTimeMs = j;
    }

    public void setImageRequestStartTimeMs(long j) {
        this.mImageRequestStartTimeMs = j;
    }

    public void setPrefetch(boolean z) {
        this.mIsPrefetch = z;
    }

    public void setRequestId(@Nullable String str) {
        this.mRequestId = str;
    }

    public void setSuccessful(boolean z) {
        this.mIsSuccessful = z;
    }

    public ImagePerfData snapshot() {
        return new ImagePerfData(this.mControllerId, this.mRequestId, this.mImageRequest, this.mCallerContext, this.mImageInfo, this.mControllerSubmitTimeMs, this.mControllerIntermediateImageSetTimeMs, this.mControllerFinalImageSetTimeMs, this.mControllerFailureTimeMs, this.mControllerCancelTimeMs, this.mImageRequestStartTimeMs, this.mImageRequestEndTimeMs, this.mImageOrigin, this.mIsCanceled, this.mIsSuccessful, this.mIsPrefetch);
    }
}
