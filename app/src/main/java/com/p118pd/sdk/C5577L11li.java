package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.L11li  reason: case insensitive filesystem */
public class C5577L11li extends IIiLIli.OooO0O0 {
    public static final int OooOO0 = 6;
    public C9557LlI OooO00o = new C9557LlI(this, null, null);

    /* renamed from: com.pd.sdk.L11li$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ long[] f16154OooO00o;

        public OooO00o(int i, long[] jArr) {
            this.OooO00o = i;
            this.f16154OooO00o = jArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            long[] OooO00o2 = i1ILii.OooO00o();
            long[] OooO00o3 = i1ILii.OooO00o();
            int i2 = 0;
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 7; i4++) {
                    long j2 = OooO00o2[i4];
                    long[] jArr = this.f16154OooO00o;
                    OooO00o2[i4] = j2 ^ (jArr[i2 + i4] & j);
                    OooO00o3[i4] = OooO00o3[i4] ^ (jArr[(i2 + 7) + i4] & j);
                }
                i2 += 14;
            }
            return C5577L11li.this.OooO00o((AbstractC97441iIIL) new iIiii1(OooO00o2), (AbstractC97441iIIL) new iIiii1(OooO00o3), false);
        }
    }

    public C5577L11li() {
        super(409, 87, 0, 0);
        ((IIiLIli) this).f15498OooO00o = OooO00o(BigInteger.valueOf(1));
        ((IIiLIli) this).f15500OooO0O0 = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        ((IIiLIli) this).f15499OooO00o = new BigInteger(1, C6472l1l1l.OooO00o("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        ((IIiLIli) this).f15501OooO0O0 = BigInteger.valueOf(2);
        ((IIiLIli) this).OooO00o = 6;
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public IIiLIli OooO00o() {
        return new C5577L11li();
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r7, int i, int i2) {
        long[] jArr = new long[(i2 * 7 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r4 = r7[i + i4];
            i1ILii.OooO00o(((iIiii1) r4.m21813OooO0OO()).OooO00o, 0, jArr, i3);
            int i5 = i3 + 7;
            i1ILii.OooO00o(((iIiii1) r4.m21815OooO0Oo()).OooO00o, 0, jArr, i5);
            i3 = i5 + 7;
        }
        return new OooO00o(i2, jArr);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m15887OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
        return new C9557LlI(this, r2, r3, z);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
        return new C9557LlI(this, r8, r9, r10, z);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
        return new iIiii1(bigInteger);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15888OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public boolean OooO00o(int i) {
        return i == 6;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public int OooO0O0() {
        return 409;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15889OooO0O0() {
        return true;
    }

    public int OooO0OO() {
        return 87;
    }

    public int OooO0Oo() {
        return 0;
    }

    public int OooO0o() {
        return 409;
    }

    public int OooO0o0() {
        return 0;
    }
}
