package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Il1  reason: case insensitive filesystem */
public class C5417Il1 extends AbstractC5738Lil {
    public final byte[] OooO00o;
    public final LlLI1 o00OoOOo;

    public C5417Il1(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o();
        } else if (i11li1.size() == 1) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = null;
        } else {
            throw new IllegalArgumentException("unknown sequence length: " + i11li1.size());
        }
    }

    public C5417Il1(LlLI1 llLI1) {
        this(llLI1, null);
    }

    public C5417Il1(LlLI1 llLI1, byte[] bArr) {
        this.o00OoOOo = llLI1;
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static C5417Il1 OooO00o(Object obj) {
        if (obj instanceof C5417Il1) {
            return (C5417Il1) obj;
        }
        if (obj != null) {
            return new C5417Il1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15640OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        byte[] bArr = this.OooO00o;
        if (bArr != null) {
            r0.OooO00o(new C6487lIIiIlL(bArr));
        }
        return new C5707LiL1(r0);
    }
}
