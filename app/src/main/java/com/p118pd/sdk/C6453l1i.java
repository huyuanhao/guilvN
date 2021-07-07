package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.l1i  reason: case insensitive filesystem */
public class C6453l1i extends AbstractC5738Lil {
    public L1Li OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIi1i1l1 f18281OooO00o;

    public C6453l1i(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6854lLi1LL r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
            if ((r0 instanceof LIi1i1l1) || (r0 instanceof AbstractC98681)) {
                this.f18281OooO00o = LIi1i1l1.OooO00o(r0);
            } else if ((r0 instanceof L1Li) || (r0 instanceof I11li1)) {
                this.OooO00o = L1Li.OooO00o(r0);
            } else {
                throw new IllegalArgumentException("Invalid element in 'SPUserNotice': " + r0.getClass().getName());
            }
        }
    }

    public C6453l1i(L1Li l1Li, LIi1i1l1 lIi1i1l1) {
        this.OooO00o = l1Li;
        this.f18281OooO00o = lIi1i1l1;
    }

    public static C6453l1i OooO00o(Object obj) {
        if (obj instanceof C6453l1i) {
            return (C6453l1i) obj;
        }
        if (obj != null) {
            return new C6453l1i(I11li1.OooO00o(obj));
        }
        return null;
    }

    public L1Li OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LIi1i1l1 m17574OooO00o() {
        return this.f18281OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        L1Li l1Li = this.OooO00o;
        if (l1Li != null) {
            r0.OooO00o(l1Li);
        }
        LIi1i1l1 lIi1i1l1 = this.f18281OooO00o;
        if (lIi1i1l1 != null) {
            r0.OooO00o(lIi1i1l1);
        }
        return new C5707LiL1(r0);
    }
}
