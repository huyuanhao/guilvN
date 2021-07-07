package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.L1丨1llL丨  reason: invalid class name and case insensitive filesystem */
public class C5597L11llL extends KeyGeneratorSpi {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5706LiL f16234OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f16235OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16236OooO00o = true;
    public int OooO0O0;

    public C5597L11llL(String str, int i, C5706LiL liL) {
        this.f16235OooO00o = str;
        this.OooO0O0 = i;
        this.OooO00o = i;
        this.f16234OooO00o = liL;
    }

    public SecretKey engineGenerateKey() {
        if (this.f16236OooO00o) {
            this.f16234OooO00o.OooO00o(new C6470l1i(IIllii.OooO00o(), this.OooO0O0));
            this.f16236OooO00o = false;
        }
        return new SecretKeySpec(this.f16234OooO00o.OooO00o(), this.f16235OooO00o);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = IIllii.OooO00o();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.f16234OooO00o.OooO00o(new C6470l1i(secureRandom, i));
        this.f16236OooO00o = false;
    }

    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.f16234OooO00o.OooO00o(new C6470l1i(secureRandom, this.OooO0O0));
            this.f16236OooO00o = false;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
