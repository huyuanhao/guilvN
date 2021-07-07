package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.l丨丨iLi  reason: invalid class name and case insensitive filesystem */
public class C6902liLi extends LI1I1Ii {
    public C6902liLi(l1LILI1 r8, BigInteger bigInteger, Date date, Date date2, l1LILI1 r12, C6213iL11I r13) throws IOException {
        super(r8, bigInteger, date, date2, r12, L11.OooO00o(r13));
    }

    public C6902liLi(X509CertificateHolder x509CertificateHolder, BigInteger bigInteger, Date date, Date date2, l1LILI1 r12, C6213iL11I r13) throws IOException {
        super(x509CertificateHolder.getSubject(), bigInteger, date, date2, r12, L11.OooO00o(r13));
    }
}
