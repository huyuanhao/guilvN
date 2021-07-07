package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.I1I丨LL  reason: invalid class name */
public class I1ILL extends IIiLIli.OooO0O0 {
    public static final int OooOO0 = 6;
    public C5241IIiLl1 OooO00o = new C5241IIiLl1(this, null, null);

    /* renamed from: com.pd.sdk.I1I丨LL$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ long[] f15318OooO00o;

        public OooO00o(int i, long[] jArr) {
            this.OooO00o = i;
            this.f15318OooO00o = jArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
            long[] OooO00o3 = AbstractC9759ILlI.OooO00o();
            int i2 = 0;
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 5; i4++) {
                    long j2 = OooO00o2[i4];
                    long[] jArr = this.f15318OooO00o;
                    OooO00o2[i4] = j2 ^ (jArr[i2 + i4] & j);
                    OooO00o3[i4] = OooO00o3[i4] ^ (jArr[(i2 + 5) + i4] & j);
                }
                i2 += 10;
            }
            return I1ILL.this.OooO00o((AbstractC97441iIIL) new LIliIIiL(OooO00o2), (AbstractC97441iIIL) new LIliIIiL(OooO00o3), false);
        }
    }

    public I1ILL() {
        super(283, 5, 7, 12);
        ((IIiLIli) this).f15498OooO00o = OooO00o(BigInteger.valueOf(1));
        ((IIiLIli) this).f15500OooO0O0 = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        ((IIiLIli) this).f15499OooO00o = new BigInteger(1, C6472l1l1l.OooO00o("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        ((IIiLIli) this).f15501OooO0O0 = BigInteger.valueOf(2);
        ((IIiLIli) this).OooO00o = 6;
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public IIiLIli OooO00o() {
        return new I1ILL();
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r7, int i, int i2) {
        long[] jArr = new long[(i2 * 5 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r4 = r7[i + i4];
            AbstractC9759ILlI.OooO00o(((LIliIIiL) r4.m21813OooO0OO()).OooO00o, 0, jArr, i3);
            int i5 = i3 + 5;
            AbstractC9759ILlI.OooO00o(((LIliIIiL) r4.m21815OooO0Oo()).OooO00o, 0, jArr, i5);
            i3 = i5 + 5;
        }
        return new OooO00o(i2, jArr);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m15271OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
        return new C5241IIiLl1(this, r2, r3, z);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
        return new C5241IIiLl1(this, r8, r9, r10, z);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
        return new LIliIIiL(bigInteger);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15272OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public boolean OooO00o(int i) {
        return i == 6;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public int OooO0O0() {
        return 283;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15273OooO0O0() {
        return false;
    }

    public int OooO0OO() {
        return 5;
    }

    public int OooO0Oo() {
        return 7;
    }

    public int OooO0o() {
        return 283;
    }

    public int OooO0o0() {
        return 12;
    }
}
