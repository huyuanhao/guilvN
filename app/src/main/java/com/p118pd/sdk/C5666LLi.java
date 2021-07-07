package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLi丨  reason: invalid class name and case insensitive filesystem */
public class C5666LLi extends AbstractC5738Lil {
    public final C5753LiI1 OooO00o;
    public final C5753LiI1 OooO0O0;

    public C5666LLi(I11li1 i11li1) {
        AbstractC6854lLi1LL r3;
        if (i11li1.OooO00o(0) instanceof AbstractC5903LlLLL) {
            this.OooO00o = C5753LiI1.OooO00o(AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(0)), true);
            r3 = i11li1.OooO00o(1);
        } else {
            this.OooO00o = null;
            r3 = i11li1.OooO00o(0);
        }
        this.OooO0O0 = C5753LiI1.OooO00o(r3);
    }

    public C5666LLi(C5753LiI1 r2) {
        this.OooO00o = null;
        this.OooO0O0 = r2;
    }

    public C5666LLi(C5753LiI1 r1, C5753LiI1 r2) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
    }

    public static C5666LLi OooO00o(Object obj) {
        if (obj instanceof C5666LLi) {
            return (C5666LLi) obj;
        }
        if (obj != null) {
            return new C5666LLi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5753LiI1 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public C5753LiI1 OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16237OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }
}
