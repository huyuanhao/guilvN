package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.iL丨1  reason: invalid class name and case insensitive filesystem */
public class C6199iL1 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6310ilIL f17801OooO00o;
    public C6310ilIL OooO0O0;

    public C6199iL1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            int OooO00o3 = r0.OooO00o();
            if (OooO00o3 == 0) {
                this.f17801OooO00o = C6310ilIL.OooO00o(r0, true);
            } else if (OooO00o3 == 1) {
                this.OooO0O0 = C6310ilIL.OooO00o(r0, true);
            } else if (OooO00o3 == 2) {
                this.OooO00o = r0.OooO0O0() ? I11li1.OooO00o(r0, true) : I11li1.OooO00o(r0, false);
                I11li1 i11li12 = this.OooO00o;
                if (i11li12 != null && i11li12.size() > 6) {
                    throw new IllegalArgumentException("postal address must contain less than 6 strings");
                }
            } else {
                throw new IllegalArgumentException("illegal tag");
            }
        }
    }

    public C6199iL1(LII lii, LII lii2, I11li1 i11li1) {
        this(C6310ilIL.OooO00o(lii), C6310ilIL.OooO00o(lii2), i11li1);
    }

    public C6199iL1(C6310ilIL r3, C6310ilIL r4, I11li1 i11li1) {
        if (i11li1 == null || i11li1.size() <= 6) {
            this.f17801OooO00o = r3;
            this.OooO0O0 = r4;
            this.OooO00o = i11li1;
            return;
        }
        throw new IllegalArgumentException("postal address must contain less than 6 strings");
    }

    public C6199iL1(C6310ilIL r2, C6310ilIL r3, C6310ilIL[] r4) {
        this(r2, r3, new C5707LiL1(r4));
    }

    public static C6199iL1 OooO00o(Object obj) {
        return (obj == null || (obj instanceof C6199iL1)) ? (C6199iL1) obj : new C6199iL1(I11li1.OooO00o(obj));
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LII m17173OooO00o() {
        if (this.f17801OooO00o == null) {
            return null;
        }
        return new LII(m17174OooO00o().OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6310ilIL m17174OooO00o() {
        return this.f17801OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6310ilIL[] m17175OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        C6310ilIL[] r1 = new C6310ilIL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C6310ilIL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public LII OooO0O0() {
        if (this.OooO0O0 == null) {
            return null;
        }
        return new LII(m17177OooO0O0().OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17176OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f17801OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f17801OooO00o));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.OooO0O0));
        }
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 2, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6310ilIL m17177OooO0O0() {
        return this.OooO0O0;
    }
}
