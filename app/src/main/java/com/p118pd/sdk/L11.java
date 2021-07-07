package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.L11 */
public class L11 {
    public static C6888ll OooO00o(C6213iL11I r8) throws IOException {
        if (r8 instanceof liLI1l1i) {
            liLI1l1i lili1l1i = (liLI1l1i) r8;
            return new C6888ll(new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o), new C5724Liil(lili1l1i.OooO0O0(), lili1l1i.OooO00o()));
        } else if (r8 instanceof C5242IIl) {
            C5242IIl r82 = (C5242IIl) r8;
            C6847lLI r0 = null;
            L1llLl1 OooO00o = r82.OooO00o();
            if (OooO00o != null) {
                r0 = new C6847lLI(OooO00o.OooO0O0(), OooO00o.OooO0OO(), OooO00o.m15991OooO00o());
            }
            return new C6888ll(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo, r0), new C6513lIiI(r82.OooO00o()));
        } else if (r8 instanceof LL1ii1l) {
            LL1ii1l r83 = (LL1ii1l) r8;
            C5600L1iLL OooO00o2 = r83.OooO00o();
            return new C6888ll(new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, OooO00o2 == null ? new C6620lLlliL((AbstractC5335ILl) C6452l1Lll.OooO00o) : OooO00o2 instanceof C9811LL ? new C6620lLlliL(((C9811LL) OooO00o2).OooO00o()) : new C6620lLlliL(new C9387Iill(OooO00o2.OooO00o(), OooO00o2.m16003OooO00o(), OooO00o2.OooO0OO(), OooO00o2.m16004OooO00o(), OooO00o2.m16005OooO00o()))), ((AbstractC6804llL1ii) new C6147iL1(r83.OooO00o()).OooO0O0()).m17938OooO00o());
        } else {
            throw new IOException("key parameters not recognised.");
        }
    }
}
