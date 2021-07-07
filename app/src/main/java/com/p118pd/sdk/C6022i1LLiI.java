package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.i1LLiI  reason: case insensitive filesystem */
public class C6022i1LLiI extends AbstractC5738Lil {
    public final C6283iiI1I1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6513lIiI f17364OooO00o;
    public final C6513lIiI OooO0O0;
    public final C6513lIiI OooO0OO;
    public final C6513lIiI OooO0Oo;

    public C6022i1LLiI(I11li1 i11li1) {
        if (i11li1.size() < 3 || i11li1.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f17364OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.OooO0OO = C6513lIiI.OooO00o(OooO00o2.nextElement());
        AbstractC6854lLi1LL OooO00o3 = OooO00o(OooO00o2);
        if (OooO00o3 == null || !(OooO00o3 instanceof C6513lIiI)) {
            this.OooO0Oo = null;
        } else {
            this.OooO0Oo = C6513lIiI.OooO00o(OooO00o3);
            OooO00o3 = OooO00o(OooO00o2);
        }
        if (OooO00o3 != null) {
            this.OooO00o = C6283iiI1I1.OooO00o(OooO00o3.OooO0O0());
        } else {
            this.OooO00o = null;
        }
    }

    public C6022i1LLiI(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, C6283iiI1I1 r6) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        } else if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        } else if (bigInteger3 != null) {
            this.f17364OooO00o = new C6513lIiI(bigInteger);
            this.OooO0O0 = new C6513lIiI(bigInteger2);
            this.OooO0OO = new C6513lIiI(bigInteger3);
            this.OooO0Oo = bigInteger4 != null ? new C6513lIiI(bigInteger4) : null;
            this.OooO00o = r6;
        } else {
            throw new IllegalArgumentException("'q' cannot be null");
        }
    }

    public static C6022i1LLiI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6022i1LLiI OooO00o(Object obj) {
        if (obj instanceof C6022i1LLiI) {
            return (C6022i1LLiI) obj;
        }
        if (obj != null) {
            return new C6022i1LLiI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public static AbstractC6854lLi1LL OooO00o(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (AbstractC6854lLi1LL) enumeration.nextElement();
        }
        return null;
    }

    public C6283iiI1I1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16871OooO00o() {
        return this.OooO0O0.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17364OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.OooO0OO);
        C6513lIiI r1 = this.OooO0Oo;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        C6283iiI1I1 r12 = this.OooO00o;
        if (r12 != null) {
            r0.OooO00o(r12);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16872OooO0O0() {
        C6513lIiI r0 = this.OooO0Oo;
        if (r0 == null) {
            return null;
        }
        return r0.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public BigInteger OooO0OO() {
        return this.f17364OooO00o.OooO00o();
    }

    public BigInteger OooO0Oo() {
        return this.OooO0OO.OooO00o();
    }
}
