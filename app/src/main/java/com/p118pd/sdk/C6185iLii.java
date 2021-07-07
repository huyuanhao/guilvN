package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.iLi丨i  reason: invalid class name and case insensitive filesystem */
public class C6185iLii extends AbstractC5738Lil {
    public L1iI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17761OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f17762OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9711ll f17763OooO00o;

    public C6185iLii(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f17763OooO00o = C9711ll.OooO00o(OooO00o2.nextElement());
        this.f17761OooO00o = C6456l1ilL.OooO00o(OooO00o2.nextElement());
        this.f17762OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2.nextElement());
        if (OooO00o2.hasMoreElements()) {
            this.OooO00o = L1iI1.OooO00o(OooO00o2.nextElement());
        }
    }

    public C6185iLii(C9711ll r1, C6456l1ilL r2, AbstractC6804llL1ii r3) {
        this.f17763OooO00o = r1;
        this.f17761OooO00o = r2;
        this.f17762OooO00o = r3;
        this.OooO00o = null;
    }

    public C6185iLii(C9711ll r1, C6456l1ilL r2, AbstractC6804llL1ii r3, L1iI1 l1iI1) {
        this.f17763OooO00o = r1;
        this.f17761OooO00o = r2;
        this.f17762OooO00o = r3;
        this.OooO00o = l1iI1;
    }

    public static C6185iLii OooO00o(Object obj) {
        if (obj instanceof C6185iLii) {
            return (C6185iLii) obj;
        }
        if (obj != null) {
            return new C6185iLii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public L1iI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17145OooO00o() {
        return this.f17761OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m17146OooO00o() {
        return this.f17762OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9711ll m17147OooO00o() {
        return this.f17763OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17763OooO00o);
        r0.OooO00o(this.f17761OooO00o);
        r0.OooO00o(this.f17762OooO00o);
        L1iI1 l1iI1 = this.OooO00o;
        if (l1iI1 != null) {
            r0.OooO00o(l1iI1);
        }
        return new C5707LiL1(r0);
    }
}
