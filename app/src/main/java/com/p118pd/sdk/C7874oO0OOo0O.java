package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.oO0OOo0O  reason: case insensitive filesystem */
public class C7874oO0OOo0O extends AbstractC7779oO000Oo0 {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f20948OooO00o = OooO0O0.getBytes(AbstractC7644o0oOoOO.f20533OooO00o);
    public static final String OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    @Override // com.p118pd.sdk.AbstractC7779oO000Oo0
    public Bitmap OooO00o(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2) {
        return C7790oO000oOo.OooO0OO(o0ooo0oo, bitmap, i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        return obj instanceof C7874oO0OOo0O;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return 1101716364;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f20948OooO00o);
    }
}
