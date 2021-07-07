package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

/* renamed from: com.pd.sdk.丨liILi1i  reason: invalid class name */
public class liILi1i extends liiLII {
    public int OooO00o = 1024;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23334OooO00o;
    public int OooO0O0 = 0;

    public AlgorithmParameters engineGenerateParameters() {
        li1llIi r0 = new li1llIi();
        SecureRandom secureRandom = this.f23334OooO00o;
        if (secureRandom != null) {
            r0.OooO00o(this.OooO00o, 20, secureRandom);
        } else {
            r0.OooO00o(this.OooO00o, 20, IIllii.OooO00o());
        }
        C5312ILl OooO00o2 = r0.OooO00o();
        try {
            AlgorithmParameters OooO00o3 = OooO00o("ElGamal");
            OooO00o3.init(new DHParameterSpec(OooO00o2.OooO0O0(), OooO00o2.m15512OooO00o(), this.OooO0O0));
            return OooO00o3;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.f23334OooO00o = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHGenParameterSpec) {
            DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
            this.OooO00o = dHGenParameterSpec.getPrimeSize();
            this.OooO0O0 = dHGenParameterSpec.getExponentSize();
            this.f23334OooO00o = secureRandom;
            return;
        }
        throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
    }
}
