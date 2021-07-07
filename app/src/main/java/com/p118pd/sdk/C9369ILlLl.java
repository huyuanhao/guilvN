package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨IL丨lLl  reason: invalid class name and case insensitive filesystem */
public class C9369ILlLl extends AbstractC5738Lil {
    public C6513lIiI OooO00o;
    public C6513lIiI OooO0O0;
    public C6513lIiI OooO0OO;
    public C6513lIiI OooO0Oo;
    public C6513lIiI OooO0o;
    public C6513lIiI OooO0o0;

    public C9369ILlLl(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO0OO = (C6513lIiI) OooO00o2.nextElement();
        this.OooO0Oo = (C6513lIiI) OooO00o2.nextElement();
        this.OooO00o = (C6513lIiI) OooO00o2.nextElement();
        this.OooO0O0 = (C6513lIiI) OooO00o2.nextElement();
        this.OooO0o0 = (C6513lIiI) OooO00o2.nextElement();
        this.OooO0o = (C6513lIiI) OooO00o2.nextElement();
    }

    public C9369ILlLl(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.OooO0OO = new C6513lIiI(bigInteger);
        this.OooO0Oo = new C6513lIiI(bigInteger2);
        this.OooO00o = new C6513lIiI(bigInteger3);
        this.OooO0O0 = new C6513lIiI(bigInteger4);
        this.OooO0o0 = new C6513lIiI((long) i);
        this.OooO0o = new C6513lIiI(bigInteger5);
    }

    public static C9369ILlLl OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9369ILlLl OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9369ILlLl)) {
            return (C9369ILlLl) obj;
        }
        if (obj instanceof I11li1) {
            return new C9369ILlLl((I11li1) obj);
        }
        throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
    }

    public BigInteger OooO00o() {
        return this.OooO0OO.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO0OO);
        r0.OooO00o(this.OooO0Oo);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.OooO0o0);
        r0.OooO00o(this.OooO0o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m21436OooO0O0() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public BigInteger OooO0OO() {
        return this.OooO0O0.OooO00o();
    }
}
