package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Lil丨I丨  reason: invalid class name and case insensitive filesystem */
public class C5747LilI extends AbstractC5738Lil {
    public final AbstractC6854lLi1LL OooO00o;
    public final LlLI1 o00OoOOo;

    public C5747LilI(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = i11li1.OooO00o(1);
            return;
        }
        throw new IllegalArgumentException("Sequence must be 2 elements.");
    }

    public C5747LilI(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static C5747LilI OooO00o(Object obj) {
        if (obj instanceof C5747LilI) {
            return (C5747LilI) obj;
        }
        if (obj instanceof AbstractC6854lLi1LL) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
            if (OooO0O0 instanceof I11li1) {
                return new C5747LilI((I11li1) OooO0O0);
            }
            return null;
        } else if (obj instanceof byte[]) {
            return OooO00o(I11li1.OooO00o(obj));
        } else {
            return null;
        }
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(new AbstractC6854lLi1LL[]{this.o00OoOOo, this.OooO00o});
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16332OooO0O0() {
        return this.OooO00o;
    }
}
