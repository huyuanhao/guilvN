package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.IIL1丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5199IIL1 implements AbstractC5760Lil {
    public LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f15488OooO00o;
    public LlLI1 OooO0O0;

    public AbstractC5199IIL1(LlLI1 llLI1, C6888ll r2, LlLI1 llLI12) {
        this.f15488OooO00o = r2;
        this.OooO00o = llLI1;
        this.OooO0O0 = llLI12;
    }

    public abstract I11li1 OooO00o(C6456l1ilL v, C6456l1ilL v2, LIiI11 v3) throws CMSException;

    public C6413ili OooO00o(C6888ll r5) {
        return new C6413ili(new C6456l1ilL(r5.m18041OooO00o().OooO00o(), C6452l1Lll.OooO00o), r5.OooO00o().m15475OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5760Lil
    public C1lIii OooO00o(LIiI11 r7) throws CMSException {
        C9675lI r0 = new C9675lI(OooO00o(this.f15488OooO00o));
        C6456l1ilL r1 = (C5799LllI.OooO00o(this.OooO0O0.m16387OooO0O0()) || this.OooO0O0.equals(AbstractC5711LiLli.o000oo0)) ? new C6456l1ilL(this.OooO0O0, C6452l1Lll.OooO00o) : C5799LllI.OooO0O0(this.OooO00o) ? new C6456l1ilL(this.OooO0O0, new C5417Il1(AbstractC5331ILi.OooO0oo)) : new C6456l1ilL(this.OooO0O0);
        C6456l1ilL r2 = new C6456l1ilL(this.OooO00o, r1);
        I11li1 OooO00o2 = OooO00o(r2, r1, r7);
        byte[] OooO00o3 = OooO00o(r2);
        return OooO00o3 != null ? new C1lIii(new C9451L1(r0, new C6487lIIiIlL(OooO00o3), r2, OooO00o2)) : new C1lIii(new C9451L1(r0, null, r2, OooO00o2));
    }

    public abstract byte[] OooO00o(C6456l1ilL v) throws CMSException;
}
