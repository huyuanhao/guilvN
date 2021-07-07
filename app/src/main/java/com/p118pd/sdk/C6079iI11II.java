package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.iI1丨1II  reason: invalid class name and case insensitive filesystem */
public class C6079iI11II {
    public static final C6079iI11II OooO00o = new C6079iI11II();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map f17478OooO00o = new HashMap();

    static {
        OooO0O0(AbstractC5905LllI.OoooO, "DSA");
        OooO0O0(AbstractC5905LllI.OoooOO0, "DSA");
        OooO0O0(AbstractC5905LllI.o000oOoO, "DSA");
        OooO0O0(AbstractC5905LllI.OoooOOO, "DSA");
        OooO0O0(AbstractC5905LllI.OoooOOo, "DSA");
        OooO0O0(AbstractC5905LllI.OoooOo0, "DSA");
        OooO0O0(AbstractC5905LllI.OoooOoO, "DSA");
        OooO0O0(AbstractC5905LllI.OoooOoo, "DSA");
        OooO0O0(AbstractC9733l.OooOO0, "DSA");
        OooO0O0(AbstractC9733l.OooO00o, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC9733l.OooO0OO, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC9733l.OooO0O0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC9733l.OooOO0O, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.OooOoO, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.OooOoOO, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.OooOoo0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.OooOoo, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.Oooo0o0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.Oooo0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.Oooo0O0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.Oooo0OO, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5905LllI.OooooOo, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5905LllI.Oooooo0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5905LllI.Oooooo, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5905LllI.OoooooO, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5420Il1iIL.o00O0o0, "ECDSA");
        OooO0O0(AbstractC5420Il1iIL.o00O0oO, "ECDSA");
        OooO0O0(AbstractC5420Il1iIL.o00O0oOO, "ECDSA");
        OooO0O0(AbstractC5420Il1iIL.o00O0oOo, "ECDSA");
        OooO0O0(AbstractC5420Il1iIL.o00O0oo0, "ECDSA");
        OooO0O0(AbstractC5905LllI.Ooooo00, "ECDSA");
        OooO0O0(AbstractC5905LllI.Ooooo0o, "ECDSA");
        OooO0O0(AbstractC5905LllI.OooooO0, "ECDSA");
        OooO0O0(AbstractC5905LllI.OooooOO, "ECDSA");
        OooO0O0(AbstractC5420Il1iIL.o00OoOoO, "DSA");
        OooO0O0(AbstractC9525LlI1.OooOOoo, "ECDSA");
        OooO0O0(AbstractC9525LlI1.OooOo00, "ECDSA");
        OooO0O0(AbstractC9525LlI1.OooOo0, "ECDSA");
        OooO0O0(AbstractC9525LlI1.OooOo0O, "ECDSA");
        OooO0O0(AbstractC9525LlI1.OooOo0o, "ECDSA");
        OooO0O0(AbstractC9525LlI1.OooOO0o, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC9525LlI1.OooOOO0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC9525LlI1.OooOOO, "RSAandMGF1");
        OooO0O0(AbstractC9525LlI1.OooOOOO, "RSAandMGF1");
        OooO0O0(AbstractC5420Il1iIL.o00OOooo, "DSA");
        OooO0O0(AbstractC5711LiLli.OooOoO0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC9468L1lL.OooO0o0, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5855LLl.o00O000, C7491o0OoOOO.OooO00o);
        OooO0O0(AbstractC5711LiLli.Oooo00o, "RSAandMGF1");
        OooO0O0(AbstractC5331ILi.OooOO0o, "GOST3410");
        OooO0O0(AbstractC5331ILi.OooOOO0, "ECGOST3410");
        OooO0O0(new LlLI1("1.3.6.1.4.1.5849.1.6.2"), "ECGOST3410");
        OooO0O0(new LlLI1("1.3.6.1.4.1.5849.1.1.5"), "GOST3410");
        OooO0O0(LLiII.OooO0oO, "ECGOST3410-2012-256");
        OooO0O0(LLiII.OooO0oo, "ECGOST3410-2012-512");
        OooO0O0(AbstractC5331ILi.OooOOOO, "ECGOST3410");
        OooO0O0(AbstractC5331ILi.OooOOO, "GOST3410");
        OooO0O0(LLiII.OooO, "ECGOST3410-2012-256");
        OooO0O0(LLiII.OooOO0, "ECGOST3410-2012-512");
    }

    public static void OooO0O0(LlLI1 llLI1, String str) {
        f17478OooO00o.put(llLI1.m16387OooO0O0(), str);
    }

    public AbstractC6271iilI OooO00o(I11L i11l) {
        if (i11l == null) {
            return new C5607LI1I1iI(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(i11l.size());
        Enumeration OooO00o2 = i11l.m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) OooO00o2.nextElement()).OooO0O0();
            if (OooO0O0 instanceof AbstractC5903LlLLL) {
                arrayList.add(new X509AttributeCertificateHolder(C9370Ii.OooO00o(((AbstractC5903LlLLL) OooO0O0).OooO0o())));
            }
        }
        return new C5607LI1I1iI(arrayList);
    }

    public AbstractC6271iilI OooO00o(LlLI1 llLI1, I11L i11l) {
        if (i11l == null) {
            return new C5607LI1I1iI(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(i11l.size());
        Enumeration OooO00o2 = i11l.m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) OooO00o2.nextElement()).OooO0O0();
            if (OooO0O0 instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o((Object) OooO0O0);
                if (OooO00o3.OooO00o() == 1) {
                    C9732ll OooO00o4 = C9732ll.OooO00o(OooO00o3, false);
                    if (llLI1.equals(OooO00o4.OooO00o())) {
                        arrayList.add(OooO00o4.m21790OooO0O0());
                    }
                }
            }
        }
        return new C5607LI1I1iI(arrayList);
    }

    public C6456l1ilL OooO00o(C6456l1ilL r3) {
        return r3.m17587OooO0O0() == null ? new C6456l1ilL(r3.OooO00o(), C6452l1Lll.OooO00o) : r3;
    }

    public String OooO00o(String str) {
        String str2 = (String) f17478OooO00o.get(str);
        return str2 != null ? str2 : str;
    }

    public void OooO00o(LlLI1 llLI1, String str) {
        OooO0O0(llLI1, str);
    }

    public AbstractC6271iilI OooO0O0(I11L i11l) {
        if (i11l == null) {
            return new C5607LI1I1iI(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(i11l.size());
        Enumeration OooO00o2 = i11l.m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) OooO00o2.nextElement()).OooO0O0();
            if (OooO0O0 instanceof I11li1) {
                arrayList.add(new X509CRLHolder(C5190I1lIiL.OooO00o(OooO0O0)));
            }
        }
        return new C5607LI1I1iI(arrayList);
    }

    public AbstractC6271iilI OooO0OO(I11L i11l) {
        if (i11l == null) {
            return new C5607LI1I1iI(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(i11l.size());
        Enumeration OooO00o2 = i11l.m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) OooO00o2.nextElement()).OooO0O0();
            if (OooO0O0 instanceof I11li1) {
                arrayList.add(new X509CertificateHolder(LilIiIl.OooO00o(OooO0O0)));
            }
        }
        return new C5607LI1I1iI(arrayList);
    }
}
