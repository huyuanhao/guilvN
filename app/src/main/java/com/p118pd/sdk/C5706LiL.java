package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.LiL  reason: case insensitive filesystem */
public class C5706LiL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16598OooO00o;

    public void OooO00o(C6470l1i r2) {
        this.f16598OooO00o = r2.m17607OooO00o();
        this.OooO00o = (r2.OooO00o() + 7) / 8;
    }

    public byte[] OooO00o() {
        byte[] bArr = new byte[this.OooO00o];
        this.f16598OooO00o.nextBytes(bArr);
        return bArr;
    }
}
