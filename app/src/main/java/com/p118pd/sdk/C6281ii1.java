package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ii丨1  reason: invalid class name and case insensitive filesystem */
public class C6281ii1 extends AbstractC5738Lil {
    public final I11li1 OooO00o;

    public C6281ii1(I11li1 i11li1) {
        if (i11li1.size() == 1) {
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(0));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C6281ii1(C5668LLil r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public C6281ii1(C5668LLil[] r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static C6281ii1 OooO00o(Object obj) {
        if (obj instanceof C6281ii1) {
            return (C6281ii1) obj;
        }
        if (obj != null) {
            return new C6281ii1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5668LLil[] OooO00o() {
        C5668LLil[] r0 = new C5668LLil[this.OooO00o.size()];
        for (int i = 0; i != this.OooO00o.size(); i++) {
            r0[i] = C5668LLil.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }
}
