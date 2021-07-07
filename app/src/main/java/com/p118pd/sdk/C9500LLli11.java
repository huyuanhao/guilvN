package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey;

/* renamed from: com.pd.sdk.丨LLli11  reason: invalid class name and case insensitive filesystem */
public class C9500LLli11 extends KeyPairGenerator {
    public int OooO00o = 1024;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lLi1lILl f23063OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ll11l1l f23064OooO00o = new ll11l1l();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9475LI1il f23065OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23066OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23067OooO00o = false;

    public C9500LLli11() {
        super("GOST3410");
    }

    private void OooO00o(lLi1lILl lli1lill, SecureRandom secureRandom) {
        C9683lIi OooO00o2 = lli1lill.OooO00o();
        C9475LI1il r1 = new C9475LI1il(secureRandom, new Ii1lIl(OooO00o2.OooO0O0(), OooO00o2.OooO0OO(), OooO00o2.OooO00o()));
        this.f23065OooO00o = r1;
        this.f23064OooO00o.OooO00o(r1);
        this.f23067OooO00o = true;
        this.f23063OooO00o = lli1lill;
    }

    public KeyPair generateKeyPair() {
        if (!this.f23067OooO00o) {
            OooO00o(new lLi1lILl(AbstractC5331ILi.OooOOo0.m16387OooO0O0()), IIllii.OooO00o());
        }
        i1LLl1L OooO00o2 = this.f23064OooO00o.OooO00o();
        return new KeyPair(new BCGOST3410PublicKey((C5201IIL) OooO00o2.OooO0O0(), this.f23063OooO00o), new BCGOST3410PrivateKey((C6463l1lI) OooO00o2.OooO00o(), this.f23063OooO00o));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.f23066OooO00o = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof lLi1lILl) {
            OooO00o((lLi1lILl) algorithmParameterSpec, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
    }
}
