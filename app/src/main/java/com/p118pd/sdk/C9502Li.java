package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨Li  reason: invalid class name and case insensitive filesystem */
public class C9502Li extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f23069OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f23070OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6368iI1II f23071OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f23072OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23073OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f23074OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f23075OooO00o;
    public iIilII1 OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public l1LILI1 f23076OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6513lIiI f23077OooO0O0;

    public C9502Li(I11li1 i11li1) {
        this.OooO00o = i11li1;
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            switch (r0.OooO00o()) {
                case 0:
                    this.f23074OooO00o = C6513lIiI.OooO00o(r0, false);
                    break;
                case 1:
                    this.f23077OooO0O0 = C6513lIiI.OooO00o(r0, false);
                    break;
                case 2:
                    this.f23073OooO00o = C6456l1ilL.OooO00o(r0, false);
                    break;
                case 3:
                    this.f23072OooO00o = l1LILI1.OooO00o(r0, true);
                    break;
                case 4:
                    this.f23071OooO00o = C6368iI1II.OooO00o(I11li1.OooO00o(r0, false));
                    break;
                case 5:
                    this.f23076OooO0O0 = l1LILI1.OooO00o(r0, true);
                    break;
                case 6:
                    this.f23075OooO00o = C6888ll.OooO00o(r0, false);
                    break;
                case 7:
                    this.f23069OooO00o = iIilII1.OooO00o(r0, false);
                    break;
                case 8:
                    this.OooO0O0 = iIilII1.OooO00o(r0, false);
                    break;
                case 9:
                    this.f23070OooO00o = iI11IL.OooO00o(r0, false);
                    break;
                default:
                    throw new IllegalArgumentException("unknown tag: " + r0.OooO00o());
            }
        }
    }

    public static C9502Li OooO00o(Object obj) {
        if (obj instanceof C9502Li) {
            return (C9502Li) obj;
        }
        if (obj != null) {
            return new C9502Li(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return this.f23069OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m21559OooO00o() {
        return this.f23070OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6368iI1II m21560OooO00o() {
        return this.f23071OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m21561OooO00o() {
        return this.f23072OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21562OooO00o() {
        return this.f23073OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m21563OooO00o() {
        return this.f23077OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m21564OooO00o() {
        return this.f23075OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        C6513lIiI r0 = this.f23074OooO00o;
        if (r0 != null) {
            return r0.m17647OooO0O0().intValue();
        }
        return -1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public iIilII1 m21565OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21566OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public l1LILI1 m21567OooO0O0() {
        return this.f23076OooO0O0;
    }
}
