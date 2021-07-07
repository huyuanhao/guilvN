package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.L11Li丨1  reason: invalid class name */
public class L11Li1 {
    public static C6213iL11I OooO00o(C5464IlilIi r10) throws IOException {
        C5600L1iLL r8;
        C6456l1ilL OooO0O0 = r10.m15707OooO0O0();
        if (OooO0O0.OooO00o().equals(AbstractC5711LiLli.OooOoO0)) {
            C6563lL1Ll OooO00o = C6563lL1Ll.OooO00o(r10.m15708OooO0O0());
            return new C11lI(OooO00o.OooO0Oo(), OooO00o.OooO0oo(), OooO00o.OooO0oO(), OooO00o.OooO0o0(), OooO00o.OooO0o(), OooO00o.m17663OooO0O0(), OooO00o.OooO0OO(), OooO00o.OooO00o());
        }
        L1llLl1 l1llLl1 = null;
        if (OooO0O0.OooO00o().equals(AbstractC5711LiLli.Oooo)) {
            C5866Li1 OooO00o2 = C5866Li1.OooO00o(OooO0O0.m17587OooO0O0());
            C6513lIiI r102 = (C6513lIiI) r10.m15708OooO0O0();
            BigInteger OooO0O02 = OooO00o2.m16445OooO0O0();
            return new C6389ii(r102.m17647OooO0O0(), new C6017i1Il(OooO00o2.OooO0OO(), OooO00o2.OooO00o(), null, OooO0O02 == null ? 0 : OooO0O02.intValue()));
        } else if (OooO0O0.OooO00o().equals(AbstractC9733l.OooOO0o)) {
            C5838L1lI OooO00o3 = C5838L1lI.OooO00o(OooO0O0.m17587OooO0O0());
            return new C6336illiIil(((C6513lIiI) r10.m15708OooO0O0()).m17647OooO0O0(), new C5312ILl(OooO00o3.m16425OooO0O0(), OooO00o3.OooO00o()));
        } else if (OooO0O0.OooO00o().equals(AbstractC5420Il1iIL.o00OOooo)) {
            C6513lIiI r103 = (C6513lIiI) r10.m15708OooO0O0();
            AbstractC6854lLi1LL OooO0O03 = OooO0O0.m17587OooO0O0();
            if (OooO0O03 != null) {
                C6847lLI OooO00o4 = C6847lLI.OooO00o(OooO0O03.OooO0O0());
                l1llLl1 = new L1llLl1(OooO00o4.m17999OooO0O0(), OooO00o4.OooO0OO(), OooO00o4.OooO00o());
            }
            return new C5907Ll1LI(r103.m17647OooO0O0(), l1llLl1);
        } else if (OooO0O0.OooO00o().equals(AbstractC5420Il1iIL.o00O0o0o)) {
            C6620lLlliL llllil = new C6620lLlliL((AbstractC6122iIlLiL) OooO0O0.m17587OooO0O0());
            if (llllil.m17705OooO0O0()) {
                LlLI1 llLI1 = (LlLI1) llllil.OooO0Oo();
                C9387Iill OooO00o5 = C6907lliLi.OooO00o(llLI1);
                if (OooO00o5 == null) {
                    OooO00o5 = C9857liL1l.OooO00o(llLI1);
                }
                r8 = new C9811LL(llLI1, OooO00o5.OooO00o(), OooO00o5.m21457OooO00o(), OooO00o5.m21460OooO0O0(), OooO00o5.m21458OooO00o(), OooO00o5.m21459OooO00o());
            } else {
                C9387Iill OooO00o6 = C9387Iill.OooO00o(llllil.OooO0Oo());
                r8 = new C5600L1iLL(OooO00o6.OooO00o(), OooO00o6.m21457OooO00o(), OooO00o6.m21460OooO0O0(), OooO00o6.m21458OooO00o(), OooO00o6.m21459OooO00o());
            }
            return new C6512lIilLl(C6392ii1LI1.OooO00o(r10.m15708OooO0O0()).m17511OooO00o(), r8);
        } else {
            throw new RuntimeException("algorithm identifier in key not recognised");
        }
    }

    public static C6213iL11I OooO00o(InputStream inputStream) throws IOException {
        return OooO00o(C5464IlilIi.OooO00o(new C5805Ll1(inputStream).OooO00o()));
    }

    public static C6213iL11I OooO00o(byte[] bArr) throws IOException {
        return OooO00o(C5464IlilIi.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr)));
    }
}
