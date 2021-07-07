package com.p118pd.sdk;

import java.io.OutputStream;

/* renamed from: com.pd.sdk.iLLl  reason: case insensitive filesystem */
public class C6171iLLl implements Lii1ii1 {
    public final Lii1ii1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OutputStream f17739OooO00o;

    public C6171iLLl(Lii1ii1 r2) {
        this.OooO00o = r2;
        this.f17739OooO00o = new IIiLIi(r2.m16310OooO00o());
    }

    public C6171iLLl(Lii1ii1 r2, int i) {
        this.OooO00o = r2;
        this.f17739OooO00o = new IIiLIi(r2.m16310OooO00o(), i);
    }

    @Override // com.p118pd.sdk.Lii1ii1, com.p118pd.sdk.Lii1ii1
    public C6456l1ilL OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.Lii1ii1, com.p118pd.sdk.Lii1ii1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OutputStream m17123OooO00o() {
        return this.f17739OooO00o;
    }

    @Override // com.p118pd.sdk.Lii1ii1
    public byte[] getSignature() {
        return this.OooO00o.getSignature();
    }
}
