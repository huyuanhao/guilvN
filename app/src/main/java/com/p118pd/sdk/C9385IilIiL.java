package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨IilIi丨L  reason: invalid class name and case insensitive filesystem */
public class C9385IilIiL {
    public static AbstractC6122iIlLiL OooO00o(byte[] bArr) throws IOException {
        return AbstractC6122iIlLiL.OooO00o(((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(bArr)).m17938OooO00o());
    }

    public static Collection OooO00o(X509Certificate x509Certificate) throws CertificateParsingException {
        return m21451OooO00o(x509Certificate.getExtensionValue(C5237III.o00Ooo0O.m16387OooO0O0()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Collection m21451OooO00o(byte[] bArr) throws CertificateParsingException {
        Object OooO0O0;
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration OooO00o = I11li1.OooO00o((Object) OooO00o(bArr)).m15236OooO00o();
            while (OooO00o.hasMoreElements()) {
                ILI OooO00o2 = ILI.OooO00o(OooO00o.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(I11I.OooO00o(OooO00o2.OooO00o()));
                switch (OooO00o2.OooO00o()) {
                    case 0:
                    case 3:
                    case 5:
                        OooO0O0 = OooO00o2.m15483OooO0O0().OooO0O0();
                        break;
                    case 1:
                    case 2:
                    case 6:
                        OooO0O0 = ((AbstractC98681) OooO00o2.m15483OooO0O0()).OooO00o();
                        break;
                    case 4:
                        OooO0O0 = l1LILI1.OooO00o(OooO00o2.m15483OooO0O0()).toString();
                        break;
                    case 7:
                        arrayList2.add(AbstractC6804llL1ii.OooO00o(OooO00o2.m15483OooO0O0()).m17938OooO00o());
                        continue;
                        arrayList.add(arrayList2);
                    case 8:
                        OooO0O0 = LlLI1.OooO00o(OooO00o2.m15483OooO0O0()).m16387OooO0O0();
                        break;
                    default:
                        throw new IOException("Bad tag number: " + OooO00o2.OooO00o());
                }
                arrayList2.add(OooO0O0);
                arrayList.add(arrayList2);
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    public static Collection OooO0O0(X509Certificate x509Certificate) throws CertificateParsingException {
        return m21451OooO00o(x509Certificate.getExtensionValue(C5237III.o00Ooo0.m16387OooO0O0()));
    }
}
