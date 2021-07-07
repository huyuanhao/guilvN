package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨IlL  reason: invalid class name and case insensitive filesystem */
public class C9422IlL extends IIiLIli.OooO0OO {
    public static final BigInteger OooO0OO = new BigInteger(1, C6472l1l1l.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    public static final int OooOO0 = 2;
    public C5567II OooO00o = new C5567II(this, null, null);

    /* renamed from: com.pd.sdk.丨IlL$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ int[] f22960OooO00o;

        public OooO00o(int i, int[] iArr) {
            this.OooO00o = i;
            this.f22960OooO00o = iArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
            int[] OooO00o3 = AbstractC6163iLIl1.OooO00o();
            int i2 = 0;
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 6; i5++) {
                    int i6 = OooO00o2[i5];
                    int[] iArr = this.f22960OooO00o;
                    OooO00o2[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    OooO00o3[i5] = OooO00o3[i5] ^ (iArr[(i2 + 6) + i5] & i4);
                }
                i2 += 12;
            }
            return C9422IlL.this.OooO00o((AbstractC97441iIIL) new C9540LllI1L(OooO00o2), (AbstractC97441iIIL) new C9540LllI1L(OooO00o3), false);
        }
    }

    public C9422IlL() {
        super(OooO0OO);
        ((IIiLIli) this).f15498OooO00o = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        ((IIiLIli) this).f15500OooO0O0 = OooO00o(new BigInteger(1, C6472l1l1l.OooO00o("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        ((IIiLIli) this).f15499OooO00o = new BigInteger(1, C6472l1l1l.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        ((IIiLIli) this).f15501OooO0O0 = BigInteger.valueOf(1);
        ((IIiLIli) this).OooO00o = 2;
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public IIiLIli OooO00o() {
        return new C9422IlL();
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r7, int i, int i2) {
        int[] iArr = new int[(i2 * 6 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r4 = r7[i + i4];
            AbstractC6163iLIl1.m17087OooO00o(((C9540LllI1L) r4.m21813OooO0OO()).OooO00o, 0, iArr, i3);
            int i5 = i3 + 6;
            AbstractC6163iLIl1.m17087OooO00o(((C9540LllI1L) r4.m21815OooO0Oo()).OooO00o, 0, iArr, i5);
            i3 = i5 + 6;
        }
        return new OooO00o(i2, iArr);
    }

    @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m21467OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
        return new C5567II(this, r2, r3, z);
    }

    @Override // com.p118pd.sdk.IIiLIli
    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
        return new C5567II(this, r8, r9, r10, z);
    }

    @Override // com.p118pd.sdk.IIiLIli.OooO0OO, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
    public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
        return new C9540LllI1L(bigInteger);
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
