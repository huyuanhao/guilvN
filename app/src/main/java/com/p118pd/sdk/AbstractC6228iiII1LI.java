package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.iiII丨1LI  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6228iiII1LI extends liiLII {
    public int OooO00o = 1024;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17843OooO00o;

    public AlgorithmParameters engineGenerateParameters() {
        C6864lil r0 = new C6864lil();
        SecureRandom secureRandom = this.f17843OooO00o;
        if (secureRandom != null) {
            r0.OooO00o(this.OooO00o, 2, secureRandom);
        } else {
            r0.OooO00o(this.OooO00o, 2, IIllii.OooO00o());
        }
        Ii1lIl OooO00o2 = r0.OooO00o();
        try {
            AlgorithmParameters OooO00o3 = OooO00o("GOST3410");
            OooO00o3.init(new lLi1lILl(new C9683lIi(OooO00o2.OooO0O0(), OooO00o2.OooO0OO(), OooO00o2.m15559OooO00o())));
            return OooO00o3;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.f17843OooO00o = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for GOST3410 parameter generation.");
    }
}
