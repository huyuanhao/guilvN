package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ll1  reason: case insensitive filesystem */
public class C5764Ll1 extends AbstractC5738Lil {
    public final AbstractC6804llL1ii OooO00o;
    public final LlLI1 o00OoOOo;

    public C5764Ll1(I11li1 i11li1) {
        this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1));
    }

    public C5764Ll1(LlLI1 llLI1, byte[] bArr) {
        this.o00OoOOo = llLI1;
        this.OooO00o = new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
    }

    public static C5764Ll1 OooO00o(Object obj) {
        if (obj instanceof C5764Ll1) {
            return (C5764Ll1) obj;
        }
        if (obj != null) {
            return new C5764Ll1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16354OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
