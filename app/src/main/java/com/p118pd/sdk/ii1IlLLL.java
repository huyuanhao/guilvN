package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ii1IlLLL */
public class ii1IlLLL extends AbstractC5738Lil implements AbstractC5462Ilil {
    public C5187I1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1I1LlI f17834OooO00o;

    public ii1IlLLL(C5187I1l r1) {
        this.OooO00o = r1;
    }

    public ii1IlLLL(Ii1I1LlI ii1I1LlI) {
        this.f17834OooO00o = ii1I1LlI;
    }

    public static ii1IlLLL OooO00o(Object obj) {
        return obj instanceof ii1IlLLL ? (ii1IlLLL) obj : obj instanceof AbstractC5903LlLLL ? new ii1IlLLL(Ii1I1LlI.OooO00o((AbstractC5903LlLLL) obj, false)) : obj instanceof C5187I1l ? new ii1IlLLL((C5187I1l) obj) : new ii1IlLLL(C5187I1l.OooO00o(obj));
    }

    public boolean OooO00o() {
        return this.OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        C5187I1l r0 = this.OooO00o;
        return r0 != null ? r0.m15317OooO0O0() : new ILI1Ll(false, 0, this.f17834OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17229OooO0O0() {
        C5187I1l r0 = this.OooO00o;
        return r0 != null ? r0 : this.f17834OooO00o;
    }
}
