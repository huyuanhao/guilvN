package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨L1l  reason: invalid class name and case insensitive filesystem */
public class C9464L1l extends AbstractC5738Lil {
    public AbstractC5335ILl OooO00o;

    public C9464L1l() {
        this.OooO00o = C6452l1Lll.OooO00o;
    }

    public C9464L1l(AbstractC5335ILl r1) {
        this.OooO00o = r1;
    }

    public static C9464L1l OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9464L1l)) {
            return (C9464L1l) obj;
        }
        if (obj instanceof AbstractC5335ILl) {
            return new C9464L1l((AbstractC5335ILl) obj);
        }
        throw new IllegalArgumentException("Invalid object: " + obj.getClass().getName());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
