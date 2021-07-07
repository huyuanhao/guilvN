package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o0ooO0Oo  reason: case insensitive filesystem */
public class C7712o0ooO0Oo implements AbstractC7711o0ooO0OO {
    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO, com.p118pd.sdk.AbstractC7711o0ooO0OO
    public long OooO00o() {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO, com.p118pd.sdk.AbstractC7711o0ooO0OO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19353OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    public void OooO00o(float f) {
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    public void OooO00o(int i) {
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    public void OooO00o(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    @NonNull
    public Bitmap OooO0O0(int i, int i2, Bitmap.Config config) {
        return OooO00o(i, i2, config);
    }

    @Override // com.p118pd.sdk.AbstractC7711o0ooO0OO
    @NonNull
    public Bitmap OooO00o(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
