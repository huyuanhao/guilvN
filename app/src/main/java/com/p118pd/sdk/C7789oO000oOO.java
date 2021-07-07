package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.oO000oOO  reason: case insensitive filesystem */
public final class C7789oO000oOO extends AbstractC7779oO000Oo0 {
    public static final byte[] OooO00o = OooO0O0.getBytes(AbstractC7644o0oOoOO.f20533OooO00o);
    public static final String OooO0O0 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f20843OooO00o;

    public C7789oO000oOO(int i) {
        C7842oO0O0.OooO00o(i > 0, "roundingRadius must be greater than 0.");
        this.f20843OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC7779oO000Oo0
    public Bitmap OooO00o(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2) {
        return C7790oO000oOo.OooO0O0(o0ooo0oo, bitmap, this.f20843OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (!(obj instanceof C7789oO000oOO) || this.f20843OooO00o != ((C7789oO000oOO) obj).f20843OooO00o) {
            return false;
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return oO0O0O00.OooO00o(-569625254, oO0O0O00.OooO00o(this.f20843OooO00o));
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(OooO00o);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f20843OooO00o).array());
    }
}
