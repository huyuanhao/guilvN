package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨IILl  reason: invalid class name and case insensitive filesystem */
public class C9351IILl extends AbstractC5738Lil implements AbstractC6406il1i1, AbstractC5339Ii1l {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public C9351IILl(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.o00OoOOo = LlLI1.OooO00o(OooO00o2.nextElement());
        if (OooO00o2.hasMoreElements()) {
            this.OooO00o = (AbstractC6854lLi1LL) OooO00o2.nextElement();
        }
    }

    public C9351IILl(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
        this.OooO00o = null;
    }

    public C9351IILl(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static C9351IILl OooO00o(Object obj) {
        if (obj instanceof C9351IILl) {
            return (C9351IILl) obj;
        }
        if (obj != null) {
            return new C9351IILl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        AbstractC6854lLi1LL r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21410OooO0O0() {
        return this.OooO00o;
    }
}
