package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.l1丨LLI1  reason: invalid class name */
public class l1LLI1 extends LlIIili {
    public AbstractC5649LIlI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f18309OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6827lIIi1I1 f18310OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18311OooO00o;

    public l1LLI1(C6827lIIi1I1 r3, C6213iL11I r4) {
        boolean z;
        if (r3 == null) {
            throw new IllegalArgumentException("'certificate' cannot be null");
        } else if (r3.m17955OooO00o()) {
            throw new IllegalArgumentException("'certificate' cannot be empty");
        } else if (r4 == null) {
            throw new IllegalArgumentException("'privateKey' cannot be null");
        } else if (r4.OooO00o()) {
            if (r4 instanceof C6389ii) {
                this.OooO00o = new C5629LIiLlLil();
                z = true;
            } else if (r4 instanceof C6512lIilLl) {
                this.OooO00o = new C5822L1();
                z = false;
            } else {
                throw new IllegalArgumentException("'privateKey' type not supported: " + r4.getClass().getName());
            }
            this.f18311OooO00o = z;
            this.f18310OooO00o = r3;
            this.f18309OooO00o = r4;
        } else {
            throw new IllegalArgumentException("'privateKey' must be private");
        }
    }

    @Override // com.p118pd.sdk.ll1iiLI
    public C6827lIIi1I1 OooO00o() {
        return this.f18310OooO00o;
    }

    @Override // com.p118pd.sdk.I1ILILI
    public byte[] OooO00o(C6213iL11I r3) {
        this.OooO00o.m16162OooO00o((AbstractC6370iIIIl) this.f18309OooO00o);
        BigInteger OooO00o2 = this.OooO00o.OooO00o((AbstractC6370iIIIl) r3);
        return this.f18311OooO00o ? IIiL.OooO00o(OooO00o2) : IIiL.OooO00o(this.OooO00o.OooO00o(), OooO00o2);
    }
}
