package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.II丨  reason: invalid class name */
public class II extends C5607LI1I1iI {
    public II(Collection collection) throws CertificateEncodingException {
        super(OooO00o(collection));
    }

    public static Collection OooO00o(Collection collection) throws CertificateEncodingException {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509Certificate) {
                try {
                    arrayList.add(new X509CertificateHolder(((X509Certificate) obj).getEncoded()));
                } catch (IOException e) {
                    throw new CertificateEncodingException("unable to read encoding: " + e.getMessage());
                }
            } else {
                arrayList.add((X509CertificateHolder) obj);
            }
        }
        return arrayList;
    }
}
