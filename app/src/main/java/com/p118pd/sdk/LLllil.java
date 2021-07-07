package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.LLl丨lil  reason: invalid class name */
public class LLllil extends AbstractC5738Lil {
    public LL1IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f16518OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16519OooO00o;

    public LLllil(I11li1 i11li1) {
        if (i11li1.size() < 2 || i11li1.size() > 3) {
            throw new IllegalArgumentException();
        }
        this.f16518OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = LL1IL.OooO00o(i11li1.OooO00o(1));
        if (i11li1.size() > 2) {
            this.f16519OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(2));
        }
    }

    public LLllil(l1LILI1 r2, LL1IL ll1il) {
        this(r2, ll1il, null);
    }

    public LLllil(l1LILI1 r1, LL1IL ll1il, BigInteger bigInteger) {
        this.f16518OooO00o = r1;
        this.OooO00o = ll1il;
        if (bigInteger != null) {
            this.f16519OooO00o = new C6513lIiI(bigInteger);
        }
    }

    public static LLllil OooO00o(Object obj) {
        if (obj instanceof LLllil) {
            return (LLllil) obj;
        }
        if (obj != null) {
            return new LLllil(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LL1IL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m16251OooO00o() {
        return this.f16518OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16252OooO00o() {
        C6513lIiI r0 = this.f16519OooO00o;
        if (r0 == null) {
            return null;
        }
        return r0.m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16518OooO00o.OooO0O0());
        r0.OooO00o(this.OooO00o);
        C6513lIiI r1 = this.f16519OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
