package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL */
public class C1688iL extends AbstractC5738Lil {
    public LI11 OooO00o;
    public LI11 OooO0O0;

    public C1688iL(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = LI11.OooO00o(i11li1.OooO00o(0));
            this.OooO0O0 = LI11.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for LDSVersionInfo");
    }

    public C1688iL(String str, String str2) {
        this.OooO00o = new LI11(str);
        this.OooO0O0 = new LI11(str2);
    }

    public static C1688iL OooO00o(Object obj) {
        if (obj instanceof C1688iL) {
            return (C1688iL) obj;
        }
        if (obj != null) {
            return new C1688iL(I11li1.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m17046OooO0O0() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public String OooO0OO() {
        return this.OooO0O0.OooO00o();
    }
}
