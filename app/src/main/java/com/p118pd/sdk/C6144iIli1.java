package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.iI丨l丨i丨1  reason: invalid class name and case insensitive filesystem */
public class C6144iIli1 {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.asymmetric.rsa.";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, String> f17650OooO00o;

    /* renamed from: com.pd.sdk.iI丨l丨i丨1$OooO00o */
    public static class OooO00o extends Il1LIlll {
        private void OooO00o(l1I1L r5, String str, String str2) {
            r5.addAlgorithm("Alg.Alias.Signature." + str + "withRSA/ISO9796-2", str + "WITHRSA/ISO9796-2");
            r5.addAlgorithm("Alg.Alias.Signature." + str + "WithRSA/ISO9796-2", str + "WITHRSA/ISO9796-2");
            r5.addAlgorithm("Signature." + str + "WITHRSA/ISO9796-2", str2);
        }

        private void OooO00o(l1I1L r9, String str, String str2, LlLI1 llLI1) {
            String str3 = str + "WITHRSA";
            String str4 = str + "withRSA";
            String str5 = str + "WithRSA";
            String str6 = str + "/RSA";
            String str7 = str + "WITHRSAENCRYPTION";
            String str8 = str + "withRSAEncryption";
            r9.addAlgorithm("Signature." + str3, str2);
            r9.addAlgorithm("Alg.Alias.Signature." + str4, str3);
            r9.addAlgorithm("Alg.Alias.Signature." + str5, str3);
            r9.addAlgorithm("Alg.Alias.Signature." + str7, str3);
            r9.addAlgorithm("Alg.Alias.Signature." + str8, str3);
            r9.addAlgorithm("Alg.Alias.Signature." + (str + "WithRSAEncryption"), str3);
            r9.addAlgorithm("Alg.Alias.Signature." + str6, str3);
            if (llLI1 != null) {
                r9.addAlgorithm("Alg.Alias.Signature." + llLI1, str3);
                r9.addAlgorithm("Alg.Alias.Signature.OID." + llLI1, str3);
            }
        }

        private void OooO0O0(l1I1L r5, String str, String str2) {
            r5.addAlgorithm("Alg.Alias.Signature." + str + "withRSA/PSS", str + "WITHRSAANDMGF1");
            r5.addAlgorithm("Alg.Alias.Signature." + str + "WithRSA/PSS", str + "WITHRSAANDMGF1");
            r5.addAlgorithm("Alg.Alias.Signature." + str + "withRSAandMGF1", str + "WITHRSAANDMGF1");
            r5.addAlgorithm("Alg.Alias.Signature." + str + "WithRSAAndMGF1", str + "WITHRSAANDMGF1");
            r5.addAlgorithm("Signature." + str + "WITHRSAANDMGF1", str2);
        }

        private void OooO0OO(l1I1L r5, String str, String str2) {
            r5.addAlgorithm("Alg.Alias.Signature." + str + "withRSA/X9.31", str + "WITHRSA/X9.31");
            r5.addAlgorithm("Alg.Alias.Signature." + str + "WithRSA/X9.31", str + "WITHRSA/X9.31");
            r5.addAlgorithm("Signature." + str + "WITHRSA/X9.31", str2);
        }

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r12) {
            r12.addAlgorithm("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
            r12.addAlgorithm("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-224WITHRSAANDMGF1", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-256WITHRSAANDMGF1", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-384WITHRSAANDMGF1", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-512WITHRSAANDMGF1", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
            r12.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
            r12.addAttributes("Cipher.RSA", C6144iIli1.f17650OooO00o);
            r12.addAlgorithm("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            r12.addAlgorithm("Cipher.RSA/RAW", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            r12.addAlgorithm("Cipher.RSA/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            r12.addAlgorithm("Cipher", AbstractC5711LiLli.OooOoO0, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            r12.addAlgorithm("Cipher", AbstractC5855LLl.o00O000, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            r12.addAlgorithm("Cipher.RSA/1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
            r12.addAlgorithm("Cipher.RSA/2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
            r12.addAlgorithm("Cipher.RSA/OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            r12.addAlgorithm("Cipher", AbstractC5711LiLli.OooOooo, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            r12.addAlgorithm("Cipher.RSA/ISO9796-1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
            r12.addAlgorithm("Alg.Alias.Cipher.RSA//RAW", C7491o0OoOOO.OooO00o);
            r12.addAlgorithm("Alg.Alias.Cipher.RSA//NOPADDING", C7491o0OoOOO.OooO00o);
            r12.addAlgorithm("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
            r12.addAlgorithm("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
            r12.addAlgorithm("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
            r12.addAlgorithm("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
            r12.addAlgorithm("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
            I1I1lL r2 = new I1I1lL();
            OooO00o(r12, AbstractC5711LiLli.OooOoO0, C7491o0OoOOO.OooO00o, r2);
            OooO00o(r12, AbstractC5855LLl.o00O000, C7491o0OoOOO.OooO00o, r2);
            OooO00o(r12, AbstractC5711LiLli.OooOooo, C7491o0OoOOO.OooO00o, r2);
            OooO00o(r12, AbstractC5711LiLli.Oooo00o, C7491o0OoOOO.OooO00o, r2);
            OooO0O0(r12, AbstractC5711LiLli.OooOoO0, C7491o0OoOOO.OooO00o);
            OooO0O0(r12, AbstractC5855LLl.o00O000, C7491o0OoOOO.OooO00o);
            OooO0O0(r12, AbstractC5711LiLli.OooOooo, "OAEP");
            OooO0O0(r12, AbstractC5711LiLli.Oooo00o, "PSS");
            r12.addAlgorithm("Signature.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            r12.addAlgorithm("Signature." + AbstractC5711LiLli.Oooo00o, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            r12.addAlgorithm("Signature.OID." + AbstractC5711LiLli.Oooo00o, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            r12.addAlgorithm("Signature.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
            r12.addAlgorithm("Signature.RAWRSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
            r12.addAlgorithm("Alg.Alias.Signature.RAWRSA", C7491o0OoOOO.OooO00o);
            r12.addAlgorithm("Alg.Alias.Signature.NONEWITHRSA", C7491o0OoOOO.OooO00o);
            r12.addAlgorithm("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
            r12.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
            r12.addAlgorithm("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
            r12.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
            r12.addAlgorithm("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
            OooO0O0(r12, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
            OooO0O0(r12, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
            OooO0O0(r12, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
            OooO0O0(r12, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
            OooO0O0(r12, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSA");
            OooO0O0(r12, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSA");
            OooO0O0(r12, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSA");
            OooO0O0(r12, C6229iiIL.OooO0OO, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSA");
            OooO0O0(r12, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSA");
            OooO0O0(r12, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSA");
            if (r12.hasAlgorithm("MessageDigest", "MD2")) {
                OooO00o(r12, "MD2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", AbstractC5711LiLli.OooOoO);
            }
            if (r12.hasAlgorithm("MessageDigest", "MD4")) {
                OooO00o(r12, "MD4", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", AbstractC5711LiLli.OooOoOO);
            }
            if (r12.hasAlgorithm("MessageDigest", "MD5")) {
                OooO00o(r12, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", AbstractC5711LiLli.OooOoo0);
                OooO00o(r12, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            }
            if (r12.hasAlgorithm("MessageDigest", "SHA1")) {
                r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
                r12.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
                OooO0O0(r12, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
                OooO00o(r12, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", AbstractC5711LiLli.OooOoo);
                OooO00o(r12, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
                r12.addAlgorithm("Alg.Alias.Signature." + AbstractC9733l.OooOO0O, "SHA1WITHRSA");
                r12.addAlgorithm("Alg.Alias.Signature.OID." + AbstractC9733l.OooOO0O, "SHA1WITHRSA");
                OooO0OO(r12, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA1WithRSAEncryption");
            }
            OooO00o(r12, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", AbstractC5711LiLli.Oooo0o0);
            OooO00o(r12, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", AbstractC5711LiLli.Oooo0);
            OooO00o(r12, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", AbstractC5711LiLli.Oooo0O0);
            OooO00o(r12, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", AbstractC5711LiLli.Oooo0OO);
            OooO00o(r12, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", AbstractC5711LiLli.Oooo0o);
            OooO00o(r12, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", AbstractC5711LiLli.Oooo0oO);
            OooO00o(r12, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", AbstractC5905LllI.OooooOo);
            OooO00o(r12, C6229iiIL.OooO0OO, "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", AbstractC5905LllI.Oooooo0);
            OooO00o(r12, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", AbstractC5905LllI.Oooooo);
            OooO00o(r12, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", AbstractC5905LllI.OoooooO);
            OooO00o(r12, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA224WithRSAEncryption");
            OooO00o(r12, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA256WithRSAEncryption");
            OooO00o(r12, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA384WithRSAEncryption");
            OooO00o(r12, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512WithRSAEncryption");
            OooO00o(r12, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_224WithRSAEncryption");
            OooO00o(r12, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_256WithRSAEncryption");
            OooO0OO(r12, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA224WithRSAEncryption");
            OooO0OO(r12, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA256WithRSAEncryption");
            OooO0OO(r12, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA384WithRSAEncryption");
            OooO0OO(r12, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512WithRSAEncryption");
            OooO0OO(r12, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_224WithRSAEncryption");
            OooO0OO(r12, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_256WithRSAEncryption");
            if (r12.hasAlgorithm("MessageDigest", "RIPEMD128")) {
                OooO00o(r12, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", AbstractC9468L1lL.OooO0oO);
                OooO00o(r12, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", (LlLI1) null);
                OooO0OO(r12, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
                OooO0OO(r12, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
            }
            if (r12.hasAlgorithm("MessageDigest", "RIPEMD160")) {
                OooO00o(r12, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", AbstractC9468L1lL.OooO0o);
                OooO00o(r12, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", (LlLI1) null);
                r12.addAlgorithm("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
                r12.addAlgorithm("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
                OooO0OO(r12, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
                OooO0OO(r12, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
            }
            if (r12.hasAlgorithm("MessageDigest", "RIPEMD256")) {
                OooO00o(r12, "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", AbstractC9468L1lL.OooO0oo);
                OooO00o(r12, "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", (LlLI1) null);
            }
            if (r12.hasAlgorithm("MessageDigest", "WHIRLPOOL")) {
                OooO00o(r12, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                OooO00o(r12, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                OooO0OO(r12, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
                OooO0OO(r12, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f17650OooO00o = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.interfaces.RSAPublicKey|javax.crypto.interfaces.RSAPrivateKey");
        f17650OooO00o.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
