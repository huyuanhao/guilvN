package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨1lIii  reason: invalid class name */
public class C1lIii extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6854lLi1LL OooO00o;

    public C1lIii(AbstractC6122iIlLiL iillil) {
        this.OooO00o = iillil;
    }

    public C1lIii(C6265iiilI iiili) {
        this.OooO00o = new ILI1Ll(false, 2, iiili);
    }

    public C1lIii(C6327ilii ilii) {
        this.OooO00o = new ILI1Ll(false, 4, ilii);
    }

    public C1lIii(C6404il r4) {
        this.OooO00o = new ILI1Ll(false, 3, r4);
    }

    public C1lIii(C9451L1 r4) {
        this.OooO00o = new ILI1Ll(false, 1, r4);
    }

    public C1lIii(C1l1 r1) {
        this.OooO00o = r1;
    }

    private C6265iiilI OooO00o(AbstractC5903LlLLL r2) {
        return C6265iiilI.OooO00o(r2, r2.OooO0O0());
    }

    public static C1lIii OooO00o(Object obj) {
        if (obj == null || (obj instanceof C1lIii)) {
            return (C1lIii) obj;
        }
        if (obj instanceof I11li1) {
            return new C1lIii((I11li1) obj);
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C1lIii((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public C6513lIiI OooO00o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (!(r0 instanceof AbstractC5903LlLLL)) {
            return C1l1.OooO00o(r0).m21880OooO00o();
        }
        AbstractC5903LlLLL r02 = (AbstractC5903LlLLL) r0;
        int OooO00o2 = r02.OooO00o();
        if (OooO00o2 == 1) {
            return C9451L1.OooO00o(r02, false).m21503OooO00o();
        }
        if (OooO00o2 == 2) {
            return OooO00o(r02).m17289OooO00o();
        }
        if (OooO00o2 == 3) {
            return C6404il.OooO00o(r02, false).m17519OooO00o();
        }
        if (OooO00o2 == 4) {
            return new C6513lIiI(0);
        }
        throw new IllegalStateException("unknown tag");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21882OooO00o() {
        return this.OooO00o instanceof AbstractC5903LlLLL;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21883OooO0O0() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (!(r0 instanceof AbstractC5903LlLLL)) {
            return C1l1.OooO00o(r0);
        }
        AbstractC5903LlLLL r02 = (AbstractC5903LlLLL) r0;
        int OooO00o2 = r02.OooO00o();
        if (OooO00o2 == 1) {
            return C9451L1.OooO00o(r02, false);
        }
        if (OooO00o2 == 2) {
            return OooO00o(r02);
        }
        if (OooO00o2 == 3) {
            return C6404il.OooO00o(r02, false);
        }
        if (OooO00o2 == 4) {
            return C6327ilii.OooO00o(r02, false);
        }
        throw new IllegalStateException("unknown tag");
    }
}
