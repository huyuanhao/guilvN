package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.ILil丨L1丨  reason: invalid class name */
public class ILilL1 extends AbstractC97421Il {
    public iL1liI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f15616OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6827lIIi1I1 f15617OooO00o;

    public ILilL1(iL1liI il1lii, C6827lIIi1I1 r3, C6213iL11I r4) {
        if (r3 == null) {
            throw new IllegalArgumentException("'certificate' cannot be null");
        } else if (r3.m17955OooO00o()) {
            throw new IllegalArgumentException("'certificate' cannot be empty");
        } else if (r4 == null) {
            throw new IllegalArgumentException("'privateKey' cannot be null");
        } else if (!r4.OooO00o()) {
            throw new IllegalArgumentException("'privateKey' must be private");
        } else if (r4 instanceof liLI1l1i) {
            this.OooO00o = il1lii;
            this.f15617OooO00o = r3;
            this.f15616OooO00o = r4;
        } else {
            throw new IllegalArgumentException("'privateKey' type not supported: " + r4.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.ll1iiLI
    public C6827lIIi1I1 OooO00o() {
        return this.f15617OooO00o;
    }

    @Override // com.p118pd.sdk.iLiLiIi1
    public byte[] OooO0O0(byte[] bArr) throws IOException {
        return C6063i1iIL.OooO00o(this.OooO00o, (liLI1l1i) this.f15616OooO00o, bArr);
    }
}
