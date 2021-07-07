package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1IilL  reason: case insensitive filesystem */
public class C6016i1IilL {
    public static final String OooO00o = "org.bouncycastle.pqc.jcajce.provider.sphincs.";

    /* renamed from: com.pd.sdk.i1IilL$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r15) {
            r15.addAlgorithm("KeyFactory.SPHINCS256", "org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi");
            r15.addAlgorithm("KeyPairGenerator.SPHINCS256", "org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyPairGeneratorSpi");
            OooO00o(r15, "SHA512", "SPHINCS256", "org.bouncycastle.pqc.jcajce.provider.sphincs.SignatureSpi$withSha512", L1iiiiI.OooOo00);
            OooO00o(r15, "SHA3-512", "SPHINCS256", "org.bouncycastle.pqc.jcajce.provider.sphincs.SignatureSpi$withSha3_512", L1iiiiI.OooOo0);
            OooO00o(r15, L1iiiiI.OooOOo, "SPHINCS256", new iIlIlLl());
            OooO0O0(r15, L1iiiiI.OooOOo, "SPHINCS256");
        }
    }
}
