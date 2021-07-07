package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* renamed from: com.pd.sdk.oO0OOooO  reason: case insensitive filesystem */
public class C7881oO0OOooO implements AbstractC7653o0oOoo0<BitmapDrawable> {
    public final AbstractC7653o0oOoo0<Bitmap> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f20950OooO00o;

    public C7881oO0OOooO(AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7653o0oOoo0<Bitmap> o0oooo0) {
        this.f20950OooO00o = o0ooo0oo;
        this.OooO00o = o0oooo0;
    }

    public boolean OooO00o(@NonNull AbstractC7700o0oo0oo0<BitmapDrawable> o0oo0oo0, @NonNull File file, @NonNull C7648o0oOoOo o0ooooo) {
        return this.OooO00o.OooO00o(new C7875oO0OOo0o(o0oo0oo0.get().getBitmap(), this.f20950OooO00o), file, o0ooooo);
    }

    @Override // com.p118pd.sdk.AbstractC7653o0oOoo0
    @NonNull
    public EncodeStrategy OooO00o(@NonNull C7648o0oOoOo o0ooooo) {
        return this.OooO00o.OooO00o(o0ooooo);
    }
}
