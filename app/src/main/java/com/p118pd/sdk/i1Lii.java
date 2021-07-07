package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1Lii */
public class i1Lii {
    public ILI1Ll OooO00o = new ILI1Ll(true, 0, new C6513lIiI(0));

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5432IlIlIlL f17381OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f17382OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17383OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17384OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f17385OooO00o;
    public C5432IlIlIlL OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public l1LILI1 f17386OooO0O0;

    public C5314ILlLL OooO00o() {
        if (this.f17384OooO00o == null || this.f17383OooO00o == null || this.f17382OooO00o == null || this.f17381OooO00o == null || this.OooO0O0 == null || this.f17386OooO0O0 == null || this.f17385OooO00o == null) {
            throw new IllegalStateException("not all mandatory fields set in V1 TBScertificate generator");
        }
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17384OooO00o);
        r0.OooO00o(this.f17383OooO00o);
        r0.OooO00o(this.f17382OooO00o);
        iILLL1 r1 = new iILLL1();
        r1.OooO00o(this.f17381OooO00o);
        r1.OooO00o(this.OooO0O0);
        r0.OooO00o(new C5707LiL1(r1));
        r0.OooO00o(this.f17386OooO0O0);
        r0.OooO00o(this.f17385OooO00o);
        return C5314ILlLL.OooO00o(new C5707LiL1(r0));
    }

    public void OooO00o(C5432IlIlIlL r1) {
        this.OooO0O0 = r1;
    }

    public void OooO00o(LL1IL ll1il) {
        this.OooO0O0 = new C5432IlIlIlL(ll1il);
    }

    public void OooO00o(l1LILI1 r1) {
        this.f17382OooO00o = r1;
    }

    public void OooO00o(C6456l1ilL r1) {
        this.f17383OooO00o = r1;
    }

    public void OooO00o(C6513lIiI r1) {
        this.f17384OooO00o = r1;
    }

    public void OooO00o(C6888ll r1) {
        this.f17385OooO00o = r1;
    }

    public void OooO00o(C929811Li1 r1) {
        this.f17382OooO00o = l1LILI1.OooO00o(r1.OooO0O0());
    }

    public void OooO0O0(C5432IlIlIlL r1) {
        this.f17381OooO00o = r1;
    }

    public void OooO0O0(LL1IL ll1il) {
        this.f17381OooO00o = new C5432IlIlIlL(ll1il);
    }

    public void OooO0O0(l1LILI1 r1) {
        this.f17386OooO0O0 = r1;
    }

    public void OooO0O0(C929811Li1 r1) {
        this.f17386OooO0O0 = l1LILI1.OooO00o(r1.OooO0O0());
    }
}
