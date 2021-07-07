package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.pd.sdk.oO0OO0OO */
public class oO0OO0OO implements AbstractC7650o0oOoOoO<ByteBuffer, Bitmap> {
    public final C7785oO000o00 OooO00o;

    public oO0OO0OO(C7785oO000o00 oo000o00) {
        this.OooO00o = oo000o00;
    }

    public boolean OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull C7648o0oOoOo o0ooooo) {
        return this.OooO00o.OooO00o(byteBuffer);
    }

    public AbstractC7700o0oo0oo0<Bitmap> OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) throws IOException {
        return this.OooO00o.OooO00o(C8984ooOOoOo0.m20650OooO00o(byteBuffer), i, i2, o0ooooo);
    }
}
