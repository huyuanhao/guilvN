package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.iLlLiLll */
public class iLlLiLll {
    public II1LLIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17782OooO00o;

    public iLlLiLll(II1LLIl iI1LLIl, byte[] bArr) {
        if (bArr != null) {
            this.OooO00o = iI1LLIl;
            this.f17782OooO00o = bArr;
            return;
        }
        throw new IllegalArgumentException("'signature' cannot be null");
    }

    public static iLlLiLll OooO00o(iL1liI il1lii, InputStream inputStream) throws IOException {
        return new iLlLiLll(L1LL1Ii.OooO0OO(il1lii) ? II1LLIl.OooO00o(inputStream) : null, L1LL1Ii.m15931OooO00o(inputStream));
    }

    public II1LLIl OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        II1LLIl iI1LLIl = this.OooO00o;
        if (iI1LLIl != null) {
            iI1LLIl.OooO00o(outputStream);
        }
        L1LL1Ii.OooO00o(this.f17782OooO00o, outputStream);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17161OooO00o() {
        return this.f17782OooO00o;
    }
}
