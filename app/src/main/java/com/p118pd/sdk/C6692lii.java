package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lii丨  reason: invalid class name and case insensitive filesystem */
public class C6692lii extends AbstractC5738Lil {
    public static final C6456l1ilL OooO0OO = new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o);

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final C6513lIiI f18633OooO0OO = new C6513lIiI(20);
    public static final C6456l1ilL OooO0Oo = new C6456l1ilL(AbstractC5711LiLli.Oooo000, OooO0OO);

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final C6513lIiI f18634OooO0Oo = new C6513lIiI(1);
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18635OooO00o;
    public C6456l1ilL OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6513lIiI f18636OooO0O0;

    public C6692lii() {
        this.OooO00o = OooO0OO;
        this.OooO0O0 = OooO0Oo;
        this.f18635OooO00o = f18633OooO0OO;
        this.f18636OooO0O0 = f18634OooO0Oo;
    }

    public C6692lii(I11li1 i11li1) {
        this.OooO00o = OooO0OO;
        this.OooO0O0 = OooO0Oo;
        this.f18635OooO00o = f18633OooO0OO;
        this.f18636OooO0O0 = f18634OooO0Oo;
        for (int i = 0; i != i11li1.size(); i++) {
            AbstractC5903LlLLL r1 = (AbstractC5903LlLLL) i11li1.OooO00o(i);
            int OooO00o2 = r1.OooO00o();
            if (OooO00o2 == 0) {
                this.OooO00o = C6456l1ilL.OooO00o(r1, true);
            } else if (OooO00o2 == 1) {
                this.OooO0O0 = C6456l1ilL.OooO00o(r1, true);
            } else if (OooO00o2 == 2) {
                this.f18635OooO00o = C6513lIiI.OooO00o(r1, true);
            } else if (OooO00o2 == 3) {
                this.f18636OooO0O0 = C6513lIiI.OooO00o(r1, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }

    public C6692lii(C6456l1ilL r1, C6456l1ilL r2, C6513lIiI r3, C6513lIiI r4) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
        this.f18635OooO00o = r3;
        this.f18636OooO0O0 = r4;
    }

    public static C6692lii OooO00o(Object obj) {
        if (obj instanceof C6692lii) {
            return (C6692lii) obj;
        }
        if (obj != null) {
            return new C6692lii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17776OooO00o() {
        return this.f18635OooO00o.m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (!this.OooO00o.equals(OooO0OO)) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        if (!this.OooO0O0.equals(OooO0Oo)) {
            r0.OooO00o(new ILI1Ll(true, 1, this.OooO0O0));
        }
        if (!this.f18635OooO00o.equals(f18633OooO0OO)) {
            r0.OooO00o(new ILI1Ll(true, 2, this.f18635OooO00o));
        }
        if (!this.f18636OooO0O0.equals(f18634OooO0Oo)) {
            r0.OooO00o(new ILI1Ll(true, 3, this.f18636OooO0O0));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17777OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m17778OooO0O0() {
        return this.f18636OooO0O0.m17647OooO0O0();
    }
}
