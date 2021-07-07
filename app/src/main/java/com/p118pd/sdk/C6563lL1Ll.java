package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.lL1丨Ll  reason: invalid class name and case insensitive filesystem */
public class C6563lL1Ll extends AbstractC5738Lil {
    public BigInteger OooO;
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f18461OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;
    public BigInteger OooO0Oo;
    public BigInteger OooO0o;
    public BigInteger OooO0o0;
    public BigInteger OooO0oO;
    public BigInteger OooO0oo;

    public C6563lL1Ll(I11li1 i11li1) {
        this.OooO00o = null;
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        BigInteger OooO0O02 = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
        if (OooO0O02.intValue() == 0 || OooO0O02.intValue() == 1) {
            this.f18461OooO00o = OooO0O02;
            this.OooO0O0 = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
            this.OooO0OO = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
            this.OooO0Oo = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
            this.OooO0o0 = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
            this.OooO0o = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
            this.OooO0oO = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
            this.OooO0oo = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
            this.OooO = ((C6513lIiI) OooO00o2.nextElement()).m17647OooO0O0();
            if (OooO00o2.hasMoreElements()) {
                this.OooO00o = (I11li1) OooO00o2.nextElement();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for RSA private key");
    }

    public C6563lL1Ll(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.OooO00o = null;
        this.f18461OooO00o = BigInteger.valueOf(0);
        this.OooO0O0 = bigInteger;
        this.OooO0OO = bigInteger2;
        this.OooO0Oo = bigInteger3;
        this.OooO0o0 = bigInteger4;
        this.OooO0o = bigInteger5;
        this.OooO0oO = bigInteger6;
        this.OooO0oo = bigInteger7;
        this.OooO = bigInteger8;
    }

    public static C6563lL1Ll OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6563lL1Ll OooO00o(Object obj) {
        if (obj instanceof C6563lL1Ll) {
            return (C6563lL1Ll) obj;
        }
        if (obj != null) {
            return new C6563lL1Ll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO() {
        return this.f18461OooO00o;
    }

    public BigInteger OooO00o() {
        return this.OooO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(this.f18461OooO00o));
        r0.OooO00o(new C6513lIiI(OooO0Oo()));
        r0.OooO00o(new C6513lIiI(OooO0oo()));
        r0.OooO00o(new C6513lIiI(OooO0oO()));
        r0.OooO00o(new C6513lIiI(OooO0o0()));
        r0.OooO00o(new C6513lIiI(OooO0o()));
        r0.OooO00o(new C6513lIiI(m17663OooO0O0()));
        r0.OooO00o(new C6513lIiI(OooO0OO()));
        r0.OooO00o(new C6513lIiI(OooO00o()));
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m17663OooO0O0() {
        return this.OooO0oO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public BigInteger OooO0OO() {
        return this.OooO0oo;
    }

    public BigInteger OooO0Oo() {
        return this.OooO0O0;
    }

    public BigInteger OooO0o() {
        return this.OooO0o;
    }

    public BigInteger OooO0o0() {
        return this.OooO0o0;
    }

    public BigInteger OooO0oO() {
        return this.OooO0Oo;
    }

    public BigInteger OooO0oo() {
        return this.OooO0OO;
    }
}
