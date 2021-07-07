package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.l丨iL  reason: invalid class name and case insensitive filesystem */
public class C6859liL {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.asymmetric.dh.";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, String> f18924OooO00o;

    /* renamed from: com.pd.sdk.l丨iL$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r6) {
            r6.addAlgorithm("KeyPairGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
            r6.addAlgorithm("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
            r6.addAttributes("KeyAgreement.DH", C6859liL.f18924OooO00o);
            r6.addAlgorithm("KeyAgreement.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
            r6.addAlgorithm("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
            r6.addAlgorithm("KeyAgreement", AbstractC5711LiLli.o000oo0O, "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
            r6.addAlgorithm("KeyAgreement", AbstractC5711LiLli.o000oo0o, "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
            r6.addAlgorithm("KeyFactory.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
            r6.addAlgorithm("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
            r6.addAlgorithm("AlgorithmParameters.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
            r6.addAlgorithm("AlgorithmParameterGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
            r6.addAlgorithm("Cipher.IES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
            r6.addAlgorithm("Cipher.IESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            r6.addAlgorithm("Cipher.IESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            r6.addAlgorithm("Cipher.IESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
            r6.addAlgorithm("Cipher.DHIES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
            r6.addAlgorithm("Cipher.DHIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            r6.addAlgorithm("Cipher.DHIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            r6.addAlgorithm("Cipher.DHIESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
            r6.addAlgorithm("KeyAgreement.DHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA1KDF");
            r6.addAlgorithm("KeyAgreement.DHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA224KDF");
            r6.addAlgorithm("KeyAgreement.DHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA256KDF");
            r6.addAlgorithm("KeyAgreement.DHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA384KDF");
            r6.addAlgorithm("KeyAgreement.DHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA512KDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1KDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224KDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256KDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384KDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512KDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1CKDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224CKDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256CKDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384CKDF");
            r6.addAlgorithm("KeyAgreement.DHUWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512CKDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1KDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224KDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256KDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384KDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512KDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1CKDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224CKDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256CKDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384CKDF");
            r6.addAlgorithm("KeyAgreement.MQVWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512CKDF");
            OooO00o(r6, AbstractC5711LiLli.Oooo, "DH", new C9629ilLilI());
            OooO00o(r6, AbstractC5420Il1iIL.o00Oo0Oo, "DH", new C9629ilLilI());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f18924OooO00o = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey");
        f18924OooO00o.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
