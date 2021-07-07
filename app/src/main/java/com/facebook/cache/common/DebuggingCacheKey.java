package com.facebook.cache.common;

import android.net.Uri;
import javax.annotation.Nullable;

public class DebuggingCacheKey extends SimpleCacheKey {
    public final Object mCallerContext;
    public final Uri mSourceUri;

    public DebuggingCacheKey(String str, @Nullable Object obj, Uri uri) {
        super(str);
        this.mCallerContext = obj;
        this.mSourceUri = uri;
    }

    @Nullable
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }
}
