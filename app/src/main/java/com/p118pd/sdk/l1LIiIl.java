package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1LIiIl */
public class l1LIiIl extends AbstractC5738Lil {
    public ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18272OooO00o;

    public l1LIiIl(I11li1 i11li1) {
        this.f18272OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() == 2) {
            this.OooO00o = ILI.OooO00o(i11li1.OooO00o(1));
        }
    }

    public static l1LIiIl OooO00o(Object obj) {
        if (obj instanceof l1LIiIl) {
            return (l1LIiIl) obj;
        }
        if (obj != null) {
            return new l1LIiIl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18272OooO00o);
        ILI ili = this.OooO00o;
        if (ili != null) {
            r0.OooO00o(ili);
        }
        return new C5707LiL1(r0);
    }
}
