package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.IiI  reason: case insensitive filesystem */
public class C5345IiI extends AbstractC5738Lil {
    public i1ILLl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15682OooO00o;
    public C6513lIiI OooO0O0;

    public C5345IiI(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = i1ILLl.OooO00o(OooO00o2.nextElement());
        this.f15682OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2.nextElement());
    }

    public C5345IiI(i1ILLl r3, int i, int i2) {
        this.OooO00o = r3;
        this.f15682OooO00o = new C6513lIiI((long) i);
        this.OooO0O0 = new C6513lIiI((long) i2);
    }

    public static C5345IiI OooO00o(Object obj) {
        if (obj instanceof C5345IiI) {
            return (C5345IiI) obj;
        }
        if (obj != null) {
            return new C5345IiI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public i1ILLl OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15561OooO00o() {
        return this.f15682OooO00o.m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15682OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m15562OooO0O0() {
        return this.OooO0O0.m17647OooO0O0();
    }
}
