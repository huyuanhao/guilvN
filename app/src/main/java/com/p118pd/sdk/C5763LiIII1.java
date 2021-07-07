package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.Li丨丨III1  reason: invalid class name and case insensitive filesystem */
public class C5763LiIII1 extends IIiLIli.OooO0OO {
    public static final BigInteger OooO0OO = new BigInteger(1, C6472l1l1l.OooO00o("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    public static final int OooOO0 = 2;
    public C6439l11lI OooO00o = new C6439l11lI(this, null, null);

    /* renamed from: com.pd.sdk.Li丨丨III1$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ int[] f16668OooO00o;

        public OooO00o(int i, int[] iArr) {
            this.OooO00o = i;
            this.f16668OooO00o = iArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            int[] OooO00o2 = C1iiIiI.OooO00o(17);
            int[] OooO00o3 = C1iiIiI.OooO00o(17);
            int i2 = 0;
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 17; i5++) {
                    int i6 = OooO00o2[i5];
                    int[] iArr = this.f16668OooO00o;
                    OooO00o2[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    OooO00o3[i5] = OooO00o3[i5] ^ (iArr[(i2 + 17) + i5] & i4);
                }
                i2 += 34;
            }
            return C5763LiIII1.this.OooO00o((AbstractC97441iIIL) new C98691i(OooO00o2), (AbstractC97441iIIL) new C98691i(OooO00o3), false);
        }
    }

    public C5763LiIII1() {
        super(OooO0OO);
        ((IIiLIli) this).f15498OooO00o = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        ((IIiLIli) this).f15500OooO0O0 = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        ((IIiLIli) this).f15499OooO00o = new BigInteger(1, C6472l1l1l.OooO00o("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        ((IIiLIli) this).f15501OooO0O0 = BigInteger.valueOf(1);
        ((IIiLIli) this).OooO00o = 2;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public IIiLIli OooO00o() {
        return new C5763LiIII1();
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r8, int i, int i2) {
        int[] iArr = new int[(i2 * 17 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r4 = r8[i + i4];
            C1iiIiI.m21318OooO00o(17, ((C98691i) r4.m21813OooO0OO()).OooO00o, 0, iArr, i3);
            int i5 = i3 + 17;
            C1iiIiI.m21318OooO00o(17, ((C98691i) r4.m21815OooO0Oo()).OooO00o, 0, iArr, i5);
            i3 = i5 + 17;
        }
        return new OooO00o(i2, iArr);
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m16350OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
        return new C6439l11lI(this, r2, r3, z);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
        return new C6439l11lI(this, r8, r9, r10, z);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0OO, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
        return new C98691i(bigInteger);
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
