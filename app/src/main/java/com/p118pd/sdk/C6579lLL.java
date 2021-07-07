package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lLL  reason: case insensitive filesystem */
public class C6579lLL extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    public C6579lLL(I11li1 i11li1) {
        this.OooO00o = C6456l1ilL.OooO00o(i11li1);
    }

    public C6579lLL(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.OooO00o = new C6456l1ilL(llLI1, r3);
    }

    public static C6579lLL OooO00o(Object obj) {
        if (obj instanceof C6579lLL) {
            return (C6579lLL) obj;
        }
        if (obj != null) {
            return new C6579lLL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17683OooO0O0() {
        return this.OooO00o.m17587OooO0O0();
    }
}
