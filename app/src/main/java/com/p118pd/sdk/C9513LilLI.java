package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨LilLI  reason: invalid class name and case insensitive filesystem */
public class C9513LilLI extends AbstractC97441iIIL.OooO0O0 {
    public static final int[] OooO0O0 = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public static final BigInteger OooO0oO = C5749Li.OooO0OO;
    public int[] OooO00o;

    public C9513LilLI() {
        this.OooO00o = C1LLlIL.OooO00o();
    }

    public C9513LilLI(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.OooO00o = C6486lIILlLI.OooO00o(bigInteger);
    }

    public C9513LilLI(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO00o(this.OooO00o, OooO00o2);
        return new C9513LilLI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO00o(this.OooO00o, ((C9513LilLI) r3).OooO00o, OooO00o2);
        return new C9513LilLI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21575OooO00o() {
        return "Curve25519Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21576OooO00o() {
        return C1LLlIL.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21577OooO00o() {
        return C1LLlIL.m21842OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m21578OooO0O0() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        AbstractC9859lil.OooO00o(C6486lIILlLI.f18361OooO00o, this.OooO00o, OooO00o2);
        return new C9513LilLI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        AbstractC9859lil.OooO00o(C6486lIILlLI.f18361OooO00o, ((C9513LilLI) r3).OooO00o, OooO00o2);
        C6486lIILlLI.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C9513LilLI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21579OooO0O0() {
        return C1LLlIL.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0OO(this.OooO00o, OooO00o2);
        return new C9513LilLI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0OO(this.OooO00o, ((C9513LilLI) r3).OooO00o, OooO00o2);
        return new C9513LilLI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21580OooO0OO() {
        return C1LLlIL.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (C1LLlIL.OooO0O0(iArr) || C1LLlIL.m21842OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o0(iArr, OooO00o2);
        C6486lIILlLI.OooO0OO(OooO00o2, iArr, OooO00o2);
        C6486lIILlLI.OooO0o0(OooO00o2, OooO00o2);
        C6486lIILlLI.OooO0OO(OooO00o2, iArr, OooO00o2);
        int[] OooO00o3 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o0(OooO00o2, OooO00o3);
        C6486lIILlLI.OooO0OO(OooO00o3, iArr, OooO00o3);
        int[] OooO00o4 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO00o(OooO00o3, 3, OooO00o4);
        C6486lIILlLI.OooO0OO(OooO00o4, OooO00o2, OooO00o4);
        C6486lIILlLI.OooO00o(OooO00o4, 4, OooO00o2);
        C6486lIILlLI.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C6486lIILlLI.OooO00o(OooO00o2, 4, OooO00o4);
        C6486lIILlLI.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        C6486lIILlLI.OooO00o(OooO00o4, 15, OooO00o3);
        C6486lIILlLI.OooO0OO(OooO00o3, OooO00o4, OooO00o3);
        C6486lIILlLI.OooO00o(OooO00o3, 30, OooO00o4);
        C6486lIILlLI.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        C6486lIILlLI.OooO00o(OooO00o4, 60, OooO00o3);
        C6486lIILlLI.OooO0OO(OooO00o3, OooO00o4, OooO00o3);
        C6486lIILlLI.OooO00o(OooO00o3, 11, OooO00o4);
        C6486lIILlLI.OooO0OO(OooO00o4, OooO00o2, OooO00o4);
        C6486lIILlLI.OooO00o(OooO00o4, 120, OooO00o2);
        C6486lIILlLI.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        C6486lIILlLI.OooO0o0(OooO00o2, OooO00o2);
        C6486lIILlLI.OooO0o0(OooO00o2, OooO00o3);
        if (C1LLlIL.m21845OooO00o(iArr, OooO00o3)) {
            return new C9513LilLI(OooO00o2);
        }
        C6486lIILlLI.OooO0OO(OooO00o2, OooO0O0, OooO00o2);
        C6486lIILlLI.OooO0o0(OooO00o2, OooO00o3);
        if (C1LLlIL.m21845OooO00o(iArr, OooO00o3)) {
            return new C9513LilLI(OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o0(this.OooO00o, ((C9513LilLI) r3).OooO00o, OooO00o2);
        return new C9513LilLI(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o0(this.OooO00o, OooO00o2);
        return new C9513LilLI(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9513LilLI)) {
            return false;
        }
        return C1LLlIL.m21845OooO00o(this.OooO00o, ((C9513LilLI) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 8);
    }
}
