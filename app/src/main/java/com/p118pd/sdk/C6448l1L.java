package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1L  reason: case insensitive filesystem */
public class C6448l1L extends AbstractC5738Lil {
    public final C6518lIlIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6854lLi1LL f18258OooO00o;
    public final LlLI1 o00OoOOo;

    public C6448l1L(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.OooO00o = C6518lIlIl.OooO00o(i11li1.OooO00o(0));
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(1));
            this.f18258OooO00o = i11li1.OooO00o(2);
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C6448l1L(C6518lIlIl lilil, LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.OooO00o = lilil;
        this.o00OoOOo = llLI1;
        this.f18258OooO00o = r3;
    }

    public static C6448l1L OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6448l1L OooO00o(Object obj) {
        if (obj instanceof C6448l1L) {
            return (C6448l1L) obj;
        }
        if (obj != null) {
            return new C6448l1L(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6518lIlIl m17567OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.f18258OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17568OooO0O0() {
        return this.f18258OooO00o;
    }
}
