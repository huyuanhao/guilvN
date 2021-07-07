package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.ii丨I1丨I1  reason: invalid class name and case insensitive filesystem */
public class C6283iiI1I1 extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17961OooO00o;

    public C6283iiI1I1(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = iIilII1.OooO00o(i11li1.OooO00o(0));
            this.f17961OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C6283iiI1I1(iIilII1 iiilii1, C6513lIiI r2) {
        if (iiilii1 == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        } else if (r2 != null) {
            this.OooO00o = iiilii1;
            this.f17961OooO00o = r2;
        } else {
            throw new IllegalArgumentException("'pgenCounter' cannot be null");
        }
    }

    public C6283iiI1I1(byte[] bArr, int i) {
        if (bArr != null) {
            this.OooO00o = new iIilII1(bArr);
            this.f17961OooO00o = new C6513lIiI((long) i);
            return;
        }
        throw new IllegalArgumentException("'seed' cannot be null");
    }

    public static C6283iiI1I1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6283iiI1I1 OooO00o(Object obj) {
        if (obj instanceof C6283iiI1I1) {
            return (C6283iiI1I1) obj;
        }
        if (obj != null) {
            return new C6283iiI1I1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.f17961OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17307OooO00o() {
        return this.OooO00o.m15475OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f17961OooO00o);
        return new C5707LiL1(r0);
    }
}
