package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.LLlIiil */
public class LLlIiil extends AbstractC5738Lil {
    public II1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16506OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f16507OooO00o;

    public LLlIiil(I11li1 i11li1) {
        this.f16507OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0));
        this.f16506OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1));
        if (i11li1.size() > 2) {
            this.OooO00o = II1LL.OooO00o(i11li1.OooO00o(2));
        }
    }

    public LLlIiil(byte[] bArr, BigInteger bigInteger) {
        this.f16507OooO00o = new C6487lIIiIlL(bArr);
        this.f16506OooO00o = new C6513lIiI(bigInteger);
    }

    public LLlIiil(byte[] bArr, BigInteger bigInteger, II1LL r4) {
        this.f16507OooO00o = new C6487lIIiIlL(bArr);
        this.f16506OooO00o = new C6513lIiI(bigInteger);
        this.OooO00o = r4;
    }

    public static LLlIiil OooO00o(Object obj) {
        if (obj instanceof LLlIiil) {
            return (LLlIiil) obj;
        }
        if (obj != null) {
            return new LLlIiil(I11li1.OooO00o(obj));
        }
        return null;
    }

    public II1LL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16241OooO00o() {
        return this.f16506OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m16242OooO00o() {
        return this.f16507OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16507OooO00o);
        r0.OooO00o(this.f16506OooO00o);
        II1LL r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
