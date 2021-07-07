package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ll丨IILl  reason: invalid class name and case insensitive filesystem */
public class C6803llIILl {
    public static final String OooO00o = "org.bouncycastle.pqc.jcajce.provider.rainbow.";

    /* renamed from: com.pd.sdk.ll丨IILl$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r15) {
            r15.addAlgorithm("KeyFactory.Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi");
            r15.addAlgorithm("KeyPairGenerator.Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi");
            OooO00o(r15, "SHA224", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha224", L1iiiiI.OooO0OO);
            OooO00o(r15, "SHA256", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha256", L1iiiiI.OooO0Oo);
            OooO00o(r15, "SHA384", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha384", L1iiiiI.OooO0o0);
            OooO00o(r15, "SHA512", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha512", L1iiiiI.OooO0o);
            OooO00o(r15, L1iiiiI.OooO00o, "Rainbow", new C6811l1());
        }
    }
}
