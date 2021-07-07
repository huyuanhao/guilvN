package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey;

/* renamed from: com.pd.sdk.L丨Il  reason: invalid class name and case insensitive filesystem */
public class C5846LIl extends KeyPairGenerator {
    public iliiLi OooO00o;

    public C5846LIl() {
        super("McEliece-CCA2");
    }

    public KeyPair generateKeyPair() {
        i1LLl1L OooO00o2 = this.OooO00o.m17386OooO00o();
        return new KeyPair(new BCMcElieceCCA2PublicKey((C93221) OooO00o2.OooO0O0()), new BCMcElieceCCA2PrivateKey((C9844iLi) OooO00o2.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.OooO00o = new iliiLi();
        this.OooO00o.OooO00o(new C5197IIIi(secureRandom, new C9382Iii()));
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        this.OooO00o = new iliiLi();
        super.initialize(algorithmParameterSpec);
        LL1i r6 = (LL1i) algorithmParameterSpec;
        this.OooO00o.OooO00o(new C5197IIIi(IIllii.OooO00o(), new C9382Iii(r6.OooO0O0(), r6.OooO0Oo(), r6.m16187OooO00o())));
    }
}
