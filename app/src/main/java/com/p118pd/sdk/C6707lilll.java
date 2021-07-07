package com.p118pd.sdk;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.lilll  reason: case insensitive filesystem */
public class C6707lilll {
    public static Set OooO00o(X509CertificateHolder[] x509CertificateHolderArr) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i != x509CertificateHolderArr.length; i++) {
            hashSet.addAll(x509CertificateHolderArr[i].getCriticalExtensionOIDs());
        }
        return hashSet;
    }
}
