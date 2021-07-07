package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.L1l  reason: case insensitive filesystem */
public class C5591L1l implements li1l11I1 {
    public static final int OooO00o = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static byte[] f16211OooO00o = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, ExifInterface.OooO0OO, -99, ExifInterface.OooO, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 92, 107, 78, C3571am.f9202h, 84, -42, 101, -109, ExifInterface.OooOOOO, 96, -78, C8026oOO00oOo.OooO00o, 115, 86, ExifInterface.OooO0Oo, 20, -89, -116, -15, -36, 18, 117, ExifInterface.OooOO0o, C3571am.f9204j, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, C3587az.f9268l, -38, 70, 105, 7, 87, 39, -14, 29, -101, C9684lIl.OooO0O0, -108, 67, 3, -8, 17, ExifInterface.OooOO0, -10, -112, -17, 62, -25, 6, ExifInterface.OooO0oO, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, O0O00O.OooO00o, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, ExifInterface.OooO00o, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, ExifInterface.OooO0o, C3571am.f9205k, C8027oOO00oo.OooO00o, 110, 15, 81, ExifInterface.OooOOO0, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, C8027oOO00oo.OooO0OO, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, ExifInterface.OooOO0O, -45, 0, -26, ExifInterface.OooOOOo, ExifInterface.OooOOo, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, C8027oOO00oo.OooO0Oo, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, ExifInterface.OooOOO, 46, ExifInterface.OooO0oo, -13, -37, C8027oOO00oo.OooO0O0, -27, -91, -100, 119, 10, -90, 32, 104, -2, O0O00O.OooO0O0, ExifInterface.OooO0o0, -83};

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16212OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16213OooO00o;

    private int OooO00o(int i, int i2) {
        int i3 = i & 65535;
        return (i3 >> (16 - i2)) | (i3 << i2);
    }

    @Override // com.p118pd.sdk.li1l11I1
    private void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int i4 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int i5 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int i6 = ((bArr[i + 1] & 255) << 8) + (bArr[i + 0] & 255);
        for (int i7 = 60; i7 >= 44; i7 -= 4) {
            i3 = OooO00o(i3, 11) - ((((i4 ^ -1) & i6) + (i5 & i4)) + this.f16213OooO00o[i7 + 3]);
            i4 = OooO00o(i4, 13) - ((((i5 ^ -1) & i3) + (i6 & i5)) + this.f16213OooO00o[i7 + 2]);
            i5 = OooO00o(i5, 14) - ((((i6 ^ -1) & i4) + (i3 & i6)) + this.f16213OooO00o[i7 + 1]);
            i6 = OooO00o(i6, 15) - ((((i3 ^ -1) & i5) + (i4 & i3)) + this.f16213OooO00o[i7]);
        }
        int[] iArr = this.f16213OooO00o;
        int i8 = i3 - iArr[i4 & 63];
        int i9 = i4 - iArr[i5 & 63];
        int i10 = i5 - iArr[i6 & 63];
        int i11 = i6 - iArr[i8 & 63];
        for (int i12 = 40; i12 >= 20; i12 -= 4) {
            i8 = OooO00o(i8, 11) - ((((i9 ^ -1) & i11) + (i10 & i9)) + this.f16213OooO00o[i12 + 3]);
            i9 = OooO00o(i9, 13) - ((((i10 ^ -1) & i8) + (i11 & i10)) + this.f16213OooO00o[i12 + 2]);
            i10 = OooO00o(i10, 14) - ((((i11 ^ -1) & i9) + (i8 & i11)) + this.f16213OooO00o[i12 + 1]);
            i11 = OooO00o(i11, 15) - ((((i8 ^ -1) & i10) + (i9 & i8)) + this.f16213OooO00o[i12]);
        }
        int[] iArr2 = this.f16213OooO00o;
        int i13 = i8 - iArr2[i9 & 63];
        int i14 = i9 - iArr2[i10 & 63];
        int i15 = i10 - iArr2[i11 & 63];
        int i16 = i11 - iArr2[i13 & 63];
        for (int i17 = 16; i17 >= 0; i17 -= 4) {
            i13 = OooO00o(i13, 11) - ((((i14 ^ -1) & i16) + (i15 & i14)) + this.f16213OooO00o[i17 + 3]);
            i14 = OooO00o(i14, 13) - ((((i15 ^ -1) & i13) + (i16 & i15)) + this.f16213OooO00o[i17 + 2]);
            i15 = OooO00o(i15, 14) - ((((i16 ^ -1) & i14) + (i13 & i16)) + this.f16213OooO00o[i17 + 1]);
            i16 = OooO00o(i16, 15) - ((((i13 ^ -1) & i15) + (i14 & i13)) + this.f16213OooO00o[i17]);
        }
        bArr2[i2 + 0] = (byte) i16;
        bArr2[i2 + 1] = (byte) (i16 >> 8);
        bArr2[i2 + 2] = (byte) i15;
        bArr2[i2 + 3] = (byte) (i15 >> 8);
        bArr2[i2 + 4] = (byte) i14;
        bArr2[i2 + 5] = (byte) (i14 >> 8);
        bArr2[i2 + 6] = (byte) i13;
        bArr2[i2 + 7] = (byte) (i13 >> 8);
    }

    private int[] OooO00o(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = iArr[length - 1];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                i3 = f16211OooO00o[(i3 + iArr[i4]) & 255] & 255;
                int i6 = length + 1;
                iArr[length] = i3;
                if (i6 >= 128) {
                    break;
                }
                length = i6;
                i4 = i5;
            }
        }
        int i7 = (i + 7) >> 3;
        int i8 = 128 - i7;
        int i9 = f16211OooO00o[(255 >> ((-i) & 7)) & iArr[i8]] & 255;
        iArr[i8] = i9;
        for (int i10 = i8 - 1; i10 >= 0; i10--) {
            i9 = f16211OooO00o[i9 ^ iArr[i10 + i7]] & 255;
            iArr[i10] = i9;
        }
        int[] iArr2 = new int[64];
        for (int i11 = 0; i11 != 64; i11++) {
            int i12 = i11 * 2;
            iArr2[i11] = iArr[i12] + (iArr[i12 + 1] << 8);
        }
        return iArr2;
    }

    private void OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int i4 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int i5 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int i6 = ((bArr[i + 1] & 255) << 8) + (bArr[i + 0] & 255);
        for (int i7 = 0; i7 <= 16; i7 += 4) {
            i6 = OooO00o(i6 + ((i3 ^ -1) & i5) + (i4 & i3) + this.f16213OooO00o[i7], 1);
            i5 = OooO00o(i5 + ((i6 ^ -1) & i4) + (i3 & i6) + this.f16213OooO00o[i7 + 1], 2);
            i4 = OooO00o(i4 + ((i5 ^ -1) & i3) + (i6 & i5) + this.f16213OooO00o[i7 + 2], 3);
            i3 = OooO00o(i3 + ((i4 ^ -1) & i6) + (i5 & i4) + this.f16213OooO00o[i7 + 3], 5);
        }
        int[] iArr = this.f16213OooO00o;
        int i8 = i6 + iArr[i3 & 63];
        int i9 = i5 + iArr[i8 & 63];
        int i10 = i4 + iArr[i9 & 63];
        int i11 = i3 + iArr[i10 & 63];
        for (int i12 = 20; i12 <= 40; i12 += 4) {
            i8 = OooO00o(i8 + ((i11 ^ -1) & i9) + (i10 & i11) + this.f16213OooO00o[i12], 1);
            i9 = OooO00o(i9 + ((i8 ^ -1) & i10) + (i11 & i8) + this.f16213OooO00o[i12 + 1], 2);
            i10 = OooO00o(i10 + ((i9 ^ -1) & i11) + (i8 & i9) + this.f16213OooO00o[i12 + 2], 3);
            i11 = OooO00o(i11 + ((i10 ^ -1) & i8) + (i9 & i10) + this.f16213OooO00o[i12 + 3], 5);
        }
        int[] iArr2 = this.f16213OooO00o;
        int i13 = i8 + iArr2[i11 & 63];
        int i14 = i9 + iArr2[i13 & 63];
        int i15 = i10 + iArr2[i14 & 63];
        int i16 = i11 + iArr2[i15 & 63];
        for (int i17 = 44; i17 < 64; i17 += 4) {
            i13 = OooO00o(i13 + ((i16 ^ -1) & i14) + (i15 & i16) + this.f16213OooO00o[i17], 1);
            i14 = OooO00o(i14 + ((i13 ^ -1) & i15) + (i16 & i13) + this.f16213OooO00o[i17 + 1], 2);
            i15 = OooO00o(i15 + ((i14 ^ -1) & i16) + (i13 & i14) + this.f16213OooO00o[i17 + 2], 3);
            i16 = OooO00o(i16 + ((i15 ^ -1) & i13) + (i14 & i15) + this.f16213OooO00o[i17 + 3], 5);
        }
        bArr2[i2 + 0] = (byte) i13;
        bArr2[i2 + 1] = (byte) (i13 >> 8);
        bArr2[i2 + 2] = (byte) i14;
        bArr2[i2 + 3] = (byte) (i14 >> 8);
        bArr2[i2 + 4] = (byte) i15;
        bArr2[i2 + 5] = (byte) (i15 >> 8);
        bArr2[i2 + 6] = (byte) i16;
        bArr2[i2 + 7] = (byte) (i16 >> 8);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 8;
    }

    @Override // com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final int m15978OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f16213OooO00o == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this.f16212OooO00o) {
            OooO0O0(bArr, i, bArr2, i2);
            return 8;
        } else {
            OooO00o(bArr, i, bArr2, i2);
            return 8;
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15979OooO00o() {
        return "RC2";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        this.f16212OooO00o = z;
        if (r4 instanceof C6148iL11L) {
            C6148iL11L il11l = (C6148iL11L) r4;
            this.f16213OooO00o = OooO00o(il11l.OooO00o(), il11l.OooO00o());
        } else if (r4 instanceof C6642li1LI) {
            byte[] OooO00o2 = ((C6642li1LI) r4).OooO00o();
            this.f16213OooO00o = OooO00o(OooO00o2, OooO00o2.length * 8);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + r4.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
