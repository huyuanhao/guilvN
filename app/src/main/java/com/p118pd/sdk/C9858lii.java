package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨丨lii  reason: invalid class name and case insensitive filesystem */
public class C9858lii extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = IIilI.OooO0OO;
    public int[] OooO00o;

    public C9858lii() {
        this.OooO00o = C1iiIiI.OooO00o(12);
    }

    public C9858lii(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.OooO00o = C6349ilill1.OooO00o(bigInteger);
    }

    public C9858lii(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO00o(this.OooO00o, OooO00o2);
        return new C9858lii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO00o(this.OooO00o, ((C9858lii) r3).OooO00o, OooO00o2);
        return new C9858lii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21942OooO00o() {
        return "SecP384R1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21943OooO00o() {
        return C1iiIiI.m21315OooO00o(12, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21944OooO00o() {
        return C1iiIiI.m21322OooO00o(12, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m21945OooO0O0() {
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        AbstractC9859lil.OooO00o(C6349ilill1.f18112OooO00o, this.OooO00o, OooO00o2);
        return new C9858lii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        AbstractC9859lil.OooO00o(C6349ilill1.f18112OooO00o, ((C9858lii) r3).OooO00o, OooO00o2);
        C6349ilill1.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C9858lii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21946OooO0O0() {
        return C1iiIiI.m21328OooO0O0(12, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0OO(this.OooO00o, OooO00o2);
        return new C9858lii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0OO(this.OooO00o, ((C9858lii) r3).OooO00o, OooO00o2);
        return new C9858lii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21947OooO0OO() {
        return C1iiIiI.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (C1iiIiI.m21328OooO0O0(12, iArr) || C1iiIiI.m21322OooO00o(12, iArr)) {
            return this;
        }
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        int[] OooO00o3 = C1iiIiI.OooO00o(12);
        int[] OooO00o4 = C1iiIiI.OooO00o(12);
        int[] OooO00o5 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0o0(iArr, OooO00o2);
        C6349ilill1.OooO0OO(OooO00o2, iArr, OooO00o2);
        C6349ilill1.OooO00o(OooO00o2, 2, OooO00o3);
        C6349ilill1.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C6349ilill1.OooO0o0(OooO00o3, OooO00o3);
        C6349ilill1.OooO0OO(OooO00o3, iArr, OooO00o3);
        C6349ilill1.OooO00o(OooO00o3, 5, OooO00o4);
        C6349ilill1.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        C6349ilill1.OooO00o(OooO00o4, 5, OooO00o5);
        C6349ilill1.OooO0OO(OooO00o5, OooO00o3, OooO00o5);
        C6349ilill1.OooO00o(OooO00o5, 15, OooO00o3);
        C6349ilill1.OooO0OO(OooO00o3, OooO00o5, OooO00o3);
        C6349ilill1.OooO00o(OooO00o3, 2, OooO00o4);
        C6349ilill1.OooO0OO(OooO00o2, OooO00o4, OooO00o2);
        C6349ilill1.OooO00o(OooO00o4, 28, OooO00o4);
        C6349ilill1.OooO0OO(OooO00o3, OooO00o4, OooO00o3);
        C6349ilill1.OooO00o(OooO00o3, 60, OooO00o4);
        C6349ilill1.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        C6349ilill1.OooO00o(OooO00o4, 120, OooO00o3);
        C6349ilill1.OooO0OO(OooO00o3, OooO00o4, OooO00o3);
        C6349ilill1.OooO00o(OooO00o3, 15, OooO00o3);
        C6349ilill1.OooO0OO(OooO00o3, OooO00o5, OooO00o3);
        C6349ilill1.OooO00o(OooO00o3, 33, OooO00o3);
        C6349ilill1.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C6349ilill1.OooO00o(OooO00o3, 64, OooO00o3);
        C6349ilill1.OooO0OO(OooO00o3, iArr, OooO00o3);
        C6349ilill1.OooO00o(OooO00o3, 30, OooO00o2);
        C6349ilill1.OooO0o0(OooO00o2, OooO00o3);
        if (C1iiIiI.m21323OooO00o(12, iArr, OooO00o3)) {
            return new C9858lii(OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0Oo(this.OooO00o, ((C9858lii) r3).OooO00o, OooO00o2);
        return new C9858lii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0o0(this.OooO00o, OooO00o2);
        return new C9858lii(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9858lii)) {
            return false;
        }
        return C1iiIiI.m21323OooO00o(12, this.OooO00o, ((C9858lii) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 12);
    }
}
