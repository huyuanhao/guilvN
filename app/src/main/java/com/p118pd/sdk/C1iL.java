package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨1iL  reason: invalid class name */
public class C1iL extends IIiLIli.OooO0O0 {
    public static final int OooOO0 = 6;
    public ilii1i OooO00o = new ilii1i(this, null, null);

    /* renamed from: com.pd.sdk.丨1iL$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ long[] f22805OooO00o;

        public OooO00o(int i, long[] jArr) {
            this.OooO00o = i;
            this.f22805OooO00o = jArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
            long[] OooO00o3 = AbstractC6163iLIl1.m17097OooO00o();
            int i2 = 0;
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 3; i4++) {
                    long j2 = OooO00o2[i4];
                    long[] jArr = this.f22805OooO00o;
                    OooO00o2[i4] = j2 ^ (jArr[i2 + i4] & j);
                    OooO00o3[i4] = OooO00o3[i4] ^ (jArr[(i2 + 3) + i4] & j);
                }
                i2 += 6;
            }
            return C1iL.this.OooO00o((AbstractC97441iIIL) new C6219ii11(OooO00o2), (AbstractC97441iIIL) new C6219ii11(OooO00o3), false);
        }
    }

    public C1iL() {
        super(163, 3, 6, 7);
        ((IIiLIli) this).f15498OooO00o = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        ((IIiLIli) this).f15500OooO0O0 = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        ((IIiLIli) this).f15499OooO00o = new BigInteger(1, C6472l1l1l.OooO00o("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        ((IIiLIli) this).f15501OooO0O0 = BigInteger.valueOf(2);
        ((IIiLIli) this).OooO00o = 6;
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public IIiLIli OooO00o() {
        return new C1iL();
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r7, int i, int i2) {
        long[] jArr = new long[(i2 * 3 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r4 = r7[i + i4];
            AbstractC6163iLIl1.OooO00o(((C6219ii11) r4.m21813OooO0OO()).OooO00o, 0, jArr, i3);
            int i5 = i3 + 3;
            AbstractC6163iLIl1.OooO00o(((C6219ii11) r4.m21815OooO0Oo()).OooO00o, 0, jArr, i5);
            i3 = i5 + 3;
        }
        return new OooO00o(i2, jArr);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m21309OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
        return new ilii1i(this, r2, r3, z);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
        return new ilii1i(this, r8, r9, r10, z);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
        return new C6219ii11(bigInteger);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21310OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public boolean OooO00o(int i) {
        return i == 6;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public int OooO0O0() {
        return 163;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21311OooO0O0() {
        return false;
    }

    public int OooO0OO() {
        return 3;
    }

    public int OooO0Oo() {
        return 6;
    }

    public int OooO0o() {
        return 163;
    }

    public int OooO0o0() {
        return 7;
    }
}
