package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1LilL */
public class I1LilL extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15350OooO00o;
    public AbstractC6804llL1ii OooO0O0;

    public I1LilL(I11li1 i11li1) {
        int i = 0;
        if (i11li1.size() == 3) {
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
            i = 1;
        }
        this.f15350OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(i));
        this.OooO0O0 = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(i + 1));
    }

    public I1LilL(C6456l1ilL r1, byte[] bArr, byte[] bArr2) {
        this.OooO00o = r1;
        this.f15350OooO00o = new C6487lIIiIlL(bArr);
        this.OooO0O0 = new C6487lIIiIlL(bArr2);
    }

    public I1LilL(byte[] bArr, byte[] bArr2) {
        this(null, bArr, bArr2);
    }

    public static I1LilL OooO00o(Object obj) {
        if (obj instanceof I1LilL) {
            return (I1LilL) obj;
        }
        if (obj != null) {
            return new I1LilL(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r1, AbstractC6854lLi1LL r2) {
        if (r2 != null) {
            r1.OooO00o(r2);
        }
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15283OooO00o() {
        return this.OooO0O0.m17938OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        OooO00o(r0, this.OooO00o);
        r0.OooO00o(this.f15350OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m15284OooO0O0() {
        return this.f15350OooO00o.m17938OooO00o();
    }
}
