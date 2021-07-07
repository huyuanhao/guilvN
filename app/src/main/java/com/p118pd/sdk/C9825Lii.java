package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨Li丨i  reason: invalid class name and case insensitive filesystem */
public class C9825Lii extends AbstractC5738Lil {
    public final AbstractC6854lLi1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9863l1L f23424OooO00o;
    public final LlLI1 o00OoOOo;

    public C9825Lii(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.f23424OooO00o = C9863l1L.OooO00o(i11li1.OooO00o(0));
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(1));
            this.OooO00o = i11li1.OooO00o(2);
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C9825Lii(C9863l1L r1, LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.f23424OooO00o = r1;
        this.o00OoOOo = llLI1;
        this.OooO00o = r3;
    }

    public static C9825Lii OooO00o(Object obj) {
        if (obj instanceof C9825Lii) {
            return (C9825Lii) obj;
        }
        if (obj != null) {
            return new C9825Lii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9863l1L m21913OooO00o() {
        return this.f23424OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23424OooO00o);
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21914OooO0O0() {
        return this.OooO00o;
    }
}
