package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi;

/* renamed from: com.pd.sdk.丨丨丨LLlL丨  reason: invalid class name and case insensitive filesystem */
public class C9872LLlL {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.asymmetric.dsa.";

    /* renamed from: com.pd.sdk.丨丨丨LLlL丨$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r15) {
            r15.addAlgorithm("AlgorithmParameters.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParametersSpi");
            r15.addAlgorithm("AlgorithmParameterGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParameterGeneratorSpi");
            r15.addAlgorithm("KeyPairGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyPairGeneratorSpi");
            r15.addAlgorithm("KeyFactory.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi");
            r15.addAlgorithm("Signature.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$stdDSA");
            r15.addAlgorithm("Signature.NONEWITHDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$noneDSA");
            r15.addAlgorithm("Alg.Alias.Signature.RAWDSA", "NONEWITHDSA");
            r15.addAlgorithm("Signature.DETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            r15.addAlgorithm("Signature.SHA1WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            r15.addAlgorithm("Signature.SHA224WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA224");
            r15.addAlgorithm("Signature.SHA256WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA256");
            r15.addAlgorithm("Signature.SHA384WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA384");
            r15.addAlgorithm("Signature.SHA512WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA512");
            r15.addAlgorithm("Signature.DDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            r15.addAlgorithm("Signature.SHA1WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            r15.addAlgorithm("Signature.SHA224WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA224");
            r15.addAlgorithm("Signature.SHA256WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA256");
            r15.addAlgorithm("Signature.SHA384WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA384");
            r15.addAlgorithm("Signature.SHA512WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA512");
            r15.addAlgorithm("Signature.SHA3-224WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_224");
            r15.addAlgorithm("Signature.SHA3-256WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_256");
            r15.addAlgorithm("Signature.SHA3-384WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_384");
            r15.addAlgorithm("Signature.SHA3-512WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_512");
            OooO00o(r15, "SHA224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa224", AbstractC5905LllI.OoooO);
            OooO00o(r15, "SHA256", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa256", AbstractC5905LllI.OoooOO0);
            OooO00o(r15, "SHA384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa384", AbstractC5905LllI.o000oOoO);
            OooO00o(r15, "SHA512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512", AbstractC5905LllI.OoooOOO);
            OooO00o(r15, "SHA3-224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_224", AbstractC5905LllI.OoooOOo);
            OooO00o(r15, C6229iiIL.OooO0OO, "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_256", AbstractC5905LllI.OoooOo0);
            OooO00o(r15, "SHA3-384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_384", AbstractC5905LllI.OoooOoO);
            OooO00o(r15, "SHA3-512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_512", AbstractC5905LllI.OoooOoo);
            r15.addAlgorithm("Alg.Alias.Signature.SHA/DSA", "DSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA1withDSA", "DSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA1WITHDSA", "DSA");
            r15.addAlgorithm("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.1", "DSA");
            r15.addAlgorithm("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.3", "DSA");
            r15.addAlgorithm("Alg.Alias.Signature.DSAwithSHA1", "DSA");
            r15.addAlgorithm("Alg.Alias.Signature.DSAWITHSHA1", "DSA");
            r15.addAlgorithm("Alg.Alias.Signature.SHA1WithDSA", "DSA");
            r15.addAlgorithm("Alg.Alias.Signature.DSAWithSHA1", "DSA");
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            for (int i = 0; i != C9348II1i.OooO00o.length; i++) {
                r15.addAlgorithm("Alg.Alias.Signature." + C9348II1i.OooO00o[i], "DSA");
                OooO00o(r15, C9348II1i.OooO00o[i], "DSA", keyFactorySpi);
                OooO00o(r15, C9348II1i.OooO00o[i], "DSA");
            }
        }
    }
}
