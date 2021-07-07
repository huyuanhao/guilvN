package com.facebook.drawee.backends.pipeline.info.internal;

import android.graphics.drawable.Animatable;
import com.facebook.common.time.MonotonicClock;
import com.facebook.drawee.backends.pipeline.info.ImagePerfMonitor;
import com.facebook.drawee.backends.pipeline.info.ImagePerfState;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import javax.annotation.Nullable;

public class ImagePerfControllerListener extends BaseControllerListener<ImageInfo> {
    public final MonotonicClock mClock;
    public final ImagePerfMonitor mImagePerfMonitor;
    public final ImagePerfState mImagePerfState;

    public ImagePerfControllerListener(MonotonicClock monotonicClock, ImagePerfState imagePerfState, ImagePerfMonitor imagePerfMonitor) {
        this.mClock = monotonicClock;
        this.mImagePerfState = imagePerfState;
        this.mImagePerfMonitor = imagePerfMonitor;
    }

    @Override // com.facebook.drawee.controller.ControllerListener, com.facebook.drawee.controller.BaseControllerListener
    public void onFailure(String str, Throwable th) {
        this.mImagePerfState.setControllerFailureTimeMs(this.mClock.now());
        this.mImagePerfState.setControllerId(str);
        this.mImagePerfState.setSuccessful(false);
        this.mImagePerfMonitor.notifyListeners(this.mImagePerfState, 5);
    }

    @Override // com.facebook.drawee.controller.ControllerListener, com.facebook.drawee.controller.BaseControllerListener
    public void onRelease(String str) {
        super.onRelease(str);
        int imageLoadStatus = this.mImagePerfState.getImageLoadStatus();
        if (imageLoadStatus != 3 && imageLoadStatus != 5) {
            this.mImagePerfState.setControllerCancelTimeMs(this.mClock.now());
            this.mImagePerfState.setControllerId(str);
            this.mImagePerfState.setCanceled(true);
            this.mImagePerfMonitor.notifyListeners(this.mImagePerfState, 4);
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener, com.facebook.drawee.controller.BaseControllerListener
    public void onSubmit(String str, Object obj) {
        this.mImagePerfState.setControllerSubmitTimeMs(this.mClock.now());
        this.mImagePerfState.setControllerId(str);
        this.mImagePerfState.setCallerContext(obj);
        this.mImagePerfMonitor.notifyListeners(this.mImagePerfState, 0);
    }

    public void onFinalImageSet(String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
        this.mImagePerfState.setControllerFinalImageSetTimeMs(this.mClock.now());
        this.mImagePerfState.setControllerId(str);
        this.mImagePerfState.setImageInfo(imageInfo);
        this.mImagePerfState.setSuccessful(true);
        this.mImagePerfMonitor.notifyListeners(this.mImagePerfState, 3);
    }

    public void onIntermediateImageSet(String str, @Nullable ImageInfo imageInfo) {
        this.mImagePerfState.setControllerIntermediateImageSetTimeMs(this.mClock.now());
        this.mImagePerfState.setControllerId(str);
        this.mImagePerfState.setImageInfo(imageInfo);
        this.mImagePerfMonitor.notifyListeners(this.mImagePerfState, 2);
    }
}
