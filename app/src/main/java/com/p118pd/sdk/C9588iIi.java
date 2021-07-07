package com.p118pd.sdk;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;

/* renamed from: com.pd.sdk.丨iIi  reason: invalid class name and case insensitive filesystem */
public class C9588iIi implements ii1I11l {
    public final String OooO00o;

    public C9588iIi(String str) {
        this.OooO00o = str;
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    public AlgorithmParameterGenerator OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameterGenerator.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameters m21646OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameters.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyFactory m21647OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyFactory.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyPairGenerator m21648OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyPairGenerator.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public MessageDigest m21649OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return MessageDigest.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecureRandom m21650OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return SecureRandom.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Signature m21651OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return Signature.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CertificateFactory m21652OooO00o(String str) throws CertificateException, NoSuchProviderException {
        return CertificateFactory.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Cipher m21653OooO00o(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
        return Cipher.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyAgreement m21654OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyAgreement.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyGenerator m21655OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyGenerator.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Mac m21656OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return Mac.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecretKeyFactory m21657OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return SecretKeyFactory.getInstance(str, this.OooO00o);
    }
}
