package com.p118pd.sdk;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

/* renamed from: com.pd.sdk.ILLli */
public class ILLli implements ii1I11l {
    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    public AlgorithmParameterGenerator OooO00o(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameterGenerator.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameters m15490OooO00o(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyFactory m15491OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyPairGenerator m15492OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyPairGenerator.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public MessageDigest m15493OooO00o(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecureRandom m15494OooO00o(String str) throws NoSuchAlgorithmException {
        return SecureRandom.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Signature m15495OooO00o(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CertificateFactory m15496OooO00o(String str) throws CertificateException {
        return CertificateFactory.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Cipher m15497OooO00o(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyAgreement m15498OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyAgreement.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyGenerator m15499OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyGenerator.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Mac m15500OooO00o(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str);
    }

    @Override // com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l, com.p118pd.sdk.ii1I11l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecretKeyFactory m15501OooO00o(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str);
    }
}
