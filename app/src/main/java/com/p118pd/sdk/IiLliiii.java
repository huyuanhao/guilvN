package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.IiLliiii */
public class IiLliiii extends AbstractC97441iIIL.OooO0O0 {
    public static final int[] OooO0O0 = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public static final BigInteger OooO0oO = C6458l1lIIl.OooO0OO;
    public int[] OooO00o;

    public IiLliiii() {
        this.OooO00o = AbstractC6694lilI.OooO00o();
    }

    public IiLliiii(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(OooO0oO) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.OooO00o = C5839L1lL1.OooO00o(bigInteger);
    }

    public IiLliiii(int[] iArr) {
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO00o(this.OooO00o, OooO00o2);
        return new IiLliiii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO00o(this.OooO00o, ((IiLliiii) r3).OooO00o, OooO00o2);
        return new IiLliiii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15603OooO00o() {
        return "SecP224K1Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15604OooO00o() {
        return AbstractC6694lilI.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15605OooO00o() {
        return AbstractC6694lilI.m17784OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return OooO0oO.bitLength();
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m15606OooO0O0() {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        AbstractC9859lil.OooO00o(C5839L1lL1.f16801OooO00o, this.OooO00o, OooO00o2);
        return new IiLliiii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        AbstractC9859lil.OooO00o(C5839L1lL1.f16801OooO00o, ((IiLliiii) r3).OooO00o, OooO00o2);
        C5839L1lL1.OooO0OO(OooO00o2, this.OooO00o, OooO00o2);
        return new IiLliiii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15607OooO0O0() {
        return AbstractC6694lilI.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO() {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0OO(this.OooO00o, OooO00o2);
        return new IiLliiii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0OO(this.OooO00o, ((IiLliiii) r3).OooO00o, OooO00o2);
        return new IiLliiii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m15608OooO0OO() {
        return AbstractC6694lilI.OooO00o(this.OooO00o, 0) == 1;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo() {
        int[] iArr = this.OooO00o;
        if (AbstractC6694lilI.OooO0O0(iArr) || AbstractC6694lilI.m17784OooO00o(iArr)) {
            return this;
        }
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0o0(iArr, OooO00o2);
        C5839L1lL1.OooO0OO(OooO00o2, iArr, OooO00o2);
        C5839L1lL1.OooO0o0(OooO00o2, OooO00o2);
        C5839L1lL1.OooO0OO(OooO00o2, iArr, OooO00o2);
        int[] OooO00o3 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0o0(OooO00o2, OooO00o3);
        C5839L1lL1.OooO0OO(OooO00o3, iArr, OooO00o3);
        int[] OooO00o4 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO00o(OooO00o3, 4, OooO00o4);
        C5839L1lL1.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        int[] OooO00o5 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO00o(OooO00o4, 3, OooO00o5);
        C5839L1lL1.OooO0OO(OooO00o5, OooO00o2, OooO00o5);
        C5839L1lL1.OooO00o(OooO00o5, 8, OooO00o5);
        C5839L1lL1.OooO0OO(OooO00o5, OooO00o4, OooO00o5);
        C5839L1lL1.OooO00o(OooO00o5, 4, OooO00o4);
        C5839L1lL1.OooO0OO(OooO00o4, OooO00o3, OooO00o4);
        C5839L1lL1.OooO00o(OooO00o4, 19, OooO00o3);
        C5839L1lL1.OooO0OO(OooO00o3, OooO00o5, OooO00o3);
        int[] OooO00o6 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO00o(OooO00o3, 42, OooO00o6);
        C5839L1lL1.OooO0OO(OooO00o6, OooO00o3, OooO00o6);
        C5839L1lL1.OooO00o(OooO00o6, 23, OooO00o3);
        C5839L1lL1.OooO0OO(OooO00o3, OooO00o4, OooO00o3);
        C5839L1lL1.OooO00o(OooO00o3, 84, OooO00o4);
        C5839L1lL1.OooO0OO(OooO00o4, OooO00o6, OooO00o4);
        C5839L1lL1.OooO00o(OooO00o4, 20, OooO00o4);
        C5839L1lL1.OooO0OO(OooO00o4, OooO00o5, OooO00o4);
        C5839L1lL1.OooO00o(OooO00o4, 3, OooO00o4);
        C5839L1lL1.OooO0OO(OooO00o4, iArr, OooO00o4);
        C5839L1lL1.OooO00o(OooO00o4, 2, OooO00o4);
        C5839L1lL1.OooO0OO(OooO00o4, iArr, OooO00o4);
        C5839L1lL1.OooO00o(OooO00o4, 4, OooO00o4);
        C5839L1lL1.OooO0OO(OooO00o4, OooO00o2, OooO00o4);
        C5839L1lL1.OooO0o0(OooO00o4, OooO00o4);
        C5839L1lL1.OooO0o0(OooO00o4, OooO00o6);
        if (AbstractC6694lilI.m17787OooO00o(iArr, OooO00o6)) {
            return new IiLliiii(OooO00o4);
        }
        C5839L1lL1.OooO0OO(OooO00o4, OooO0O0, OooO00o4);
        C5839L1lL1.OooO0o0(OooO00o4, OooO00o6);
        if (AbstractC6694lilI.m17787OooO00o(iArr, OooO00o6)) {
            return new IiLliiii(OooO00o4);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r3) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0o0(this.OooO00o, ((IiLliiii) r3).OooO00o, OooO00o2);
        return new IiLliiii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0o0() {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0o0(this.OooO00o, OooO00o2);
        return new IiLliiii(OooO00o2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IiLliiii)) {
            return false;
        }
        return AbstractC6694lilI.m17787OooO00o(this.OooO00o, ((IiLliiii) obj).OooO00o);
    }

    public int hashCode() {
        return OooO0oO.hashCode() ^ C9586iIILl.OooO00o(this.OooO00o, 0, 7);
    }
}
