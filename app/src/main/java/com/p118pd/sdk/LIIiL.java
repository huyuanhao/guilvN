package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIIiL */
public class LIIiL extends AbstractC5738Lil {
    public final IIllLll1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6804llL1ii f16289OooO00o;

    public LIIiL(I11li1 i11li1) {
        AbstractC6854lLi1LL OooO00o2;
        if (i11li1.size() == 1) {
            this.OooO00o = null;
            OooO00o2 = i11li1.OooO00o(0);
        } else if (i11li1.size() == 2) {
            this.OooO00o = IIllLll1.OooO00o(i11li1.OooO00o(0));
            OooO00o2 = i11li1.OooO00o(1);
        } else {
            throw new IllegalArgumentException("sequence wrong length for DhSigStatic");
        }
        this.f16289OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2);
    }

    public LIIiL(IIllLll1 iIllLll1, byte[] bArr) {
        this.OooO00o = iIllLll1;
        this.f16289OooO00o = new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
    }

    public LIIiL(byte[] bArr) {
        this(null, bArr);
    }

    public static LIIiL OooO00o(Object obj) {
        if (obj instanceof LIIiL) {
            return (LIIiL) obj;
        }
        if (obj != null) {
            return new LIIiL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public IIllLll1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16031OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f16289OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        IIllLll1 iIllLll1 = this.OooO00o;
        if (iIllLll1 != null) {
            r0.OooO00o(iIllLll1);
        }
        r0.OooO00o(this.f16289OooO00o);
        return new C5707LiL1(r0);
    }
}
