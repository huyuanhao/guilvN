package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPublicKey;

/* renamed from: com.pd.sdk.丨l1丨丨i1  reason: invalid class name and case insensitive filesystem */
public class C9674l1i1 extends KeyPairGenerator {
    public LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6366iI1 f23279OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6619lLll f23280OooO00o = new C6619lLll();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23281OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23282OooO00o = false;

    public C9674l1i1() {
        super("XMSSMT");
    }

    public KeyPair generateKeyPair() {
        if (!this.f23282OooO00o) {
            C6366iI1 r0 = new C6366iI1(new C6454l1ii(10, 20, new C5622LILlL()), this.f23281OooO00o);
            this.f23279OooO00o = r0;
            this.f23280OooO00o.OooO00o(r0);
            this.f23282OooO00o = true;
        }
        i1LLl1L OooO00o2 = this.f23280OooO00o.OooO00o();
        return new KeyPair(new BCXMSSMTPublicKey(this.OooO00o, (C5736Liiil) OooO00o2.OooO0O0()), new BCXMSSMTPrivateKey(this.OooO00o, (C6643li1l) OooO00o2.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        C6366iI1 r0;
        if (algorithmParameterSpec instanceof IiiiLIL) {
            IiiiLIL r6 = (IiiiLIL) algorithmParameterSpec;
            if (r6.m15613OooO00o().equals("SHA256")) {
                this.OooO00o = AbstractC5905LllI.OooO0OO;
                r0 = new C6366iI1(new C6454l1ii(r6.OooO00o(), r6.OooO0O0(), new I1li1Ll()), secureRandom);
            } else if (r6.m15613OooO00o().equals("SHA512")) {
                this.OooO00o = AbstractC5905LllI.OooO0o0;
                r0 = new C6366iI1(new C6454l1ii(r6.OooO00o(), r6.OooO0O0(), new C5622LILlL()), secureRandom);
            } else if (r6.m15613OooO00o().equals("SHAKE128")) {
                this.OooO00o = AbstractC5905LllI.OooOOO0;
                r0 = new C6366iI1(new C6454l1ii(r6.OooO00o(), r6.OooO0O0(), new C6423iIii(128)), secureRandom);
            } else {
                if (r6.m15613OooO00o().equals("SHAKE256")) {
                    this.OooO00o = AbstractC5905LllI.OooOOO;
                    r0 = new C6366iI1(new C6454l1ii(r6.OooO00o(), r6.OooO0O0(), new C6423iIii(256)), secureRandom);
                }
                this.f23280OooO00o.OooO00o(this.f23279OooO00o);
                this.f23282OooO00o = true;
                return;
            }
            this.f23279OooO00o = r0;
            this.f23280OooO00o.OooO00o(this.f23279OooO00o);
            this.f23282OooO00o = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a XMSSMTParameterSpec");
    }
}
