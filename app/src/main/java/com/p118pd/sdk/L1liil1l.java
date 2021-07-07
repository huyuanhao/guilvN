package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.L1liil1l */
public class L1liil1l implements IL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16221OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lIL1i11 f16222OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16223OooO00o;
    public int OooO0O0;

    public L1liil1l() {
        this(new C6461l1liI(), new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o));
    }

    public L1liil1l(lIL1i11 r2, C6456l1ilL r3) {
        this.OooO0O0 = 1024;
        this.f16222OooO00o = r2;
        this.f16221OooO00o = r3;
        this.OooO00o = r2.OooO0O0();
    }

    public L1liil1l OooO00o(int i) {
        this.OooO0O0 = i;
        return this;
    }

    @Override // com.p118pd.sdk.IL
    public AbstractC6296il1il1 OooO00o(char[] cArr) {
        if (this.f16223OooO00o == null) {
            this.f16223OooO00o = new SecureRandom();
        }
        byte[] bArr = new byte[this.OooO00o];
        this.f16223OooO00o.nextBytes(bArr);
        return C6800ll1lLi.OooO00o(this.f16221OooO00o.OooO00o(), this.f16222OooO00o, new C6263iiiL(bArr, this.OooO0O0), cArr);
    }

    @Override // com.p118pd.sdk.IL
    public C6456l1ilL OooO00o() {
        return this.f16221OooO00o;
    }
}
