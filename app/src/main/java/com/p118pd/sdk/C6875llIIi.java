package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey;

/* renamed from: com.pd.sdk.l丨lIIi  reason: invalid class name and case insensitive filesystem */
public class C6875llIIi extends KeyPairGenerator {
    public static final BigInteger OooO00o = BigInteger.valueOf(65537);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6244iiLI f18963OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6410ilLiIL f18964OooO00o;

    public C6875llIIi() {
        super(C7491o0OoOOO.OooO00o);
        this.f18964OooO00o = new C6410ilLiIL();
        C6244iiLI iili = new C6244iiLI(OooO00o, IIllii.OooO00o(), 2048, C5746LilliL.OooO00o(2048));
        this.f18963OooO00o = iili;
        this.f18964OooO00o.OooO00o(iili);
    }

    public C6875llIIi(String str) {
        super(str);
    }

    public KeyPair generateKeyPair() {
        i1LLl1L OooO00o2 = this.f18964OooO00o.OooO00o();
        return new KeyPair(new BCRSAPublicKey((liLI1l1i) OooO00o2.OooO0O0()), new BCRSAPrivateCrtKey((C11lI) OooO00o2.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        C6244iiLI iili = new C6244iiLI(OooO00o, secureRandom, i, C5746LilliL.OooO00o(i));
        this.f18963OooO00o = iili;
        this.f18964OooO00o.OooO00o(iili);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof RSAKeyGenParameterSpec) {
            RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
            C6244iiLI iili = new C6244iiLI(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), C5746LilliL.OooO00o(2048));
            this.f18963OooO00o = iili;
            this.f18964OooO00o.OooO00o(iili);
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
    }
}
