package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.llL丨1  reason: invalid class name and case insensitive filesystem */
public class C6777llL1 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5646LII1 f18798OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f18799OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C97411 f18800OooO00o;

    public C6777llL1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f18798OooO00o = C5646LII1.OooO00o(OooO00o2.nextElement());
        this.f18800OooO00o = C97411.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            if (r0.OooO00o() == 0) {
                this.f18799OooO00o = iIilII1.OooO00o(r0, true);
            } else {
                this.OooO00o = I11li1.OooO00o(r0, true);
            }
        }
    }

    public C6777llL1(C5646LII1 r2, C97411 r3) {
        this(r2, r3, null, null);
    }

    public C6777llL1(C5646LII1 r2, C97411 r3, iIilII1 iiilii1) {
        this(r2, r3, iiilii1, null);
    }

    public C6777llL1(C5646LII1 r1, C97411 r2, iIilII1 iiilii1, C9826LllL[] r4) {
        this.f18798OooO00o = r1;
        this.f18800OooO00o = r2;
        this.f18799OooO00o = iiilii1;
        if (r4 != null) {
            iILLL1 r12 = new iILLL1();
            for (C9826LllL r3 : r4) {
                r12.OooO00o(r3);
            }
            this.OooO00o = new C5707LiL1(r12);
        }
    }

    public static C6777llL1 OooO00o(Object obj) {
        if (obj instanceof C6777llL1) {
            return (C6777llL1) obj;
        }
        if (obj != null) {
            return new C6777llL1(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r3, int i, AbstractC6854lLi1LL r5) {
        if (r5 != null) {
            r3.OooO00o(new ILI1Ll(true, i, r5));
        }
    }

    public C5646LII1 OooO00o() {
        return this.f18798OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m17897OooO00o() {
        return this.f18799OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C97411 m17898OooO00o() {
        return this.f18800OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9826LllL[] m17899OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        C9826LllL[] r1 = new C9826LllL[size];
        for (int i = 0; i < size; i++) {
            r1[i] = C9826LllL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18798OooO00o);
        r0.OooO00o(this.f18800OooO00o);
        OooO00o(r0, 0, this.f18799OooO00o);
        OooO00o(r0, 1, this.OooO00o);
        return new C5707LiL1(r0);
    }
}
