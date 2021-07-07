package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.l11  reason: case insensitive filesystem */
public class C6434l11 extends AbstractC5738Lil {
    public final ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f18244OooO00o;

    public C6434l11(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = ILI.OooO00o(i11li1.OooO00o(0));
            this.f18244OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1)).m17647OooO0O0();
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C6434l11(ILI ili, BigInteger bigInteger) {
        this.OooO00o = ili;
        this.f18244OooO00o = bigInteger;
    }

    public static C6434l11 OooO00o(Object obj) {
        if (obj instanceof C6434l11) {
            return (C6434l11) obj;
        }
        if (obj != null) {
            return new C6434l11(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17547OooO00o() {
        return this.f18244OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C6513lIiI(this.f18244OooO00o));
        return new C5707LiL1(r0);
    }
}
