package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.IL丨丨1  reason: invalid class name and case insensitive filesystem */
public class C5334IL1 {
    public static final Set OooO00o = new HashSet();
    public static final Set OooO0O0 = new HashSet();
    public static final Set OooO0OO = new HashSet();

    static {
        OooO00o.add(AbstractC5420Il1iIL.o00Oo0O0);
        OooO00o.add(AbstractC6801ll1lLI.OoooO0);
        OooO00o.add(AbstractC6801ll1lLI.OoooO0O);
        OooO00o.add(AbstractC6801ll1lLI.OoooO);
        OooO00o.add(AbstractC6801ll1lLI.OoooOO0);
        OooO0O0.add(AbstractC5420Il1iIL.o00Oo00o);
        OooO0O0.add(AbstractC5420Il1iIL.o00Oo00);
        OooO0O0.add(AbstractC6801ll1lLI.Oooo0oO);
        OooO0O0.add(AbstractC6801ll1lLI.Oooo0O0);
        OooO0O0.add(AbstractC6801ll1lLI.Oooo0oo);
        OooO0O0.add(AbstractC6801ll1lLI.Oooo0OO);
        OooO0O0.add(AbstractC6801ll1lLI.Oooo);
        OooO0O0.add(AbstractC6801ll1lLI.Oooo0o0);
        OooO0O0.add(AbstractC6801ll1lLI.OoooO00);
        OooO0O0.add(AbstractC6801ll1lLI.Oooo0o);
        OooO0OO.add(AbstractC5331ILi.OooOooo);
        OooO0OO.add(AbstractC5331ILi.OooOOO0);
        OooO0OO.add(LLiII.OooOO0o);
        OooO0OO.add(LLiII.OooOOO0);
        OooO0OO.add(LLiII.OooO0oO);
        OooO0OO.add(LLiII.OooO0oo);
    }

    public static IIllLll1 OooO00o(X509Certificate x509Certificate) throws CertificateEncodingException {
        return new IIllLll1(LilIiIl.OooO00o(x509Certificate.getEncoded()).m16318OooO00o(), x509Certificate.getSerialNumber());
    }

    public static LIlL OooO00o(String str) {
        return str != null ? new LIlL(new C6224ii11l(str)) : new LIlL(new C6858liI());
    }

    public static LIlL OooO00o(Provider provider) {
        return provider != null ? new LIlL(new C9443ILiII(provider)) : new LIlL(new C6858liI());
    }

    public static AbstractC6854lLi1LL OooO00o(AlgorithmParameters algorithmParameters) throws CMSException {
        try {
            return C6037i1iLi.OooO00o(algorithmParameters);
        } catch (IOException e) {
            throw new CMSException("cannot extract parameters: " + e.getMessage(), e);
        }
    }

    public static void OooO00o(AlgorithmParameters algorithmParameters, AbstractC6854lLi1LL r2) throws CMSException {
        try {
            C6037i1iLi.OooO00o(algorithmParameters, r2);
        } catch (IOException e) {
            throw new CMSException("error encoding algorithm parameters.", e);
        }
    }

    public static boolean OooO00o(LlLI1 llLI1) {
        return OooO0O0.contains(llLI1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15542OooO00o(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(C5237III.o00OoOo.m16387OooO0O0());
        if (extensionValue != null) {
            return AbstractC6804llL1ii.OooO00o((Object) AbstractC6804llL1ii.OooO00o((Object) extensionValue).m17938OooO00o()).m17938OooO00o();
        }
        return null;
    }

    public static boolean OooO0O0(LlLI1 llLI1) {
        return OooO0OO.contains(llLI1);
    }

    public static boolean OooO0OO(LlLI1 llLI1) {
        return OooO00o.contains(llLI1);
    }

    public static boolean OooO0Oo(LlLI1 llLI1) {
        return llLI1.equals(AbstractC5711LiLli.o000oo0O) || llLI1.equals(AbstractC5711LiLli.o000oo0o);
    }
}
