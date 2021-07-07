package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LiiLIiIL */
public class LiiLIiIL extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16617OooO00o;
    public final byte[] OooO0O0;

    public LiiLIiIL(I11li1 i11li1) {
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() == 2) {
            this.f16617OooO00o = null;
            this.OooO0O0 = AbstractC6804llL1ii.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true).m17938OooO00o();
            return;
        }
        this.f16617OooO00o = AbstractC6804llL1ii.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true).m17938OooO00o();
        this.OooO0O0 = AbstractC6804llL1ii.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(2), true).m17938OooO00o();
    }

    public LiiLIiIL(C6456l1ilL r1, byte[] bArr) {
        this.OooO00o = r1;
        this.f16617OooO00o = null;
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr);
    }

    public LiiLIiIL(C6456l1ilL r1, byte[] bArr, byte[] bArr2) {
        this.OooO00o = r1;
        this.f16617OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
    }

    public static LiiLIiIL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static LiiLIiIL OooO00o(Object obj) {
        if (obj instanceof LiiLIiIL) {
            return (LiiLIiIL) obj;
        }
        if (obj != null) {
            return new LiiLIiIL(I11li1.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        if (this.f16617OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, new C6487lIIiIlL(this.f16617OooO00o)));
        }
        r0.OooO00o(new ILI1Ll(true, 2, new C6487lIIiIlL(this.OooO0O0)));
        return new C5707LiL1(r0);
    }
}
