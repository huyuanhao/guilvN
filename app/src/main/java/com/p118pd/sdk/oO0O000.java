package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.oO0O000 */
public class oO0O000 implements AbstractC7644o0oOoOO {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f20890OooO00o;
    @NonNull
    public final String OooO0O0;

    public oO0O000(@Nullable String str, long j, int i) {
        this.OooO0O0 = str == null ? "" : str;
        this.f20890OooO00o = j;
        this.OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f20890OooO00o).putInt(this.OooO00o).array());
        messageDigest.update(this.OooO0O0.getBytes(AbstractC7644o0oOoOO.f20533OooO00o));
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oO0O000.class != obj.getClass()) {
            return false;
        }
        oO0O000 oo0o000 = (oO0O000) obj;
        return this.f20890OooO00o == oo0o000.f20890OooO00o && this.OooO00o == oo0o000.OooO00o && this.OooO0O0.equals(oo0o000.OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        long j = this.f20890OooO00o;
        return (((this.OooO0O0.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.OooO00o;
    }
}
