package com.p118pd.sdk;

import com.p118pd.sdk.lLL1iIIi;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.lLLl丨Lii  reason: invalid class name */
public class lLLlLii {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.asymmetric.ec.";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, String> f18527OooO00o;

    /* renamed from: com.pd.sdk.lLLl丨Lii$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r15) {
            r15.addAlgorithm("AlgorithmParameters.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi");
            r15.addAttributes("KeyAgreement.ECDH", lLLlLii.f18527OooO00o);
            r15.addAlgorithm("KeyAgreement.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DH");
            r15.addAttributes("KeyAgreement.ECDHC", lLLlLii.f18527OooO00o);
            r15.addAlgorithm("KeyAgreement.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC");
            r15.addAttributes("KeyAgreement.ECCDH", lLLlLii.f18527OooO00o);
            r15.addAlgorithm("KeyAgreement.ECCDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC");
            r15.addAttributes("KeyAgreement.ECCDHU", lLLlLii.f18527OooO00o);
            r15.addAlgorithm("KeyAgreement.ECCDHU", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUC");
            r15.addAlgorithm("KeyAgreement.ECDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECDHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECDHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECDHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECDHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC5420Il1iIL.o00Oo00, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC5420Il1iIL.o00Oo00o, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC6801ll1lLI.Oooo0O0, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC6801ll1lLI.Oooo0oO, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC6801ll1lLI.Oooo0OO, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC6801ll1lLI.Oooo0oo, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC6801ll1lLI.Oooo0o0, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC6801ll1lLI.Oooo, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC6801ll1lLI.Oooo0o, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement", AbstractC6801ll1lLI.OoooO00, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA1CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA224CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA256CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA384CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA512CKDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA1KDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA224KDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA256KDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA384KDF");
            r15.addAlgorithm("KeyAgreement.ECCDHUWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA512KDF");
            r15.addAlgorithm("KeyAgreement.ECKAEGWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA1KDF");
            r15.addAlgorithm("KeyAgreement.ECKAEGWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA224KDF");
            r15.addAlgorithm("KeyAgreement.ECKAEGWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA256KDF");
            r15.addAlgorithm("KeyAgreement.ECKAEGWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA384KDF");
            r15.addAlgorithm("KeyAgreement.ECKAEGWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA512KDF");
            r15.addAlgorithm("KeyAgreement", LIiiILi.OooOOO0, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA1KDF");
            r15.addAlgorithm("KeyAgreement", LIiiILi.OooOOO, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA224KDF");
            r15.addAlgorithm("KeyAgreement", LIiiILi.OooOOOO, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA256KDF");
            r15.addAlgorithm("KeyAgreement", LIiiILi.OooOOOo, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA384KDF");
            r15.addAlgorithm("KeyAgreement", LIiiILi.OooOOo0, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA512KDF");
            r15.addAlgorithm("KeyAgreement", LIiiILi.OooOOo, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithRIPEMD160KDF");
            r15.addAlgorithm("KeyAgreement.ECKAEGWITHRIPEMD160KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithRIPEMD160KDF");
            OooO00o(r15, AbstractC5420Il1iIL.o00O0o0o, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC5420Il1iIL.o00Oo00o, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC5420Il1iIL.o00Oo0O0, "ECMQV", new lLL1iIIi.C6582OooO0oO());
            OooO00o(r15, AbstractC6801ll1lLI.Oooo0O0, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC6801ll1lLI.Oooo0oO, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC6801ll1lLI.Oooo0OO, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC6801ll1lLI.Oooo0oo, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC6801ll1lLI.Oooo0o0, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC6801ll1lLI.Oooo, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC6801ll1lLI.Oooo0o, "EC", new lLL1iIIi.OooO00o());
            OooO00o(r15, AbstractC6801ll1lLI.OoooO00, "EC", new lLL1iIIi.OooO00o());
            OooO0O0(r15, AbstractC5420Il1iIL.o00O0o0o, "EC");
            OooO0O0(r15, AbstractC5420Il1iIL.o00Oo00, "EC");
            OooO0O0(r15, AbstractC5420Il1iIL.o00Oo00o, "EC");
            OooO0O0(r15, AbstractC6801ll1lLI.Oooo0O0, "EC");
            OooO0O0(r15, AbstractC6801ll1lLI.Oooo0oO, "EC");
            OooO0O0(r15, AbstractC6801ll1lLI.Oooo0OO, "EC");
            OooO0O0(r15, AbstractC6801ll1lLI.Oooo0oo, "EC");
            OooO0O0(r15, AbstractC6801ll1lLI.Oooo0o0, "EC");
            OooO0O0(r15, AbstractC6801ll1lLI.Oooo, "EC");
            OooO0O0(r15, AbstractC6801ll1lLI.Oooo0o, "EC");
            OooO0O0(r15, AbstractC6801ll1lLI.OoooO00, "EC");
            if (!C9358II1.m21422OooO00o("org.bouncycastle.ec.disable_mqv")) {
                r15.addAlgorithm("KeyAgreement.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQV");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1CKDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224CKDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256CKDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384CKDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512CKDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224KDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256KDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384KDF");
                r15.addAlgorithm("KeyAgreement.ECMQVWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512KDF");
                r15.addAlgorithm("KeyAgreement." + AbstractC5420Il1iIL.o00Oo0O0, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDFAndSharedInfo");
                r15.addAlgorithm("KeyAgreement." + AbstractC6801ll1lLI.OoooO0, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224KDFAndSharedInfo");
                r15.addAlgorithm("KeyAgreement." + AbstractC6801ll1lLI.OoooO0O, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256KDFAndSharedInfo");
                r15.addAlgorithm("KeyAgreement." + AbstractC6801ll1lLI.OoooO, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384KDFAndSharedInfo");
                r15.addAlgorithm("KeyAgreement." + AbstractC6801ll1lLI.OoooOO0, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512KDFAndSharedInfo");
                OooO00o(r15, AbstractC5420Il1iIL.o00Oo00, "EC", new lLL1iIIi.OooO00o());
                OooO0O0(r15, AbstractC5420Il1iIL.o00Oo0O0, "EC");
                OooO00o(r15, AbstractC6801ll1lLI.OoooO0, "ECMQV", new lLL1iIIi.C6582OooO0oO());
                OooO0O0(r15, AbstractC6801ll1lLI.OoooO0O, "EC");
                OooO00o(r15, AbstractC6801ll1lLI.OoooO0O, "ECMQV", new lLL1iIIi.C6582OooO0oO());
                OooO0O0(r15, AbstractC6801ll1lLI.OoooO0, "EC");
                OooO00o(r15, AbstractC6801ll1lLI.OoooO, "ECMQV", new lLL1iIIi.C6582OooO0oO());
                OooO0O0(r15, AbstractC6801ll1lLI.OoooO, "EC");
                OooO00o(r15, AbstractC6801ll1lLI.OoooOO0, "ECMQV", new lLL1iIIi.C6582OooO0oO());
                OooO0O0(r15, AbstractC6801ll1lLI.OoooOO0, "EC");
                r15.addAlgorithm("KeyFactory.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECMQV");
                r15.addAlgorithm("KeyPairGenerator.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECMQV");
            }
            r15.addAlgorithm("KeyFactory.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$EC");
            r15.addAlgorithm("KeyFactory.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDSA");
            r15.addAlgorithm("KeyFactory.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDH");
            r15.addAlgorithm("KeyFactory.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDHC");
            r15.addAlgorithm("KeyPairGenerator.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$EC");
            r15.addAlgorithm("KeyPairGenerator.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDSA");
            r15.addAlgorithm("KeyPairGenerator.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            r15.addAlgorithm("KeyPairGenerator.ECDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            r15.addAlgorithm("KeyPairGenerator.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDHC");
            r15.addAlgorithm("KeyPairGenerator.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            r15.addAlgorithm("Cipher.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIES");
            r15.addAlgorithm("Cipher.ECIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC");
            r15.addAlgorithm("Cipher.ECIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC");
            r15.addAlgorithm("Cipher.ECIESwithDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC");
            r15.addAlgorithm("Cipher.ECIESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC");
            r15.addAlgorithm("Signature.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA");
            r15.addAlgorithm("Signature.NONEwithECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAnone");
            r15.addAlgorithm("Alg.Alias.Signature.SHA1withECDSA", "ECDSA");
            r15.addAlgorithm("Alg.Alias.Signature.ECDSAwithSHA1", "ECDSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA1WITHECDSA", "ECDSA");
            r15.addAlgorithm("Alg.Alias.Signature.ECDSAWITHSHA1", "ECDSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA1WithECDSA", "ECDSA");
            r15.addAlgorithm("Alg.Alias.Signature.ECDSAWithSHA1", "ECDSA");
            r15.addAlgorithm("Alg.Alias.Signature.1.2.840.10045.4.1", "ECDSA");
            r15.addAlgorithm("Alg.Alias.Signature." + AbstractC9468L1lL.OooOO0, "ECDSA");
            r15.addAlgorithm("Signature.ECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA");
            r15.addAlgorithm("Signature.SHA1WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA");
            r15.addAlgorithm("Signature.SHA224WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA224");
            r15.addAlgorithm("Signature.SHA256WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA256");
            r15.addAlgorithm("Signature.SHA384WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA384");
            r15.addAlgorithm("Signature.SHA512WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA512");
            r15.addAlgorithm("Signature.SHA3-224WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_224");
            r15.addAlgorithm("Signature.SHA3-256WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_256");
            r15.addAlgorithm("Signature.SHA3-384WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_384");
            r15.addAlgorithm("Signature.SHA3-512WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_512");
            r15.addAlgorithm("Alg.Alias.Signature.DETECDSA", "ECDDSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA1WITHDETECDSA", "SHA1WITHECDDSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA224WITHDETECDSA", "SHA224WITHECDDSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA256WITHDETECDSA", "SHA256WITHECDDSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA384WITHDETECDSA", "SHA384WITHECDDSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA512WITHDETECDSA", "SHA512WITHECDDSA");
            OooO00o(r15, "SHA224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA224", AbstractC5420Il1iIL.o00O0oO);
            OooO00o(r15, "SHA256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA256", AbstractC5420Il1iIL.o00O0oOO);
            OooO00o(r15, "SHA384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA384", AbstractC5420Il1iIL.o00O0oOo);
            OooO00o(r15, "SHA512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA512", AbstractC5420Il1iIL.o00O0oo0);
            OooO00o(r15, "SHA3-224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_224", AbstractC5905LllI.Ooooo00);
            OooO00o(r15, C6229iiIL.OooO0OO, "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_256", AbstractC5905LllI.Ooooo0o);
            OooO00o(r15, "SHA3-384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_384", AbstractC5905LllI.OooooO0);
            OooO00o(r15, "SHA3-512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_512", AbstractC5905LllI.OooooOO);
            OooO00o(r15, "RIPEMD160", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSARipeMD160", AbstractC9468L1lL.OooOO0O);
            r15.addAlgorithm("Signature.SHA1WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR");
            r15.addAlgorithm("Signature.SHA224WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR224");
            r15.addAlgorithm("Signature.SHA256WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR256");
            r15.addAlgorithm("Signature.SHA384WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR384");
            r15.addAlgorithm("Signature.SHA512WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR512");
            OooO00o(r15, "SHA1", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", AbstractC9525LlI1.OooOOoo);
            OooO00o(r15, "SHA224", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", AbstractC9525LlI1.OooOo00);
            OooO00o(r15, "SHA256", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", AbstractC9525LlI1.OooOo0);
            OooO00o(r15, "SHA384", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384", AbstractC9525LlI1.OooOo0O);
            OooO00o(r15, "SHA512", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512", AbstractC9525LlI1.OooOo0o);
            OooO00o(r15, "SHA1", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", LIiiILi.OooO0Oo);
            OooO00o(r15, "SHA224", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", LIiiILi.OooO0o0);
            OooO00o(r15, "SHA256", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", LIiiILi.OooO0o);
            OooO00o(r15, "SHA384", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384", LIiiILi.OooO0oO);
            OooO00o(r15, "SHA512", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512", LIiiILi.OooO0oo);
            OooO00o(r15, "RIPEMD160", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecPlainDSARP160", LIiiILi.OooO);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f18527OooO00o = hashMap;
        hashMap.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        f18527OooO00o.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
