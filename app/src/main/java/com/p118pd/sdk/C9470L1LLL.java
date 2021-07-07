package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨L1丨LLL丨  reason: invalid class name and case insensitive filesystem */
public class C9470L1LLL extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23042OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f23043OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f23044OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C11 f23045OooO00o;
    public I11L OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6456l1ilL f23046OooO0O0;

    public C9470L1LLL(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f23043OooO00o = (C6513lIiI) OooO00o2.nextElement();
        this.f23045OooO00o = C11.OooO00o(OooO00o2.nextElement());
        this.f23042OooO00o = C6456l1ilL.OooO00o(OooO00o2.nextElement());
        Object nextElement = OooO00o2.nextElement();
        if (nextElement instanceof AbstractC5903LlLLL) {
            this.OooO00o = I11L.OooO00o((AbstractC5903LlLLL) nextElement, false);
            nextElement = OooO00o2.nextElement();
        } else {
            this.OooO00o = null;
        }
        this.f23046OooO0O0 = C6456l1ilL.OooO00o(nextElement);
        this.f23044OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2.nextElement());
        if (OooO00o2.hasMoreElements()) {
            this.OooO0O0 = I11L.OooO00o((AbstractC5903LlLLL) OooO00o2.nextElement(), false);
        } else {
            this.OooO0O0 = null;
        }
    }

    public C9470L1LLL(C6513lIiI r1, C11 r2, C6456l1ilL r3, I11L i11l, C6456l1ilL r5, AbstractC6804llL1ii r6, I11L i11l2) {
        this.f23043OooO00o = r1;
        this.f23045OooO00o = r2;
        this.f23042OooO00o = r3;
        this.OooO00o = i11l;
        this.f23046OooO0O0 = r5;
        this.f23044OooO00o = r6;
        this.OooO0O0 = i11l2;
    }

    public static C9470L1LLL OooO00o(Object obj) {
        if (obj instanceof C9470L1LLL) {
            return (C9470L1LLL) obj;
        }
        if (obj instanceof I11li1) {
            return new C9470L1LLL((I11li1) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21522OooO00o() {
        return this.f23042OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m21523OooO00o() {
        return this.f23043OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21524OooO00o() {
        return this.f23044OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C11 m21525OooO00o() {
        return this.f23045OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11L OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21526OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23043OooO00o);
        r0.OooO00o(this.f23045OooO00o);
        r0.OooO00o(this.f23042OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        r0.OooO00o(this.f23046OooO0O0);
        r0.OooO00o(this.f23044OooO00o);
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0O0));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m21527OooO0O0() {
        return this.f23046OooO0O0;
    }
}
