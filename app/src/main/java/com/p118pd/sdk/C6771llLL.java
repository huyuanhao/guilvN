package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.llLL  reason: case insensitive filesystem */
public class C6771llLL extends AbstractC5738Lil {
    public C6176iLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18763OooO00o;
    public C6513lIiI OooO0O0;
    public C6513lIiI OooO0OO;
    public C6513lIiI OooO0Oo;

    public C6771llLL(I11li1 i11li1) {
        if (i11li1.size() < 3 || i11li1.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f18763OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.OooO0OO = C6513lIiI.OooO00o(OooO00o2.nextElement());
        AbstractC6854lLi1LL OooO00o3 = OooO00o(OooO00o2);
        if (OooO00o3 != null && (OooO00o3 instanceof C6513lIiI)) {
            this.OooO0Oo = C6513lIiI.OooO00o(OooO00o3);
            OooO00o3 = OooO00o(OooO00o2);
        }
        if (OooO00o3 != null) {
            this.OooO00o = C6176iLi.OooO00o(OooO00o3.OooO0O0());
        }
    }

    public C6771llLL(C6513lIiI r1, C6513lIiI r2, C6513lIiI r3, C6513lIiI r4, C6176iLi ili) {
        if (r1 == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        } else if (r2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        } else if (r3 != null) {
            this.f18763OooO00o = r1;
            this.OooO0O0 = r2;
            this.OooO0OO = r3;
            this.OooO0Oo = r4;
            this.OooO00o = ili;
        } else {
            throw new IllegalArgumentException("'q' cannot be null");
        }
    }

    public C6771llLL(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, C6176iLi ili) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        } else if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        } else if (bigInteger3 != null) {
            this.f18763OooO00o = new C6513lIiI(bigInteger);
            this.OooO0O0 = new C6513lIiI(bigInteger2);
            this.OooO0OO = new C6513lIiI(bigInteger3);
            this.OooO0Oo = new C6513lIiI(bigInteger4);
            this.OooO00o = ili;
        } else {
            throw new IllegalArgumentException("'q' cannot be null");
        }
    }

    public static C6771llLL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6771llLL OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6771llLL)) {
            return (C6771llLL) obj;
        }
        if (obj instanceof I11li1) {
            return new C6771llLL((I11li1) obj);
        }
        throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
    }

    public static AbstractC6854lLi1LL OooO00o(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (AbstractC6854lLi1LL) enumeration.nextElement();
        }
        return null;
    }

    public C6176iLi OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17877OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18763OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.OooO0OO);
        C6513lIiI r1 = this.OooO0Oo;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        C6176iLi ili = this.OooO00o;
        if (ili != null) {
            r0.OooO00o(ili);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6513lIiI m17878OooO0O0() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public C6513lIiI OooO0OO() {
        return this.f18763OooO00o;
    }

    public C6513lIiI OooO0Oo() {
        return this.OooO0OO;
    }
}
