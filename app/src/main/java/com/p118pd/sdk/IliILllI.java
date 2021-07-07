package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.IliILllI */
public class IliILllI implements AbstractC9568i1L1lL {
    public final SecureRandom OooO00o;

    public IliILllI(SecureRandom secureRandom) {
        this.OooO00o = secureRandom;
    }

    @Override // com.p118pd.sdk.AbstractC9568i1L1lL
    public C6595lLiLl OooO00o(C6213iL11I r4) {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[2048];
        C6450l1LLi.OooO00o(this.OooO00o, bArr, bArr2, ((IL1IILIl) r4).OooO00o);
        return new C6595lLiLl(new IL1IILIl(bArr2), bArr);
    }

    @Override // com.p118pd.sdk.AbstractC9568i1L1lL
    public C6595lLiLl OooO0O0(C6213iL11I r1) {
        return OooO00o(r1);
    }
}
