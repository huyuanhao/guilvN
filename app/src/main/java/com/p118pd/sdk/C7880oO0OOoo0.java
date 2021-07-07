package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.oO0OOoo0  reason: case insensitive filesystem */
public class C7880oO0OOoo0 extends AbstractC7779oO000Oo0 {
    public static final byte[] OooO00o = OooO0O0.getBytes(AbstractC7644o0oOoOO.f20533OooO00o);
    public static final String OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterCrop";

    @Override // com.p118pd.sdk.AbstractC7779oO000Oo0
    public Bitmap OooO00o(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2) {
        return C7790oO000oOo.OooO00o(o0ooo0oo, bitmap, i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        return obj instanceof C7880oO0OOoo0;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return -599754482;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(OooO00o);
    }
}
