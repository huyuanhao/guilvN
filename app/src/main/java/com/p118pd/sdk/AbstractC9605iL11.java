package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Extension;
import java.util.Date;

/* renamed from: com.pd.sdk.丨iL1丨1丨  reason: invalid class name and case insensitive filesystem */
public interface AbstractC9605iL11 extends X509Extension {
    llL1LI OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    Lllll1 m21662OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    C9850lI1I[] m21663OooO00o();

    C9850lI1I[] OooO00o(String str);

    void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException;

    void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException;

    byte[] getEncoded() throws IOException;

    boolean[] getIssuerUniqueID();

    Date getNotAfter();

    Date getNotBefore();

    BigInteger getSerialNumber();

    byte[] getSignature();

    int getVersion();

    void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
}
