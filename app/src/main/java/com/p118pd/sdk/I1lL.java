package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.I1l丨L  reason: invalid class name */
public abstract class I1lL {
    public static final String OooO00o = "bc_wnaf";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f15410OooO00o = new byte[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f15411OooO00o = {13, 41, 121, 337, 897, C7988oO0oo0o.OooooOo};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AbstractC9738llL1L[] f15412OooO00o = new AbstractC9738llL1L[0];
    public static final int[] OooO0O0 = new int[0];

    /* renamed from: com.pd.sdk.I1l丨L$OooO00o */
    public static class OooO00o implements iLLLIil {
        public final /* synthetic */ C6597lLil OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6872ll1i f15413OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ boolean f15414OooO00o;

        public OooO00o(C6597lLil llil, AbstractC6872ll1i r2, boolean z) {
            this.OooO00o = llil;
            this.f15413OooO00o = r2;
            this.f15414OooO00o = z;
        }

        @Override // com.p118pd.sdk.iLLLIil
        public AbstractC6375iL1 OooO00o(AbstractC6375iL1 r8) {
            C6597lLil llil = new C6597lLil();
            AbstractC9738llL1L OooO00o2 = this.OooO00o.OooO00o();
            if (OooO00o2 != null) {
                llil.OooO00o(this.f15413OooO00o.OooO00o(OooO00o2));
            }
            AbstractC9738llL1L[] OooO00o3 = this.OooO00o.m17698OooO00o();
            int length = OooO00o3.length;
            AbstractC9738llL1L[] r2 = new AbstractC9738llL1L[length];
            for (int i = 0; i < OooO00o3.length; i++) {
                r2[i] = this.f15413OooO00o.OooO00o(OooO00o3[i]);
            }
            llil.OooO00o(r2);
            if (this.f15414OooO00o) {
                AbstractC9738llL1L[] r0 = new AbstractC9738llL1L[length];
                for (int i2 = 0; i2 < length; i2++) {
                    r0[i2] = r2[i2].OooO0OO();
                }
                llil.OooO0O0(r0);
            }
            return llil;
        }
    }

    /* renamed from: com.pd.sdk.I1l丨L$OooO0O0 */
    public static class OooO0O0 implements iLLLIil {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ IIiLIli f15415OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9738llL1L f15416OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ boolean f15417OooO00o;

        public OooO0O0(int i, boolean z, AbstractC9738llL1L r3, IIiLIli r4) {
            this.OooO00o = i;
            this.f15417OooO00o = z;
            this.f15416OooO00o = r3;
            this.f15415OooO00o = r4;
        }

        private boolean OooO00o(C6597lLil llil, int i, boolean z) {
            return llil != null && OooO00o(llil.m17698OooO00o(), i) && (!z || OooO00o(llil.OooO0O0(), i));
        }

        private boolean OooO00o(AbstractC9738llL1L[] r1, int i) {
            return r1 != null && r1.length >= i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5 A[LOOP:0: B:40:0x00c3->B:41:0x00c5, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00ea A[LOOP:1: B:51:0x00e8->B:52:0x00ea, LOOP_END] */
        @Override // com.p118pd.sdk.iLLLIil
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p118pd.sdk.AbstractC6375iL1 OooO00o(com.p118pd.sdk.AbstractC6375iL1 r12) {
            /*
            // Method dump skipped, instructions count: 260
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.I1lL.OooO0O0.OooO00o(com.pd.sdk.i丨L1):com.pd.sdk.i丨L1");
        }
    }

    public static int OooO00o(int i) {
        return OooO00o(i, f15411OooO00o);
    }

    public static int OooO00o(int i, int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    public static int OooO00o(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static C6597lLil OooO00o(AbstractC6375iL1 r1) {
        if (r1 instanceof C6597lLil) {
            return (C6597lLil) r1;
        }
        return null;
    }

    public static C6597lLil OooO00o(AbstractC9738llL1L r2) {
        return OooO00o(r2.m21800OooO00o().OooO00o(r2, OooO00o));
    }

    public static C6597lLil OooO00o(AbstractC9738llL1L r2, int i, boolean z) {
        IIiLIli OooO00o2 = r2.m21800OooO00o();
        return (C6597lLil) OooO00o2.OooO00o(r2, OooO00o, new OooO0O0(i, z, r2, OooO00o2));
    }

    public static AbstractC9738llL1L OooO00o(AbstractC9738llL1L r2, int i, boolean z, AbstractC6872ll1i r5) {
        IIiLIli OooO00o2 = r2.m21800OooO00o();
        C6597lLil OooO00o3 = OooO00o(r2, i, z);
        AbstractC9738llL1L OooO00o4 = r5.OooO00o(r2);
        OooO00o2.OooO00o(OooO00o4, OooO00o, new OooO00o(OooO00o3, r5, z));
        return OooO00o4;
    }

    public static byte[] OooO00o(int i, BigInteger bigInteger) {
        if (i == 2) {
            return m15320OooO00o(bigInteger);
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        } else if (bigInteger.signum() == 0) {
            return f15410OooO00o;
        } else {
            int bitLength = bigInteger.bitLength() + 1;
            byte[] bArr = new byte[bitLength];
            int i2 = 1 << i;
            int i3 = i2 - 1;
            int i4 = i2 >>> 1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i5) == z) {
                    i5++;
                } else {
                    bigInteger = bigInteger.shiftRight(i5);
                    int intValue = bigInteger.intValue() & i3;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i4) != 0;
                    if (z) {
                        intValue -= i2;
                    }
                    if (i6 > 0) {
                        i5--;
                    }
                    int i7 = i6 + i5;
                    bArr[i7] = (byte) intValue;
                    i6 = i7 + 1;
                    i5 = i;
                }
            }
            return bitLength > i6 ? OooO00o(bArr, i6) : bArr;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15320OooO00o(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return f15410OooO00o;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength() - 1;
        byte[] bArr = new byte[bitLength];
        BigInteger xor = add.xor(bigInteger);
        int i = 1;
        while (i < bitLength) {
            if (xor.testBit(i)) {
                bArr[i - 1] = (byte) (bigInteger.testBit(i) ? -1 : 1);
                i++;
            }
            i++;
        }
        bArr[bitLength - 1] = 1;
        return bArr;
    }

    public static byte[] OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        int max = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[max];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if ((i | i2) == 0 && bigInteger.bitLength() <= i3 && bigInteger2.bitLength() <= i3) {
                break;
            }
            int intValue = ((bigInteger.intValue() >>> i3) + i) & 7;
            int intValue2 = ((bigInteger2.intValue() >>> i3) + i2) & 7;
            int i5 = intValue & 1;
            if (i5 != 0) {
                i5 -= intValue & 2;
                if (intValue + i5 == 4 && (intValue2 & 3) == 2) {
                    i5 = -i5;
                }
            }
            int i6 = intValue2 & 1;
            if (i6 != 0) {
                i6 -= intValue2 & 2;
                if (intValue2 + i6 == 4 && (intValue & 3) == 2) {
                    i6 = -i6;
                }
            }
            if ((i << 1) == i5 + 1) {
                i ^= 1;
            }
            if ((i2 << 1) == i6 + 1) {
                i2 ^= 1;
            }
            i3++;
            if (i3 == 30) {
                bigInteger = bigInteger.shiftRight(30);
                bigInteger2 = bigInteger2.shiftRight(30);
                i3 = 0;
            }
            bArr[i4] = (byte) ((i5 << 4) | (i6 & 15));
            i4++;
        }
        return max > i4 ? OooO00o(bArr, i4) : bArr;
    }

    public static byte[] OooO00o(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m15321OooO00o(int i, BigInteger bigInteger) {
        if (i == 2) {
            return m15322OooO00o(bigInteger);
        }
        if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        } else if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            return OooO0O0;
        } else {
            int bitLength = (bigInteger.bitLength() / i) + 1;
            int[] iArr = new int[bitLength];
            int i2 = 1 << i;
            int i3 = i2 - 1;
            int i4 = i2 >>> 1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i5) == z) {
                    i5++;
                } else {
                    bigInteger = bigInteger.shiftRight(i5);
                    int intValue = bigInteger.intValue() & i3;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i4) != 0;
                    if (z) {
                        intValue -= i2;
                    }
                    if (i6 > 0) {
                        i5--;
                    }
                    iArr[i6] = i5 | (intValue << 16);
                    i5 = i;
                    i6++;
                }
            }
            return bitLength > i6 ? OooO00o(iArr, i6) : iArr;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m15322OooO00o(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            return OooO0O0;
        } else {
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength();
            int i = bitLength >> 1;
            int[] iArr = new int[i];
            BigInteger xor = add.xor(bigInteger);
            int i2 = bitLength - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1;
            while (i5 < i2) {
                if (!xor.testBit(i5)) {
                    i4++;
                } else {
                    iArr[i3] = i4 | ((bigInteger.testBit(i5) ? -1 : 1) << 16);
                    i5++;
                    i3++;
                    i4 = 1;
                }
                i5++;
            }
            int i6 = i3 + 1;
            iArr[i3] = 65536 | i4;
            return i > i6 ? OooO00o(iArr, i6) : iArr;
        }
    }

    public static int[] OooO00o(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static AbstractC9738llL1L[] OooO0O0(AbstractC9738llL1L[] r2, int i) {
        AbstractC9738llL1L[] r3 = new AbstractC9738llL1L[i];
        System.arraycopy(r2, 0, r3, 0, r2.length);
        return r3;
    }
}
