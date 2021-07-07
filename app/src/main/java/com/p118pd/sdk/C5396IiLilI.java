package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.Ii丨LilI  reason: invalid class name and case insensitive filesystem */
public class C5396IiLilI {
    public static C5464IlilIi OooO00o(C6213iL11I r14) throws IOException {
        int i;
        C6620lLlliL llllil;
        if (r14 instanceof liLI1l1i) {
            C11lI r142 = (C11lI) r14;
            return new C5464IlilIi(new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o), new C6563lL1Ll(r142.OooO0O0(), r142.OooO0o(), r142.OooO00o(), r142.OooO0o0(), r142.OooO0oO(), r142.OooO0OO(), r142.OooO0Oo(), r142.OooO0oo()));
        } else if (r14 instanceof C5907Ll1LI) {
            C5907Ll1LI r143 = (C5907Ll1LI) r14;
            L1llLl1 OooO00o = r143.OooO00o();
            return new C5464IlilIi(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo, new C6847lLI(OooO00o.OooO0O0(), OooO00o.OooO0OO(), OooO00o.m15991OooO00o())), new C6513lIiI(r143.OooO00o()));
        } else if (r14 instanceof C6512lIilLl) {
            C6512lIilLl r144 = (C6512lIilLl) r14;
            C5600L1iLL OooO00o2 = r144.OooO00o();
            if (OooO00o2 == null) {
                llllil = new C6620lLlliL((AbstractC5335ILl) C6452l1Lll.OooO00o);
                i = r144.OooO00o().bitLength();
            } else if (OooO00o2 instanceof C9811LL) {
                C6620lLlliL llllil2 = new C6620lLlliL(((C9811LL) OooO00o2).OooO00o());
                i = OooO00o2.OooO0OO().bitLength();
                llllil = llllil2;
            } else {
                C6620lLlliL llllil3 = new C6620lLlliL(new C9387Iill(OooO00o2.OooO00o(), OooO00o2.m16003OooO00o(), OooO00o2.OooO0OO(), OooO00o2.m16004OooO00o(), OooO00o2.m16005OooO00o()));
                i = OooO00o2.OooO0OO().bitLength();
                llllil = llllil3;
            }
            return new C5464IlilIi(new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, llllil), new C6392ii1LI1(i, r144.OooO00o(), llllil));
        } else {
            throw new IOException("key parameters not recognised.");
        }
    }
}
