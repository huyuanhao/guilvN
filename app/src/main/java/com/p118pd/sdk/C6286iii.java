package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ii丨i  reason: invalid class name and case insensitive filesystem */
public class C6286iii extends AbstractC5738Lil {
    public C6353i1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f17965OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9450IL1L f17966OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f17967OooO00o;
    public C9623il OooO0O0;

    public C6286iii(I11li1 i11li1) {
        AbstractC5903LlLLL r5;
        this.OooO00o = C6353i1.OooO00o(i11li1.OooO00o(0));
        this.f17966OooO00o = C9450IL1L.OooO00o(i11li1.OooO00o(1));
        this.f17967OooO00o = C9623il.OooO00o(i11li1.OooO00o(2));
        if (i11li1.size() > 4) {
            this.OooO0O0 = C9623il.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(3), true);
            r5 = (AbstractC5903LlLLL) i11li1.OooO00o(4);
        } else if (i11li1.size() > 3) {
            r5 = (AbstractC5903LlLLL) i11li1.OooO00o(3);
            if (r5.OooO00o() == 0) {
                this.OooO0O0 = C9623il.OooO00o(r5, true);
                return;
            }
        } else {
            return;
        }
        this.f17965OooO00o = iI11IL.OooO00o(r5, true);
    }

    public C6286iii(C6353i1 r1, C9450IL1L r2, C9623il r3, C9623il r4, iI11IL r5) {
        this.OooO00o = r1;
        this.f17966OooO00o = r2;
        this.f17967OooO00o = r3;
        this.OooO0O0 = r4;
        this.f17965OooO00o = r5;
    }

    public C6286iii(C6353i1 r7, C9450IL1L r8, C9623il r9, C9623il r10, C9431I r11) {
        this(r7, r8, r9, r10, iI11IL.OooO00o(r11));
    }

    public static C6286iii OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6286iii OooO00o(Object obj) {
        if (obj instanceof C6286iii) {
            return (C6286iii) obj;
        }
        if (obj != null) {
            return new C6286iii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6353i1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m17309OooO00o() {
        return this.f17965OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9450IL1L m17310OooO00o() {
        return this.f17966OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m17311OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f17966OooO00o);
        r0.OooO00o(this.f17967OooO00o);
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO0O0));
        }
        if (this.f17965OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.f17965OooO00o));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9623il m17312OooO0O0() {
        return this.f17967OooO00o;
    }
}
