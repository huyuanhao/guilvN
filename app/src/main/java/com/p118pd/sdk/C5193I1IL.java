package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1丨IL  reason: invalid class name and case insensitive filesystem */
public class C5193I1IL extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public C5193I1IL(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        if (i11li1.size() > 1) {
            this.OooO00o = i11li1.OooO00o(1);
        }
    }

    public C5193I1IL(LlLI1 llLI1) {
        this(llLI1, null);
    }

    public C5193I1IL(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static C5193I1IL OooO00o(Object obj) {
        if (obj instanceof C5193I1IL) {
            return (C5193I1IL) obj;
        }
        if (obj != null) {
            return new C5193I1IL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        AbstractC6854lLi1LL r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m15341OooO0O0() {
        return this.OooO00o;
    }
}
