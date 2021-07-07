package com.p118pd.sdk;

import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* renamed from: com.pd.sdk.lI丨Llii  reason: invalid class name and case insensitive filesystem */
public class C6536lILlii extends C9729l1iIl {
    public final PrivateKey OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final X509Certificate[] f18418OooO00o;

    public C6536lILlii(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        super(OooO00o(privateKey), OooO00o(x509CertificateArr));
        this.OooO00o = privateKey;
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        this.f18418OooO00o = x509CertificateArr2;
        System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, x509CertificateArr.length);
    }

    public static C5464IlilIi OooO00o(PrivateKey privateKey) {
        try {
            return C5464IlilIi.OooO00o(privateKey.getEncoded());
        } catch (Exception unused) {
            return null;
        }
    }

    public static X509CertificateHolder[] OooO00o(X509Certificate[] x509CertificateArr) {
        int length = x509CertificateArr.length;
        X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[length];
        for (int i = 0; i != length; i++) {
            try {
                x509CertificateHolderArr[i] = new JcaX509CertificateHolder(x509CertificateArr[i]);
            } catch (CertificateEncodingException e) {
                throw new IllegalArgumentException("Unable to process certificates: " + e.getMessage());
            }
        }
        return x509CertificateHolderArr;
    }

    @Override // com.p118pd.sdk.C9729l1iIl, com.p118pd.sdk.C9729l1iIl, com.p118pd.sdk.C9729l1iIl
    public PrivateKey OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C9729l1iIl, com.p118pd.sdk.C9729l1iIl, com.p118pd.sdk.C9729l1iIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509Certificate m17655OooO00o() {
        return this.f18418OooO00o[0];
    }
}
