package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ll */
public class C1696ll extends AbstractC5738Lil implements AbstractC5711LiLli {
    public C6903lil OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9713llii f18681OooO00o = null;

    public C1696ll(I11li1 i11li1) {
        if (C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0().intValue() == 3) {
            this.OooO00o = C6903lil.OooO00o(i11li1.OooO00o(1));
            if (i11li1.size() == 3) {
                this.f18681OooO00o = C9713llii.OooO00o(i11li1.OooO00o(2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for PFX PDU");
    }

    public C1696ll(C6903lil r2, C9713llii r3) {
        this.OooO00o = r2;
        this.f18681OooO00o = r3;
    }

    public static C1696ll OooO00o(Object obj) {
        if (obj instanceof C1696ll) {
            return (C1696ll) obj;
        }
        if (obj != null) {
            return new C1696ll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6903lil OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9713llii m17822OooO00o() {
        return this.f18681OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(3));
        r0.OooO00o(this.OooO00o);
        C9713llii r1 = this.f18681OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C6351ill(r0);
    }
}
