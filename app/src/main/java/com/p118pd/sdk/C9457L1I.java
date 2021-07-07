package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨L1I  reason: invalid class name and case insensitive filesystem */
public class C9457L1I extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23011OooO00o;

    public C9457L1I(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
            this.f23011OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o();
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C9457L1I(C6456l1ilL r3, byte[] bArr) {
        this.OooO00o = r3;
        byte[] bArr2 = new byte[bArr.length];
        this.f23011OooO00o = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public static C9457L1I OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9457L1I)) {
            return (C9457L1I) obj;
        }
        if (obj instanceof I11li1) {
            return new C9457L1I((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21506OooO00o() {
        return this.f23011OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C6487lIIiIlL(this.f23011OooO00o));
        return new C5707LiL1(r0);
    }
}
