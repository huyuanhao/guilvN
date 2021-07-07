package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨1iI1l  reason: invalid class name and case insensitive filesystem */
public class C93041iI1l extends AbstractC5738Lil {
    public C5845LIillll OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f22802OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f22803OooO00o;

    public C93041iI1l(I11li1 i11li1) {
        if (i11li1.size() == 2 || i11li1.size() == 3) {
            this.OooO00o = C5845LIillll.OooO00o(i11li1.OooO00o(0));
            this.f22803OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1));
            if (i11li1.size() == 3) {
                this.f22802OooO00o = iIilII1.OooO00o(i11li1.OooO00o(2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C93041iI1l(C5845LIillll r1, C6513lIiI r2) {
        this.OooO00o = r1;
        this.f22803OooO00o = r2;
    }

    public C93041iI1l(C5845LIillll r2, BigInteger bigInteger) {
        this(r2, new C6513lIiI(bigInteger));
    }

    public C93041iI1l(l1LILI1 r3, BigInteger bigInteger) {
        this(new C5845LIillll(new ILI(r3)), new C6513lIiI(bigInteger));
    }

    public static C93041iI1l OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C93041iI1l OooO00o(Object obj) {
        if (obj instanceof C93041iI1l) {
            return (C93041iI1l) obj;
        }
        if (obj != null) {
            return new C93041iI1l(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5845LIillll OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m21307OooO00o() {
        return this.f22802OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m21308OooO00o() {
        return this.f22803OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f22803OooO00o);
        iIilII1 iiilii1 = this.f22802OooO00o;
        if (iiilii1 != null) {
            r0.OooO00o(iiilii1);
        }
        return new C5707LiL1(r0);
    }
}
