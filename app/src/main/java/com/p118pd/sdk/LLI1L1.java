package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.LLI丨1L丨1  reason: invalid class name */
public class LLI1L1 extends KeyPairGenerator {
    public int OooO00o = 1024;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5550IiIliI f16441OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public llIli11 f16442OooO00o = new llIli11();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16443OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16444OooO00o = false;
    public int OooO0O0 = 20;

    public LLI1L1() {
        super("ElGamal");
    }

    public KeyPair generateKeyPair() {
        C5550IiIliI r1;
        if (!this.f16444OooO00o) {
            DHParameterSpec OooO00o2 = BouncyCastleProvider.CONFIGURATION.m21534OooO00o(this.OooO00o);
            if (OooO00o2 != null) {
                r1 = new C5550IiIliI(this.f16443OooO00o, new C5312ILl(OooO00o2.getP(), OooO00o2.getG(), OooO00o2.getL()));
            } else {
                li1llIi r0 = new li1llIi();
                r0.OooO00o(this.OooO00o, this.OooO0O0, this.f16443OooO00o);
                r1 = new C5550IiIliI(this.f16443OooO00o, r0.OooO00o());
            }
            this.f16441OooO00o = r1;
            this.f16442OooO00o.OooO00o(this.f16441OooO00o);
            this.f16444OooO00o = true;
        }
        i1LLl1L OooO00o3 = this.f16442OooO00o.OooO00o();
        return new KeyPair(new BCElGamalPublicKey((i1I1L) OooO00o3.OooO0O0()), new BCElGamalPrivateKey((C6336illiIil) OooO00o3.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.f16443OooO00o = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        C5550IiIliI r0;
        boolean z = algorithmParameterSpec instanceof C6791lllI;
        if (z || (algorithmParameterSpec instanceof DHParameterSpec)) {
            if (z) {
                C6791lllI llli = (C6791lllI) algorithmParameterSpec;
                r0 = new C5550IiIliI(secureRandom, new C5312ILl(llli.OooO0O0(), llli.OooO00o()));
            } else {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                r0 = new C5550IiIliI(secureRandom, new C5312ILl(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
            }
            this.f16441OooO00o = r0;
            this.f16442OooO00o.OooO00o(this.f16441OooO00o);
            this.f16444OooO00o = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
    }
}
