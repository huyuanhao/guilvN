package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lili  reason: case insensitive filesystem */
public class C6702lili extends AbstractC5738Lil {
    public final byte[] OooO00o;
    public final byte[] OooO0O0;
    public final byte[] OooO0OO;

    public C6702lili(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0)).m17938OooO00o());
            this.OooO0OO = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o());
            this.OooO0O0 = null;
        } else if (i11li1.size() == 3) {
            this.OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0)).m17938OooO00o());
            this.OooO0O0 = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1)), false).m17938OooO00o());
            this.OooO0OO = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(2)).m17938OooO00o());
        } else {
            throw new IllegalArgumentException("unknown sequence length: " + i11li1.size());
        }
    }

    public C6702lili(byte[] bArr, byte[] bArr2) {
        this(bArr, null, bArr2);
    }

    public C6702lili(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
        this.OooO0OO = C9586iIILl.m21630OooO00o(bArr3);
    }

    public static C6702lili OooO00o(Object obj) {
        if (obj instanceof C6702lili) {
            return (C6702lili) obj;
        }
        if (obj != null) {
            return new C6702lili(I11li1.OooO00o(obj));
        }
        return null;
    }

    public byte[] OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6487lIIiIlL(this.OooO00o));
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 0, new C6487lIIiIlL(this.OooO00o)));
        }
        r0.OooO00o(new C6487lIIiIlL(this.OooO0OO));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m17792OooO0O0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public byte[] OooO0OO() {
        return this.OooO0O0;
    }
}
