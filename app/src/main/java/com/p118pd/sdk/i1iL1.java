package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1iL1 */
public class i1iL1 extends AbstractC5738Lil {
    public final I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6518lIlIl f17409OooO00o;

    public i1iL1(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.f17409OooO00o = C6518lIlIl.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public i1iL1(C6518lIlIl lilil, I11li1 i11li1) {
        this.f17409OooO00o = lilil;
        this.OooO00o = i11li1;
    }

    public static i1iL1 OooO00o(Object obj) {
        if (obj instanceof i1iL1) {
            return (i1iL1) obj;
        }
        if (obj != null) {
            return new i1iL1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6518lIlIl OooO00o() {
        return this.f17409OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6518lIlIl[] m16888OooO00o() {
        C6518lIlIl[] lililArr = new C6518lIlIl[this.OooO00o.size()];
        for (int i = 0; i != this.OooO00o.size(); i++) {
            lililArr[i] = C6518lIlIl.OooO00o(this.OooO00o.OooO00o(i));
        }
        return lililArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17409OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
