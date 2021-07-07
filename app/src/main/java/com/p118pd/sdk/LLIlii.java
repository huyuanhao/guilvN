package com.p118pd.sdk;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
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

/* renamed from: com.pd.sdk.LLIlii */
public class LLIlii implements ii1I11l {
    public final Provider OooO00o;

    public LLIlii(Provider provider) {
        this.OooO00o = provider;
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    public AlgorithmParameterGenerator OooO00o(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameterGenerator.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameters m16203OooO00o(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyFactory m16204OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyPairGenerator m16205OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyPairGenerator.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public MessageDigest m16206OooO00o(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecureRandom m16207OooO00o(String str) throws NoSuchAlgorithmException {
        return SecureRandom.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Signature m16208OooO00o(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CertificateFactory m16209OooO00o(String str) throws CertificateException {
        return CertificateFactory.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Cipher m16210OooO00o(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyAgreement m16211OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyAgreement.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyGenerator m16212OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyGenerator.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Mac m16213OooO00o(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str, this.OooO00o);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecretKeyFactory m16214OooO00o(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str, this.OooO00o);
    }
}
