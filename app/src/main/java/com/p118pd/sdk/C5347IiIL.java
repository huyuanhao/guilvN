package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* renamed from: com.pd.sdk.IiIL  reason: case insensitive filesystem */
public class C5347IiIL extends LI1I1Ii {
    public C5347IiIL(l1LILI1 r8, BigInteger bigInteger, C5432IlIlIlL r10, C5432IlIlIlL r11, l1LILI1 r12, PublicKey publicKey) {
        super(r8, bigInteger, r10, r11, r12, C6888ll.OooO00o(publicKey.getEncoded()));
    }

    public C5347IiIL(l1LILI1 r8, BigInteger bigInteger, Date date, Date date2, l1LILI1 r12, PublicKey publicKey) {
        super(r8, bigInteger, date, date2, r12, C6888ll.OooO00o(publicKey.getEncoded()));
    }

    public C5347IiIL(X509Certificate x509Certificate, BigInteger bigInteger, Date date, Date date2, l1LILI1 r12, PublicKey publicKey) {
        this(l1LILI1.OooO00o(x509Certificate.getSubjectX500Principal().getEncoded()), bigInteger, date, date2, r12, publicKey);
    }

    public C5347IiIL(X509Certificate x509Certificate, BigInteger bigInteger, Date date, Date date2, X500Principal x500Principal, PublicKey publicKey) {
        this(x509Certificate.getSubjectX500Principal(), bigInteger, date, date2, x500Principal, publicKey);
    }

    public C5347IiIL(X500Principal x500Principal, BigInteger bigInteger, Date date, Date date2, X500Principal x500Principal2, PublicKey publicKey) {
        super(l1LILI1.OooO00o(x500Principal.getEncoded()), bigInteger, date, date2, l1LILI1.OooO00o(x500Principal2.getEncoded()), C6888ll.OooO00o(publicKey.getEncoded()));
    }

    public C5347IiIL OooO00o(LlLI1 llLI1, boolean z, X509Certificate x509Certificate) throws CertificateEncodingException {
        OooO00o(llLI1, z, new JcaX509CertificateHolder(x509Certificate));
        return this;
    }
}
