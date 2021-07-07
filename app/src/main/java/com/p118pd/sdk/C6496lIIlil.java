package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lIIli丨l丨  reason: invalid class name and case insensitive filesystem */
public class C6496lIIlil extends AbstractC5738Lil {
    public static final C6456l1ilL OooO0Oo = new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o);
    public static final C6456l1ilL OooO0o = new C6456l1ilL(AbstractC5711LiLli.Oooo00O, new C6487lIIiIlL(new byte[0]));
    public static final C6456l1ilL OooO0o0 = new C6456l1ilL(AbstractC5711LiLli.Oooo000, OooO0Oo);
    public C6456l1ilL OooO00o;
    public C6456l1ilL OooO0O0;
    public C6456l1ilL OooO0OO;

    public C6496lIIlil() {
        this.OooO00o = OooO0Oo;
        this.OooO0O0 = OooO0o0;
        this.OooO0OO = OooO0o;
    }

    public C6496lIIlil(I11li1 i11li1) {
        this.OooO00o = OooO0Oo;
        this.OooO0O0 = OooO0o0;
        this.OooO0OO = OooO0o;
        for (int i = 0; i != i11li1.size(); i++) {
            AbstractC5903LlLLL r1 = (AbstractC5903LlLLL) i11li1.OooO00o(i);
            int OooO00o2 = r1.OooO00o();
            if (OooO00o2 == 0) {
                this.OooO00o = C6456l1ilL.OooO00o(r1, true);
            } else if (OooO00o2 == 1) {
                this.OooO0O0 = C6456l1ilL.OooO00o(r1, true);
            } else if (OooO00o2 == 2) {
                this.OooO0OO = C6456l1ilL.OooO00o(r1, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }

    public C6496lIIlil(C6456l1ilL r1, C6456l1ilL r2, C6456l1ilL r3) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
        this.OooO0OO = r3;
    }

    public static C6496lIIlil OooO00o(Object obj) {
        if (obj instanceof C6496lIIlil) {
            return (C6496lIIlil) obj;
        }
        if (obj != null) {
            return new C6496lIIlil(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (!this.OooO00o.equals(OooO0Oo)) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        if (!this.OooO0O0.equals(OooO0o0)) {
            r0.OooO00o(new ILI1Ll(true, 1, this.OooO0O0));
        }
        if (!this.OooO0OO.equals(OooO0o)) {
            r0.OooO00o(new ILI1Ll(true, 2, this.OooO0OO));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17632OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public C6456l1ilL OooO0OO() {
        return this.OooO0OO;
    }
}
