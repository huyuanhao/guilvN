package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.iL丨1i  reason: invalid class name and case insensitive filesystem */
public class C6200iL1i extends IIiLIli.OooO0O0 {
    public static final IlIL1 OooO00o;
    public static final IlIL1 OooO0O0;
    public static final int OooOO0 = 6;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9701liI1i f17802OooO00o = new C9701liI1i(this, null, null);

    /* renamed from: com.pd.sdk.iL丨1i$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ long[] f17804OooO00o;

        public OooO00o(int i, long[] jArr) {
            this.OooO00o = i;
            this.f17804OooO00o = jArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            long[] OooO00o2 = lillilII.OooO00o();
            long[] OooO00o3 = lillilII.OooO00o();
            int i2 = 0;
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 9; i4++) {
                    long j2 = OooO00o2[i4];
                    long[] jArr = this.f17804OooO00o;
                    OooO00o2[i4] = j2 ^ (jArr[i2 + i4] & j);
                    OooO00o3[i4] = OooO00o3[i4] ^ (jArr[(i2 + 9) + i4] & j);
                }
                i2 += 18;
            }
            return C6200iL1i.this.OooO00o((AbstractC97441iIIL) new IlIL1(OooO00o2), (AbstractC97441iIIL) new IlIL1(OooO00o3), false);
        }
    }

    static {
        IlIL1 r0 = new IlIL1(new BigInteger(1, C6472l1l1l.OooO00o("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        OooO00o = r0;
        OooO0O0 = (IlIL1) r0.m15849OooO0Oo();
    }

    public C6200iL1i() {
        super(571, 2, 5, 10);
        ((IIiLIli) this).f15498OooO00o = OooO00o(BigInteger.valueOf(1));
        ((IIiLIli) this).f15500OooO0O0 = OooO00o;
        ((IIiLIli) this).f15499OooO00o = new BigInteger(1, C6472l1l1l.OooO00o("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        ((IIiLIli) this).f15501OooO0O0 = BigInteger.valueOf(2);
        ((IIiLIli) this).OooO00o = 6;
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public IIiLIli OooO00o() {
        return new C6200iL1i();
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r7, int i, int i2) {
        long[] jArr = new long[(i2 * 9 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r4 = r7[i + i4];
            lillilII.OooO00o(((IlIL1) r4.m21813OooO0OO()).OooO00o, 0, jArr, i3);
            int i5 = i3 + 9;
            lillilII.OooO00o(((IlIL1) r4.m21815OooO0Oo()).OooO00o, 0, jArr, i5);
            i3 = i5 + 9;
        }
        return new OooO00o(i2, jArr);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m17178OooO00o() {
        return this.f17802OooO00o;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
        return new C9701liI1i(this, r2, r3, z);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
        return new C9701liI1i(this, r8, r9, r10, z);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
        return new IlIL1(bigInteger);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17179OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public boolean OooO00o(int i) {
        return i == 6;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public int OooO0O0() {
        return 571;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17180OooO0O0() {
        return false;
    }

    public int OooO0OO() {
        return 2;
    }

    public int OooO0Oo() {
        return 5;
    }

    public int OooO0o() {
        return 571;
    }

    public int OooO0o0() {
        return 10;
    }
}
