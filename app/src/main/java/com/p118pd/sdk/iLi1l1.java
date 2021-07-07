package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey;

/* renamed from: com.pd.sdk.iLi1l1 */
public class iLi1l1 extends KeyPairGenerator {
    public iL111lI OooO00o = new iL111lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17749OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17750OooO00o = false;

    public iLi1l1() {
        super("NH");
    }

    public KeyPair generateKeyPair() {
        if (!this.f17750OooO00o) {
            this.OooO00o.OooO00o(new C6470l1i(this.f17749OooO00o, 1024));
            this.f17750OooO00o = true;
        }
        i1LLl1L OooO00o2 = this.OooO00o.OooO00o();
        return new KeyPair(new BCNHPublicKey((IL1IILIl) OooO00o2.OooO0O0()), new BCNHPrivateKey((LiL1L) OooO00o2.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        if (i == 1024) {
            this.OooO00o.OooO00o(new C6470l1i(secureRandom, 1024));
            this.f17750OooO00o = true;
            return;
        }
        throw new IllegalArgumentException("strength must be 1024 bits");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("parameter object not recognised");
    }
}
