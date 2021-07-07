package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨IiIi  reason: invalid class name and case insensitive filesystem */
public class C9375IiIi extends AbstractC5738Lil {
    public final I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6360i1i f22922OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f22923OooO00o;

    public C9375IiIi(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.f22923OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
            this.f22922OooO00o = C6360i1i.OooO00o(i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C9375IiIi(C6456l1ilL r4, byte[][] bArr, C6360i1i r6) {
        this.f22923OooO00o = r4;
        iILLL1 r42 = new iILLL1();
        for (int i = 0; i != bArr.length; i++) {
            r42.OooO00o(new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr[i])));
        }
        this.OooO00o = new C5707LiL1(r42);
        this.f22922OooO00o = r6;
    }

    public static C9375IiIi OooO00o(Object obj) {
        if (obj instanceof C9375IiIi) {
            return (C9375IiIi) obj;
        }
        if (obj != null) {
            return new C9375IiIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6360i1i OooO00o() {
        return this.f22922OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21447OooO00o() {
        return this.f22923OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[][] m21448OooO00o() {
        int size = this.OooO00o.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i != size; i++) {
            bArr[i] = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(this.OooO00o.OooO00o(i)).m17938OooO00o());
        }
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f22923OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f22922OooO00o);
        return new C5707LiL1(r0);
    }
}
