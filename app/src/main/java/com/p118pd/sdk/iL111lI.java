package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.iL111lI丨  reason: invalid class name */
public class iL111lI implements AbstractC5599L1Ii {
    public SecureRandom OooO00o;

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public i1LLl1L OooO00o() {
        byte[] bArr = new byte[C6450l1LLi.OooO0OO];
        short[] sArr = new short[1024];
        C6450l1LLi.OooO00o(this.OooO00o, bArr, sArr);
        return new i1LLl1L((C6213iL11I) new IL1IILIl(bArr), (C6213iL11I) new LiL1L(sArr));
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        this.OooO00o = r1.m17607OooO00o();
    }
}
