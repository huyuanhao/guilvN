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

/* renamed from: com.pd.sdk.ii1I11l */
public interface ii1I11l {
    AlgorithmParameterGenerator OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    AlgorithmParameters m17217OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    KeyFactory m17218OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    KeyPairGenerator m17219OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    MessageDigest m17220OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    SecureRandom m17221OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    Signature m17222OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    CertificateFactory m17223OooO00o(String str) throws NoSuchProviderException, CertificateException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    Cipher m17224OooO00o(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    KeyAgreement m17225OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    KeyGenerator m17226OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    Mac m17227OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    SecretKeyFactory m17228OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
}
