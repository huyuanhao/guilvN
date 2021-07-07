package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.li丨1  reason: invalid class name and case insensitive filesystem */
public class C6710li1 extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18650OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18651OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f18652OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9542L f18653OooO00o;
    public I11L OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6456l1ilL f18654OooO0O0;

    public C6710li1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f18651OooO00o = (C6513lIiI) OooO00o2.nextElement();
        this.f18653OooO00o = C9542L.OooO00o(OooO00o2.nextElement());
        this.f18650OooO00o = C6456l1ilL.OooO00o(OooO00o2.nextElement());
        Object nextElement = OooO00o2.nextElement();
        if (nextElement instanceof AbstractC5903LlLLL) {
            this.OooO00o = I11L.OooO00o((AbstractC5903LlLLL) nextElement, false);
            nextElement = OooO00o2.nextElement();
        } else {
            this.OooO00o = null;
        }
        this.f18654OooO0O0 = C6456l1ilL.OooO00o(nextElement);
        this.f18652OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2.nextElement());
        if (OooO00o2.hasMoreElements()) {
            this.OooO0O0 = I11L.OooO00o((AbstractC5903LlLLL) OooO00o2.nextElement(), false);
        } else {
            this.OooO0O0 = null;
        }
    }

    public C6710li1(C9542L r4, C6456l1ilL r5, I11L i11l, C6456l1ilL r7, AbstractC6804llL1ii r8, I11L i11l2) {
        this.f18651OooO00o = r4.OooO00o() ? new C6513lIiI(3) : new C6513lIiI(1);
        this.f18653OooO00o = r4;
        this.f18650OooO00o = r5;
        this.OooO00o = i11l;
        this.f18654OooO0O0 = r7;
        this.f18652OooO00o = r8;
        this.OooO0O0 = i11l2;
    }

    public C6710li1(C9542L r4, C6456l1ilL r5, l1iII r6, C6456l1ilL r7, AbstractC6804llL1ii r8, l1iII r9) {
        this.f18651OooO00o = r4.OooO00o() ? new C6513lIiI(3) : new C6513lIiI(1);
        this.f18653OooO00o = r4;
        this.f18650OooO00o = r5;
        this.OooO00o = I11L.OooO00o((Object) r6);
        this.f18654OooO0O0 = r7;
        this.f18652OooO00o = r8;
        this.OooO0O0 = I11L.OooO00o((Object) r9);
    }

    public static C6710li1 OooO00o(Object obj) throws IllegalArgumentException {
        if (obj instanceof C6710li1) {
            return (C6710li1) obj;
        }
        if (obj != null) {
            return new C6710li1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17803OooO00o() {
        return this.f18650OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17804OooO00o() {
        return this.f18651OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m17805OooO00o() {
        return this.f18652OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9542L m17806OooO00o() {
        return this.f18653OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11L OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17807OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18651OooO00o);
        r0.OooO00o(this.f18653OooO00o);
        r0.OooO00o(this.f18650OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        r0.OooO00o(this.f18654OooO0O0);
        r0.OooO00o(this.f18652OooO00o);
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0O0));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17808OooO0O0() {
        return this.f18654OooO0O0;
    }
}
