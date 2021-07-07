package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

/* renamed from: com.pd.sdk.oOOoOoOO  reason: case insensitive filesystem */
public class C8230oOOoOoOO implements AbstractC7803oO00Oo0O<Bitmap, byte[]> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Bitmap.CompressFormat f21346OooO00o;

    public C8230oOOoOoOO() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.p118pd.sdk.AbstractC7803oO00Oo0O
    @Nullable
    public AbstractC7700o0oo0oo0<byte[]> OooO00o(@NonNull AbstractC7700o0oo0oo0<Bitmap> o0oo0oo0, @NonNull C7648o0oOoOo o0ooooo) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o0oo0oo0.get().compress(this.f21346OooO00o, this.OooO00o, byteArrayOutputStream);
        o0oo0oo0.recycle();
        return new C8995ooOOooOo(byteArrayOutputStream.toByteArray());
    }

    public C8230oOOoOoOO(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.f21346OooO00o = compressFormat;
        this.OooO00o = i;
    }
}
