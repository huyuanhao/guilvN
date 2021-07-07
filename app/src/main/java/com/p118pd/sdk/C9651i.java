package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨i丨丨  reason: invalid class name and case insensitive filesystem */
public class C9651i extends AbstractC97441iIIL.OooO0O0 {
    public static final BigInteger OooO0oO = C6192iLlL.OooO0OO;
    public int[] OooO00o;

    public C9651i() {
        this.OooO00o = AbstractC6694lilI.OooO00o();
    }

    public C9651i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.OooO00o = ILllll.OooO00o(bigInteger);
    }

    public C9651i(int[] iArr) {
        this.OooO00o = iArr;
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        ILllll.OooO0OO(iArr2, iArr, iArr2);
        ILllll.OooO0o(iArr2, iArr2);
        ILllll.OooO0o0(iArr, iArr4);
        ILllll.OooO00o(iArr3, iArr4, iArr);
        ILllll.OooO0OO(iArr3, iArr4, iArr3);
        ILllll.OooO00o(C1iiIiI.OooO0o(7, iArr3, 2, 0), iArr3);
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        AbstractC6694lilI.m17782OooO00o(iArr, iArr4);
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        int[] OooO00o3 = AbstractC6694lilI.OooO00o();
        for (int i = 0; i < 7; i++) {
            AbstractC6694lilI.m17782OooO00o(iArr2, OooO00o2);
            AbstractC6694lilI.m17782OooO00o(iArr3, OooO00o3);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                OooO00o(iArr2, iArr3, iArr4, iArr5);
            }
            OooO00o(iArr, OooO00o2, OooO00o3, iArr2, iArr3, iArr4, iArr5);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        ILllll.OooO0OO(iArr5, iArr3, iArr7);
        ILllll.OooO0OO(iArr7, iArr, iArr7);
        ILllll.OooO0OO(iArr4, iArr2, iArr6);
        ILllll.OooO00o(iArr6, iArr7, iArr6);
        ILllll.OooO0OO(iArr4, iArr3, iArr7);
        AbstractC6694lilI.m17782OooO00o(iArr6, iArr4);
        ILllll.OooO0OO(iArr5, iArr2, iArr5);
        ILllll.OooO00o(iArr5, iArr7, iArr5);
        ILllll.OooO0o0(iArr5, iArr6);
        ILllll.OooO0OO(iArr6, iArr, iArr6);
    }

    public static boolean OooO00o(int[] iArr) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        int[] OooO00o3 = AbstractC6694lilI.OooO00o();
        AbstractC6694lilI.m17782OooO00o(iArr, OooO00o2);
        for (int i = 0; i < 7; i++) {
            AbstractC6694lilI.m17782OooO00o(OooO00o2, OooO00o3);
            ILllll.OooO00o(OooO00o2, 1 << i, OooO00o2);
            ILllll.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        }
        ILllll.OooO00o(OooO00o2, 95, OooO00o2);
        return AbstractC6694lilI.m17784OooO00o(OooO00o2);
    }

    public static boolean OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        AbstractC6694lilI.m17782OooO00o(iArr2, OooO00o2);
        int[] OooO00o3 = AbstractC6694lilI.OooO00o();
        OooO00o3[0] = 1;
        int[] OooO00o4 = AbstractC6694lilI.OooO00o();
        OooO00o(iArr, OooO00o2, OooO00o3, OooO00o4, iArr3);
        int[] OooO00o5 = AbstractC6694lilI.OooO00o();
        int[] OooO00o6 = AbstractC6694lilI.OooO00o();
        for (int i = 1; i < 96; i++) {
            AbstractC6694lilI.m17782OooO00o(OooO00o2, OooO00o5);
            AbstractC6694lilI.m17782OooO00o(OooO00o3, OooO00o6);
            OooO00o(OooO00o2, OooO00o3, OooO00o4, iArr3);
            if (AbstractC6694lilI.OooO0O0(OooO00o2)) {
                AbstractC9859lil.OooO00o(ILllll.f15659OooO00o, OooO00o6, iArr3);
                ILllll.OooO0OO(iArr3, OooO00o5, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        ILllll.OooO00o(this.OooO00o, OooO00o2);
        return new C9651i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        ILllll.OooO00o(this.OooO00o, ((C9651i) r3).OooO00o, OooO00o2);
        return new C9651i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21706OooO00o() {
        return "SecP224R1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21707OooO00o() {
        return AbstractC6694lilI.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21708OooO00o() {
        return AbstractC6694lilI.m17784OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m21709OooO0O0() {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        AbstractC9859lil.OooO00o(ILllll.f15659OooO00o, this.OooO00o, OooO00o2);
        return new C9651i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        AbstractC9859lil.OooO00o(ILllll.f15659OooO00o, ((C9651i) r3).OooO00o, OooO00o2);
        ILllll.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new C9651i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21710OooO0O0() {
        return AbstractC6694lilI.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        ILllll.OooO0OO(this.OooO00o, OooO00o2);
        return new C9651i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        ILllll.OooO0OO(this.OooO00o, ((C9651i) r3).OooO00o, OooO00o2);
        return new C9651i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21711OooO0OO() {
        return AbstractC6694lilI.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (AbstractC6694lilI.OooO0O0(iArr) || AbstractC6694lilI.m17784OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        ILllll.OooO0OO(iArr, OooO00o2);
        int[] OooO00o3 = AbstractC9859lil.OooO00o(ILllll.f15659OooO00o);
        int[] OooO00o4 = AbstractC6694lilI.OooO00o();
        if (!OooO00o(iArr)) {
            return null;
        }
        while (!OooO00o(OooO00o2, OooO00o3, OooO00o4)) {
            ILllll.OooO00o(OooO00o3, OooO00o3);
        }
        ILllll.OooO0o0(OooO00o4, OooO00o3);
        if (AbstractC6694lilI.m17787OooO00o(iArr, OooO00o3)) {
            return new C9651i(OooO00o4);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        ILllll.OooO0o0(this.OooO00o, ((C9651i) r3).OooO00o, OooO00o2);
        return new C9651i(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        ILllll.OooO0o0(this.OooO00o, OooO00o2);
        return new C9651i(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9651i)) {
            return false;
        }
        return AbstractC6694lilI.m17787OooO00o(this.OooO00o, ((C9651i) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 7);
    }
}
