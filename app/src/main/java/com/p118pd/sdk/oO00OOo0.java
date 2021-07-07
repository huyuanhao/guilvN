package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;

/* renamed from: com.pd.sdk.oO00OOo0 */
public final class oO00OOo0 implements AbstractC7650o0oOoOoO<GifDecoder, Bitmap> {
    public final AbstractC7711o0ooO0OO OooO00o;

    public oO00OOo0(AbstractC7711o0ooO0OO o0ooo0oo) {
        this.OooO00o = o0ooo0oo;
    }

    public boolean OooO00o(@NonNull GifDecoder gifDecoder, @NonNull C7648o0oOoOo o0ooooo) {
        return true;
    }

    public AbstractC7700o0oo0oo0<Bitmap> OooO00o(@NonNull GifDecoder gifDecoder, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return C7875oO0OOo0o.OooO00o(gifDecoder.m14986OooO00o(), this.OooO00o);
    }
}
