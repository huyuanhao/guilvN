package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LL丨  reason: invalid class name */
public class LL extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6804llL1ii f16520OooO00o;

    public LL(I11li1 i11li1) {
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        this.f16520OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1));
    }

    public LL(C6456l1ilL r1, byte[] bArr) {
        this.OooO00o = r1;
        this.f16520OooO00o = new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
    }

    public static LL OooO00o(Object obj) {
        if (obj instanceof LL) {
            return (LL) obj;
        }
        if (obj != null) {
            return new LL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16253OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f16520OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f16520OooO00o);
        return new C5707LiL1(r0);
    }
}
