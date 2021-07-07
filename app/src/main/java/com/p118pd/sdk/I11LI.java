package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1丨丨1LI  reason: invalid class name */
public class I11LI extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15429OooO00o;

    public I11LI(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
            this.f15429OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o();
            return;
        }
        throw new IllegalArgumentException("size of seq = " + i11li1.size());
    }

    public I11LI(byte[] bArr) {
        this.OooO00o = new C6513lIiI(0);
        this.f15429OooO00o = bArr;
    }

    public static I11LI OooO00o(Object obj) {
        if (obj instanceof I11LI) {
            return (I11LI) obj;
        }
        if (obj != null) {
            return new I11LI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f15429OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C6487lIIiIlL(this.f15429OooO00o));
        return new C5707LiL1(r0);
    }
}
