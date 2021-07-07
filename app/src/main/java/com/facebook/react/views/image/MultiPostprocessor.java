package com.facebook.react.views.image;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.MultiCacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.util.LinkedList;
import java.util.List;

public class MultiPostprocessor implements Postprocessor {
    public final List<Postprocessor> mPostprocessors;

    public MultiPostprocessor(List<Postprocessor> list) {
        this.mPostprocessors = new LinkedList(list);
    }

    public static Postprocessor from(List<Postprocessor> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            return new MultiPostprocessor(list);
        }
        return list.get(0);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (Postprocessor postprocessor : this.mPostprocessors) {
            if (sb.length() > 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(postprocessor.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        LinkedList linkedList = new LinkedList();
        for (Postprocessor postprocessor : this.mPostprocessors) {
            linkedList.push(postprocessor.getPostprocessorCacheKey());
        }
        return new MultiCacheKey(linkedList);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        CloseableReference<Bitmap> closeableReference = null;
        try {
            CloseableReference<Bitmap> closeableReference2 = null;
            for (Postprocessor postprocessor : this.mPostprocessors) {
                closeableReference = postprocessor.process(closeableReference2 != null ? closeableReference2.get() : bitmap, platformBitmapFactory);
                CloseableReference.closeSafely(closeableReference2);
                closeableReference2 = closeableReference.clone();
            }
            CloseableReference<Bitmap> clone = closeableReference.clone();
            CloseableReference.closeSafely(closeableReference);
            return clone;
        } catch (Throwable th) {
            CloseableReference.closeSafely((CloseableReference<?>) null);
            throw th;
        }
    }
}
