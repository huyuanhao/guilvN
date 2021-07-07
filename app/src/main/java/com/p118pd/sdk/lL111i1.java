package com.p118pd.sdk;

import java.io.OutputStream;

/* renamed from: com.pd.sdk.lL111i1 */
public class lL111i1 implements I111LIL {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final I111LIL f18431OooO00o;

    public lL111i1(I111LIL r2) {
        this(r2, 28);
    }

    public lL111i1(I111LIL r1, int i) {
        this.f18431OooO00o = r1;
        this.OooO00o = i;
    }

    @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
    public C6456l1ilL OooO00o() {
        return this.f18431OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OutputStream m17657OooO00o() {
        return this.f18431OooO00o.m21370OooO00o();
    }

    @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17658OooO00o() {
        int i = this.OooO00o;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f18431OooO00o.m21371OooO00o(), 0, bArr, 0, i);
        return bArr;
    }
}
