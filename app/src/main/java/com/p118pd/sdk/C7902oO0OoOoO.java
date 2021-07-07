package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

@Deprecated
/* renamed from: com.pd.sdk.oO0OoOoO  reason: case insensitive filesystem */
public class C7902oO0OoOoO implements AbstractC7655o0oOoo0O<BitmapDrawable> {
    public final AbstractC7655o0oOoo0O<Drawable> OooO00o;

    public C7902oO0OoOoO(AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        this.OooO00o = (AbstractC7655o0oOoo0O) C7842oO0O0.OooO00o(new C8945ooOOOOOo(o0oooo0o, false));
    }

    public static AbstractC7700o0oo0oo0<Drawable> OooO0O0(AbstractC7700o0oo0oo0<BitmapDrawable> o0oo0oo0) {
        return o0oo0oo0;
    }

    @Override // com.p118pd.sdk.AbstractC7655o0oOoo0O
    @NonNull
    public AbstractC7700o0oo0oo0<BitmapDrawable> OooO00o(@NonNull Context context, @NonNull AbstractC7700o0oo0oo0<BitmapDrawable> o0oo0oo0, int i, int i2) {
        return OooO00o(this.OooO00o.OooO00o(context, OooO0O0(o0oo0oo0), i, i2));
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (obj instanceof C7902oO0OoOoO) {
            return this.OooO00o.equals(((C7902oO0OoOoO) obj).OooO00o);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.o0oo0oo0<android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC7700o0oo0oo0<BitmapDrawable> OooO00o(AbstractC7700o0oo0oo0<Drawable> o0oo0oo0) {
        if (o0oo0oo0.get() instanceof BitmapDrawable) {
            return o0oo0oo0;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + o0oo0oo0.get());
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        this.OooO00o.OooO00o(messageDigest);
    }
}
