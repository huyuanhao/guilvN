package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ii丨丨LL  reason: invalid class name and case insensitive filesystem */
public class C6291iiLL extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6518lIlIl f17968OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f17969OooO00o;

    public C6291iiLL(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.f17968OooO00o = C6518lIlIl.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            this.f17969OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(2)).m17938OooO00o());
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C6291iiLL(C6518lIlIl lilil, C6456l1ilL r2, byte[] bArr) {
        this.f17968OooO00o = lilil;
        this.OooO00o = r2;
        this.f17969OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static C6291iiLL OooO00o(Object obj) {
        if (obj instanceof C6291iiLL) {
            return (C6291iiLL) obj;
        }
        if (obj != null) {
            return new C6291iiLL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6518lIlIl m17314OooO00o() {
        return this.f17968OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17315OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17969OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17968OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C6487lIIiIlL(this.f17969OooO00o));
        return new C5707LiL1(r0);
    }
}
