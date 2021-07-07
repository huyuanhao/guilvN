package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.i丨I1丨II  reason: invalid class name and case insensitive filesystem */
public class C6368iI1II extends AbstractC5738Lil {
    public C5432IlIlIlL OooO00o;
    public C5432IlIlIlL OooO0O0;

    public C6368iI1II(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            int OooO00o3 = r0.OooO00o();
            C5432IlIlIlL OooO00o4 = C5432IlIlIlL.OooO00o(r0, true);
            if (OooO00o3 == 0) {
                this.OooO00o = OooO00o4;
            } else {
                this.OooO0O0 = OooO00o4;
            }
        }
    }

    public C6368iI1II(C5432IlIlIlL r1, C5432IlIlIlL r2) {
        if (r1 == null && r2 == null) {
            throw new IllegalArgumentException("at least one of notBefore/notAfter must not be null.");
        }
        this.OooO00o = r1;
        this.OooO0O0 = r2;
    }

    public static C6368iI1II OooO00o(Object obj) {
        if (obj instanceof C6368iI1II) {
            return (C6368iI1II) obj;
        }
        if (obj != null) {
            return new C6368iI1II(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5432IlIlIlL OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public C5432IlIlIlL OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17483OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.OooO0O0));
        }
        return new C5707LiL1(r0);
    }
}
