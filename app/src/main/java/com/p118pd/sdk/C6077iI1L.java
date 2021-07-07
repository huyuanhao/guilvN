package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.iI1L  reason: case insensitive filesystem */
public class C6077iI1L extends AbstractC5738Lil {
    public static C6849lLLIllI OooO00o = new C6849lLLIllI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC97441iIIL f17476OooO00o;

    public C6077iI1L(int i, int i2, int i3, int i4, AbstractC6804llL1ii r12) {
        this(new AbstractC97441iIIL.OooO0OO(i, i2, i3, i4, new BigInteger(1, r12.m17938OooO00o())));
    }

    public C6077iI1L(AbstractC97441iIIL r1) {
        this.f17476OooO00o = r1;
    }

    public C6077iI1L(BigInteger bigInteger, AbstractC6804llL1ii r5) {
        this(new AbstractC97441iIIL.C9745OooO0Oo(bigInteger, new BigInteger(1, r5.m17938OooO00o())));
    }

    public AbstractC97441iIIL OooO00o() {
        return this.f17476OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C6487lIIiIlL(OooO00o.OooO00o(this.f17476OooO00o.m21859OooO00o(), OooO00o.OooO00o(this.f17476OooO00o)));
    }
}
