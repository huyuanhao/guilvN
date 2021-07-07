package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.LIi1lli1 */
public class LIi1lli1 extends AbstractC97441iIIL.OooO00o {
    public long[] OooO00o;

    public LIi1lli1() {
        this.OooO00o = AbstractC6835lIiiL1.m17983OooO00o();
    }

    public LIi1lli1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.OooO00o = C9499LLi.OooO00o(bigInteger);
    }

    public LIi1lli1(long[] jArr) {
        this.OooO00o = jArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO00o(this.OooO00o, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(int i) {
        if (i < 1) {
            return this;
        }
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO00o(this.OooO00o, i, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO00o(this.OooO00o, ((LIi1lli1) r3).OooO00o, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2) {
        return OooO0O0(r1, r2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
        return OooO0O0(r1, r2, r3);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16076OooO00o() {
        return "SecT113Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16077OooO00o() {
        return AbstractC6835lIiiL1.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16078OooO00o() {
        return AbstractC6835lIiiL1.m17981OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return 113;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m16079OooO0O0() {
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO0OO(this.OooO00o, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r1) {
        return OooO0OO(r1.m21862OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        long[] jArr = this.OooO00o;
        long[] jArr2 = ((LIi1lli1) r3).OooO00o;
        long[] jArr3 = ((LIi1lli1) r4).OooO00o;
        long[] OooO0O0 = AbstractC6835lIiiL1.m17988OooO0O0();
        C9499LLi.OooO0oO(jArr, OooO0O0);
        C9499LLi.OooO0o0(jArr2, jArr3, OooO0O0);
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO0Oo(OooO0O0, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
        long[] jArr = this.OooO00o;
        long[] jArr2 = ((LIi1lli1) r3).OooO00o;
        long[] jArr3 = ((LIi1lli1) r4).OooO00o;
        long[] jArr4 = ((LIi1lli1) r5).OooO00o;
        long[] OooO0O0 = AbstractC6835lIiiL1.m17988OooO0O0();
        C9499LLi.OooO0o0(jArr, jArr2, OooO0O0);
        C9499LLi.OooO0o0(jArr3, jArr4, OooO0O0);
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO0Oo(OooO0O0, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16080OooO0O0() {
        return AbstractC6835lIiiL1.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    public int OooO0OO() {
        return C9499LLi.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public AbstractC97441iIIL m16081OooO0OO() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO0Oo(this.OooO00o, ((LIi1lli1) r3).OooO00o, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m16082OooO0OO() {
        return (this.OooO00o[0] & 1) != 0;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0Oo() {
        return 9;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public AbstractC97441iIIL m16083OooO0Oo() {
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO0o0(this.OooO00o, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r1) {
        return OooO00o(r1);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    public int OooO0o() {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0o0() {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public AbstractC97441iIIL m16084OooO0o0() {
        long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
        C9499LLi.OooO0o(this.OooO00o, OooO00o2);
        return new LIi1lli1(OooO00o2);
    }

    public int OooO0oO() {
        return 113;
    }

    public int OooO0oo() {
        return 2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LIi1lli1)) {
            return false;
        }
        return AbstractC6835lIiiL1.m17982OooO00o(this.OooO00o, ((LIi1lli1) obj).OooO00o);
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o, 0, 2) ^ 113009;
    }
}
