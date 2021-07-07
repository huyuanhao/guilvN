package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1ILIl */
public class l1ILIl extends AbstractC5738Lil {
    public C9826LllL OooO00o;
    public C9826LllL OooO0O0;
    public C9826LllL OooO0OO;

    public l1ILIl(I11li1 i11li1) {
        this.OooO00o = C9826LllL.OooO00o(i11li1.OooO00o(0));
        this.OooO0O0 = C9826LllL.OooO00o(i11li1.OooO00o(1));
        this.OooO0OO = C9826LllL.OooO00o(i11li1.OooO00o(2));
    }

    public l1ILIl(C9826LllL r1, C9826LllL r2, C9826LllL r3) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
        this.OooO0OO = r3;
    }

    public static l1ILIl OooO00o(Object obj) {
        if (obj instanceof l1ILIl) {
            return (l1ILIl) obj;
        }
        if (obj != null) {
            return new l1ILIl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9826LllL OooO00o() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.OooO0OO);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9826LllL m17559OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public C9826LllL OooO0OO() {
        return this.OooO00o;
    }
}
