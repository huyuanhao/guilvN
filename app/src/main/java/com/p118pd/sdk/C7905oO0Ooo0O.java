package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO0Ooo0O  reason: case insensitive filesystem */
public class C7905oO0Ooo0O implements AbstractC7650o0oOoOoO<Uri, Bitmap> {
    public final AbstractC7711o0ooO0OO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7845oO0O0OOo f20974OooO00o;

    public C7905oO0Ooo0O(C7845oO0O0OOo oo0o0ooo, AbstractC7711o0ooO0OO o0ooo0oo) {
        this.f20974OooO00o = oo0o0ooo;
        this.OooO00o = o0ooo0oo;
    }

    public boolean OooO00o(@NonNull Uri uri, @NonNull C7648o0oOoOo o0ooooo) {
        return "android.resource".equals(uri.getScheme());
    }

    @Nullable
    public AbstractC7700o0oo0oo0<Bitmap> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        AbstractC7700o0oo0oo0<Drawable> OooO00o2 = this.f20974OooO00o.OooO00o(uri, i, i2, o0ooooo);
        if (OooO00o2 == null) {
            return null;
        }
        return C7784oO000o0.m19440OooO00o(this.OooO00o, OooO00o2.get(), i, i2);
    }
}
