package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.Ii丨ii  reason: invalid class name and case insensitive filesystem */
public class C5408Iiii extends AbstractC5738Lil {
    public BigInteger OooO00o;
    public BigInteger OooO0O0;

    public C5408Iiii(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            this.OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement()).OooO00o();
            this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2.nextElement()).OooO00o();
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C5408Iiii(BigInteger bigInteger, BigInteger bigInteger2) {
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
    }

    public static C5408Iiii OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5408Iiii OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5408Iiii)) {
            return (C5408Iiii) obj;
        }
        if (obj instanceof I11li1) {
            return new C5408Iiii((I11li1) obj);
        }
        throw new IllegalArgumentException("Invalid RSAPublicKeyStructure: " + obj.getClass().getName());
    }

    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(OooO00o()));
        r0.OooO00o(new C6513lIiI(m15637OooO0O0()));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m15637OooO0O0() {
        return this.OooO0O0;
    }
}
