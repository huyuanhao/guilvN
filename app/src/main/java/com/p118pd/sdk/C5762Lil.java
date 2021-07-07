package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.Li丨l丨  reason: invalid class name and case insensitive filesystem */
public class C5762Lil extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = II11L.OooO0OO;
    public int[] OooO00o;

    public C5762Lil() {
        this.OooO00o = LILLl.OooO00o();
    }

    public C5762Lil(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.OooO00o = LiLI1L1.OooO00o(bigInteger);
    }

    public C5762Lil(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = LILLl.OooO00o();
        LiLI1L1.OooO00o(this.OooO00o, OooO00o2);
        return new C5762Lil(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = LILLl.OooO00o();
        LiLI1L1.OooO00o(this.OooO00o, ((C5762Lil) r3).OooO00o, OooO00o2);
        return new C5762Lil(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16344OooO00o() {
        return "SecP160R2Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16345OooO00o() {
        return LILLl.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16346OooO00o() {
        return LILLl.m16053OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m16347OooO0O0() {
        int[] OooO00o2 = LILLl.OooO00o();
        AbstractC9859lil.OooO00o(LiLI1L1.f16599OooO00o, this.OooO00o, OooO00o2);
        return new C5762Lil(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = LILLl.OooO00o();
        AbstractC9859lil.OooO00o(LiLI1L1.f16599OooO00o, ((C5762Lil) r3).OooO00o, OooO00o2);
        LiLI1L1.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C5762Lil(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16348OooO0O0() {
        return LILLl.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = LILLl.OooO00o();
        LiLI1L1.OooO0OO(this.OooO00o, OooO00o2);
        return new C5762Lil(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = LILLl.OooO00o();
        LiLI1L1.OooO0OO(this.OooO00o, ((C5762Lil) r3).OooO00o, OooO00o2);
        return new C5762Lil(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m16349OooO0OO() {
        return LILLl.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (LILLl.OooO0O0(iArr) || LILLl.m16053OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = LILLl.OooO00o();
        LiLI1L1.OooO0o0(iArr, OooO00o2);
        LiLI1L1.OooO0OO(OooO00o2, iArr, OooO00o2);
        int[] OooO00o3 = LILLl.OooO00o();
        LiLI1L1.OooO0o0(OooO00o2, OooO00o3);
        LiLI1L1.OooO0OO(OooO00o3, iArr, OooO00o3);
        int[] OooO00o4 = LILLl.OooO00o();
        LiLI1L1.OooO0o0(OooO00o3, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, iArr, OooO00o4);
        int[] OooO00o5 = LILLl.OooO00o();
        LiLI1L1.OooO00o(OooO00o4, 3, OooO00o5);
        LiLI1L1.OooO0OO(OooO00o5, OooO00o3, OooO00o5);
        LiLI1L1.OooO00o(OooO00o5, 7, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, OooO00o5, OooO00o4);
        LiLI1L1.OooO00o(OooO00o4, 3, OooO00o5);
        LiLI1L1.OooO0OO(OooO00o5, OooO00o3, OooO00o5);
        int[] OooO00o6 = LILLl.OooO00o();
        LiLI1L1.OooO00o(OooO00o5, 14, OooO00o6);
        LiLI1L1.OooO0OO(OooO00o6, OooO00o4, OooO00o6);
        LiLI1L1.OooO00o(OooO00o6, 31, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, OooO00o6, OooO00o4);
        LiLI1L1.OooO00o(OooO00o4, 62, OooO00o6);
        LiLI1L1.OooO0OO(OooO00o6, OooO00o4, OooO00o6);
        LiLI1L1.OooO00o(OooO00o6, 3, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        LiLI1L1.OooO00o(OooO00o4, 18, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, OooO00o5, OooO00o4);
        LiLI1L1.OooO00o(OooO00o4, 2, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, iArr, OooO00o4);
        LiLI1L1.OooO00o(OooO00o4, 3, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, OooO00o2, OooO00o4);
        LiLI1L1.OooO00o(OooO00o4, 6, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        LiLI1L1.OooO00o(OooO00o4, 2, OooO00o4);
        LiLI1L1.OooO0OO(OooO00o4, iArr, OooO00o4);
        LiLI1L1.OooO0o0(OooO00o4, OooO00o2);
        if (LILLl.m16056OooO00o(iArr, OooO00o2)) {
            return new C5762Lil(OooO00o4);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = LILLl.OooO00o();
        LiLI1L1.OooO0o0(this.OooO00o, ((C5762Lil) r3).OooO00o, OooO00o2);
        return new C5762Lil(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = LILLl.OooO00o();
        LiLI1L1.OooO0o0(this.OooO00o, OooO00o2);
        return new C5762Lil(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5762Lil)) {
            return false;
        }
        return LILLl.m16056OooO00o(this.OooO00o, ((C5762Lil) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 5);
    }
}
