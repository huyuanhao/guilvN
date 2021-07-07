package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.Lllii */
public class Lllii extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f16743OooO00o;

    public Lllii(I11li1 i11li1) {
        this.f16743OooO00o = (AbstractC6804llL1ii) i11li1.OooO00o(0);
        this.OooO00o = (C6513lIiI) i11li1.OooO00o(1);
    }

    public Lllii(byte[] bArr, int i) {
        if (bArr.length == 8) {
            this.f16743OooO00o = new C6487lIIiIlL(bArr);
            this.OooO00o = new C6513lIiI((long) i);
            return;
        }
        throw new IllegalArgumentException("salt length must be 8");
    }

    public static Lllii OooO00o(Object obj) {
        if (obj instanceof Lllii) {
            return (Lllii) obj;
        }
        if (obj != null) {
            return new Lllii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.OooO00o.m17647OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16403OooO00o() {
        return this.f16743OooO00o.m17938OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16743OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
