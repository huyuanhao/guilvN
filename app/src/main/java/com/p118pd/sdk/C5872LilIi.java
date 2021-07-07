package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨ilI丨i  reason: invalid class name and case insensitive filesystem */
public class C5872LilIi extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f16835OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f16836OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16837OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16838OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6653liIl f16839OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9365ILi f16840OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9421IlIli f16841OooO00o;
    public C6513lIiI OooO0O0;

    public C5872LilIi(I11li1 i11li1) {
        if (i11li1.size() < 6 || i11li1.size() > 9) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        int i = 0;
        if (i11li1.OooO00o(0) instanceof C6513lIiI) {
            this.f16838OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
            i = 1;
        } else {
            this.f16838OooO00o = new C6513lIiI(0);
        }
        this.f16841OooO00o = C9421IlIli.OooO00o(i11li1.OooO00o(i));
        this.f16839OooO00o = C6653liIl.OooO00o(i11li1.OooO00o(i + 1));
        this.f16837OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(i + 2));
        this.OooO0O0 = C6513lIiI.OooO00o(i11li1.OooO00o(i + 3));
        this.f16840OooO00o = C9365ILi.OooO00o(i11li1.OooO00o(i + 4));
        this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(i + 5));
        for (int i2 = i + 6; i2 < i11li1.size(); i2++) {
            AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(i2);
            if (OooO00o2 instanceof iIilII1) {
                this.f16835OooO00o = iIilII1.OooO00o(i11li1.OooO00o(i2));
            } else if ((OooO00o2 instanceof I11li1) || (OooO00o2 instanceof iI11IL)) {
                this.f16836OooO00o = iI11IL.OooO00o(i11li1.OooO00o(i2));
            }
        }
    }

    public static C5872LilIi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5872LilIi OooO00o(Object obj) {
        if (obj instanceof C5872LilIi) {
            return (C5872LilIi) obj;
        }
        if (obj != null) {
            return new C5872LilIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m16461OooO00o() {
        return this.f16835OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m16462OooO00o() {
        return this.f16836OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16463OooO00o() {
        return this.f16837OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16464OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6653liIl m16465OooO00o() {
        return this.f16839OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9365ILi m16466OooO00o() {
        return this.f16840OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9421IlIli m16467OooO00o() {
        return this.f16841OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f16838OooO00o.m17647OooO0O0().intValue() != 0) {
            r0.OooO00o(this.f16838OooO00o);
        }
        r0.OooO00o(this.f16841OooO00o);
        r0.OooO00o(this.f16839OooO00o);
        r0.OooO00o(this.f16837OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.f16840OooO00o);
        r0.OooO00o(this.OooO00o);
        iIilII1 iiilii1 = this.f16835OooO00o;
        if (iiilii1 != null) {
            r0.OooO00o(iiilii1);
        }
        iI11IL r1 = this.f16836OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6513lIiI m16468OooO0O0() {
        return this.f16838OooO00o;
    }
}
