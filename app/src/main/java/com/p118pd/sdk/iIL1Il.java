package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.iIL1Il */
public class iIL1Il extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = LLLLil1.OooO0OO;
    public int[] OooO00o;

    public iIL1Il() {
        this.OooO00o = LILLl.OooO00o();
    }

    public iIL1Il(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.OooO00o = C9822Li1.OooO00o(bigInteger);
    }

    public iIL1Il(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = LILLl.OooO00o();
        C9822Li1.OooO00o(this.OooO00o, OooO00o2);
        return new iIL1Il(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = LILLl.OooO00o();
        C9822Li1.OooO00o(this.OooO00o, ((iIL1Il) r3).OooO00o, OooO00o2);
        return new iIL1Il(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16955OooO00o() {
        return "SecP160R1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16956OooO00o() {
        return LILLl.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16957OooO00o() {
        return LILLl.m16053OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m16958OooO0O0() {
        int[] OooO00o2 = LILLl.OooO00o();
        AbstractC9859lil.OooO00o(C9822Li1.f23420OooO00o, this.OooO00o, OooO00o2);
        return new iIL1Il(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = LILLl.OooO00o();
        AbstractC9859lil.OooO00o(C9822Li1.f23420OooO00o, ((iIL1Il) r3).OooO00o, OooO00o2);
        C9822Li1.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new iIL1Il(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16959OooO0O0() {
        return LILLl.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = LILLl.OooO00o();
        C9822Li1.OooO0OO(this.OooO00o, OooO00o2);
        return new iIL1Il(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = LILLl.OooO00o();
        C9822Li1.OooO0OO(this.OooO00o, ((iIL1Il) r3).OooO00o, OooO00o2);
        return new iIL1Il(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m16960OooO0OO() {
        return LILLl.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (LILLl.OooO0O0(iArr) || LILLl.m16053OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = LILLl.OooO00o();
        C9822Li1.OooO0o0(iArr, OooO00o2);
        C9822Li1.OooO0OO(OooO00o2, iArr, OooO00o2);
        int[] OooO00o3 = LILLl.OooO00o();
        C9822Li1.OooO00o(OooO00o2, 2, OooO00o3);
        C9822Li1.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C9822Li1.OooO00o(OooO00o3, 4, OooO00o2);
        C9822Li1.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C9822Li1.OooO00o(OooO00o2, 8, OooO00o3);
        C9822Li1.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C9822Li1.OooO00o(OooO00o3, 16, OooO00o2);
        C9822Li1.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C9822Li1.OooO00o(OooO00o2, 32, OooO00o3);
        C9822Li1.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C9822Li1.OooO00o(OooO00o3, 64, OooO00o2);
        C9822Li1.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C9822Li1.OooO0o0(OooO00o2, OooO00o3);
        C9822Li1.OooO0OO(OooO00o3, iArr, OooO00o3);
        C9822Li1.OooO00o(OooO00o3, 29, OooO00o3);
        C9822Li1.OooO0o0(OooO00o3, OooO00o2);
        if (LILLl.m16056OooO00o(iArr, OooO00o2)) {
            return new iIL1Il(OooO00o3);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = LILLl.OooO00o();
        C9822Li1.OooO0o0(this.OooO00o, ((iIL1Il) r3).OooO00o, OooO00o2);
        return new iIL1Il(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = LILLl.OooO00o();
        C9822Li1.OooO0o0(this.OooO00o, OooO00o2);
        return new iIL1Il(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iIL1Il)) {
            return false;
        }
        return LILLl.m16056OooO00o(this.OooO00o, ((iIL1Il) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 5);
    }
}
