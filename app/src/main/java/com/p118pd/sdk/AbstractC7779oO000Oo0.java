package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.oO000Oo0  reason: case insensitive filesystem */
public abstract class AbstractC7779oO000Oo0 implements AbstractC7655o0oOoo0O<Bitmap> {
    public abstract Bitmap OooO00o(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2);

    @Override // com.p118pd.sdk.AbstractC7655o0oOoo0O
    @NonNull
    public final AbstractC7700o0oo0oo0<Bitmap> OooO00o(@NonNull Context context, @NonNull AbstractC7700o0oo0oo0<Bitmap> o0oo0oo0, int i, int i2) {
        if (oO0O0O00.m19527OooO00o(i, i2)) {
            AbstractC7711o0ooO0OO OooO00o = ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19238OooO00o();
            Bitmap bitmap = o0oo0oo0.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap OooO00o2 = OooO00o(OooO00o, bitmap, i, i2);
            return bitmap.equals(OooO00o2) ? o0oo0oo0 : C7875oO0OOo0o.OooO00o(OooO00o2, OooO00o);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}
