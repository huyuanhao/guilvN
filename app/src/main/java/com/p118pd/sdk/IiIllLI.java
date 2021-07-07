package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IiIllLI */
public class IiIllLI extends AbstractC5738Lil {
    public static final IiIllLI OooO00o = new IiIllLI(1);
    public static final IiIllLI OooO0O0 = new IiIllLI(2);
    public static final IiIllLI OooO0OO = new IiIllLI(3);
    public static final IiIllLI OooO0Oo = new IiIllLI(4);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5841L11I f15699OooO00o;

    public IiIllLI(int i) {
        this.f15699OooO00o = new C5841L11I(i);
    }

    public IiIllLI(C5841L11I r1) {
        this.f15699OooO00o = r1;
    }

    public static IiIllLI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(C5841L11I.OooO00o(r0, z));
    }

    public static IiIllLI OooO00o(Object obj) {
        if (obj instanceof IiIllLI) {
            return (IiIllLI) obj;
        }
        if (obj != null) {
            return new IiIllLI(C5841L11I.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.f15699OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.f15699OooO00o;
    }

    public String toString() {
        int intValue = this.f15699OooO00o.OooO00o().intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(intValue);
        sb.append(intValue == OooO00o.OooO00o().intValue() ? "(CPD)" : intValue == OooO0O0.OooO00o().intValue() ? "(VSD)" : intValue == OooO0OO.OooO00o().intValue() ? "(VPKC)" : intValue == OooO0Oo.OooO00o().intValue() ? "(CCPD)" : C8932ooOOO0o.f22176OooO00o);
        return sb.toString();
    }
}
