package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.I丨l  reason: invalid class name and case insensitive filesystem */
public class C5556Il extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public II1lI f16074OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f16075OooO00o;

    public C5556Il(I11li1 i11li1) {
        if (i11li1.size() <= 3) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            AbstractC6854lLi1LL r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
            if (r0 instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r02 = (AbstractC5903LlLLL) r0;
                int OooO00o3 = r02.OooO00o();
                if (OooO00o3 == 0) {
                    this.f16075OooO00o = ILI.OooO00o(r02, true);
                } else if (OooO00o3 == 1) {
                    this.f16074OooO00o = II1lI.OooO00o(r02, true);
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + r02.OooO00o());
                }
                r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
            }
            if (r0 instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r03 = (AbstractC5903LlLLL) r0;
                if (r03.OooO00o() == 1) {
                    this.f16074OooO00o = II1lI.OooO00o(r03, true);
                    r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + r03.OooO00o());
                }
            }
            this.OooO00o = I11li1.OooO00o(r0);
            if (OooO00o2.hasMoreElements()) {
                throw new IllegalArgumentException("Bad object encountered: " + OooO00o2.nextElement().getClass());
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C5556Il(ILI ili, II1lI iI1lI, C1LiLi[] r3) {
        this.f16075OooO00o = ili;
        this.f16074OooO00o = iI1lI;
        this.OooO00o = new C5707LiL1(r3);
    }

    public static C5556Il OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5556Il)) {
            return (C5556Il) obj;
        }
        if (obj instanceof I11li1) {
            return new C5556Il((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public II1lI OooO00o() {
        return this.f16074OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ILI m15835OooO00o() {
        return this.f16075OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1LiLi[] m15836OooO00o() {
        C1LiLi[] r0 = new C1LiLi[this.OooO00o.size()];
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            r0[i] = C1LiLi.OooO00o(OooO00o2.nextElement());
            i++;
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f16075OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f16075OooO00o));
        }
        if (this.f16074OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.f16074OooO00o));
        }
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
