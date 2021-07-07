package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Il1l */
public class Il1l {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.keystore.bc.";

    /* renamed from: com.pd.sdk.Il1l$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("KeyStore.BKS", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$Std");
            r3.addAlgorithm("KeyStore.BKS-V1", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$Version1");
            r3.addAlgorithm("KeyStore.BouncyCastle", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$BouncyCastleStore");
            r3.addAlgorithm("Alg.Alias.KeyStore.UBER", "BouncyCastle");
            r3.addAlgorithm("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
            r3.addAlgorithm("Alg.Alias.KeyStore.bouncycastle", "BouncyCastle");
        }
    }
}
