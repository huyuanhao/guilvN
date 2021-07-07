package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i1IlIiLI */
public class i1IlIiLI extends AbstractC5738Lil {
    public ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17361OooO00o;

    public i1IlIiLI(I11li1 i11li1) {
        this.OooO00o = ILI.OooO00o(i11li1.OooO00o(0));
        this.f17361OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1));
    }

    public i1IlIiLI(ILI ili, C6513lIiI r2) {
        this.OooO00o = ili;
        this.f17361OooO00o = r2;
    }

    public i1IlIiLI(ILI ili, BigInteger bigInteger) {
        this(ili, new C6513lIiI(bigInteger));
    }

    public static i1IlIiLI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static i1IlIiLI OooO00o(Object obj) {
        if (obj instanceof i1IlIiLI) {
            return (i1IlIiLI) obj;
        }
        if (obj != null) {
            return new i1IlIiLI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16866OooO00o() {
        return this.f17361OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f17361OooO00o);
        return new C5707LiL1(r0);
    }
}
