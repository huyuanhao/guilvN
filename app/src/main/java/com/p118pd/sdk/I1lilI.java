package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;

/* renamed from: com.pd.sdk.丨I1lilI  reason: invalid class name */
public class I1lilI extends liiLII {
    public int OooO00o = 2048;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IiLiII f22881OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f22882OooO00o;

    public AlgorithmParameters engineGenerateParameters() {
        C6891l r0 = this.OooO00o <= 1024 ? new C6891l() : new C6891l(new I1li1Ll());
        if (this.f22882OooO00o == null) {
            this.f22882OooO00o = IIllii.OooO00o();
        }
        int OooO00o2 = C5746LilliL.OooO00o(this.OooO00o);
        int i = this.OooO00o;
        if (i == 1024) {
            IiLiII r3 = new IiLiII(1024, 160, OooO00o2, this.f22882OooO00o);
            this.f22881OooO00o = r3;
            r0.OooO00o(r3);
        } else if (i > 1024) {
            IiLiII r1 = new IiLiII(i, 256, OooO00o2, this.f22882OooO00o);
            this.f22881OooO00o = r1;
            r0.OooO00o(r1);
        } else {
            r0.OooO00o(i, OooO00o2, this.f22882OooO00o);
        }
        L1llLl1 OooO00o3 = r0.OooO00o();
        try {
            AlgorithmParameters OooO00o4 = OooO00o("DSA");
            OooO00o4.init(new DSAParameterSpec(OooO00o3.OooO0O0(), OooO00o3.OooO0OO(), OooO00o3.m15991OooO00o()));
            return OooO00o4;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 3072) {
            throw new InvalidParameterException("strength must be from 512 - 3072");
        } else if (i <= 1024 && i % 64 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        } else if (i <= 1024 || i % 1024 == 0) {
            this.OooO00o = i;
            this.f22882OooO00o = secureRandom;
        } else {
            throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
