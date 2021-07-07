package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

/* renamed from: com.pd.sdk.IL1ll  reason: case insensitive filesystem */
public class C5298IL1ll extends liiLII {
    public int OooO00o = 2048;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15560OooO00o;
    public int OooO0O0 = 0;

    public AlgorithmParameters engineGenerateParameters() {
        C6369iII r0 = new C6369iII();
        int OooO00o2 = C5746LilliL.OooO00o(this.OooO00o);
        SecureRandom secureRandom = this.f15560OooO00o;
        if (secureRandom != null) {
            r0.OooO00o(this.OooO00o, OooO00o2, secureRandom);
        } else {
            r0.OooO00o(this.OooO00o, OooO00o2, IIllii.OooO00o());
        }
        C6017i1Il OooO00o3 = r0.OooO00o();
        try {
            AlgorithmParameters OooO00o4 = OooO00o("DH");
            OooO00o4.init(new DHParameterSpec(OooO00o3.OooO0OO(), OooO00o3.m16863OooO00o(), this.OooO0O0));
            return OooO00o4;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.f15560OooO00o = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHGenParameterSpec) {
            DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
            this.OooO00o = dHGenParameterSpec.getPrimeSize();
            this.OooO0O0 = dHGenParameterSpec.getExponentSize();
            this.f15560OooO00o = secureRandom;
            return;
        }
        throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
    }
}
