package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.oO000oo0  reason: case insensitive filesystem */
public final class C7792oO000oo0 implements AbstractC7650o0oOoOoO<Bitmap, Bitmap> {

    /* renamed from: com.pd.sdk.oO000oo0$OooO00o */
    public static final class OooO00o implements AbstractC7700o0oo0oo0<Bitmap> {
        public final Bitmap OooO00o;

        public OooO00o(@NonNull Bitmap bitmap) {
            this.OooO00o = bitmap;
        }

        @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<Bitmap> m19449OooO00o() {
            return Bitmap.class;
        }

        @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
        public void recycle() {
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

    public boolean OooO00o(@NonNull Bitmap bitmap, @NonNull C7648o0oOoOo o0ooooo) {
        return true;
    }

    public AbstractC7700o0oo0oo0<Bitmap> OooO00o(@NonNull Bitmap bitmap, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new OooO00o(bitmap);
    }
}
