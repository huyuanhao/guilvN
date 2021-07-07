package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.LI1ll丨l  reason: invalid class name */
public class LI1lll {
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16267OooO00o;

    public LI1lll(long j, byte[] bArr) {
        this.OooO00o = j;
        this.f16267OooO00o = bArr;
    }

    public static LI1lll OooO00o(InputStream inputStream) throws IOException {
        return new LI1lll(L1LL1Ii.m15913OooO00o(inputStream), L1LL1Ii.m15931OooO00o(inputStream));
    }

    public long OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(this.OooO00o, outputStream);
        L1LL1Ii.OooO00o(this.f16267OooO00o, outputStream);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16019OooO00o() {
        return this.f16267OooO00o;
    }
}
