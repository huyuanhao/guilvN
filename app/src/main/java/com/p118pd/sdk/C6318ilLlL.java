package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ilLlL  reason: case insensitive filesystem */
public class C6318ilLlL extends AbstractC5738Lil {
    public C6322ili OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6714lil f18029OooO00o;

    public C6318ilLlL(I11li1 i11li1) {
        this.OooO00o = C6322ili.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() == 2) {
            this.f18029OooO00o = C6714lil.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true);
        }
    }

    public C6318ilLlL(C6322ili ili, C6714lil r2) {
        this.OooO00o = ili;
        this.f18029OooO00o = r2;
    }

    public static C6318ilLlL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6318ilLlL OooO00o(Object obj) {
        if (obj instanceof C6318ilLlL) {
            return (C6318ilLlL) obj;
        }
        if (obj != null) {
            return new C6318ilLlL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6322ili OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6714lil m17360OooO00o() {
        return this.f18029OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        if (this.f18029OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f18029OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
