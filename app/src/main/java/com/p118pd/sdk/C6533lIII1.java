package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lI丨II1  reason: invalid class name and case insensitive filesystem */
public class C6533lIII1 extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6513lIiI f18417OooO00o;
    public final int o00oO0O;
    public final int o0ooOO0;

    public C6533lIII1(int i, int i2, C6456l1ilL r6) {
        this.f18417OooO00o = new C6513lIiI(0);
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.OooO00o = r6;
    }

    public C6533lIII1(I11li1 i11li1) {
        this.f18417OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        this.o00oO0O = C6513lIiI.OooO00o(i11li1.OooO00o(1)).m17647OooO0O0().intValue();
        this.o0ooOO0 = C6513lIiI.OooO00o(i11li1.OooO00o(2)).m17647OooO0O0().intValue();
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(3));
    }

    public static C6533lIII1 OooO00o(Object obj) {
        if (obj instanceof C6533lIII1) {
            return (C6533lIII1) obj;
        }
        if (obj != null) {
            return new C6533lIII1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17654OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18417OooO00o);
        r0.OooO00o(new C6513lIiI((long) this.o00oO0O));
        r0.OooO00o(new C6513lIiI((long) this.o0ooOO0));
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o0ooOO0;
    }
}
