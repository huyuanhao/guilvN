package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LI1 */
public class LI1 extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16255OooO00o;
    public final C6456l1ilL OooO0O0;

    public LI1(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
            this.OooO0O0 = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            this.f16255OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(2)).m17938OooO00o());
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public LI1(C6456l1ilL r1, C6456l1ilL r2, byte[] bArr) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
        this.f16255OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static LI1 OooO00o(Object obj) {
        if (obj instanceof LI1) {
            return (LI1) obj;
        }
        if (obj != null) {
            return new LI1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16008OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f16255OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(new C6487lIIiIlL(m16008OooO00o()));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m16009OooO0O0() {
        return this.OooO0O0;
    }
}
