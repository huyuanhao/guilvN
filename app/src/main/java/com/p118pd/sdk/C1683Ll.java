package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.Ll */
public class C1683Ll extends AbstractC5738Lil {
    public C6513lIiI OooO00o;
    public C6513lIiI OooO0O0;
    public C6513lIiI OooO0OO;
    public int o00oO0O;

    public C1683Ll(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.o00oO0O = i;
        this.OooO00o = new C6513lIiI(bigInteger);
        this.OooO0O0 = new C6513lIiI(bigInteger2);
        this.OooO0OO = new C6513lIiI(bigInteger3);
    }

    public C1683Ll(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.o00oO0O = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0().intValue();
        this.OooO00o = (C6513lIiI) OooO00o2.nextElement();
        this.OooO0O0 = (C6513lIiI) OooO00o2.nextElement();
        this.OooO0OO = (C6513lIiI) OooO00o2.nextElement();
    }

    public static C1683Ll OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C1683Ll OooO00o(Object obj) {
        if (obj == null || (obj instanceof C1683Ll)) {
            return (C1683Ll) obj;
        }
        if (obj instanceof I11li1) {
            return new C1683Ll((I11li1) obj);
        }
        throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
    }

    public BigInteger OooO00o() {
        return this.OooO0OO.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16351OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI((long) this.o00oO0O));
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.OooO0OO);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16352OooO0O0() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public BigInteger m16353OooO0OO() {
        return this.OooO0O0.OooO00o();
    }
}
