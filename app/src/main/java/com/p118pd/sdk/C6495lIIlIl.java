package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.lIIlIl  reason: case insensitive filesystem */
public class C6495lIIlIl extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = C9458L1L.OooO0OO;
    public int[] OooO00o;

    public C6495lIIlIl() {
        this.OooO00o = C1LLlIL.OooO00o();
    }

    public C6495lIIlIl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.OooO00o = C9444ILl.OooO00o(bigInteger);
    }

    public C6495lIIlIl(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9444ILl.OooO00o(this.OooO00o, OooO00o2);
        return new C6495lIIlIl(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9444ILl.OooO00o(this.OooO00o, ((C6495lIIlIl) r3).OooO00o, OooO00o2);
        return new C6495lIIlIl(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17626OooO00o() {
        return "SM2P256V1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17627OooO00o() {
        return C1LLlIL.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17628OooO00o() {
        return C1LLlIL.m21842OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m17629OooO0O0() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        AbstractC9859lil.OooO00o(C9444ILl.f22992OooO00o, this.OooO00o, OooO00o2);
        return new C6495lIIlIl(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        AbstractC9859lil.OooO00o(C9444ILl.f22992OooO00o, ((C6495lIIlIl) r3).OooO00o, OooO00o2);
        C9444ILl.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C6495lIIlIl(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17630OooO0O0() {
        return C1LLlIL.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9444ILl.OooO0OO(this.OooO00o, OooO00o2);
        return new C6495lIIlIl(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9444ILl.OooO0OO(this.OooO00o, ((C6495lIIlIl) r3).OooO00o, OooO00o2);
        return new C6495lIIlIl(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m17631OooO0OO() {
        return C1LLlIL.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (C1LLlIL.OooO0O0(iArr) || C1LLlIL.m21842OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9444ILl.OooO0o0(iArr, OooO00o2);
        C9444ILl.OooO0OO(OooO00o2, iArr, OooO00o2);
        int[] OooO00o3 = C1LLlIL.OooO00o();
        C9444ILl.OooO00o(OooO00o2, 2, OooO00o3);
        C9444ILl.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        int[] OooO00o4 = C1LLlIL.OooO00o();
        C9444ILl.OooO00o(OooO00o3, 2, OooO00o4);
        C9444ILl.OooO0OO(OooO00o4, OooO00o2, OooO00o4);
        C9444ILl.OooO00o(OooO00o4, 6, OooO00o2);
        C9444ILl.OooO0OO(OooO00o2, OooO00o4, OooO00o2);
        int[] OooO00o5 = C1LLlIL.OooO00o();
        C9444ILl.OooO00o(OooO00o2, 12, OooO00o5);
        C9444ILl.OooO0OO(OooO00o5, OooO00o2, OooO00o5);
        C9444ILl.OooO00o(OooO00o5, 6, OooO00o2);
        C9444ILl.OooO0OO(OooO00o2, OooO00o4, OooO00o2);
        C9444ILl.OooO0o0(OooO00o2, OooO00o4);
        C9444ILl.OooO0OO(OooO00o4, iArr, OooO00o4);
        C9444ILl.OooO00o(OooO00o4, 31, OooO00o5);
        C9444ILl.OooO0OO(OooO00o5, OooO00o4, OooO00o2);
        C9444ILl.OooO00o(OooO00o5, 32, OooO00o5);
        C9444ILl.OooO0OO(OooO00o5, OooO00o2, OooO00o5);
        C9444ILl.OooO00o(OooO00o5, 62, OooO00o5);
        C9444ILl.OooO0OO(OooO00o5, OooO00o2, OooO00o5);
        C9444ILl.OooO00o(OooO00o5, 4, OooO00o5);
        C9444ILl.OooO0OO(OooO00o5, OooO00o3, OooO00o5);
        C9444ILl.OooO00o(OooO00o5, 32, OooO00o5);
        C9444ILl.OooO0OO(OooO00o5, iArr, OooO00o5);
        C9444ILl.OooO00o(OooO00o5, 62, OooO00o5);
        C9444ILl.OooO0o0(OooO00o5, OooO00o3);
        if (C1LLlIL.m21845OooO00o(iArr, OooO00o3)) {
            return new C6495lIIlIl(OooO00o5);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9444ILl.OooO0o0(this.OooO00o, ((C6495lIIlIl) r3).OooO00o, OooO00o2);
        return new C6495lIIlIl(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C9444ILl.OooO0o0(this.OooO00o, OooO00o2);
        return new C6495lIIlIl(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6495lIIlIl)) {
            return false;
        }
        return C1LLlIL.m21845OooO00o(this.OooO00o, ((C6495lIIlIl) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 8);
    }
}
