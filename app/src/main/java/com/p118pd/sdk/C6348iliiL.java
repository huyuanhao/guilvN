package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.il丨iiL丨  reason: invalid class name and case insensitive filesystem */
public class C6348iliiL extends I11li1 {
    public byte[] OooO00o;

    public C6348iliiL(byte[] bArr) throws IOException {
        this.OooO00o = bArr;
    }

    @Override // com.p118pd.sdk.I11li1, com.p118pd.sdk.I11li1, com.p118pd.sdk.I11li1, com.p118pd.sdk.I11li1, com.p118pd.sdk.AbstractC6122iIlLiL
    private void OooO00o() {
        Li1IL1 r0 = new Li1IL1(this.OooO00o);
        while (r0.hasMoreElements()) {
            super.OooO00o.addElement(r0.nextElement());
        }
        this.OooO00o = null;
    }

    @Override // com.p118pd.sdk.I11li1
    public synchronized AbstractC6854lLi1LL OooO00o(int i) {
        if (this.OooO00o != null) {
            OooO00o();
        }
        return super.OooO00o(i);
    }

    @Override // com.p118pd.sdk.I11li1, com.p118pd.sdk.I11li1, com.p118pd.sdk.I11li1, com.p118pd.sdk.I11li1, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized Enumeration m17411OooO00o() {
        if (this.OooO00o == null) {
            return super.m15236OooO00o();
        }
        return new Li1IL1(this.OooO00o);
    }

    @Override // com.p118pd.sdk.I11li1, com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        byte[] bArr = this.OooO00o;
        if (bArr != null) {
            iii1.OooO00o(48, bArr);
        } else {
            super.OooO0o0().OooO00o(iii1);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        byte[] bArr = this.OooO00o;
        return bArr != null ? L1li1.OooO00o(bArr.length) + 1 + this.OooO00o.length : super.OooO0o0().OooO0O0();
    }

    @Override // com.p118pd.sdk.I11li1, com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0Oo() {
        if (this.OooO00o != null) {
            OooO00o();
        }
        return super.OooO0Oo();
    }

    @Override // com.p118pd.sdk.I11li1, com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0o0() {
        if (this.OooO00o != null) {
            OooO00o();
        }
        return super.OooO0o0();
    }

    @Override // com.p118pd.sdk.I11li1
    public synchronized int size() {
        if (this.OooO00o != null) {
            OooO00o();
        }
        return super.size();
    }
}
