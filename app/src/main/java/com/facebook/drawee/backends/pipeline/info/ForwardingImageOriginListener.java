package com.facebook.drawee.backends.pipeline.info;

import com.facebook.common.logging.FLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ForwardingImageOriginListener implements ImageOriginListener {
    public static final String TAG = "ForwardingImageOriginListener";
    public final List<ImageOriginListener> mImageOriginListeners;

    public ForwardingImageOriginListener(Set<ImageOriginListener> set) {
        this.mImageOriginListeners = new ArrayList(set);
    }

    public synchronized void addImageOriginListener(ImageOriginListener imageOriginListener) {
        this.mImageOriginListeners.add(imageOriginListener);
    }

    @Override // com.facebook.drawee.backends.pipeline.info.ImageOriginListener
    public synchronized void onImageLoaded(String str, int i, boolean z) {
        int size = this.mImageOriginListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mImageOriginListeners.get(i2).onImageLoaded(str, i, z);
            } catch (Exception e) {
                FLog.m874e(TAG, "InternalListener exception in onImageLoaded", e);
            }
        }
    }

    public synchronized void removeImageOriginListener(ImageOriginListener imageOriginListener) {
        this.mImageOriginListeners.remove(imageOriginListener);
    }

    public ForwardingImageOriginListener(ImageOriginListener... imageOriginListenerArr) {
        ArrayList arrayList = new ArrayList(imageOriginListenerArr.length);
        this.mImageOriginListeners = arrayList;
        Collections.addAll(arrayList, imageOriginListenerArr);
    }
}
