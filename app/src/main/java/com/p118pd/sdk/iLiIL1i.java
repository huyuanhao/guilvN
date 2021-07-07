package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.iLiIL1i */
public class iLiIL1i extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = C5821LlI.OooO0OO;
    public int[] OooO00o;

    public iLiIL1i() {
        this.OooO00o = AbstractC6835lIiiL1.OooO00o();
    }

    public iLiIL1i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.OooO00o = Ll11ILL.OooO00o(bigInteger);
    }

    public iLiIL1i(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO00o(this.OooO00o, OooO00o2);
        return new iLiIL1i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO00o(this.OooO00o, ((iLiIL1i) r3).OooO00o, OooO00o2);
        return new iLiIL1i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17129OooO00o() {
        return "SecP128R1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17130OooO00o() {
        return AbstractC6835lIiiL1.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17131OooO00o() {
        return AbstractC6835lIiiL1.m17977OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m17132OooO0O0() {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        AbstractC9859lil.OooO00o(Ll11ILL.f16681OooO00o, this.OooO00o, OooO00o2);
        return new iLiIL1i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        AbstractC9859lil.OooO00o(Ll11ILL.f16681OooO00o, ((iLiIL1i) r3).OooO00o, OooO00o2);
        Ll11ILL.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new iLiIL1i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17133OooO0O0() {
        return AbstractC6835lIiiL1.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0OO(this.OooO00o, OooO00o2);
        return new iLiIL1i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0OO(this.OooO00o, ((iLiIL1i) r3).OooO00o, OooO00o2);
        return new iLiIL1i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m17134OooO0OO() {
        return AbstractC6835lIiiL1.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (AbstractC6835lIiiL1.OooO0O0(iArr) || AbstractC6835lIiiL1.m17977OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0o0(iArr, OooO00o2);
        Ll11ILL.OooO0OO(OooO00o2, iArr, OooO00o2);
        int[] OooO00o3 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO00o(OooO00o2, 2, OooO00o3);
        Ll11ILL.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        int[] OooO00o4 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO00o(OooO00o3, 4, OooO00o4);
        Ll11ILL.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        Ll11ILL.OooO00o(OooO00o4, 2, OooO00o3);
        Ll11ILL.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        Ll11ILL.OooO00o(OooO00o3, 10, OooO00o2);
        Ll11ILL.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        Ll11ILL.OooO00o(OooO00o2, 10, OooO00o4);
        Ll11ILL.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        Ll11ILL.OooO0o0(OooO00o4, OooO00o3);
        Ll11ILL.OooO0OO(OooO00o3, iArr, OooO00o3);
        Ll11ILL.OooO00o(OooO00o3, 95, OooO00o3);
        Ll11ILL.OooO0o0(OooO00o3, OooO00o4);
        if (AbstractC6835lIiiL1.m17980OooO00o(iArr, OooO00o4)) {
            return new iLiIL1i(OooO00o3);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0o0(this.OooO00o, ((iLiIL1i) r3).OooO00o, OooO00o2);
        return new iLiIL1i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0o0(this.OooO00o, OooO00o2);
        return new iLiIL1i(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iLiIL1i)) {
            return false;
        }
        return AbstractC6835lIiiL1.m17980OooO00o(this.OooO00o, ((iLiIL1i) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 4);
    }
}
