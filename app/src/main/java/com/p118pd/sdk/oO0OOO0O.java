package com.p118pd.sdk;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;

/* renamed from: com.pd.sdk.oO0OOO0O */
public interface oO0OOO0O<R> {
    boolean onLoadFailed(@Nullable GlideException glideException, Object obj, AbstractC7833oO00oOo0<R> oo00ooo0, boolean z);

    boolean onResourceReady(R r, Object obj, AbstractC7833oO00oOo0<R> oo00ooo0, DataSource dataSource, boolean z);
}
