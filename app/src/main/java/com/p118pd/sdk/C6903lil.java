package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.l丨丨il  reason: invalid class name and case insensitive filesystem */
public class C6903lil extends AbstractC5738Lil implements AbstractC5711LiLli {
    public AbstractC6854lLi1LL OooO00o;
    public boolean OooO0O0 = true;
    public LlLI1 o00OoOOo;

    public C6903lil(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.o00OoOOo = (LlLI1) OooO00o2.nextElement();
        if (OooO00o2.hasMoreElements()) {
            this.OooO00o = ((AbstractC5903LlLLL) OooO00o2.nextElement()).OooO0o();
        }
        this.OooO0O0 = i11li1 instanceof C6351ill;
    }

    public C6903lil(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r3;
    }

    public static C6903lil OooO00o(Object obj) {
        if (obj instanceof C6903lil) {
            return (C6903lil) obj;
        }
        if (obj != null) {
            return new C6903lil(I11li1.OooO00o(obj));
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
            r0.OooO00o(new C6881lliiI1(true, 0, r1));
        }
        return this.OooO0O0 ? new C6351ill(r0) : new C6120iIlL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m18069OooO0O0() {
        return this.OooO00o;
    }
}
