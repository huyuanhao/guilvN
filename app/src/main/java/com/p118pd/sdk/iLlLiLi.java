package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iLlLiLi */
public class iLlLiLi implements li1l11I1 {
    public static final int OooO00o = 8;
    public static final int OooO0O0 = 65535;
    public static final int OooO0OO = 65537;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f17781OooO00o = null;

    private int OooO00o(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = OooO0OO - i2;
        } else if (i2 == 0) {
            i3 = OooO0OO - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 - i6) + (i5 < i6 ? 1 : 0);
        }
        return i3 & 65535;
    }

    private int OooO00o(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    private void OooO00o(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 2);
        int OooO00o4 = OooO00o(bArr, i + 4);
        int OooO00o5 = OooO00o(bArr, i + 6);
        int i3 = 0;
        int i4 = OooO00o4;
        int i5 = OooO00o3;
        int i6 = OooO00o2;
        int i7 = 0;
        while (i3 < 8) {
            int i8 = i7 + 1;
            int OooO00o6 = OooO00o(i6, iArr[i7]);
            int i9 = i8 + 1;
            int i10 = (i5 + iArr[i8]) & 65535;
            int i11 = i9 + 1;
            int i12 = (i4 + iArr[i9]) & 65535;
            int i13 = i11 + 1;
            int OooO00o7 = OooO00o(OooO00o5, iArr[i11]);
            int i14 = i13 + 1;
            int OooO00o8 = OooO00o(i12 ^ OooO00o6, iArr[i13]);
            int OooO00o9 = OooO00o(((i10 ^ OooO00o7) + OooO00o8) & 65535, iArr[i14]);
            int i15 = (OooO00o8 + OooO00o9) & 65535;
            OooO00o5 = OooO00o7 ^ i15;
            i4 = i15 ^ i10;
            i3++;
            i5 = i12 ^ OooO00o9;
            i6 = OooO00o6 ^ OooO00o9;
            i7 = i14 + 1;
        }
        int i16 = i7 + 1;
        OooO00o(OooO00o(i6, iArr[i7]), bArr2, i2);
        int i17 = i16 + 1;
        OooO00o(i4 + iArr[i16], bArr2, i2 + 2);
        OooO00o(i5 + iArr[i17], bArr2, i2 + 4);
        OooO00o(OooO00o(OooO00o5, iArr[i17 + 1]), bArr2, i2 + 6);
    }

    private int[] OooO00o(boolean z, byte[] bArr) {
        return z ? OooO00o(bArr) : OooO00o(OooO00o(bArr));
    }

    private int[] OooO00o(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            iArr[i2] = OooO00o(bArr, i2 * 2);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i3 = i & 7;
            if (i3 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i3 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] OooO00o(int[] iArr) {
        int[] iArr2 = new int[52];
        int OooO0O02 = OooO0O0(iArr[0]);
        int i = 1;
        int OooO00o2 = OooO00o(iArr[1]);
        int OooO00o3 = OooO00o(iArr[2]);
        iArr2[51] = OooO0O0(iArr[3]);
        iArr2[50] = OooO00o3;
        iArr2[49] = OooO00o2;
        int i2 = 48;
        iArr2[48] = OooO0O02;
        int i3 = 4;
        while (i < 8) {
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            int i6 = i4 + 1;
            int i7 = i2 - 1;
            iArr2[i7] = iArr[i4];
            int i8 = i7 - 1;
            iArr2[i8] = i5;
            int i9 = i6 + 1;
            int OooO0O03 = OooO0O0(iArr[i6]);
            int i10 = i9 + 1;
            int OooO00o4 = OooO00o(iArr[i9]);
            int i11 = i10 + 1;
            int OooO00o5 = OooO00o(iArr[i10]);
            int i12 = i8 - 1;
            iArr2[i12] = OooO0O0(iArr[i11]);
            int i13 = i12 - 1;
            iArr2[i13] = OooO00o4;
            int i14 = i13 - 1;
            iArr2[i14] = OooO00o5;
            i2 = i14 - 1;
            iArr2[i2] = OooO0O03;
            i++;
            i3 = i11 + 1;
        }
        int i15 = i3 + 1;
        int i16 = iArr[i3];
        int i17 = i15 + 1;
        int i18 = i2 - 1;
        iArr2[i18] = iArr[i15];
        int i19 = i18 - 1;
        iArr2[i19] = i16;
        int i20 = i17 + 1;
        int OooO0O04 = OooO0O0(iArr[i17]);
        int i21 = i20 + 1;
        int OooO00o6 = OooO00o(iArr[i20]);
        int i22 = i21 + 1;
        int OooO00o7 = OooO00o(iArr[i21]);
        int i23 = i19 - 1;
        iArr2[i23] = OooO0O0(iArr[i22]);
        int i24 = i23 - 1;
        iArr2[i24] = OooO00o7;
        int i25 = i24 - 1;
        iArr2[i25] = OooO00o6;
        iArr2[i25 - 1] = OooO0O04;
        return iArr2;
    }

    private int OooO0O0(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = OooO0OO / i;
        int i3 = OooO0OO % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = (i4 + (i5 * i2)) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = (i2 + (i6 * i4)) & 65535;
        }
        return (1 - i2) & 65535;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 8;
    }

    public int OooO00o(int i) {
        return (0 - i) & 65535;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.f17781OooO00o;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            OooO00o(iArr, bArr, i, bArr2, i2);
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17160OooO00o() {
        return "IDEA";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            this.f17781OooO00o = OooO00o(z, ((C6642li1LI) r4).OooO00o());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
