package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.Ii1  reason: case insensitive filesystem */
public class C5336Ii1 extends AbstractC5738Lil {
    public LilIiIl OooO00o;
    public LilIiIl OooO0O0;

    public C5336Ii1(I11li1 i11li1) {
        if (i11li1.size() == 1 || i11li1.size() == 2) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            while (OooO00o2.hasMoreElements()) {
                AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2.nextElement());
                if (OooO00o3.OooO00o() == 0) {
                    this.OooO00o = LilIiIl.OooO00o(OooO00o3, true);
                } else if (OooO00o3.OooO00o() == 1) {
                    this.OooO0O0 = LilIiIl.OooO00o(OooO00o3, true);
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + OooO00o3.OooO00o());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C5336Ii1(LilIiIl lilIiIl, LilIiIl lilIiIl2) {
        this.OooO00o = lilIiIl;
        this.OooO0O0 = lilIiIl2;
    }

    public static C5336Ii1 OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5336Ii1)) {
            return (C5336Ii1) obj;
        }
        if (obj instanceof I11li1) {
            return new C5336Ii1((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public LilIiIl OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public LilIiIl OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15546OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(0, this.OooO00o));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(1, this.OooO0O0));
        }
        return new C5707LiL1(r0);
    }
}
