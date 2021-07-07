package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL1  reason: case insensitive filesystem */
public class C6147iL1 extends AbstractC5738Lil {
    public IIiLIli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6804llL1ii f17651OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9738llL1L f17652OooO00o;

    public C6147iL1(IIiLIli r1, AbstractC6804llL1ii r2) {
        this(r1, r2.m17938OooO00o());
    }

    public C6147iL1(IIiLIli r1, byte[] bArr) {
        this.OooO00o = r1;
        this.f17651OooO00o = new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
    }

    public C6147iL1(AbstractC9738llL1L r2) {
        this(r2, false);
    }

    public C6147iL1(AbstractC9738llL1L r2, boolean z) {
        this.f17652OooO00o = r2.OooO0Oo();
        this.f17651OooO00o = new C6487lIIiIlL(r2.m21808OooO00o(z));
    }

    public synchronized AbstractC9738llL1L OooO00o() {
        if (this.f17652OooO00o == null) {
            this.f17652OooO00o = this.OooO00o.OooO00o(this.f17651OooO00o.m17938OooO00o()).OooO0Oo();
        }
        return this.f17652OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17047OooO00o() {
        byte[] OooO00o2 = this.f17651OooO00o.m17938OooO00o();
        if (OooO00o2 == null || OooO00o2.length <= 0) {
            return false;
        }
        return OooO00o2[0] == 2 || OooO00o2[0] == 3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17048OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17651OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.f17651OooO00o;
    }
}
