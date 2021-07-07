package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.LllI  reason: case insensitive filesystem */
public class C5799LllI {
    public static final Set<String> OooO00o = new HashSet();
    public static final Set OooO0O0 = new HashSet();
    public static final Set OooO0OO = new HashSet();
    public static final Set OooO0Oo = new HashSet();

    static {
        OooO00o.add("DES");
        OooO00o.add("DESEDE");
        OooO00o.add(AbstractC9733l.OooO0o0.m16387OooO0O0());
        OooO00o.add(AbstractC5711LiLli.OoooOoo.m16387OooO0O0());
        OooO00o.add(AbstractC5711LiLli.OoooOoo.m16387OooO0O0());
        OooO00o.add(AbstractC5711LiLli.o000oo00.m16387OooO0O0());
        OooO0O0.add(AbstractC5420Il1iIL.o00Oo0O0);
        OooO0O0.add(AbstractC6801ll1lLI.OoooO0);
        OooO0O0.add(AbstractC6801ll1lLI.OoooO0O);
        OooO0O0.add(AbstractC6801ll1lLI.OoooO);
        OooO0O0.add(AbstractC6801ll1lLI.OoooOO0);
        OooO0OO.add(AbstractC5420Il1iIL.o00Oo00o);
        OooO0OO.add(AbstractC5420Il1iIL.o00Oo00);
        OooO0OO.add(AbstractC6801ll1lLI.Oooo0oO);
        OooO0OO.add(AbstractC6801ll1lLI.Oooo0O0);
        OooO0OO.add(AbstractC6801ll1lLI.Oooo0oo);
        OooO0OO.add(AbstractC6801ll1lLI.Oooo0OO);
        OooO0OO.add(AbstractC6801ll1lLI.Oooo);
        OooO0OO.add(AbstractC6801ll1lLI.Oooo0o0);
        OooO0OO.add(AbstractC6801ll1lLI.OoooO00);
        OooO0OO.add(AbstractC6801ll1lLI.Oooo0o);
        OooO0Oo.add(AbstractC5331ILi.OooOooo);
        OooO0Oo.add(LLiII.OooOO0o);
        OooO0Oo.add(LLiII.OooOOO0);
    }

    public static I11L OooO00o(List list) {
        iILLL1 r0 = new iILLL1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0.OooO00o((AbstractC6854lLi1LL) it.next());
        }
        return new C5781LlIl(r0);
    }

    public static C5753LiI1 OooO00o(C5805Ll1 r2) throws CMSException {
        try {
            C5753LiI1 OooO00o2 = C5753LiI1.OooO00o(r2.OooO00o());
            if (OooO00o2 != null) {
                return OooO00o2;
            }
            throw new CMSException("No content found.");
        } catch (IOException e) {
            throw new CMSException("IOException reading content.", e);
        } catch (ClassCastException e2) {
            throw new CMSException("Malformed content.", e2);
        } catch (IllegalArgumentException e3) {
            throw new CMSException("Malformed content.", e3);
        }
    }

    public static C5753LiI1 OooO00o(InputStream inputStream) throws CMSException {
        return OooO00o(new C5805Ll1(inputStream));
    }

    public static C5753LiI1 OooO00o(byte[] bArr) throws CMSException {
        return OooO00o(new C5805Ll1(bArr));
    }

    public static InputStream OooO00o(Collection collection, InputStream inputStream) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            inputStream = new LllI11(inputStream, ((I111LIL) it.next()).m21370OooO00o());
        }
        return inputStream;
    }

    public static OutputStream OooO00o(OutputStream outputStream) {
        return outputStream == null ? new C9538Ll1() : outputStream;
    }

    public static OutputStream OooO00o(OutputStream outputStream, int i, boolean z, int i2) throws IOException {
        C9600iILLl r0 = new C9600iILLl(outputStream, i, z);
        return i2 != 0 ? r0.OooO00o(new byte[i2]) : r0.OooO0O0();
    }

    public static OutputStream OooO00o(OutputStream outputStream, OutputStream outputStream2) {
        return outputStream == null ? OooO00o(outputStream2) : outputStream2 == null ? OooO00o(outputStream) : new C5741LilILl(outputStream, outputStream2);
    }

    public static OutputStream OooO00o(Collection collection, OutputStream outputStream) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            outputStream = OooO00o(outputStream, ((C6248iiLLi) it.next()).m17261OooO00o());
        }
        return outputStream;
    }

    public static Collection OooO00o(LlLI1 llLI1, AbstractC6271iilI iili) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC6854lLi1LL r1 : iili.OooO00o(null)) {
            C9732ll r2 = new C9732ll(llLI1, r1);
            OooO00o(r2);
            arrayList.add(new ILI1Ll(false, 1, r2));
        }
        return arrayList;
    }

    public static List OooO00o(AbstractC6271iilI iili) throws CMSException {
        ArrayList arrayList = new ArrayList();
        try {
            for (X509AttributeCertificateHolder x509AttributeCertificateHolder : iili.OooO00o(null)) {
                arrayList.add(new ILI1Ll(false, 2, x509AttributeCertificateHolder.toASN1Structure()));
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw new CMSException("error processing certs", e);
        }
    }

    public static void OooO00o(C9732ll r2) {
        if (AbstractC6252iiLl.OooOO0o.equals(r2.OooO00o()) && C6682liLi.OooO00o(r2.m21790OooO0O0()).m17758OooO00o().OooO00o().intValue() != 0) {
            throw new IllegalArgumentException("cannot add unsuccessful OCSP response to CMS SignedData");
        }
    }

    public static boolean OooO00o(LlLI1 llLI1) {
        return OooO0OO.contains(llLI1);
    }

    public static boolean OooO00o(C6456l1ilL r3, C6456l1ilL r4) {
        if (r3 == null || r4 == null || !r3.OooO00o().equals(r4.OooO00o())) {
            return false;
        }
        AbstractC6854lLi1LL OooO0O02 = r3.m17587OooO0O0();
        AbstractC6854lLi1LL OooO0O03 = r4.m17587OooO0O0();
        return OooO0O02 != null ? OooO0O02.equals(OooO0O03) || (OooO0O02.equals(C6452l1Lll.OooO00o) && OooO0O03 == null) : OooO0O03 == null || OooO0O03.equals(C6452l1Lll.OooO00o);
    }

    public static boolean OooO00o(String str) {
        return OooO00o.contains(Strings.OooO0O0(str));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m16401OooO00o(InputStream inputStream) throws IOException {
        return C6304ilIi1.m17339OooO00o(inputStream);
    }

    public static byte[] OooO00o(InputStream inputStream, int i) throws IOException {
        return C6304ilIi1.OooO00o(inputStream, i);
    }

    public static I11L OooO0O0(List list) {
        iILLL1 r0 = new iILLL1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0.OooO00o((AbstractC6854lLi1LL) it.next());
        }
        return new i1I1I1l(r0);
    }

    public static List OooO0O0(AbstractC6271iilI iili) throws CMSException {
        ArrayList arrayList = new ArrayList();
        try {
            for (Object obj : iili.OooO00o(null)) {
                if (obj instanceof X509CRLHolder) {
                    obj = ((X509CRLHolder) obj).toASN1Structure();
                } else if (obj instanceof C9732ll) {
                    C9732ll OooO00o2 = C9732ll.OooO00o(obj);
                    OooO00o(OooO00o2);
                    arrayList.add(new ILI1Ll(false, 1, OooO00o2));
                } else if (!(obj instanceof AbstractC5903LlLLL)) {
                }
                arrayList.add(obj);
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw new CMSException("error processing certs", e);
        }
    }

    public static boolean OooO0O0(LlLI1 llLI1) {
        return OooO0Oo.contains(llLI1);
    }

    public static List OooO0OO(AbstractC6271iilI iili) throws CMSException {
        ArrayList arrayList = new ArrayList();
        try {
            for (X509CertificateHolder x509CertificateHolder : iili.OooO00o(null)) {
                arrayList.add(x509CertificateHolder.toASN1Structure());
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw new CMSException("error processing certs", e);
        }
    }

    public static boolean OooO0OO(LlLI1 llLI1) {
        return OooO0O0.contains(llLI1);
    }

    public static boolean OooO0Oo(LlLI1 llLI1) {
        return llLI1.equals(AbstractC5711LiLli.o000oo0O) || llLI1.equals(AbstractC5711LiLli.o000oo0o);
    }
}
