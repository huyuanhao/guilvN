package com.p118pd.sdk;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO00O0oO */
public final class oO00O0oO extends AbstractC7794oO00O0o<Drawable> {
    public oO00O0oO(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    public static AbstractC7700o0oo0oo0<Drawable> OooO00o(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new oO00O0oO(drawable);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public void recycle() {
    }

    /* Return type fixed from 'java.lang.Class<android.graphics.drawable.Drawable>' to match base method */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<android.graphics.drawable.Drawable> */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7794oO00O0o
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Drawable m19482OooO00o() {
        return this.OooO00o.getClass();
    }

    /* Return type fixed from 'int' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7794oO00O0o
    public Drawable OooO00o() {
        return Math.max(1, this.OooO00o.getIntrinsicWidth() * this.OooO00o.getIntrinsicHeight() * 4);
    }
}
