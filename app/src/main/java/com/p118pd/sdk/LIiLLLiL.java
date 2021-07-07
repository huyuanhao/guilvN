package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIiLLLiL */
public class LIiLLLiL extends AbstractC5738Lil {
    public LLl111 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f16318OooO00o;

    public LIiLLLiL(I11li1 i11li1) {
        this.f16318OooO00o = C9623il.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.OooO00o = LLl111.OooO00o(C5841L11I.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true));
        }
    }

    public LIiLLLiL(C9623il r1, LLl111 r2) {
        this.f16318OooO00o = r1;
        this.OooO00o = r2;
    }

    public static LIiLLLiL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static LIiLLLiL OooO00o(Object obj) {
        if (obj instanceof LIiLLLiL) {
            return (LIiLLLiL) obj;
        }
        if (obj != null) {
            return new LIiLLLiL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LLl111 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m16086OooO00o() {
        return this.f16318OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16318OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
