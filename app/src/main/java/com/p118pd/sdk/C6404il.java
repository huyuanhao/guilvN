package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨l  reason: invalid class name and case insensitive filesystem */
public class C6404il extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18219OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f18220OooO00o;
    public C6456l1ilL OooO0O0;

    public C6404il(I11li1 i11li1) {
        AbstractC6854lLi1LL r5;
        this.f18219OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        if (i11li1.OooO00o(1) instanceof AbstractC5903LlLLL) {
            this.OooO00o = C6456l1ilL.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), false);
            this.OooO0O0 = C6456l1ilL.OooO00o(i11li1.OooO00o(2));
            r5 = i11li1.OooO00o(3);
        } else {
            this.OooO0O0 = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            r5 = i11li1.OooO00o(2);
        }
        this.f18220OooO00o = (AbstractC6804llL1ii) r5;
    }

    public C6404il(C6456l1ilL r4, C6456l1ilL r5, AbstractC6804llL1ii r6) {
        this.f18219OooO00o = new C6513lIiI(0);
        this.OooO00o = r4;
        this.OooO0O0 = r5;
        this.f18220OooO00o = r6;
    }

    public C6404il(C6456l1ilL r4, AbstractC6804llL1ii r5) {
        this.f18219OooO00o = new C6513lIiI(0);
        this.OooO0O0 = r4;
        this.f18220OooO00o = r5;
    }

    public static C6404il OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6404il OooO00o(Object obj) {
        if (obj instanceof C6404il) {
            return (C6404il) obj;
        }
        if (obj != null) {
            return new C6404il(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17519OooO00o() {
        return this.f18219OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m17520OooO00o() {
        return this.f18220OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18219OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.f18220OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17521OooO0O0() {
        return this.OooO0O0;
    }
}
