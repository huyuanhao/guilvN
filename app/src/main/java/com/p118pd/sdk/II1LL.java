package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.II丨丨1LL  reason: invalid class name */
public class II1LL extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15524OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9752I11 f15525OooO00o;

    public II1LL(I11li1 i11li1) {
        AbstractC6854lLi1LL OooO00o2;
        this.f15524OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        this.f15525OooO00o = null;
        this.OooO00o = null;
        if (i11li1.size() > 2) {
            this.f15525OooO00o = C9752I11.OooO00o(i11li1.OooO00o(1));
            OooO00o2 = i11li1.OooO00o(2);
        } else if (i11li1.size() > 1) {
            OooO00o2 = i11li1.OooO00o(1);
            if (!(OooO00o2 instanceof iIilII1)) {
                this.f15525OooO00o = C9752I11.OooO00o(OooO00o2);
                return;
            }
        } else {
            return;
        }
        this.OooO00o = iIilII1.OooO00o(OooO00o2);
    }

    public II1LL(C6720lilI1 r1) {
        this.f15524OooO00o = C6513lIiI.OooO00o((Object) r1.OooO0O0());
    }

    public II1LL(C6720lilI1 r1, C9752I11 r2) {
        this.f15524OooO00o = C6513lIiI.OooO00o((Object) r1.OooO0O0());
        this.f15525OooO00o = r2;
    }

    public II1LL(C6720lilI1 r1, C9752I11 r2, C6218ii1 ii1) {
        this.f15524OooO00o = C6513lIiI.OooO00o((Object) r1.OooO0O0());
        this.f15525OooO00o = r2;
        this.OooO00o = ii1;
    }

    public static II1LL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static II1LL OooO00o(Object obj) {
        if (obj instanceof II1LL) {
            return (II1LL) obj;
        }
        if (obj != null) {
            return new II1LL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9752I11 m15460OooO00o() {
        return this.f15525OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15461OooO00o() {
        return this.f15524OooO00o.m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15524OooO00o);
        C9752I11 r1 = this.f15525OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        iIilII1 iiilii1 = this.OooO00o;
        if (iiilii1 != null) {
            r0.OooO00o(iiilii1);
        }
        return new C5707LiL1(r0);
    }
}
