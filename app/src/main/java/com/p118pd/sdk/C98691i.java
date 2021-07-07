package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨丨丨1丨i  reason: invalid class name and case insensitive filesystem */
public class C98691i extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = C5763LiIII1.OooO0OO;
    public int[] OooO00o;

    public C98691i() {
        this.OooO00o = C1iiIiI.OooO00o(17);
    }

    public C98691i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.OooO00o = C6742ll1lI.OooO00o(bigInteger);
    }

    public C98691i(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO00o(this.OooO00o, OooO00o2);
        return new C98691i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO00o(this.OooO00o, ((C98691i) r3).OooO00o, OooO00o2);
        return new C98691i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21953OooO00o() {
        return "SecP521R1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21954OooO00o() {
        return C1iiIiI.m21315OooO00o(17, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21955OooO00o() {
        return C1iiIiI.m21322OooO00o(17, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m21956OooO0O0() {
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        AbstractC9859lil.OooO00o(C6742ll1lI.f18714OooO00o, this.OooO00o, OooO00o2);
        return new C98691i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        AbstractC9859lil.OooO00o(C6742ll1lI.f18714OooO00o, ((C98691i) r3).OooO00o, OooO00o2);
        C6742ll1lI.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C98691i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21957OooO0O0() {
        return C1iiIiI.m21328OooO0O0(17, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO0Oo(this.OooO00o, OooO00o2);
        return new C98691i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO0OO(this.OooO00o, ((C98691i) r3).OooO00o, OooO00o2);
        return new C98691i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21958OooO0OO() {
        return C1iiIiI.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (C1iiIiI.m21328OooO0O0(17, iArr) || C1iiIiI.m21322OooO00o(17, iArr)) {
            return this;
        }
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        int[] OooO00o3 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO00o(iArr, 519, OooO00o2);
        C6742ll1lI.OooO0o(OooO00o2, OooO00o3);
        if (C1iiIiI.m21323OooO00o(17, iArr, OooO00o3)) {
            return new C98691i(OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO0Oo(this.OooO00o, ((C98691i) r3).OooO00o, OooO00o2);
        return new C98691i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO0o(this.OooO00o, OooO00o2);
        return new C98691i(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C98691i)) {
            return false;
        }
        return C1iiIiI.m21323OooO00o(17, this.OooO00o, ((C98691i) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 17);
    }
}
