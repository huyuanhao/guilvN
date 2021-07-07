package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.Illi  reason: case insensitive filesystem */
public class C5470Illi extends IIiLIli.OooO0OO {
    public static final BigInteger OooO0OO = new BigInteger(1, C6472l1l1l.OooO00o("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));
    public static final int OooOO0 = 2;
    public LIILlli OooO00o = new LIILlli(this, null, null);

    /* renamed from: com.pd.sdk.Illi$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ int[] f15897OooO00o;

        public OooO00o(int i, int[] iArr) {
            this.OooO00o = i;
            this.f15897OooO00o = iArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            int[] OooO00o2 = C1LLlIL.OooO00o();
            int[] OooO00o3 = C1LLlIL.OooO00o();
            int i2 = 0;
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 8; i5++) {
                    int i6 = OooO00o2[i5];
                    int[] iArr = this.f15897OooO00o;
                    OooO00o2[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    OooO00o3[i5] = OooO00o3[i5] ^ (iArr[(i2 + 8) + i5] & i4);
                }
                i2 += 16;
            }
            return C5470Illi.this.OooO00o((AbstractC97441iIIL) new C11liL1(OooO00o2), (AbstractC97441iIIL) new C11liL1(OooO00o3), false);
        }
    }

    public C5470Illi() {
        super(OooO0OO);
        ((IIiLIli) this).f15498OooO00o = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        ((IIiLIli) this).f15500OooO0O0 = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        ((IIiLIli) this).f15499OooO00o = new BigInteger(1, C6472l1l1l.OooO00o("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        ((IIiLIli) this).f15501OooO0O0 = BigInteger.valueOf(1);
        ((IIiLIli) this).OooO00o = 2;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public IIiLIli OooO00o() {
        return new C5470Illi();
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r7, int i, int i2) {
        int[] iArr = new int[(i2 * 8 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r4 = r7[i + i4];
            C1LLlIL.m21838OooO00o(((C11liL1) r4.m21813OooO0OO()).OooO00o, 0, iArr, i3);
            int i5 = i3 + 8;
            C1LLlIL.m21838OooO00o(((C11liL1) r4.m21815OooO0Oo()).OooO00o, 0, iArr, i5);
            i3 = i5 + 8;
        }
        return new OooO00o(i2, iArr);
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m15711OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
        return new LIILlli(this, r2, r3, z);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
        return new LIILlli(this, r8, r9, r10, z);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0OO, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
        return new C11liL1(bigInteger);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public boolean OooO00o(int i) {
        return i == 2;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public int OooO0O0() {
        return OooO0OO.bitLength();
    }

    public BigInteger OooO0OO() {
        return OooO0OO;
    }
}
