package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey;

/* renamed from: com.pd.sdk.lli1ilL */
public class lli1ilL extends KeyPairGenerator {
    public C9556Lil1 OooO00o;

    public lli1ilL() {
        super("McEliece");
    }

    public KeyPair generateKeyPair() {
        i1LLl1L OooO00o2 = this.OooO00o.m21609OooO00o();
        return new KeyPair(new BCMcEliecePublicKey((i1iILI) OooO00o2.OooO0O0()), new BCMcEliecePrivateKey((LIi1L1) OooO00o2.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        try {
            initialize(new C6705lillI());
        } catch (InvalidAlgorithmParameterException unused) {
        }
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        this.OooO00o = new C9556Lil1();
        super.initialize(algorithmParameterSpec);
        C6705lillI r5 = (C6705lillI) algorithmParameterSpec;
        this.OooO00o.OooO00o(new ILL11(IIllii.OooO00o(), new C9383Iiill(r5.OooO0O0(), r5.OooO0Oo())));
    }
}
