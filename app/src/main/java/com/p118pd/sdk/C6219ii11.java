package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.ii11  reason: case insensitive filesystem */
public class C6219ii11 extends AbstractC97441iIIL.OooO00o {
    public long[] OooO00o;

    public C6219ii11() {
        this.OooO00o = AbstractC6163iLIl1.m17097OooO00o();
    }

    public C6219ii11(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.OooO00o = II1LIi.OooO00o(bigInteger);
    }

    public C6219ii11(long[] jArr) {
        this.OooO00o = jArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO00o(this.OooO00o, OooO00o2);
        return new C6219ii11(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(int i) {
        if (i < 1) {
            return this;
        }
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO00o(this.OooO00o, i, OooO00o2);
        return new C6219ii11(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO00o(this.OooO00o, ((C6219ii11) r3).OooO00o, OooO00o2);
        return new C6219ii11(OooO00o2);
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
    public String m17208OooO00o() {
        return "SecT163Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17209OooO00o() {
        return AbstractC6163iLIl1.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17210OooO00o() {
        return AbstractC6163iLIl1.m17095OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return 163;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m17211OooO0O0() {
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO0OO(this.OooO00o, OooO00o2);
        return new C6219ii11(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r1) {
        return OooO0OO(r1.m21862OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        long[] jArr = this.OooO00o;
        long[] jArr2 = ((C6219ii11) r3).OooO00o;
        long[] jArr3 = ((C6219ii11) r4).OooO00o;
        long[] OooO0O0 = AbstractC6163iLIl1.m17102OooO0O0();
        II1LIi.OooO0oO(jArr, OooO0O0);
        II1LIi.OooO0o0(jArr2, jArr3, OooO0O0);
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO0Oo(OooO0O0, OooO00o2);
        return new C6219ii11(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
        long[] jArr = this.OooO00o;
        long[] jArr2 = ((C6219ii11) r3).OooO00o;
        long[] jArr3 = ((C6219ii11) r4).OooO00o;
        long[] jArr4 = ((C6219ii11) r5).OooO00o;
        long[] OooO0O0 = AbstractC6163iLIl1.m17102OooO0O0();
        II1LIi.OooO0o0(jArr, jArr2, OooO0O0);
        II1LIi.OooO0o0(jArr3, jArr4, OooO0O0);
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO0Oo(OooO0O0, OooO00o2);
        return new C6219ii11(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17212OooO0O0() {
        return AbstractC6163iLIl1.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    public int OooO0OO() {
        return II1LIi.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public AbstractC97441iIIL m17213OooO0OO() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO0Oo(this.OooO00o, ((C6219ii11) r3).OooO00o, OooO00o2);
        return new C6219ii11(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m17214OooO0OO() {
        return (this.OooO00o[0] & 1) != 0;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0Oo() {
        return 3;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public AbstractC97441iIIL m17215OooO0Oo() {
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO0o0(this.OooO00o, OooO00o2);
        return new C6219ii11(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r1) {
        return OooO00o(r1);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    public int OooO0o() {
        return 7;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0o0() {
        return 6;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public AbstractC97441iIIL m17216OooO0o0() {
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        II1LIi.OooO0o(this.OooO00o, OooO00o2);
        return new C6219ii11(OooO00o2);
    }

    public int OooO0oO() {
        return 163;
    }

    public int OooO0oo() {
        return 3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6219ii11)) {
            return false;
        }
        return AbstractC6163iLIl1.m17096OooO00o(this.OooO00o, ((C6219ii11) obj).OooO00o);
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o, 0, 3) ^ 163763;
    }
}
