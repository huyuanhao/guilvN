package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IilL1  reason: case insensitive filesystem */
public class C5384IilL1 {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.asymmetric.ecgost.";
    public static final String OooO0O0 = "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.";

    /* renamed from: com.pd.sdk.IilL1$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r11) {
            r11.addAlgorithm("KeyFactory.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi");
            r11.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
            r11.addAlgorithm("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
            OooO00o(r11, AbstractC5331ILi.OooOOO0, "ECGOST3410", new C6565lL1l());
            OooO00o(r11, AbstractC5331ILi.Oooo000, "ECGOST3410", new C6565lL1l());
            OooO0O0(r11, AbstractC5331ILi.OooOOO0, "ECGOST3410");
            r11.addAlgorithm("KeyPairGenerator.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi");
            r11.addAlgorithm("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
            r11.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
            r11.addAlgorithm("Signature.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi");
            r11.addAlgorithm("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
            r11.addAlgorithm("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
            r11.addAlgorithm("KeyAgreement.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi$ECVKO");
            r11.addAlgorithm("Alg.Alias.KeyAgreement." + AbstractC5331ILi.OooOOO0, "ECGOST3410");
            r11.addAlgorithm("Alg.Alias.KeyAgreement.GOST-3410-2001", "ECGOST3410");
            r11.addAlgorithm("Alg.Alias.KeyAgreement." + AbstractC5331ILi.OooOooo, "ECGOST3410");
            r11.addAlgorithm("AlgorithmParameters.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.AlgorithmParametersSpi");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameters.GOST-3410-2001", "ECGOST3410");
            OooO00o(r11, "GOST3411", "ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi", AbstractC5331ILi.OooOOOO);
            r11.addAlgorithm("KeyFactory.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi");
            r11.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410-2012", "ECGOST3410-2012");
            r11.addAlgorithm("Alg.Alias.KeyFactory.ECGOST-3410-2012", "ECGOST3410-2012");
            OooO00o(r11, LLiII.OooO0oO, "ECGOST3410-2012", new C6364i1Ii1());
            OooO00o(r11, LLiII.OooOO0o, "ECGOST3410-2012", new C6364i1Ii1());
            OooO0O0(r11, LLiII.OooO0oO, "ECGOST3410-2012");
            OooO00o(r11, LLiII.OooO0oo, "ECGOST3410-2012", new C6364i1Ii1());
            OooO00o(r11, LLiII.OooOOO0, "ECGOST3410-2012", new C6364i1Ii1());
            OooO0O0(r11, LLiII.OooO0oo, "ECGOST3410-2012");
            r11.addAlgorithm("KeyPairGenerator.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyPairGeneratorSpi");
            r11.addAlgorithm("Alg.Alias.KeyPairGenerator.ECGOST3410-2012", "ECGOST3410-2012");
            r11.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410-2012", "ECGOST3410-2012");
            r11.addAlgorithm("Signature.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256");
            r11.addAlgorithm("Alg.Alias.Signature.ECGOST3410-2012-256", "ECGOST3410-2012-256");
            r11.addAlgorithm("Alg.Alias.Signature.GOST-3410-2012-256", "ECGOST3410-2012-256");
            OooO00o(r11, "GOST3411-2012-256", "ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256", LLiII.OooO);
            r11.addAlgorithm("Signature.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512");
            r11.addAlgorithm("Alg.Alias.Signature.ECGOST3410-2012-512", "ECGOST3410-2012-512");
            r11.addAlgorithm("Alg.Alias.Signature.GOST-3410-2012-512", "ECGOST3410-2012-512");
            OooO00o(r11, "GOST3411-2012-512", "ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512", LLiII.OooOO0);
            r11.addAlgorithm("KeyAgreement.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO256");
            r11.addAlgorithm("KeyAgreement.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO512");
            r11.addAlgorithm("Alg.Alias.KeyAgreement." + LLiII.OooOO0o, "ECGOST3410-2012-256");
            r11.addAlgorithm("Alg.Alias.KeyAgreement." + LLiII.OooOOO0, "ECGOST3410-2012-512");
            r11.addAlgorithm("Alg.Alias.KeyAgreement." + LLiII.OooO0oO, "ECGOST3410-2012-256");
            r11.addAlgorithm("Alg.Alias.KeyAgreement." + LLiII.OooO0oo, "ECGOST3410-2012-512");
        }
    }
}
