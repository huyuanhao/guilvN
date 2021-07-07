package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Li丨I1  reason: invalid class name and case insensitive filesystem */
public class C5753LiI1 extends AbstractC5738Lil implements AbstractC6252iiLl {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public C5753LiI1(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        if (i11li1.size() > 1) {
            AbstractC5903LlLLL r4 = (AbstractC5903LlLLL) i11li1.OooO00o(1);
            if (!r4.OooO0O0() || r4.OooO00o() != 0) {
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            this.OooO00o = r4.OooO0o();
        }
    }

    public C5753LiI1(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static C5753LiI1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5753LiI1 OooO00o(Object obj) {
        if (obj instanceof C5753LiI1) {
            return (C5753LiI1) obj;
        }
        if (obj != null) {
            return new C5753LiI1(I11li1.OooO00o(obj));
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
            r0.OooO00o(new C6881lliiI1(0, r1));
        }
        return new C6351ill(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16341OooO0O0() {
        return this.OooO00o;
    }
}
