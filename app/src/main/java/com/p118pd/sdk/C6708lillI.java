package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.lil丨lI丨  reason: invalid class name and case insensitive filesystem */
public class C6708lillI extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = C6508lIiL.OooO0OO;
    public int[] OooO00o;

    public C6708lillI() {
        this.OooO00o = C1LLlIL.OooO00o();
    }

    public C6708lillI(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.OooO00o = IiIi1lI.OooO00o(bigInteger);
    }

    public C6708lillI(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        IiIi1lI.OooO00o(this.OooO00o, OooO00o2);
        return new C6708lillI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        IiIi1lI.OooO00o(this.OooO00o, ((C6708lillI) r3).OooO00o, OooO00o2);
        return new C6708lillI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17795OooO00o() {
        return "SecP256K1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17796OooO00o() {
        return C1LLlIL.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17797OooO00o() {
        return C1LLlIL.m21842OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m17798OooO0O0() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        AbstractC9859lil.OooO00o(IiIi1lI.f15689OooO00o, this.OooO00o, OooO00o2);
        return new C6708lillI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        AbstractC9859lil.OooO00o(IiIi1lI.f15689OooO00o, ((C6708lillI) r3).OooO00o, OooO00o2);
        IiIi1lI.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C6708lillI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17799OooO0O0() {
        return C1LLlIL.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        IiIi1lI.OooO0OO(this.OooO00o, OooO00o2);
        return new C6708lillI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        IiIi1lI.OooO0OO(this.OooO00o, ((C6708lillI) r3).OooO00o, OooO00o2);
        return new C6708lillI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m17800OooO0OO() {
        return C1LLlIL.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (C1LLlIL.OooO0O0(iArr) || C1LLlIL.m21842OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = C1LLlIL.OooO00o();
        IiIi1lI.OooO0o0(iArr, OooO00o2);
        IiIi1lI.OooO0OO(OooO00o2, iArr, OooO00o2);
        int[] OooO00o3 = C1LLlIL.OooO00o();
        IiIi1lI.OooO0o0(OooO00o2, OooO00o3);
        IiIi1lI.OooO0OO(OooO00o3, iArr, OooO00o3);
        int[] OooO00o4 = C1LLlIL.OooO00o();
        IiIi1lI.OooO00o(OooO00o3, 3, OooO00o4);
        IiIi1lI.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        IiIi1lI.OooO00o(OooO00o4, 3, OooO00o4);
        IiIi1lI.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        IiIi1lI.OooO00o(OooO00o4, 2, OooO00o4);
        IiIi1lI.OooO0OO(OooO00o4, OooO00o2, OooO00o4);
        int[] OooO00o5 = C1LLlIL.OooO00o();
        IiIi1lI.OooO00o(OooO00o4, 11, OooO00o5);
        IiIi1lI.OooO0OO(OooO00o5, OooO00o4, OooO00o5);
        IiIi1lI.OooO00o(OooO00o5, 22, OooO00o4);
        IiIi1lI.OooO0OO(OooO00o4, OooO00o5, OooO00o4);
        int[] OooO00o6 = C1LLlIL.OooO00o();
        IiIi1lI.OooO00o(OooO00o4, 44, OooO00o6);
        IiIi1lI.OooO0OO(OooO00o6, OooO00o4, OooO00o6);
        int[] OooO00o7 = C1LLlIL.OooO00o();
        IiIi1lI.OooO00o(OooO00o6, 88, OooO00o7);
        IiIi1lI.OooO0OO(OooO00o7, OooO00o6, OooO00o7);
        IiIi1lI.OooO00o(OooO00o7, 44, OooO00o6);
        IiIi1lI.OooO0OO(OooO00o6, OooO00o4, OooO00o6);
        IiIi1lI.OooO00o(OooO00o6, 3, OooO00o4);
        IiIi1lI.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        IiIi1lI.OooO00o(OooO00o4, 23, OooO00o4);
        IiIi1lI.OooO0OO(OooO00o4, OooO00o5, OooO00o4);
        IiIi1lI.OooO00o(OooO00o4, 6, OooO00o4);
        IiIi1lI.OooO0OO(OooO00o4, OooO00o2, OooO00o4);
        IiIi1lI.OooO00o(OooO00o4, 2, OooO00o4);
        IiIi1lI.OooO0o0(OooO00o4, OooO00o2);
        if (C1LLlIL.m21845OooO00o(iArr, OooO00o2)) {
            return new C6708lillI(OooO00o4);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        IiIi1lI.OooO0o0(this.OooO00o, ((C6708lillI) r3).OooO00o, OooO00o2);
        return new C6708lillI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        IiIi1lI.OooO0o0(this.OooO00o, OooO00o2);
        return new C6708lillI(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6708lillI)) {
            return false;
        }
        return C1LLlIL.m21845OooO00o(this.OooO00o, ((C6708lillI) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 8);
    }
}
