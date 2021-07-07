package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.Ii1l丨l  reason: invalid class name and case insensitive filesystem */
public class C5343Ii1ll {
    public C5362Iii1Ii OooO00o;

    public int OooO00o() {
        return (this.OooO00o.OooO0O0().OooO00o().OooO0OO().bitLength() + 7) / 8;
    }

    public void OooO00o(AbstractC6370iIIIl r1) {
        this.OooO00o = (C5362Iii1Ii) r1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15560OooO00o(AbstractC6370iIIIl r4) {
        C6255iiL1 r42 = (C6255iiL1) r4;
        C5629LIiLlLil lIiLlLil = new C5629LIiLlLil();
        C5629LIiLlLil lIiLlLil2 = new C5629LIiLlLil();
        lIiLlLil.m16087OooO00o((AbstractC6370iIIIl) this.OooO00o.OooO0O0());
        BigInteger OooO00o2 = lIiLlLil.OooO00o((AbstractC6370iIIIl) r42.OooO0O0());
        lIiLlLil2.m16087OooO00o((AbstractC6370iIIIl) this.OooO00o.m15611OooO00o());
        return C9586iIILl.m21645OooO0O0(IIiL.OooO00o(OooO00o(), lIiLlLil2.OooO00o((AbstractC6370iIIIl) r42.OooO00o())), IIiL.OooO00o(OooO00o(), OooO00o2));
    }
}
