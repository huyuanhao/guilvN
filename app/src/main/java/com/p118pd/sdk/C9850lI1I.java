package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨lI1I  reason: invalid class name and case insensitive filesystem */
public class C9850lI1I extends AbstractC5738Lil {
    public C5870LiLlI OooO00o;

    public C9850lI1I(AbstractC6854lLi1LL r1) {
        this.OooO00o = C5870LiLlI.OooO00o(r1);
    }

    public C9850lI1I(String str, iILLL1 r4) {
        this.OooO00o = new C5870LiLlI(new LlLI1(str), new i1I1I1l(r4));
    }

    public C9850lI1I(String str, AbstractC6854lLi1LL r4) {
        this.OooO00o = new C5870LiLlI(new LlLI1(str), new i1I1I1l(r4));
    }

    public AbstractC6854lLi1LL[] OooO00o() {
        I11L OooO00o2 = this.OooO00o.OooO00o();
        AbstractC6854lLi1LL[] r1 = new AbstractC6854lLi1LL[OooO00o2.size()];
        for (int i = 0; i != OooO00o2.size(); i++) {
            r1[i] = OooO00o2.OooO00o(i);
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m21933OooO0O0() {
        return this.OooO00o.m16459OooO00o().m16387OooO0O0();
    }
}
