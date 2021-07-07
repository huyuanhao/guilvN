package com.p118pd.sdk;

import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.jcajce.JcaX509CRLHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* renamed from: com.pd.sdk.丨li11  reason: invalid class name and case insensitive filesystem */
public class C9698li11 extends C6706lilliI {
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Provider f23320OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23321OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public char[] f23322OooO00o;
    public Object OooO0O0;

    public C9698li11(Object obj) throws IOException {
        super(OooO00o(obj));
    }

    public C9698li11(Object obj, AbstractC93101ii r2) throws IOException {
        super(OooO00o(obj), r2);
    }

    public static Object OooO00o(Object obj) throws IOException {
        if (obj instanceof X509Certificate) {
            try {
                return new JcaX509CertificateHolder((X509Certificate) obj);
            } catch (CertificateEncodingException e) {
                throw new IllegalArgumentException("Cannot encode object: " + e.toString());
            }
        } else if (!(obj instanceof X509CRL)) {
            return obj instanceof KeyPair ? OooO00o((Object) ((KeyPair) obj).getPrivate()) : obj instanceof PrivateKey ? C5464IlilIi.OooO00o(((Key) obj).getEncoded()) : obj instanceof PublicKey ? C6888ll.OooO00o(((PublicKey) obj).getEncoded()) : obj;
        } else {
            try {
                return new JcaX509CRLHolder((X509CRL) obj);
            } catch (CRLException e2) {
                throw new IllegalArgumentException("Cannot encode object: " + e2.toString());
            }
        }
    }
}
