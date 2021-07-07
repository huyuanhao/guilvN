package com.p118pd.sdk;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO00oOo0  reason: case insensitive filesystem */
public interface AbstractC7833oO00oOo0<R> extends AbstractC7811oO00OooO {
    public static final int OooOOOO = Integer.MIN_VALUE;

    @Nullable
    AbstractC7821oO00o0o getRequest();

    void getSize(@NonNull AbstractC8301oOo00oO0 ooo00oo0);

    void onLoadCleared(@Nullable Drawable drawable);

    void onLoadFailed(@Nullable Drawable drawable);

    void onLoadStarted(@Nullable Drawable drawable);

    void onResourceReady(@NonNull R r, @Nullable AbstractC7837oO00ooOo<? super R> oo00oooo);

    void removeCallback(@NonNull AbstractC8301oOo00oO0 ooo00oo0);

    void setRequest(@Nullable AbstractC7821oO00o0o oo00o0o);
}
