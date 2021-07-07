package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.lL丨丨iL1L  reason: invalid class name and case insensitive filesystem */
public class C6632lLiL1L extends IIiLIli.OooO0O0 {
    public static final int OooOO0 = 6;
    public C9724ll1LLi OooO00o = new C9724ll1LLi(this, null, null);

    /* renamed from: com.pd.sdk.lL丨丨iL1L$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ long[] f18576OooO00o;

        public OooO00o(int i, long[] jArr) {
            this.OooO00o = i;
            this.f18576OooO00o = jArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            long[] OooO00o2 = C1LLlIL.m21848OooO00o();
            long[] OooO00o3 = C1LLlIL.m21848OooO00o();
            int i2 = 0;
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 4; i4++) {
                    long j2 = OooO00o2[i4];
                    long[] jArr = this.f18576OooO00o;
                    OooO00o2[i4] = j2 ^ (jArr[i2 + i4] & j);
                    OooO00o3[i4] = OooO00o3[i4] ^ (jArr[(i2 + 4) + i4] & j);
                }
                i2 += 8;
            }
            return C6632lLiL1L.this.OooO00o((AbstractC97441iIIL) new C6792lllIii(OooO00o2), (AbstractC97441iIIL) new C6792lllIii(OooO00o3), false);
        }
    }

    public C6632lLiL1L() {
        super(Lillilli.Oooooo, 15, 0, 0);
        ((IIiLIli) this).f15498OooO00o = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        ((IIiLIli) this).f15500OooO0O0 = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        ((IIiLIli) this).f15499OooO00o = new BigInteger(1, C6472l1l1l.OooO00o("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        ((IIiLIli) this).f15501OooO0O0 = BigInteger.valueOf(2);
        ((IIiLIli) this).OooO00o = 6;
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public IIiLIli OooO00o() {
        return new C6632lLiL1L();
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r7, int i, int i2) {
        long[] jArr = new long[(i2 * 4 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r4 = r7[i + i4];
            C1LLlIL.OooO00o(((C6792lllIii) r4.m21813OooO0OO()).OooO00o, 0, jArr, i3);
            int i5 = i3 + 4;
            C1LLlIL.OooO00o(((C6792lllIii) r4.m21815OooO0Oo()).OooO00o, 0, jArr, i5);
            i3 = i5 + 4;
        }
        return new OooO00o(i2, jArr);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m17718OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
        return new C9724ll1LLi(this, r2, r3, z);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
        return new C9724ll1LLi(this, r8, r9, r10, z);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
        return new C6792lllIii(bigInteger);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17719OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public boolean OooO00o(int i) {
        return i == 6;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public int OooO0O0() {
        return Lillilli.Oooooo;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17720OooO0O0() {
        return true;
    }

    public int OooO0OO() {
        return 15;
    }

    public int OooO0Oo() {
        return 0;
    }

    public int OooO0o() {
        return Lillilli.Oooooo;
    }

    public int OooO0o0() {
        return 0;
    }
}
