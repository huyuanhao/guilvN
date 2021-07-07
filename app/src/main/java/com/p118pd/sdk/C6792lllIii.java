package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.lllIii  reason: case insensitive filesystem */
public class C6792lllIii extends AbstractC97441iIIL.OooO00o {
    public long[] OooO00o;

    public C6792lllIii() {
        this.OooO00o = C1LLlIL.m21848OooO00o();
    }

    public C6792lllIii(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.OooO00o = C6899lLiiiI.OooO00o(bigInteger);
    }

    public C6792lllIii(long[] jArr) {
        this.OooO00o = jArr;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o() {
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO00o(this.OooO00o, OooO00o2);
        return new C6792lllIii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(int i) {
        if (i < 1) {
            return this;
        }
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO00o(this.OooO00o, i, OooO00o2);
        return new C6792lllIii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO00o(this.OooO00o, ((C6792lllIii) r3).OooO00o, OooO00o2);
        return new C6792lllIii(OooO00o2);
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
    public String m17916OooO00o() {
        return "SecT193Field";
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17917OooO00o() {
        return C1LLlIL.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17918OooO00o() {
        return C1LLlIL.m21846OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0O0() {
        return Lillilli.Oooooo;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m17919OooO0O0() {
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO0Oo(this.OooO00o, OooO00o2);
        return new C6792lllIii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r1) {
        return OooO0OO(r1.m21862OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        long[] jArr = this.OooO00o;
        long[] jArr2 = ((C6792lllIii) r3).OooO00o;
        long[] jArr3 = ((C6792lllIii) r4).OooO00o;
        long[] OooO0O0 = C1LLlIL.m21853OooO0O0();
        C6899lLiiiI.OooO0oo(jArr, OooO0O0);
        C6899lLiiiI.OooO0o0(jArr2, jArr3, OooO0O0);
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO0o0(OooO0O0, OooO00o2);
        return new C6792lllIii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
        long[] jArr = this.OooO00o;
        long[] jArr2 = ((C6792lllIii) r3).OooO00o;
        long[] jArr3 = ((C6792lllIii) r4).OooO00o;
        long[] jArr4 = ((C6792lllIii) r5).OooO00o;
        long[] OooO0O0 = C1LLlIL.m21853OooO0O0();
        C6899lLiiiI.OooO0o0(jArr, jArr2, OooO0O0);
        C6899lLiiiI.OooO0o0(jArr3, jArr4, OooO0O0);
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO0o0(OooO0O0, OooO00o2);
        return new C6792lllIii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17920OooO0O0() {
        return C1LLlIL.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    public int OooO0OO() {
        return C6899lLiiiI.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public AbstractC97441iIIL m17921OooO0OO() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r3) {
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO0Oo(this.OooO00o, ((C6792lllIii) r3).OooO00o, OooO00o2);
        return new C6792lllIii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m17922OooO0OO() {
        return (this.OooO00o[0] & 1) != 0;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0Oo() {
        return 15;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public AbstractC97441iIIL m17923OooO0Oo() {
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO0o(this.OooO00o, OooO00o2);
        return new C6792lllIii(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r1) {
        return OooO00o(r1);
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL.OooO00o
    public int OooO0o() {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    public int OooO0o0() {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC97441iIIL
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public AbstractC97441iIIL m17924OooO0o0() {
        long[] OooO00o2 = C1LLlIL.m21848OooO00o();
        C6899lLiiiI.OooO0oO(this.OooO00o, OooO00o2);
        return new C6792lllIii(OooO00o2);
    }

    public int OooO0oO() {
        return Lillilli.Oooooo;
    }

    public int OooO0oo() {
        return 2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6792lllIii)) {
            return false;
        }
        return C1LLlIL.m21847OooO00o(this.OooO00o, ((C6792lllIii) obj).OooO00o);
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o, 0, 4) ^ 1930015;
    }
}
