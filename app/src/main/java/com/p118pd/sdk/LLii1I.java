package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLii1I */
public class LLii1I extends AbstractC5738Lil {
    public final C6426iLl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6518lIlIl f16487OooO00o;

    public LLii1I(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.f16487OooO00o = C6518lIlIl.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = C6426iLl.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public LLii1I(C6518lIlIl lilil, C6426iLl r2) {
        this.f16487OooO00o = lilil;
        this.OooO00o = r2;
    }

    public static LLii1I OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static LLii1I OooO00o(Object obj) {
        if (obj instanceof LLii1I) {
            return (LLii1I) obj;
        }
        if (obj != null) {
            return new LLii1I(I11li1.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16487OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
