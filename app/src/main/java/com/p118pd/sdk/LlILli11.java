package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LlILli11 */
public class LlILli11 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6122iIlLiL f16694OooO00o;
    public LlLI1 o00OoOOo;

    public LlILli11(I11li1 i11li1) {
        if (((C6513lIiI) i11li1.OooO00o(0)).m17647OooO0O0().intValue() == 0) {
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("sequence not version 0");
    }

    public LlILli11(LlLI1 llLI1, C6456l1ilL r3, AbstractC6854lLi1LL r4) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(llLI1);
        r0.OooO00o(r3.OooO0O0());
        r0.OooO00o(new C6881lliiI1(false, 0, r4));
        this.OooO00o = new C6351ill(r0);
    }

    public static LlILli11 OooO00o(Object obj) {
        if (obj instanceof LlILli11) {
            return (LlILli11) obj;
        }
        if (obj != null) {
            return new LlILli11(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return LlLI1.OooO00o(this.OooO00o.OooO00o(0));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16372OooO00o() {
        return C6456l1ilL.OooO00o(this.OooO00o.OooO00o(1));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m16373OooO00o() {
        if (this.OooO00o.size() == 3) {
            return AbstractC6804llL1ii.OooO00o(AbstractC5903LlLLL.OooO00o(this.OooO00o.OooO00o(2)), false);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(0));
        r0.OooO00o(this.OooO00o);
        return new C6351ill(r0);
    }
}
