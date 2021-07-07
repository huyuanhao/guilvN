package com.p118pd.sdk;

import com.p118pd.sdk.C6108iIiL1;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.Lil1II丨l  reason: invalid class name */
public class Lil1IIl implements AbstractC5599L1Ii {
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16640OooO00o;

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public i1LLl1L OooO00o() {
        C6108iIiL1.OooO00o oooO00o = new C6108iIiL1.OooO00o();
        byte[] bArr = new byte[1088];
        this.f16640OooO00o.nextBytes(bArr);
        byte[] bArr2 = new byte[iLIIlIl.OooO];
        System.arraycopy(bArr, 32, bArr2, 0, 1024);
        oooO00o.OooO00o = 11;
        oooO00o.f17568OooO00o = 0;
        oooO00o.OooO0O0 = 0;
        C6108iIiL1.OooO00o(new II1i111L(this.OooO00o), bArr2, 1024, 5, bArr, oooO00o, bArr2, 0);
        return new i1LLl1L((C6213iL11I) new iII111(bArr2), (C6213iL11I) new IilIilI(bArr));
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r2) {
        this.f16640OooO00o = r2.m17607OooO00o();
        this.OooO00o = ((III1) r2).OooO00o();
    }
}
