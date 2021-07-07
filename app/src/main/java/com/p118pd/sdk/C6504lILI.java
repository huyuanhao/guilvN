package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lILI  reason: case insensitive filesystem */
public class C6504lILI {
    public ILI1Ll OooO00o = new ILI1Ll(true, 0, new C6513lIiI(2));

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5432IlIlIlL f18377OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f18378OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f18379OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f18380OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18381OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18382OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f18383OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18384OooO00o;
    public C5432IlIlIlL OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public iIilII1 f18385OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public l1LILI1 f18386OooO0O0;

    public C5314ILlLL OooO00o() {
        if (this.f18382OooO00o == null || this.f18381OooO00o == null || this.f18380OooO00o == null || this.f18377OooO00o == null || this.OooO0O0 == null || ((this.f18386OooO0O0 == null && !this.f18384OooO00o) || this.f18383OooO00o == null)) {
            throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
        }
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f18382OooO00o);
        r0.OooO00o(this.f18381OooO00o);
        r0.OooO00o(this.f18380OooO00o);
        iILLL1 r1 = new iILLL1();
        r1.OooO00o(this.f18377OooO00o);
        r1.OooO00o(this.OooO0O0);
        r0.OooO00o(new C5707LiL1(r1));
        AbstractC6854lLi1LL r12 = this.f18386OooO0O0;
        if (r12 == null) {
            r12 = new C5707LiL1();
        }
        r0.OooO00o(r12);
        r0.OooO00o(this.f18383OooO00o);
        if (this.f18378OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.f18378OooO00o));
        }
        if (this.f18385OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 2, this.f18385OooO0O0));
        }
        if (this.f18379OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 3, this.f18379OooO00o));
        }
        return C5314ILlLL.OooO00o(new C5707LiL1(r0));
    }

    public void OooO00o(C5432IlIlIlL r1) {
        this.OooO0O0 = r1;
    }

    public void OooO00o(LL1IL ll1il) {
        this.OooO0O0 = new C5432IlIlIlL(ll1il);
    }

    public void OooO00o(iIilII1 iiilii1) {
        this.f18378OooO00o = iiilii1;
    }

    public void OooO00o(iI11IL r2) {
        C5237III OooO00o2;
        this.f18379OooO00o = r2;
        if (r2 != null && (OooO00o2 = r2.OooO00o(C5237III.o00Ooo0)) != null && OooO00o2.m15434OooO00o()) {
            this.f18384OooO00o = true;
        }
    }

    public void OooO00o(l1LILI1 r1) {
        this.f18380OooO00o = r1;
    }

    public void OooO00o(C6456l1ilL r1) {
        this.f18381OooO00o = r1;
    }

    public void OooO00o(C6513lIiI r1) {
        this.f18382OooO00o = r1;
    }

    public void OooO00o(C6888ll r1) {
        this.f18383OooO00o = r1;
    }

    public void OooO00o(C929811Li1 r1) {
        this.f18380OooO00o = l1LILI1.OooO00o(r1);
    }

    public void OooO00o(C9431I r1) {
        OooO00o(iI11IL.OooO00o(r1));
    }

    public void OooO0O0(C5432IlIlIlL r1) {
        this.f18377OooO00o = r1;
    }

    public void OooO0O0(LL1IL ll1il) {
        this.f18377OooO00o = new C5432IlIlIlL(ll1il);
    }

    public void OooO0O0(iIilII1 iiilii1) {
        this.f18385OooO0O0 = iiilii1;
    }

    public void OooO0O0(l1LILI1 r1) {
        this.f18386OooO0O0 = r1;
    }

    public void OooO0O0(C929811Li1 r1) {
        this.f18386OooO0O0 = l1LILI1.OooO00o(r1.OooO0O0());
    }
}
