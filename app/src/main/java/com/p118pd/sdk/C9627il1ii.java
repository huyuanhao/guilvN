package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨il1丨ii  reason: invalid class name and case insensitive filesystem */
public class C9627il1ii extends AbstractC5738Lil {
    public BigInteger OooO00o;
    public BigInteger OooO0O0;

    public C9627il1ii(I11li1 i11li1) {
        for (int i = 0; i != i11li1.size(); i++) {
            AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(i));
            if (OooO00o2.OooO00o() == 0) {
                this.OooO00o = C6513lIiI.OooO00o(OooO00o2, false).m17647OooO0O0();
            } else if (OooO00o2.OooO00o() == 1) {
                this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2, false).m17647OooO0O0();
            } else {
                throw new IllegalArgumentException("Unknown tag encountered.");
            }
        }
    }

    public C9627il1ii(BigInteger bigInteger, BigInteger bigInteger2) {
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
    }

    public static C9627il1ii OooO00o(iI11IL r1) {
        return OooO00o(r1.m17472OooO00o(C5237III.o00o00));
    }

    public static C9627il1ii OooO00o(Object obj) {
        if (obj instanceof C9627il1ii) {
            return (C9627il1ii) obj;
        }
        if (obj != null) {
            return new C9627il1ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, new C6513lIiI(this.OooO00o)));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, new C6513lIiI(this.OooO0O0)));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m21693OooO0O0() {
        return this.OooO00o;
    }
}
