package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨Ll丨lI1L  reason: invalid class name and case insensitive filesystem */
public class C9540LllI1L extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = C9422IlL.OooO0OO;
    public int[] OooO00o;

    public C9540LllI1L() {
        this.OooO00o = AbstractC6163iLIl1.OooO00o();
    }

    public C9540LllI1L(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.OooO00o = IIIil.OooO00o(bigInteger);
    }

    public C9540LllI1L(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO00o(this.OooO00o, OooO00o2);
        return new C9540LllI1L(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO00o(this.OooO00o, ((C9540LllI1L) r3).OooO00o, OooO00o2);
        return new C9540LllI1L(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21596OooO00o() {
        return "SecP192R1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21597OooO00o() {
        return AbstractC6163iLIl1.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21598OooO00o() {
        return AbstractC6163iLIl1.m17091OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m21599OooO0O0() {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        AbstractC9859lil.OooO00o(IIIil.f15467OooO00o, this.OooO00o, OooO00o2);
        return new C9540LllI1L(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        AbstractC9859lil.OooO00o(IIIil.f15467OooO00o, ((C9540LllI1L) r3).OooO00o, OooO00o2);
        IIIil.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C9540LllI1L(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21600OooO0O0() {
        return AbstractC6163iLIl1.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0OO(this.OooO00o, OooO00o2);
        return new C9540LllI1L(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0OO(this.OooO00o, ((C9540LllI1L) r3).OooO00o, OooO00o2);
        return new C9540LllI1L(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21601OooO0OO() {
        return AbstractC6163iLIl1.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (AbstractC6163iLIl1.OooO0O0(iArr) || AbstractC6163iLIl1.m17091OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        int[] OooO00o3 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0o0(iArr, OooO00o2);
        IIIil.OooO0OO(OooO00o2, iArr, OooO00o2);
        IIIil.OooO00o(OooO00o2, 2, OooO00o3);
        IIIil.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        IIIil.OooO00o(OooO00o3, 4, OooO00o2);
        IIIil.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        IIIil.OooO00o(OooO00o2, 8, OooO00o3);
        IIIil.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        IIIil.OooO00o(OooO00o3, 16, OooO00o2);
        IIIil.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        IIIil.OooO00o(OooO00o2, 32, OooO00o3);
        IIIil.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        IIIil.OooO00o(OooO00o3, 64, OooO00o2);
        IIIil.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        IIIil.OooO00o(OooO00o2, 62, OooO00o2);
        IIIil.OooO0o0(OooO00o2, OooO00o3);
        if (AbstractC6163iLIl1.m17094OooO00o(iArr, OooO00o3)) {
            return new C9540LllI1L(OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0o0(this.OooO00o, ((C9540LllI1L) r3).OooO00o, OooO00o2);
        return new C9540LllI1L(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0o0(this.OooO00o, OooO00o2);
        return new C9540LllI1L(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9540LllI1L)) {
            return false;
        }
        return AbstractC6163iLIl1.m17094OooO00o(this.OooO00o, ((C9540LllI1L) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 6);
    }
}
