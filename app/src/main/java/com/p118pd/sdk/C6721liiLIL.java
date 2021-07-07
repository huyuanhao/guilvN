package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.li丨丨iLIL  reason: invalid class name and case insensitive filesystem */
public class C6721liiLIL extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f18676OooO00o;

    public C6721liiLIL(int i, byte[] bArr) {
        this.OooO00o = new C6513lIiI((long) i);
        this.f18676OooO00o = new C6487lIIiIlL(bArr);
    }

    public C6721liiLIL(I11li1 i11li1) {
        AbstractC6854lLi1LL r4;
        if (i11li1.size() == 1) {
            this.OooO00o = null;
            r4 = i11li1.OooO00o(0);
        } else {
            this.OooO00o = (C6513lIiI) i11li1.OooO00o(0);
            r4 = i11li1.OooO00o(1);
        }
        this.f18676OooO00o = (AbstractC6804llL1ii) r4;
    }

    public C6721liiLIL(byte[] bArr) {
        this.OooO00o = null;
        this.f18676OooO00o = new C6487lIIiIlL(bArr);
    }

    public static C6721liiLIL OooO00o(Object obj) {
        if (obj instanceof C6721liiLIL) {
            return (C6721liiLIL) obj;
        }
        if (obj != null) {
            return new C6721liiLIL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        C6513lIiI r0 = this.OooO00o;
        if (r0 == null) {
            return null;
        }
        return r0.m17647OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17818OooO00o() {
        return this.f18676OooO00o.m17938OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        C6513lIiI r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        r0.OooO00o(this.f18676OooO00o);
        return new C5707LiL1(r0);
    }
}
