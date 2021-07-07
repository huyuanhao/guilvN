package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ilI丨L丨I  reason: invalid class name and case insensitive filesystem */
public class C6311ilILI extends AbstractC5738Lil {
    public final C6888ll OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18007OooO00o;
    public final LlLI1 o00OoOOo;

    public C6311ilILI(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.f18007OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o();
            this.OooO00o = null;
        } else if (i11li1.size() == 3) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = C6888ll.OooO00o(AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1)), false);
            this.f18007OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(2)).m17938OooO00o();
        } else {
            throw new IllegalArgumentException("unknown sequence length: " + i11li1.size());
        }
    }

    public C6311ilILI(LlLI1 llLI1, C6888ll r2, byte[] bArr) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
        this.f18007OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static C6311ilILI OooO00o(AbstractC5903LlLLL r1, boolean z) {
        return new C6311ilILI(I11li1.OooO00o(r1, z));
    }

    public static C6311ilILI OooO00o(Object obj) {
        if (obj instanceof C6311ilILI) {
            return (C6311ilILI) obj;
        }
        if (obj != null) {
            return new C6311ilILI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m17351OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17352OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f18007OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        r0.OooO00o(new C6487lIIiIlL(this.f18007OooO00o));
        return new C5707LiL1(r0);
    }
}
