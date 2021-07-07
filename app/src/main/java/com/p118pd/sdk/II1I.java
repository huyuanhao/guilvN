package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.II1I */
public class II1I implements IiLLiIL {
    public LL1ii1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f15442OooO00o;

    public II1I(BigInteger bigInteger) {
        this.f15442OooO00o = bigInteger;
    }

    @Override // com.p118pd.sdk.ILIlii
    public C6238iiL1 OooO00o(C6238iiL1 iil1) {
        LL1ii1l r0 = this.OooO00o;
        if (r0 != null) {
            C5600L1iLL OooO00o2 = r0.OooO00o();
            BigInteger OooO0OO = OooO00o2.OooO0OO();
            AbstractC6615lLl1Ii OooO00o3 = OooO00o();
            BigInteger mod = this.f15442OooO00o.mod(OooO0OO);
            AbstractC9738llL1L[] r3 = {OooO00o3.OooO00o(OooO00o2.m16003OooO00o(), mod).OooO00o(Lii1I.OooO00o(OooO00o2.OooO00o(), iil1.OooO00o())), this.OooO00o.OooO00o().OooO00o(mod).OooO00o(Lii1I.OooO00o(OooO00o2.OooO00o(), iil1.OooO0O0()))};
            OooO00o2.OooO00o().OooO0O0(r3);
            return new C6238iiL1(r3[0], r3[1]);
        }
        throw new IllegalStateException("ECFixedTransform not initialised");
    }

    @Override // com.p118pd.sdk.IiLLiIL
    public AbstractC6615lLl1Ii OooO00o() {
        return new C9372Ii1();
    }

    @Override // com.p118pd.sdk.IiLLiIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15352OooO00o() {
        return this.f15442OooO00o;
    }

    @Override // com.p118pd.sdk.ILIlii
    public void OooO00o(AbstractC6370iIIIl r2) {
        if (r2 instanceof LL1ii1l) {
            this.OooO00o = (LL1ii1l) r2;
            return;
        }
        throw new IllegalArgumentException("ECPublicKeyParameters are required for fixed transform.");
    }
}
