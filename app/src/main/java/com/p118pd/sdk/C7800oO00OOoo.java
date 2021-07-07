package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO00OOoo  reason: case insensitive filesystem */
public class C7800oO00OOoo implements AbstractC7803oO00Oo0O<Bitmap, BitmapDrawable> {
    public final Resources OooO00o;

    public C7800oO00OOoo(@NonNull Context context) {
        this(context.getResources());
    }

    @Override // com.p118pd.sdk.AbstractC7803oO00Oo0O
    @Nullable
    public AbstractC7700o0oo0oo0<BitmapDrawable> OooO00o(@NonNull AbstractC7700o0oo0oo0<Bitmap> o0oo0oo0, @NonNull C7648o0oOoOo o0ooooo) {
        return C7787oO000oO.OooO00o(this.OooO00o, o0oo0oo0);
    }

    @Deprecated
    public C7800oO00OOoo(@NonNull Resources resources, AbstractC7711o0ooO0OO o0ooo0oo) {
        this(resources);
    }

    public C7800oO00OOoo(@NonNull Resources resources) {
        this.OooO00o = (Resources) C7842oO0O0.OooO00o(resources);
    }
}
