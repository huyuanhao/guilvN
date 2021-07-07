package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPublicKey;

/* renamed from: com.pd.sdk.lLl丨lli  reason: invalid class name and case insensitive filesystem */
public class C6623lLllli extends KeyPairGenerator {
    public LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9589iIi f18556OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9699li1LL f18557OooO00o = new C9699li1LL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18558OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18559OooO00o = false;

    public C6623lLllli() {
        super("XMSS");
    }

    public KeyPair generateKeyPair() {
        if (!this.f18559OooO00o) {
            C9589iIi r0 = new C9589iIi(new C9341I1iilI1(10, new C5622LILlL()), this.f18558OooO00o);
            this.f18556OooO00o = r0;
            this.f18557OooO00o.OooO00o(r0);
            this.f18559OooO00o = true;
        }
        i1LLl1L OooO00o2 = this.f18557OooO00o.OooO00o();
        return new KeyPair(new BCXMSSPublicKey(this.OooO00o, (C6394iiIlI) OooO00o2.OooO0O0()), new BCXMSSPrivateKey(this.OooO00o, (C5844LI1L) OooO00o2.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        C9589iIi r0;
        if (algorithmParameterSpec instanceof C9364ILIl) {
            C9364ILIl r5 = (C9364ILIl) algorithmParameterSpec;
            if (r5.m21430OooO00o().equals("SHA256")) {
                this.OooO00o = AbstractC5905LllI.OooO0OO;
                r0 = new C9589iIi(new C9341I1iilI1(r5.OooO00o(), new I1li1Ll()), secureRandom);
            } else if (r5.m21430OooO00o().equals("SHA512")) {
                this.OooO00o = AbstractC5905LllI.OooO0o0;
                r0 = new C9589iIi(new C9341I1iilI1(r5.OooO00o(), new C5622LILlL()), secureRandom);
            } else if (r5.m21430OooO00o().equals("SHAKE128")) {
                this.OooO00o = AbstractC5905LllI.OooOOO0;
                r0 = new C9589iIi(new C9341I1iilI1(r5.OooO00o(), new C6423iIii(128)), secureRandom);
            } else {
                if (r5.m21430OooO00o().equals("SHAKE256")) {
                    this.OooO00o = AbstractC5905LllI.OooOOO;
                    r0 = new C9589iIi(new C9341I1iilI1(r5.OooO00o(), new C6423iIii(256)), secureRandom);
                }
                this.f18557OooO00o.OooO00o(this.f18556OooO00o);
                this.f18559OooO00o = true;
                return;
            }
            this.f18556OooO00o = r0;
            this.f18557OooO00o.OooO00o(this.f18556OooO00o);
            this.f18559OooO00o = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a XMSSParameterSpec");
    }
}
