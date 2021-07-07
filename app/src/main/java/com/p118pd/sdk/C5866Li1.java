package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.L丨i1  reason: invalid class name and case insensitive filesystem */
public class C5866Li1 extends AbstractC5738Lil {
    public C6513lIiI OooO00o;
    public C6513lIiI OooO0O0;
    public C6513lIiI OooO0OO;

    public C5866Li1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.OooO0OO = OooO00o2.hasMoreElements() ? (C6513lIiI) OooO00o2.nextElement() : null;
    }

    public C5866Li1(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.OooO00o = new C6513lIiI(bigInteger);
        this.OooO0O0 = new C6513lIiI(bigInteger2);
        this.OooO0OO = i != 0 ? new C6513lIiI((long) i) : null;
    }

    public static C5866Li1 OooO00o(Object obj) {
        if (obj instanceof C5866Li1) {
            return (C5866Li1) obj;
        }
        if (obj != null) {
            return new C5866Li1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.OooO0O0.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        if (m16445OooO0O0() != null) {
            r0.OooO00o(this.OooO0OO);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16445OooO0O0() {
        C6513lIiI r0 = this.OooO0OO;
        if (r0 == null) {
            return null;
        }
        return r0.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public BigInteger OooO0OO() {
        return this.OooO00o.OooO00o();
    }
}
