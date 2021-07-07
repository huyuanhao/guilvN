package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.L1L1I1 */
public class L1L1I1 extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = C6174iLLi.OooO0OO;
    public int[] OooO00o;

    public L1L1I1() {
        this.OooO00o = AbstractC6163iLIl1.OooO00o();
    }

    public L1L1I1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.OooO00o = C6083iIIi1L.OooO00o(bigInteger);
    }

    public L1L1I1(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO00o(this.OooO00o, OooO00o2);
        return new L1L1I1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO00o(this.OooO00o, ((L1L1I1) r3).OooO00o, OooO00o2);
        return new L1L1I1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15905OooO00o() {
        return "SecP192K1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15906OooO00o() {
        return AbstractC6163iLIl1.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15907OooO00o() {
        return AbstractC6163iLIl1.m17091OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m15908OooO0O0() {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        AbstractC9859lil.OooO00o(C6083iIIi1L.f17489OooO00o, this.OooO00o, OooO00o2);
        return new L1L1I1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        AbstractC9859lil.OooO00o(C6083iIIi1L.f17489OooO00o, ((L1L1I1) r3).OooO00o, OooO00o2);
        C6083iIIi1L.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new L1L1I1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15909OooO0O0() {
        return AbstractC6163iLIl1.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0OO(this.OooO00o, OooO00o2);
        return new L1L1I1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0OO(this.OooO00o, ((L1L1I1) r3).OooO00o, OooO00o2);
        return new L1L1I1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m15910OooO0OO() {
        return AbstractC6163iLIl1.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (AbstractC6163iLIl1.OooO0O0(iArr) || AbstractC6163iLIl1.m17091OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0o0(iArr, OooO00o2);
        C6083iIIi1L.OooO0OO(OooO00o2, iArr, OooO00o2);
        int[] OooO00o3 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0o0(OooO00o2, OooO00o3);
        C6083iIIi1L.OooO0OO(OooO00o3, iArr, OooO00o3);
        int[] OooO00o4 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO00o(OooO00o3, 3, OooO00o4);
        C6083iIIi1L.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        C6083iIIi1L.OooO00o(OooO00o4, 2, OooO00o4);
        C6083iIIi1L.OooO0OO(OooO00o4, OooO00o2, OooO00o4);
        C6083iIIi1L.OooO00o(OooO00o4, 8, OooO00o2);
        C6083iIIi1L.OooO0OO(OooO00o2, OooO00o4, OooO00o2);
        C6083iIIi1L.OooO00o(OooO00o2, 3, OooO00o4);
        C6083iIIi1L.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        int[] OooO00o5 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO00o(OooO00o4, 16, OooO00o5);
        C6083iIIi1L.OooO0OO(OooO00o5, OooO00o2, OooO00o5);
        C6083iIIi1L.OooO00o(OooO00o5, 35, OooO00o2);
        C6083iIIi1L.OooO0OO(OooO00o2, OooO00o5, OooO00o2);
        C6083iIIi1L.OooO00o(OooO00o2, 70, OooO00o5);
        C6083iIIi1L.OooO0OO(OooO00o5, OooO00o2, OooO00o5);
        C6083iIIi1L.OooO00o(OooO00o5, 19, OooO00o2);
        C6083iIIi1L.OooO0OO(OooO00o2, OooO00o4, OooO00o2);
        C6083iIIi1L.OooO00o(OooO00o2, 20, OooO00o2);
        C6083iIIi1L.OooO0OO(OooO00o2, OooO00o4, OooO00o2);
        C6083iIIi1L.OooO00o(OooO00o2, 4, OooO00o2);
        C6083iIIi1L.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C6083iIIi1L.OooO00o(OooO00o2, 6, OooO00o2);
        C6083iIIi1L.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C6083iIIi1L.OooO0o0(OooO00o2, OooO00o2);
        C6083iIIi1L.OooO0o0(OooO00o2, OooO00o3);
        if (AbstractC6163iLIl1.m17094OooO00o(iArr, OooO00o3)) {
            return new L1L1I1(OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0o0(this.OooO00o, ((L1L1I1) r3).OooO00o, OooO00o2);
        return new L1L1I1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0o0(this.OooO00o, OooO00o2);
        return new L1L1I1(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L1L1I1)) {
            return false;
        }
        return AbstractC6163iLIl1.m17094OooO00o(this.OooO00o, ((L1L1I1) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 6);
    }
}
