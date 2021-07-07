package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨1Ii  reason: invalid class name and case insensitive filesystem */
public class C6816l1Ii extends AbstractC5738Lil {
    public C5514IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f18867OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6506lIi f18868OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18869OooO00o;
    public C6513lIiI OooO0O0;
    public LlLI1 o00OoOOo;

    public C6816l1Ii(I11li1 i11li1) {
        int size = i11li1.size();
        this.f18869OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        this.f18868OooO00o = C6506lIi.OooO00o(i11li1.OooO00o(1));
        for (int i = 2; i < size; i++) {
            if (i11li1.OooO00o(i) instanceof LlLI1) {
                this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(i));
            } else if (i11li1.OooO00o(i) instanceof C6513lIiI) {
                this.OooO0O0 = C6513lIiI.OooO00o(i11li1.OooO00o(i));
            } else if (i11li1.OooO00o(i) instanceof C5514IL) {
                this.OooO00o = C5514IL.OooO00o(i11li1.OooO00o(i));
            } else if (i11li1.OooO00o(i) instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r3 = (AbstractC5903LlLLL) i11li1.OooO00o(i);
                if (r3.OooO00o() == 0) {
                    this.f18867OooO00o = iI11IL.OooO00o(r3, false);
                }
            }
        }
    }

    public C6816l1Ii(C6506lIi lii, LlLI1 llLI1, C6513lIiI r6, C5514IL r7, iI11IL r8) {
        this.f18869OooO00o = new C6513lIiI(1);
        this.f18868OooO00o = lii;
        this.o00OoOOo = llLI1;
        this.OooO0O0 = r6;
        this.OooO00o = r7;
        this.f18867OooO00o = r8;
    }

    public static C6816l1Ii OooO00o(Object obj) {
        if (obj instanceof C6816l1Ii) {
            return (C6816l1Ii) obj;
        }
        if (obj != null) {
            return new C6816l1Ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5514IL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m17950OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m17951OooO00o() {
        return this.f18867OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6506lIi m17952OooO00o() {
        return this.f18868OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17953OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18869OooO00o);
        r0.OooO00o(this.f18868OooO00o);
        LlLI1 llLI1 = this.o00OoOOo;
        if (llLI1 != null) {
            r0.OooO00o(llLI1);
        }
        C6513lIiI r1 = this.OooO0O0;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        C5514IL r12 = this.OooO00o;
        if (r12 != null && r12.m15792OooO0O0()) {
            r0.OooO00o(this.OooO00o);
        }
        if (this.f18867OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f18867OooO00o));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6513lIiI m17954OooO0O0() {
        return this.f18869OooO00o;
    }
}
