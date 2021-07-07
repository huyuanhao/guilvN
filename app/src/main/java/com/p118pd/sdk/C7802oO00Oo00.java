package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO00Oo00  reason: case insensitive filesystem */
public final class C7802oO00Oo00 implements AbstractC7803oO00Oo0O<Drawable, byte[]> {
    public final AbstractC7711o0ooO0OO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7803oO00Oo0O<Bitmap, byte[]> f20857OooO00o;
    public final AbstractC7803oO00Oo0O<C7796oO00OO, byte[]> OooO0O0;

    public C7802oO00Oo00(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull AbstractC7803oO00Oo0O<Bitmap, byte[]> oo00oo0o, @NonNull AbstractC7803oO00Oo0O<C7796oO00OO, byte[]> oo00oo0o2) {
        this.OooO00o = o0ooo0oo;
        this.f20857OooO00o = oo00oo0o;
        this.OooO0O0 = oo00oo0o2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.o0oo0oo0<android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static AbstractC7700o0oo0oo0<C7796oO00OO> OooO00o(@NonNull AbstractC7700o0oo0oo0<Drawable> o0oo0oo0) {
        return o0oo0oo0;
    }

    @Override // com.p118pd.sdk.AbstractC7803oO00Oo0O
    @Nullable
    public AbstractC7700o0oo0oo0<byte[]> OooO00o(@NonNull AbstractC7700o0oo0oo0<Drawable> o0oo0oo0, @NonNull C7648o0oOoOo o0ooooo) {
        Drawable drawable = o0oo0oo0.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f20857OooO00o.OooO00o(C7875oO0OOo0o.OooO00o(((BitmapDrawable) drawable).getBitmap(), this.OooO00o), o0ooooo);
        }
        if (drawable instanceof C7796oO00OO) {
            return this.OooO0O0.OooO00o(OooO00o(o0oo0oo0), o0ooooo);
        }
        return null;
    }
}
