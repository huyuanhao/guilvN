package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨11li丨L1  reason: invalid class name */
public class C11liL1 extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = C5470Illi.OooO0OO;
    public int[] OooO00o;

    public C11liL1() {
        this.OooO00o = C1LLlIL.OooO00o();
    }

    public C11liL1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.OooO00o = C9506LiLIL.OooO00o(bigInteger);
    }

    public C11liL1(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9506LiLIL.OooO00o(this.OooO00o, OooO00o2);
        return new C11liL1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9506LiLIL.OooO00o(this.OooO00o, ((C11liL1) r3).OooO00o, OooO00o2);
        return new C11liL1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21252OooO00o() {
        return "SecP256R1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21253OooO00o() {
        return C1LLlIL.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21254OooO00o() {
        return C1LLlIL.m21842OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m21255OooO0O0() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        AbstractC9859lil.OooO00o(C9506LiLIL.f23083OooO00o, this.OooO00o, OooO00o2);
        return new C11liL1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        AbstractC9859lil.OooO00o(C9506LiLIL.f23083OooO00o, ((C11liL1) r3).OooO00o, OooO00o2);
        C9506LiLIL.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C11liL1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21256OooO0O0() {
        return C1LLlIL.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9506LiLIL.OooO0OO(this.OooO00o, OooO00o2);
        return new C11liL1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9506LiLIL.OooO0OO(this.OooO00o, ((C11liL1) r3).OooO00o, OooO00o2);
        return new C11liL1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21257OooO0OO() {
        return C1LLlIL.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (C1LLlIL.OooO0O0(iArr) || C1LLlIL.m21842OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = C1LLlIL.OooO00o();
        int[] OooO00o3 = C1LLlIL.OooO00o();
        C9506LiLIL.OooO0o0(iArr, OooO00o2);
        C9506LiLIL.OooO0OO(OooO00o2, iArr, OooO00o2);
        C9506LiLIL.OooO00o(OooO00o2, 2, OooO00o3);
        C9506LiLIL.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C9506LiLIL.OooO00o(OooO00o3, 4, OooO00o2);
        C9506LiLIL.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C9506LiLIL.OooO00o(OooO00o2, 8, OooO00o3);
        C9506LiLIL.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C9506LiLIL.OooO00o(OooO00o3, 16, OooO00o2);
        C9506LiLIL.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C9506LiLIL.OooO00o(OooO00o2, 32, OooO00o2);
        C9506LiLIL.OooO0OO(OooO00o2, iArr, OooO00o2);
        C9506LiLIL.OooO00o(OooO00o2, 96, OooO00o2);
        C9506LiLIL.OooO0OO(OooO00o2, iArr, OooO00o2);
        C9506LiLIL.OooO00o(OooO00o2, 94, OooO00o2);
        C9506LiLIL.OooO0o0(OooO00o2, OooO00o3);
        if (C1LLlIL.m21845OooO00o(iArr, OooO00o3)) {
            return new C11liL1(OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9506LiLIL.OooO0o0(this.OooO00o, ((C11liL1) r3).OooO00o, OooO00o2);
        return new C11liL1(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9506LiLIL.OooO0o0(this.OooO00o, OooO00o2);
        return new C11liL1(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11liL1)) {
            return false;
        }
        return C1LLlIL.m21845OooO00o(this.OooO00o, ((C11liL1) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 8);
    }
}
