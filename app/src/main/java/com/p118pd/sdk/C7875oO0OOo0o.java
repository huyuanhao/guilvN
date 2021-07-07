package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO0OOo0o  reason: case insensitive filesystem */
public class C7875oO0OOo0o implements AbstractC7700o0oo0oo0<Bitmap>, AbstractC7695o0oo0o0o {
    public final Bitmap OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f20949OooO00o;

    public C7875oO0OOo0o(@NonNull Bitmap bitmap, @NonNull AbstractC7711o0ooO0OO o0ooo0oo) {
        this.OooO00o = (Bitmap) C7842oO0O0.OooO00o(bitmap, "Bitmap must not be null");
        this.f20949OooO00o = (AbstractC7711o0ooO0OO) C7842oO0O0.OooO00o(o0ooo0oo, "BitmapPool must not be null");
    }

    @Nullable
    public static C7875oO0OOo0o OooO00o(@Nullable Bitmap bitmap, @NonNull AbstractC7711o0ooO0OO o0ooo0oo) {
        if (bitmap == null) {
            return null;
        }
        return new C7875oO0OOo0o(bitmap, o0ooo0oo);
    }

    @Override // com.p118pd.sdk.AbstractC7695o0oo0o0o
    public void initialize() {
        this.OooO00o.prepareToDraw();
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public void recycle() {
        this.f20949OooO00o.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<Bitmap> m19565OooO00o() {
        return Bitmap.class;
    }

    /* Return type fixed from 'android.graphics.Bitmap' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<Bitmap> get() {
        return this.OooO00o;
    }

    /* Return type fixed from 'int' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    public Class<Bitmap> OooO00o() {
        return oO0O0O00.OooO00o(this.OooO00o);
    }
}
