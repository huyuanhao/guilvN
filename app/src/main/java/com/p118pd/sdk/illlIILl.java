package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey;

/* renamed from: com.pd.sdk.illlIILl */
public class illlIILl extends KeyPairGenerator {
    public III1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Lil1IIl f18078OooO00o = new Lil1IIl();

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f18079OooO00o = AbstractC5905LllI.OooO0oo;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18080OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18081OooO00o = false;

    public illlIILl() {
        super("SPHINCS256");
    }

    public KeyPair generateKeyPair() {
        if (!this.f18081OooO00o) {
            III1 r0 = new III1(this.f18080OooO00o, new I1llii(256));
            this.OooO00o = r0;
            this.f18078OooO00o.OooO00o(r0);
            this.f18081OooO00o = true;
        }
        i1LLl1L OooO00o2 = this.f18078OooO00o.OooO00o();
        return new KeyPair(new BCSphincs256PublicKey(this.f18079OooO00o, (iII111) OooO00o2.OooO0O0()), new BCSphincs256PrivateKey(this.f18079OooO00o, (IilIilI) OooO00o2.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        III1 r3;
        if (algorithmParameterSpec instanceof C6229iiIL) {
            C6229iiIL iiil = (C6229iiIL) algorithmParameterSpec;
            if (iiil.OooO00o().equals(C6229iiIL.OooO0O0)) {
                this.f18079OooO00o = AbstractC5905LllI.OooO0oo;
                r3 = new III1(secureRandom, new I1llii(256));
            } else {
                if (iiil.OooO00o().equals(C6229iiIL.OooO0OO)) {
                    this.f18079OooO00o = AbstractC5905LllI.OooOO0;
                    r3 = new III1(secureRandom, new C6249iiLi(256));
                }
                this.f18078OooO00o.OooO00o(this.OooO00o);
                this.f18081OooO00o = true;
                return;
            }
            this.OooO00o = r3;
            this.f18078OooO00o.OooO00o(this.OooO00o);
            this.f18081OooO00o = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a SPHINCS256KeyGenParameterSpec");
    }
}
