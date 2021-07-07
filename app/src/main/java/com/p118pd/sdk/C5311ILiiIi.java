package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.ILi丨i丨Ii  reason: invalid class name and case insensitive filesystem */
public class C5311ILiiIi extends AbstractC5738Lil {
    public L1iI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15618OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f15619OooO00o;

    public C5311ILiiIi(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            int OooO00o3 = r0.OooO00o();
            if (OooO00o3 == 0) {
                this.OooO00o = L1iI1.OooO00o(r0, true);
            } else if (OooO00o3 == 1) {
                this.f15618OooO00o = C6513lIiI.OooO00o(r0, true);
            } else if (OooO00o3 == 2) {
                this.f15619OooO00o = C9623il.OooO00o(r0, true);
            } else {
                throw new IllegalArgumentException("unknown tag number: " + r0.OooO00o());
            }
        }
    }

    public static C5311ILiiIi OooO00o(Object obj) {
        if (obj instanceof C5311ILiiIi) {
            return (C5311ILiiIi) obj;
        }
        if (obj != null) {
            return new C5311ILiiIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public L1iI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15510OooO00o() {
        return this.f15618OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m15511OooO00o() {
        return this.f15619OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        if (this.f15618OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.f15618OooO00o));
        }
        if (this.f15619OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 2, this.f15619OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
