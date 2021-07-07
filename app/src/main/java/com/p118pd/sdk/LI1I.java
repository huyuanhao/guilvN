package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.LI丨1I  reason: invalid class name */
public class LI1I extends AbstractC5738Lil {
    public AbstractC6804llL1ii OooO00o;
    public LlLI1 o00OoOOo;

    public LI1I(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.o00OoOOo = (LlLI1) OooO00o2.nextElement();
        this.OooO00o = (AbstractC6804llL1ii) OooO00o2.nextElement();
    }

    public LI1I(LlLI1 llLI1, AbstractC6804llL1ii r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static LI1I OooO00o(Object obj) {
        if (obj instanceof LI1I) {
            return (LI1I) obj;
        }
        if (obj != null) {
            return new LI1I(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m16142OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
