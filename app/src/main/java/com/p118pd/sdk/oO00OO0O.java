package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;

/* renamed from: com.pd.sdk.oO00OO0O */
public final class oO00OO0O implements GifDecoder.OooO00o {
    @Nullable
    public final AbstractC7707o0ooO00O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f20853OooO00o;

    public oO00OO0O(AbstractC7711o0ooO0OO o0ooo0oo) {
        this(o0ooo0oo, null);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.OooO00o
    @NonNull
    public Bitmap OooO00o(int i, int i2, @NonNull Bitmap.Config config) {
        return this.f20853OooO00o.OooO0O0(i, i2, config);
    }

    public oO00OO0O(AbstractC7711o0ooO0OO o0ooo0oo, @Nullable AbstractC7707o0ooO00O o0ooo00o) {
        this.f20853OooO00o = o0ooo0oo;
        this.OooO00o = o0ooo00o;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.OooO00o
    public void OooO00o(@NonNull Bitmap bitmap) {
        this.f20853OooO00o.OooO00o(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.OooO00o, com.bumptech.glide.gifdecoder.GifDecoder.OooO00o
    @NonNull
    public byte[] OooO00o(int i) {
        AbstractC7707o0ooO00O o0ooo00o = this.OooO00o;
        if (o0ooo00o == null) {
            return new byte[i];
        }
        return (byte[]) o0ooo00o.OooO0O0(i, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.OooO00o
    public void OooO00o(@NonNull byte[] bArr) {
        AbstractC7707o0ooO00O o0ooo00o = this.OooO00o;
        if (o0ooo00o != null) {
            o0ooo00o.OooO00o(bArr);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.OooO00o, com.bumptech.glide.gifdecoder.GifDecoder.OooO00o
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m19493OooO00o(int i) {
        AbstractC7707o0ooO00O o0ooo00o = this.OooO00o;
        if (o0ooo00o == null) {
            return new int[i];
        }
        return (int[]) o0ooo00o.OooO0O0(i, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.OooO00o
    public void OooO00o(@NonNull int[] iArr) {
        AbstractC7707o0ooO00O o0ooo00o = this.OooO00o;
        if (o0ooo00o != null) {
            o0ooo00o.OooO00o(iArr);
        }
    }
}
