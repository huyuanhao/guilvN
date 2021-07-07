package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.iLl1  reason: case insensitive filesystem */
public class C6188iLl1 extends AbstractC5738Lil {
    public ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5514IL f17765OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f17766OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6506lIi f17767OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17768OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9521Ll f17769OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f17770OooO00o;
    public C6513lIiI OooO0O0;
    public C6513lIiI OooO0OO;
    public LlLI1 o00OoOOo;

    public C6188iLl1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f17768OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.o00OoOOo = LlLI1.OooO00o(OooO00o2.nextElement());
        this.f17767OooO00o = C6506lIi.OooO00o(OooO00o2.nextElement());
        this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.f17770OooO00o = C9623il.OooO00o(OooO00o2.nextElement());
        C5514IL OooO00o3 = C5514IL.OooO00o(false);
        while (true) {
            this.f17765OooO00o = OooO00o3;
            while (OooO00o2.hasMoreElements()) {
                AbstractC5738Lil lil = (AbstractC5738Lil) OooO00o2.nextElement();
                if (lil instanceof AbstractC5903LlLLL) {
                    AbstractC5903LlLLL r1 = (AbstractC5903LlLLL) lil;
                    int OooO00o4 = r1.OooO00o();
                    if (OooO00o4 == 0) {
                        this.OooO00o = ILI.OooO00o(r1, true);
                    } else if (OooO00o4 == 1) {
                        this.f17766OooO00o = iI11IL.OooO00o(r1, false);
                    } else {
                        throw new IllegalArgumentException("Unknown tag value " + r1.OooO00o());
                    }
                } else if ((lil instanceof I11li1) || (lil instanceof C9521Ll)) {
                    this.f17769OooO00o = C9521Ll.OooO00o(lil);
                } else if (lil instanceof C5514IL) {
                    OooO00o3 = C5514IL.OooO00o(lil);
                } else if (lil instanceof C6513lIiI) {
                    this.OooO0OO = C6513lIiI.OooO00o(lil);
                }
            }
            return;
        }
    }

    public C6188iLl1(LlLI1 llLI1, C6506lIi lii, C6513lIiI r6, C9623il r7, C9521Ll r8, C5514IL r9, C6513lIiI r10, ILI ili, iI11IL r12) {
        this.f17768OooO00o = new C6513lIiI(1);
        this.o00OoOOo = llLI1;
        this.f17767OooO00o = lii;
        this.OooO0O0 = r6;
        this.f17770OooO00o = r7;
        this.f17769OooO00o = r8;
        this.f17765OooO00o = r9;
        this.OooO0OO = r10;
        this.OooO00o = ili;
        this.f17766OooO00o = r12;
    }

    public static C6188iLl1 OooO00o(Object obj) {
        if (obj instanceof C6188iLl1) {
            return (C6188iLl1) obj;
        }
        if (obj != null) {
            return new C6188iLl1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5514IL m17149OooO00o() {
        return this.f17765OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m17150OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m17151OooO00o() {
        return this.f17766OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6506lIi m17152OooO00o() {
        return this.f17767OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17153OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9521Ll m17154OooO00o() {
        return this.f17769OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m17155OooO00o() {
        return this.f17770OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17768OooO00o);
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.f17767OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.f17770OooO00o);
        C9521Ll r1 = this.f17769OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        C5514IL r12 = this.f17765OooO00o;
        if (r12 != null && r12.m15792OooO0O0()) {
            r0.OooO00o(this.f17765OooO00o);
        }
        C6513lIiI r13 = this.OooO0OO;
        if (r13 != null) {
            r0.OooO00o(r13);
        }
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        if (this.f17766OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.f17766OooO00o));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6513lIiI m17156OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public C6513lIiI OooO0OO() {
        return this.f17768OooO00o;
    }
}
