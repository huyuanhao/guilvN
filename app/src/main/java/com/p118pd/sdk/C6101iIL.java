package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iIL丨  reason: invalid class name and case insensitive filesystem */
public class C6101iIL extends AbstractC5738Lil {
    public final C9623il OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f17534OooO00o;

    public C6101iIL(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.f17534OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0)).m17938OooO00o());
            this.OooO00o = C9623il.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C6101iIL(byte[] bArr, C9623il r2) {
        this.f17534OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO00o = r2;
    }

    public static C6101iIL OooO00o(Object obj) {
        if (obj instanceof C6101iIL) {
            return (C6101iIL) obj;
        }
        if (obj != null) {
            return new C6101iIL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9623il OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16964OooO00o() {
        return this.f17534OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6487lIIiIlL(this.f17534OooO00o));
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
