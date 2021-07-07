package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨I丨I  reason: invalid class name and case insensitive filesystem */
public class C9437II extends AbstractC5738Lil {
    public AbstractC6804llL1ii OooO00o;
    public LlLI1 o00OoOOo;

    public C9437II(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = (AbstractC6804llL1ii) OooO00o2.nextElement();
        this.o00OoOOo = (LlLI1) OooO00o2.nextElement();
    }

    public C9437II(byte[] bArr, LlLI1 llLI1) {
        this.OooO00o = new C6487lIIiIlL(bArr);
        this.o00OoOOo = llLI1;
    }

    public static C9437II OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9437II OooO00o(Object obj) {
        if (obj instanceof C9437II) {
            return (C9437II) obj;
        }
        if (obj != null) {
            return new C9437II(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21474OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.o00OoOOo);
        return new C5707LiL1(r0);
    }
}
