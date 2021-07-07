package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lL1丨lLI  reason: invalid class name */
public class lL1lLI extends AbstractC5738Lil {
    public C6198iL OooO00o;
    public boolean OooO0O0 = true;

    public lL1lLI() {
    }

    public lL1lLI(C6198iL r1) {
        this.OooO00o = r1;
    }

    public static lL1lLI OooO00o(Object obj) {
        if (obj instanceof lL1lLI) {
            return (lL1lLI) obj;
        }
        if ((obj instanceof AbstractC5335ILl) || AbstractC5738Lil.OooO00o(obj, 5)) {
            return new lL1lLI();
        }
        if (obj != null) {
            return new lL1lLI(C6198iL.OooO00o(obj));
        }
        return null;
    }

    public C6198iL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17664OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO0O0 ? C6452l1Lll.OooO00o : this.OooO00o.OooO0O0();
    }
}
