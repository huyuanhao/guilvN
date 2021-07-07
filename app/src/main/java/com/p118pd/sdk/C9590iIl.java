package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨iIl  reason: invalid class name and case insensitive filesystem */
public class C9590iIl extends AbstractC5738Lil {
    public II1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f23162OooO00o;

    public C9590iIl(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = II1LL.OooO00o(OooO00o2.nextElement());
        if (OooO00o2.hasMoreElements()) {
            this.f23162OooO00o = C5753LiI1.OooO00o(OooO00o2.nextElement());
        }
    }

    public C9590iIl(II1LL r1, C5753LiI1 r2) {
        this.OooO00o = r1;
        this.f23162OooO00o = r2;
    }

    public static C9590iIl OooO00o(Object obj) {
        if (obj instanceof C9590iIl) {
            return (C9590iIl) obj;
        }
        if (obj != null) {
            return new C9590iIl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public II1LL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5753LiI1 m21658OooO00o() {
        return this.f23162OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        C5753LiI1 r1 = this.f23162OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
