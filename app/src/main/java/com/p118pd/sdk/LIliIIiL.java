package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.LIliIIiL */
public class LIliIIiL extends AbstractC97441iIIL.OooO00o {
    public long[] OooO00o;

    public LIliIIiL() {
        this.OooO00o = AbstractC9759ILlI.OooO00o();
    }

    public LIliIIiL(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.OooO00o = C9870I.OooO00o(bigInteger);
    }

    public LIliIIiL(long[] jArr) {
        this.OooO00o = jArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO00o(this.OooO00o, OooO00o2);
        return new LIliIIiL(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(int i) {
        if (i < 1) {
            return this;
        }
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO00o(this.OooO00o, i, OooO00o2);
        return new LIliIIiL(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO00o(this.OooO00o, ((LIliIIiL) r3).OooO00o, OooO00o2);
        return new LIliIIiL(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2) {
        return OooO0O0(r1, r2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
        return OooO0O0(r1, r2, r3);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16129OooO00o() {
        return "SecT283Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16130OooO00o() {
        return AbstractC9759ILlI.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16131OooO00o() {
        return AbstractC9759ILlI.m21889OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return 283;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m16132OooO0O0() {
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO0Oo(this.OooO00o, OooO00o2);
        return new LIliIIiL(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r1) {
        return OooO0OO(r1.m21862OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        long[] jArr = this.OooO00o;
        long[] jArr2 = ((LIliIIiL) r3).OooO00o;
        long[] jArr3 = ((LIliIIiL) r4).OooO00o;
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(9);
        C9870I.OooO0oo(jArr, OooO00o2);
        C9870I.OooO0o0(jArr2, jArr3, OooO00o2);
        long[] OooO00o3 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO0o0(OooO00o2, OooO00o3);
        return new LIliIIiL(OooO00o3);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
        long[] jArr = this.OooO00o;
        long[] jArr2 = ((LIliIIiL) r3).OooO00o;
        long[] jArr3 = ((LIliIIiL) r4).OooO00o;
        long[] jArr4 = ((LIliIIiL) r5).OooO00o;
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(9);
        C9870I.OooO0o0(jArr, jArr2, OooO00o2);
        C9870I.OooO0o0(jArr3, jArr4, OooO00o2);
        long[] OooO00o3 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO0o0(OooO00o2, OooO00o3);
        return new LIliIIiL(OooO00o3);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16133OooO0O0() {
        return AbstractC9759ILlI.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    public int OooO0OO() {
        return C9870I.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public AbstractC97441iIIL m16134OooO0OO() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO0Oo(this.OooO00o, ((LIliIIiL) r3).OooO00o, OooO00o2);
        return new LIliIIiL(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m16135OooO0OO() {
        return (this.OooO00o[0] & 1) != 0;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0Oo() {
        return 5;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public AbstractC97441iIIL m16136OooO0Oo() {
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO0o(this.OooO00o, OooO00o2);
        return new LIliIIiL(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r1) {
        return OooO00o(r1);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    public int OooO0o() {
        return 12;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0o0() {
        return 7;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public AbstractC97441iIIL m16137OooO0o0() {
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
        C9870I.OooO0oO(this.OooO00o, OooO00o2);
        return new LIliIIiL(OooO00o2);
    }

    public int OooO0oO() {
        return 283;
    }

    public int OooO0oo() {
        return 3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LIliIIiL)) {
            return false;
        }
        return AbstractC9759ILlI.m21890OooO00o(this.OooO00o, ((LIliIIiL) obj).OooO00o);
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o, 0, 5) ^ 2831275;
    }
}
