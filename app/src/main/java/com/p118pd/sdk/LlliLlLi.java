package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.X931SecureRandom;

/* renamed from: com.pd.sdk.LlliLlLi */
public class LlliLlLi {
    public AbstractC6380iLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16741OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16742OooO00o;

    public LlliLlLi() {
        this(IIllii.OooO00o(), false);
    }

    public LlliLlLi(AbstractC6380iLi r2) {
        this.f16741OooO00o = null;
        this.OooO00o = r2;
    }

    public LlliLlLi(SecureRandom secureRandom, boolean z) {
        this.f16741OooO00o = secureRandom;
        this.OooO00o = new lLILil(secureRandom, z);
    }

    public LlliLlLi OooO00o(byte[] bArr) {
        this.f16742OooO00o = bArr;
        return this;
    }

    public X931SecureRandom OooO00o(li1l11I1 li1l11i1, C6642li1LI r7, boolean z) {
        if (this.f16742OooO00o == null) {
            this.f16742OooO00o = new byte[li1l11i1.OooO00o()];
            AbstractC6464l1l.OooO00o(System.currentTimeMillis(), this.f16742OooO00o, 0);
        }
        li1l11i1.OooO00o(true, r7);
        return new X931SecureRandom(this.f16741OooO00o, new C5555IiIL(li1l11i1, this.f16742OooO00o, this.OooO00o.OooO00o(li1l11i1.OooO00o() * 8)), z);
    }
}
