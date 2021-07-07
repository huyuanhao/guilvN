package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1lil1 */
public class i1lil1 {
    public static final String OooO00o = "org.bouncycastle.pqc.jcajce.provider.xmss.";

    /* renamed from: com.pd.sdk.i1lil1$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r15) {
            r15.addAlgorithm("KeyFactory.XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi");
            r15.addAlgorithm("KeyPairGenerator.XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyPairGeneratorSpi");
            OooO00o(r15, "SHA256", "XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withSha256", AbstractC5701Li1l.OooOo);
            OooO00o(r15, "SHAKE128", "XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withShake128", AbstractC5701Li1l.OooOoO);
            OooO00o(r15, "SHA512", "XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withSha512", AbstractC5701Li1l.OooOoO0);
            OooO00o(r15, "SHAKE256", "XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withShake256", AbstractC5701Li1l.OooOoOO);
            r15.addAlgorithm("KeyFactory.XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi");
            r15.addAlgorithm("KeyPairGenerator.XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyPairGeneratorSpi");
            OooO00o(r15, "SHA256", "XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withSha256", AbstractC5701Li1l.OooOoo);
            OooO00o(r15, "SHAKE128", "XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withShake128", AbstractC5701Li1l.OooOooo);
            OooO00o(r15, "SHA512", "XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withSha512", AbstractC5701Li1l.OooOooO);
            OooO00o(r15, "SHAKE256", "XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withShake256", AbstractC5701Li1l.Oooo000);
            OooO00o(r15, L1iiiiI.OooOo0o, "XMSS", new i1L1LL());
            OooO00o(r15, L1iiiiI.OooOoo0, "XMSSMT", new C6441l1II1());
        }
    }
}
