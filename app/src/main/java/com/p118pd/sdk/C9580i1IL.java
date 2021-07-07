package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨i1丨I丨L  reason: invalid class name and case insensitive filesystem */
public class C9580i1IL {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.asymmetric.elgamal.";

    /* renamed from: com.pd.sdk.丨i1丨I丨L$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("AlgorithmParameterGenerator.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
            r4.addAlgorithm("AlgorithmParameterGenerator.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
            r4.addAlgorithm("AlgorithmParameters.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
            r4.addAlgorithm("AlgorithmParameters.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
            r4.addAlgorithm("Cipher.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
            r4.addAlgorithm("Cipher.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
            r4.addAlgorithm("Alg.Alias.Cipher.ELGAMAL/ECB/PKCS1PADDING", "ELGAMAL/PKCS1");
            r4.addAlgorithm("Alg.Alias.Cipher.ELGAMAL/NONE/PKCS1PADDING", "ELGAMAL/PKCS1");
            r4.addAlgorithm("Alg.Alias.Cipher.ELGAMAL/NONE/NOPADDING", "ELGAMAL");
            r4.addAlgorithm("Cipher.ELGAMAL/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$PKCS1v1_5Padding");
            r4.addAlgorithm("KeyFactory.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
            r4.addAlgorithm("KeyFactory.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
            r4.addAlgorithm("KeyPairGenerator.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
            r4.addAlgorithm("KeyPairGenerator.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
            OooO00o(r4, AbstractC9733l.OooOO0o, "ELGAMAL", new C6129iIlLIl());
            OooO00o(r4, AbstractC9733l.OooOO0o, "ELGAMAL");
        }
    }
}
