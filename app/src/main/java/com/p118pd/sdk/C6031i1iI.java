package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1iI  reason: case insensitive filesystem */
public class C6031i1iI extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1684L f17395OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17396OooO00o;

    public C6031i1iI(I11li1 i11li1) {
        this.f17396OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        this.f17395OooO00o = C1684L.OooO00o(i11li1.OooO00o(1));
        if (i11li1.size() == 3) {
            this.OooO00o = I11L.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(2), false);
        }
    }

    public C6031i1iI(C1684L r2) {
        this(r2, null);
    }

    public C6031i1iI(C1684L r4, I11L i11l) {
        this.f17396OooO00o = new C6513lIiI(i11l == null ? 0 : 2);
        this.f17395OooO00o = r4;
        this.OooO00o = i11l;
    }

    public static C6031i1iI OooO00o(Object obj) {
        if (obj instanceof C6031i1iI) {
            return (C6031i1iI) obj;
        }
        if (obj != null) {
            return new C6031i1iI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1684L m16884OooO00o() {
        return this.f17395OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16885OooO00o() {
        return this.f17396OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17396OooO00o);
        r0.OooO00o(this.f17395OooO00o);
        I11L i11l = this.OooO00o;
        if (i11l != null) {
            r0.OooO00o(new C6881lliiI1(false, 1, i11l));
        }
        return new C6351ill(r0);
    }
}
