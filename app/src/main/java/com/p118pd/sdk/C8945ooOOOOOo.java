package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.ooOOOOOo  reason: case insensitive filesystem */
public class C8945ooOOOOOo implements AbstractC7655o0oOoo0O<Drawable> {
    public final AbstractC7655o0oOoo0O<Bitmap> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f22205OooO00o;

    public C8945ooOOOOOo(AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, boolean z) {
        this.OooO00o = o0oooo0o;
        this.f22205OooO00o = z;
    }

    public AbstractC7655o0oOoo0O<BitmapDrawable> OooO00o() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7655o0oOoo0O
    @NonNull
    public AbstractC7700o0oo0oo0<Drawable> OooO00o(@NonNull Context context, @NonNull AbstractC7700o0oo0oo0<Drawable> o0oo0oo0, int i, int i2) {
        AbstractC7711o0ooO0OO OooO00o2 = ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19238OooO00o();
        Drawable drawable = o0oo0oo0.get();
        AbstractC7700o0oo0oo0<Bitmap> OooO00o3 = C7784oO000o0.m19440OooO00o(OooO00o2, drawable, i, i2);
        if (OooO00o3 != null) {
            AbstractC7700o0oo0oo0<Bitmap> OooO00o4 = this.OooO00o.OooO00o(context, OooO00o3, i, i2);
            if (!OooO00o4.equals(OooO00o3)) {
                return OooO00o(context, OooO00o4);
            }
            OooO00o4.recycle();
            return o0oo0oo0;
        } else if (!this.f22205OooO00o) {
            return o0oo0oo0;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (obj instanceof C8945ooOOOOOo) {
            return this.OooO00o.equals(((C8945ooOOOOOo) obj).OooO00o);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    private AbstractC7700o0oo0oo0<Drawable> OooO00o(Context context, AbstractC7700o0oo0oo0<Bitmap> o0oo0oo0) {
        return C7787oO000oO.OooO00o(context.getResources(), o0oo0oo0);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        this.OooO00o.OooO00o(messageDigest);
    }
}
