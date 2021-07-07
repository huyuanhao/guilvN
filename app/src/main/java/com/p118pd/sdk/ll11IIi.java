package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.ll11IIi */
public class ll11IIi extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f18682OooO00o;

    public ll11IIi(int i, AbstractC6804llL1ii r5) {
        this.OooO00o = new C6513lIiI((long) i);
        this.f18682OooO00o = r5;
    }

    public ll11IIi(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.f18682OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2.nextElement());
    }

    public static ll11IIi OooO00o(Object obj) {
        if (obj instanceof ll11IIi) {
            return (ll11IIi) obj;
        }
        if (obj != null) {
            return new ll11IIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public AbstractC6804llL1ii OooO00o() {
        return this.f18682OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.OooO00o.m17647OooO0O0().intValue();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17823OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f18682OooO00o);
        return new C5707LiL1(r0);
    }
}
