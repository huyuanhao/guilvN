package com.p118pd.sdk;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import s.h.e.l.l.C;

@Deprecated
/* renamed from: com.pd.sdk.oO00oO00  reason: case insensitive filesystem */
public abstract class AbstractC7826oO00oO00<Z> implements AbstractC7833oO00oOo0<Z> {
    public AbstractC7821oO00o0o request;

    static {
        C.i(25);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    @Nullable
    public AbstractC7821oO00o0o getRequest() {
        return this.request;
    }

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onDestroy();

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStop();

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void setRequest(@Nullable AbstractC7821oO00o0o oo00o0o) {
        this.request = oo00o0o;
    }
}
