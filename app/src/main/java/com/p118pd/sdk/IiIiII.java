package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.IiIiII */
public class IiIiII extends AbstractC5738Lil {
    public LI1I OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15692OooO00o;
    public AbstractC6804llL1ii OooO0O0;

    public IiIiII(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = LI1I.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            if (r0.OooO00o() == 0) {
                this.f15692OooO00o = (AbstractC6804llL1ii) r0.OooO0o();
            } else if (r0.OooO00o() == 2) {
                this.OooO0O0 = (AbstractC6804llL1ii) r0.OooO0o();
            }
        }
    }

    public IiIiII(LI1I r1, AbstractC6804llL1ii r2, AbstractC6804llL1ii r3) {
        this.OooO00o = r1;
        this.f15692OooO00o = r2;
        this.OooO0O0 = r3;
    }

    public static IiIiII OooO00o(Object obj) {
        if (obj instanceof IiIiII) {
            return (IiIiII) obj;
        }
        if (obj != null) {
            return new IiIiII(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LI1I OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m15564OooO00o() {
        return this.f15692OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        if (this.f15692OooO00o != null) {
            r0.OooO00o(new ILI1Ll(0, this.f15692OooO00o));
        }
        r0.OooO00o(new ILI1Ll(2, this.OooO0O0));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6804llL1ii m15565OooO0O0() {
        return this.OooO0O0;
    }
}
