package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey;

/* renamed from: com.pd.sdk.L丨1丨1I  reason: invalid class name and case insensitive filesystem */
public class C5840L11I extends KeyPairGenerator {
    public int OooO00o = 1024;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IL1lLLI f16804OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6711liIll f16805OooO00o = new C6711liIll();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16806OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16807OooO00o = false;

    public C5840L11I() {
        super("Rainbow");
    }

    public KeyPair generateKeyPair() {
        if (!this.f16807OooO00o) {
            IL1lLLI r0 = new IL1lLLI(this.f16806OooO00o, new C6216iLLL1(new C97471().m21885OooO00o()));
            this.f16804OooO00o = r0;
            this.f16805OooO00o.OooO00o(r0);
            this.f16807OooO00o = true;
        }
        i1LLl1L OooO00o2 = this.f16805OooO00o.m17809OooO00o();
        return new KeyPair(new BCRainbowPublicKey((C6195iLllLLIi) OooO00o2.OooO0O0()), new BCRainbowPrivateKey((iiLIiL) OooO00o2.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.f16806OooO00o = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof C97471) {
            IL1lLLI r0 = new IL1lLLI(secureRandom, new C6216iLLL1(((C97471) algorithmParameterSpec).m21885OooO00o()));
            this.f16804OooO00o = r0;
            this.f16805OooO00o.OooO00o(r0);
            this.f16807OooO00o = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a RainbowParameterSpec");
    }
}
