package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.IIL丨Ll  reason: invalid class name */
public class IILLl {
    public static Map OooO00o;

    /* renamed from: com.pd.sdk.IIL丨Ll$OooO */
    public static class OooO extends OooOO0O {
        public OooO() {
            super();
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r7, Object obj) {
            LlLI1 OooO00o = r7.m18041OooO00o().OooO00o();
            try {
                byte[] OooO00o2 = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(r7.OooO00o().m15475OooO00o())).m17938OooO00o();
                int i = 32;
                if (OooO00o.equals(LLiII.OooO0oo)) {
                    i = 64;
                }
                int i2 = i * 2;
                byte[] bArr = new byte[(i2 + 1)];
                bArr[0] = 4;
                for (int i3 = 1; i3 <= i; i3++) {
                    bArr[i3] = OooO00o2[i - i3];
                    bArr[i3 + i] = OooO00o2[i2 - i3];
                }
                C5600L1iLL OooO00o3 = C6723lilIL.OooO00o(C9574i1iIiI.OooO00o(r7.m18041OooO00o().m17587OooO0O0()).OooO0OO());
                return new LL1ii1l(OooO00o3.OooO00o().OooO00o(bArr), OooO00o3);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooO0O0 */
    public static class OooO0O0 extends OooOO0O {
        public OooO0O0() {
            super();
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r5, Object obj) throws IOException {
            C5866Li1 OooO00o = C5866Li1.OooO00o(r5.m18041OooO00o().m17587OooO0O0());
            C6513lIiI r52 = (C6513lIiI) r5.OooO0o0();
            BigInteger OooO0O0 = OooO00o.m16445OooO0O0();
            return new LiIiLii(r52.m17647OooO0O0(), new C6017i1Il(OooO00o.OooO0OO(), OooO00o.OooO00o(), null, OooO0O0 == null ? 0 : OooO0O0.intValue()));
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooO0OO */
    public static class OooO0OO extends OooOO0O {
        public OooO0OO() {
            super();
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r9, Object obj) throws IOException {
            BigInteger OooO00o = C6507lIiI.OooO00o(r9.OooO0o0()).OooO00o();
            C6022i1LLiI OooO00o2 = C6022i1LLiI.OooO00o(r9.m18041OooO00o().m17587OooO0O0());
            BigInteger OooO0OO = OooO00o2.OooO0OO();
            BigInteger OooO00o3 = OooO00o2.m16871OooO00o();
            BigInteger OooO0Oo = OooO00o2.OooO0Oo();
            C5388Ii1 r4 = null;
            BigInteger OooO0O0 = OooO00o2.m16872OooO0O0() != null ? OooO00o2.m16872OooO0O0() : null;
            C6283iiI1I1 OooO00o4 = OooO00o2.OooO00o();
            if (OooO00o4 != null) {
                r4 = new C5388Ii1(OooO00o4.m17307OooO00o(), OooO00o4.OooO00o().intValue());
            }
            return new LiIiLii(OooO00o, new C6017i1Il(OooO0OO, OooO00o3, OooO0Oo, OooO0O0, r4));
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooO0Oo  reason: case insensitive filesystem */
    public static class C5202OooO0Oo extends OooOO0O {
        public C5202OooO0Oo() {
            super();
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r4, Object obj) throws IOException {
            L1llLl1 l1llLl1;
            C6513lIiI r5 = (C6513lIiI) r4.OooO0o0();
            AbstractC6854lLi1LL OooO0O0 = r4.m18041OooO00o().m17587OooO0O0();
            if (OooO0O0 != null) {
                C6847lLI OooO00o = C6847lLI.OooO00o(OooO0O0.OooO0O0());
                l1llLl1 = new L1llLl1(OooO00o.m17999OooO0O0(), OooO00o.OooO0OO(), OooO00o.OooO00o());
            } else {
                l1llLl1 = null;
            }
            return new C5242IIl(r5.m17647OooO0O0(), l1llLl1);
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooO0o */
    public static class OooO0o extends OooOO0O {
        public OooO0o() {
            super();
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r9, Object obj) {
            C5600L1iLL r7;
            C6620lLlliL OooO00o = C6620lLlliL.OooO00o(r9.m18041OooO00o().m17587OooO0O0());
            if (OooO00o.m17705OooO0O0()) {
                LlLI1 llLI1 = (LlLI1) OooO00o.OooO0Oo();
                C9387Iill OooO00o2 = C6907lliLi.OooO00o(llLI1);
                if (OooO00o2 == null) {
                    OooO00o2 = C9857liL1l.OooO00o(llLI1);
                }
                r7 = new C9811LL(llLI1, OooO00o2.OooO00o(), OooO00o2.m21457OooO00o(), OooO00o2.m21460OooO0O0(), OooO00o2.m21458OooO00o(), OooO00o2.m21459OooO00o());
            } else if (OooO00o.OooO00o()) {
                r7 = (C5600L1iLL) obj;
            } else {
                C9387Iill OooO00o3 = C9387Iill.OooO00o(OooO00o.OooO0Oo());
                r7 = new C5600L1iLL(OooO00o3.OooO00o(), OooO00o3.m21457OooO00o(), OooO00o3.m21460OooO0O0(), OooO00o3.m21458OooO00o(), OooO00o3.m21459OooO00o());
            }
            byte[] OooO00o4 = r9.OooO00o().m15475OooO00o();
            AbstractC6804llL1ii r10 = new C6487lIIiIlL(OooO00o4);
            if (OooO00o4[0] == 4 && OooO00o4[1] == OooO00o4.length - 2 && ((OooO00o4[2] == 2 || OooO00o4[2] == 3) && new C6849lLLIllI().OooO00o(r7.OooO00o()) >= OooO00o4.length - 3)) {
                try {
                    r10 = (AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(OooO00o4);
                } catch (IOException unused) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
            return new LL1ii1l(new C6147iL1(r7.OooO00o(), r10).OooO00o(), r7);
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooO0o0  reason: case insensitive filesystem */
    public static class C5203OooO0o0 extends OooOO0O {
        public C5203OooO0o0() {
            super();
        }

        private void OooO00o(byte[] bArr) {
            for (int i = 0; i < bArr.length / 2; i++) {
                byte b = bArr[i];
                bArr[i] = bArr[(bArr.length - 1) - i];
                bArr[(bArr.length - 1) - i] = b;
            }
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r12, Object obj) throws IOException {
            C5600L1iLL r122;
            try {
                byte[] OooO00o = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(r12.OooO00o().m15475OooO00o())).m17938OooO00o();
                if (r12.m18041OooO00o().OooO00o().equals(AbstractC6781lli.OooO0O0)) {
                    OooO00o(OooO00o);
                }
                C5636LIl OooO00o2 = C5636LIl.OooO00o(r12.m18041OooO00o().m17587OooO0O0());
                if (OooO00o2.m16114OooO00o()) {
                    r122 = C6598lLili.OooO00o(OooO00o2.OooO00o());
                } else {
                    C6011i1I OooO00o3 = OooO00o2.m16113OooO00o();
                    byte[] OooO00o4 = OooO00o3.m16854OooO00o();
                    if (r12.m18041OooO00o().OooO00o().equals(AbstractC6781lli.OooO0O0)) {
                        OooO00o(OooO00o4);
                    }
                    C9543L1 OooO00o5 = OooO00o3.OooO00o();
                    IIiLIli.C5231OooO0o0 oooO0o0 = new IIiLIli.C5231OooO0o0(OooO00o5.OooO0o0(), OooO00o5.OooO0O0(), OooO00o5.OooO0OO(), OooO00o5.OooO0Oo(), OooO00o3.m16853OooO00o(), new BigInteger(1, OooO00o4));
                    byte[] OooO0O0 = OooO00o3.m16856OooO0O0();
                    if (r12.m18041OooO00o().OooO00o().equals(AbstractC6781lli.OooO0O0)) {
                        OooO00o(OooO0O0);
                    }
                    r122 = new C5600L1iLL(oooO0o0, AbstractC5755LiL.OooO00o(oooO0o0, OooO0O0), OooO00o3.m16855OooO0O0());
                }
                return new LL1ii1l(AbstractC5755LiL.OooO00o(r122.OooO00o(), OooO00o), r122);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooO0oO  reason: case insensitive filesystem */
    public static class C5204OooO0oO extends OooOO0O {
        public C5204OooO0oO() {
            super();
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r4, Object obj) throws IOException {
            C5838L1lI OooO00o = C5838L1lI.OooO00o(r4.m18041OooO00o().m17587OooO0O0());
            return new i1I1L(((C6513lIiI) r4.OooO0o0()).m17647OooO0O0(), new C5312ILl(OooO00o.m16425OooO0O0(), OooO00o.OooO00o()));
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooO0oo  reason: case insensitive filesystem */
    public static class C5205OooO0oo extends OooOO0O {
        public C5205OooO0oo() {
            super();
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r5, Object obj) {
            try {
                byte[] OooO00o = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(r5.OooO00o().m15475OooO00o())).m17938OooO00o();
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i = 1; i <= 32; i++) {
                    bArr[i] = OooO00o[32 - i];
                    bArr[i + 32] = OooO00o[64 - i];
                }
                boolean z = r5.m18041OooO00o().m17587OooO0O0() instanceof LlLI1;
                AbstractC6854lLi1LL OooO0O0 = r5.m18041OooO00o().m17587OooO0O0();
                C5600L1iLL OooO00o2 = C6723lilIL.OooO00o(z ? LlLI1.OooO00o(OooO0O0) : C9574i1iIiI.OooO00o(OooO0O0).OooO0OO());
                return new LL1ii1l(OooO00o2.OooO00o().OooO00o(bArr), OooO00o2);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooOO0 */
    public static class OooOO0 extends OooOO0O {
        public OooOO0() {
            super();
        }

        @Override // com.p118pd.sdk.IILLl.OooOO0O
        public C6213iL11I OooO00o(C6888ll r3, Object obj) throws IOException {
            C5724Liil OooO00o = C5724Liil.OooO00o(r3.OooO0o0());
            return new liLI1l1i(false, OooO00o.OooO00o(), OooO00o.m16313OooO0O0());
        }
    }

    /* renamed from: com.pd.sdk.IIL丨Ll$OooOO0O */
    public static abstract class OooOO0O {
        public OooOO0O() {
        }

        public abstract C6213iL11I OooO00o(C6888ll v, Object obj) throws IOException;
    }

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5711LiLli.OooOoO0, new OooOO0());
        OooO00o.put(AbstractC5855LLl.o00O000, new OooOO0());
        OooO00o.put(AbstractC5420Il1iIL.o00Oo0Oo, new OooO0OO());
        OooO00o.put(AbstractC5711LiLli.Oooo, new OooO0O0());
        OooO00o.put(AbstractC5420Il1iIL.o00OOooo, new C5202OooO0Oo());
        OooO00o.put(AbstractC9733l.OooOO0, new C5202OooO0Oo());
        OooO00o.put(AbstractC9733l.OooOO0o, new C5204OooO0oO());
        OooO00o.put(AbstractC5420Il1iIL.o00O0o0o, new OooO0o());
        OooO00o.put(AbstractC5331ILi.OooOOO0, new C5205OooO0oo());
        OooO00o.put(LLiII.OooO0oO, new OooO());
        OooO00o.put(LLiII.OooO0oo, new OooO());
        OooO00o.put(AbstractC6781lli.OooO0OO, new C5203OooO0o0());
        OooO00o.put(AbstractC6781lli.OooO0O0, new C5203OooO0o0());
    }

    public static C6213iL11I OooO00o(C6888ll r1) throws IOException {
        return OooO00o(r1, null);
    }

    public static C6213iL11I OooO00o(C6888ll r3, Object obj) throws IOException {
        C6456l1ilL OooO00o2 = r3.m18041OooO00o();
        OooOO0O oooOO0O = (OooOO0O) OooO00o.get(OooO00o2.OooO00o());
        if (oooOO0O != null) {
            return oooOO0O.OooO00o(r3, obj);
        }
        throw new IOException("algorithm identifier in key not recognised: " + OooO00o2.OooO00o());
    }

    public static C6213iL11I OooO00o(InputStream inputStream) throws IOException {
        return OooO00o(C6888ll.OooO00o(new C5805Ll1(inputStream).OooO00o()));
    }

    public static C6213iL11I OooO00o(byte[] bArr) throws IOException {
        return OooO00o(C6888ll.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr)));
    }
}
