package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.l丨LI丨  reason: invalid class name and case insensitive filesystem */
public class C6847lLI extends AbstractC5738Lil {
    public C6513lIiI OooO00o;
    public C6513lIiI OooO0O0;
    public C6513lIiI OooO0OO;

    public C6847lLI(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            this.OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
            this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2.nextElement());
            this.OooO0OO = C6513lIiI.OooO00o(OooO00o2.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C6847lLI(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.OooO00o = new C6513lIiI(bigInteger);
        this.OooO0O0 = new C6513lIiI(bigInteger2);
        this.OooO0OO = new C6513lIiI(bigInteger3);
    }

    public static C6847lLI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6847lLI OooO00o(Object obj) {
        if (obj instanceof C6847lLI) {
            return (C6847lLI) obj;
        }
        if (obj != null) {
            return new C6847lLI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.OooO0OO.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.OooO0OO);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m17999OooO0O0() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public BigInteger OooO0OO() {
        return this.OooO0O0.OooO00o();
    }
}
