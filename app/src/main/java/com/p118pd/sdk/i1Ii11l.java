package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨1Ii11l  reason: invalid class name */
public class i1Ii11l extends AbstractC5738Lil {
    public AbstractC6804llL1ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C93041iI1l f18127OooO00o;

    public i1Ii11l(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.f18127OooO00o = C93041iI1l.OooO00o(i11li1.OooO00o(1));
        }
    }

    public i1Ii11l(byte[] bArr) {
        this.OooO00o = new C6487lIIiIlL(bArr);
    }

    public i1Ii11l(byte[] bArr, C93041iI1l r3) {
        this.OooO00o = new C6487lIIiIlL(bArr);
        this.f18127OooO00o = r3;
    }

    public static i1Ii11l OooO00o(Object obj) {
        if (obj instanceof i1Ii11l) {
            return (i1Ii11l) obj;
        }
        if (obj != null) {
            return new i1Ii11l(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C93041iI1l OooO00o() {
        return this.f18127OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17447OooO00o() {
        return this.OooO00o.m17938OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        C93041iI1l r1 = this.f18127OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
