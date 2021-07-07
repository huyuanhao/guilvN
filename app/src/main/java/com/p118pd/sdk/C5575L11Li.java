package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.L11Li丨  reason: invalid class name and case insensitive filesystem */
public class C5575L11Li extends AbstractC5738Lil {
    public static final C6513lIiI OooO0O0 = new C6513lIiI(1);
    public static final C6513lIiI OooO0OO = new C6513lIiI(3);
    public static final C6513lIiI OooO0Oo = new C6513lIiI(4);
    public static final C6513lIiI OooO0o0 = new C6513lIiI(5);
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f16123OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16124OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public I11L f16125OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f16126OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public I11L f16127OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f16128OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public I11L f16129OooO0Oo;

    public C5575L11Li(I11L i11l, C5753LiI1 r3, I11L i11l2, I11L i11l3, I11L i11l4) {
        this.f16124OooO00o = OooO00o(r3.OooO00o(), i11l2, i11l3, i11l4);
        this.OooO00o = i11l;
        this.f16123OooO00o = r3;
        this.f16125OooO0O0 = i11l2;
        this.f16127OooO0OO = i11l3;
        this.f16129OooO0Oo = i11l4;
        this.f16128OooO0OO = i11l3 instanceof C5781LlIl;
        this.f16126OooO0O0 = i11l2 instanceof C5781LlIl;
    }

    public C5575L11Li(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f16124OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.OooO00o = (I11L) OooO00o2.nextElement();
        this.f16123OooO00o = C5753LiI1.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            AbstractC6122iIlLiL iillil = (AbstractC6122iIlLiL) OooO00o2.nextElement();
            if (iillil instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) iillil;
                int OooO00o3 = r0.OooO00o();
                if (OooO00o3 == 0) {
                    this.f16126OooO0O0 = r0 instanceof C6881lliiI1;
                    this.f16125OooO0O0 = I11L.OooO00o(r0, false);
                } else if (OooO00o3 == 1) {
                    this.f16128OooO0OO = r0 instanceof C6881lliiI1;
                    this.f16127OooO0OO = I11L.OooO00o(r0, false);
                } else {
                    throw new IllegalArgumentException("unknown tag value " + r0.OooO00o());
                }
            } else {
                this.f16129OooO0Oo = (I11L) iillil;
            }
        }
    }

    public static C5575L11Li OooO00o(Object obj) {
        if (obj instanceof C5575L11Li) {
            return (C5575L11Li) obj;
        }
        if (obj != null) {
            return new C5575L11Li(I11li1.OooO00o(obj));
        }
        return null;
    }

    private C6513lIiI OooO00o(LlLI1 llLI1, I11L i11l, I11L i11l2, I11L i11l3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i11l != null) {
            Enumeration OooO00o2 = i11l.m15215OooO00o();
            z3 = false;
            z2 = false;
            z = false;
            while (OooO00o2.hasMoreElements()) {
                Object nextElement = OooO00o2.nextElement();
                if (nextElement instanceof AbstractC5903LlLLL) {
                    AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(nextElement);
                    if (OooO00o3.OooO00o() == 1) {
                        z2 = true;
                    } else if (OooO00o3.OooO00o() == 2) {
                        z = true;
                    } else if (OooO00o3.OooO00o() == 3) {
                        z3 = true;
                    }
                }
            }
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        if (z3) {
            return new C6513lIiI(5);
        }
        if (i11l2 != null) {
            Enumeration OooO00o4 = i11l2.m15215OooO00o();
            while (OooO00o4.hasMoreElements()) {
                if (OooO00o4.nextElement() instanceof AbstractC5903LlLLL) {
                    z4 = true;
                }
            }
        }
        return z4 ? OooO0o0 : z ? OooO0Oo : z2 ? OooO0OO : OooO00o(i11l3) ? OooO0OO : !AbstractC6252iiLl.OooO00o.equals(llLI1) ? OooO0OO : OooO0O0;
    }

    private boolean OooO00o(I11L i11l) {
        Enumeration OooO00o2 = i11l.m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            if (C6710li1.OooO00o(OooO00o2.nextElement()).m17804OooO00o().m17647OooO0O0().intValue() == 3) {
                return true;
            }
        }
        return false;
    }

    public I11L OooO00o() {
        return this.f16127OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5753LiI1 m15880OooO00o() {
        return this.f16123OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15881OooO00o() {
        return this.f16124OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11L OooO0O0() {
        return this.f16125OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15882OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16124OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f16123OooO00o);
        I11L i11l = this.f16125OooO0O0;
        if (i11l != null) {
            if (this.f16126OooO0O0) {
                r0.OooO00o(new C6881lliiI1(false, 0, i11l));
            } else {
                r0.OooO00o(new ILI1Ll(false, 0, this.f16125OooO0O0));
            }
        }
        I11L i11l2 = this.f16127OooO0OO;
        if (i11l2 != null) {
            if (this.f16128OooO0OO) {
                r0.OooO00o(new C6881lliiI1(false, 1, i11l2));
            } else {
                r0.OooO00o(new ILI1Ll(false, 1, this.f16127OooO0OO));
            }
        }
        r0.OooO00o(this.f16129OooO0Oo);
        return new C6351ill(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public I11L OooO0OO() {
        return this.OooO00o;
    }

    public I11L OooO0Oo() {
        return this.f16129OooO0Oo;
    }
}
