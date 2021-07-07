package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.il丨1丨  reason: invalid class name and case insensitive filesystem */
public class C6344il1 implements li1l11I1 {
    public static final int OooO00o = 16;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f18098OooO00o = {112, C3571am.f9202h, 44, -20, -77, 39, ExifInterface.OooO0Oo, -27, -28, -123, 87, 53, -22, 12, -82, C8027oOO00oo.OooO00o, 35, -17, 107, -109, 69, 25, -91, PublicSuffixDatabase.EXCEPTION_MARKER, -19, C3587az.f9268l, 79, 78, 29, 101, -110, -67, -122, -72, -81, -113, 124, -21, C3571am.f9204j, ExifInterface.OooOOOO, 62, 48, -36, 95, 94, ExifInterface.OooO0oo, 11, 26, -90, ExifInterface.OooOOo, 57, ExifInterface.OooOO0o, -43, C8027oOO00oo.OooO0O0, 93, 61, -39, 1, 90, -42, 81, 86, 108, 77, -117, 13, -102, 102, -5, -52, -80, 45, 116, 18, 43, 32, -16, -79, -124, -103, -33, 76, ExifInterface.OooOOO0, ExifInterface.OooO0o, 52, 126, 118, 5, 109, -73, -87, 49, -47, 23, 4, -41, 20, 88, 58, 97, -34, C8027oOO00oo.OooO0Oo, 17, C8026oOO00oOo.OooO00o, 50, 15, -100, 22, 83, 24, -14, 34, -2, 68, ExifInterface.OooOOOo, -78, ExifInterface.OooO0oO, -75, 122, -111, 36, 8, -24, -88, 96, -4, 105, 80, -86, -48, -96, 125, -95, -119, 98, -105, 84, 91, 30, -107, C3571am.f9205k, -1, 100, -46, 16, -60, 0, 72, -93, -9, 117, -37, -118, 3, -26, -38, 9, 63, -35, -108, -121, 92, -125, 2, ExifInterface.OooOOO, 74, -112, 51, 115, 103, -10, -13, -99, O0O00O.OooO0O0, -65, -30, 82, -101, ExifInterface.OooO0OO, 38, -56, 55, ExifInterface.OooO, 59, -127, -106, 111, 75, 19, -66, 99, 46, -23, 121, -89, -116, -97, 110, C9684lIl.OooO0O0, -114, 41, -11, -7, -74, 47, -3, -76, 89, 120, -104, 6, 106, -25, 70, 113, -70, -44, C8027oOO00oo.OooO0OO, -85, 66, -120, -94, -115, -6, 114, 7, -71, 85, -8, -18, -84, 10, 54, 73, ExifInterface.OooO00o, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, ExifInterface.OooOO0O, 67, ExifInterface.OooO0o0, 21, -29, -83, -12, 119, ExifInterface.OooOO0, O0O00O.OooO00o, -98};
    public static final int OooO0O0 = 255;
    public static final int[] OooO0o0 = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18099OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f18100OooO00o = new int[96];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18101OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f18102OooO0O0 = new int[8];
    public int[] OooO0OO = new int[12];
    public int[] OooO0Oo = new int[4];

    private byte OooO00o(byte b, int i) {
        return (byte) (((b & 255) >>> (8 - i)) | (b << i));
    }

    private int OooO00o(int i) {
        return OooO00o(f18098OooO00o[i], 1) & 255;
    }

    public static int OooO00o(int i, int i2) {
        return (i << i2) + (i >>> (32 - i2));
    }

    private int OooO00o(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[(3 - i3) + i2] = (byte) i;
            i >>>= 8;
        }
    }

    public static void OooO00o(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i3 + 2;
        int i5 = i2 + 0;
        int i6 = i2 + 1;
        int i7 = 32 - i;
        iArr2[i4] = (iArr[i5] << i) | (iArr[i6] >>> i7);
        int i8 = i3 + 3;
        int i9 = i2 + 2;
        iArr2[i8] = (iArr[i6] << i) | (iArr[i9] >>> i7);
        int i10 = i3 + 0;
        int i11 = i2 + 3;
        iArr2[i10] = (iArr[i9] << i) | (iArr[i11] >>> i7);
        int i12 = i3 + 1;
        iArr2[i12] = (iArr[i11] << i) | (iArr[i5] >>> i7);
        iArr[i5] = iArr2[i4];
        iArr[i6] = iArr2[i8];
        iArr[i9] = iArr2[i10];
        iArr[i11] = iArr2[i12];
    }

    private void OooO00o(boolean z, byte[] bArr) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        int length = bArr.length;
        if (length != 16) {
            if (length == 24) {
                iArr[0] = OooO00o(bArr, 0);
                iArr[1] = OooO00o(bArr, 4);
                iArr[2] = OooO00o(bArr, 8);
                iArr[3] = OooO00o(bArr, 12);
                iArr[4] = OooO00o(bArr, 16);
                iArr[5] = OooO00o(bArr, 20);
                iArr[6] = iArr[4] ^ -1;
                iArr[7] = iArr[5] ^ -1;
            } else if (length == 32) {
                iArr[0] = OooO00o(bArr, 0);
                iArr[1] = OooO00o(bArr, 4);
                iArr[2] = OooO00o(bArr, 8);
                iArr[3] = OooO00o(bArr, 12);
                iArr[4] = OooO00o(bArr, 16);
                iArr[5] = OooO00o(bArr, 20);
                iArr[6] = OooO00o(bArr, 24);
                iArr[7] = OooO00o(bArr, 28);
            } else {
                throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
            }
            this.f18101OooO0O0 = false;
        } else {
            this.f18101OooO0O0 = true;
            iArr[0] = OooO00o(bArr, 0);
            iArr[1] = OooO00o(bArr, 4);
            iArr[2] = OooO00o(bArr, 8);
            iArr[3] = OooO00o(bArr, 12);
            iArr[7] = 0;
            iArr[6] = 0;
            iArr[5] = 0;
            iArr[4] = 0;
        }
        for (int i = 0; i < 4; i++) {
            iArr2[i] = iArr[i] ^ iArr[i + 4];
        }
        OooO00o(iArr2, OooO0o0, 0);
        for (int i2 = 0; i2 < 4; i2++) {
            iArr2[i2] = iArr2[i2] ^ iArr[i2];
        }
        OooO00o(iArr2, OooO0o0, 4);
        if (this.f18101OooO0O0) {
            int[] iArr5 = this.f18102OooO0O0;
            if (z) {
                iArr5[0] = iArr[0];
                iArr5[1] = iArr[1];
                iArr5[2] = iArr[2];
                iArr5[3] = iArr[3];
                OooO0OO(15, iArr, 0, this.f18100OooO00o, 4);
                OooO0OO(30, iArr, 0, this.f18100OooO00o, 12);
                OooO0OO(15, iArr, 0, iArr4, 0);
                int[] iArr6 = this.f18100OooO00o;
                iArr6[18] = iArr4[2];
                iArr6[19] = iArr4[3];
                OooO0OO(17, iArr, 0, this.OooO0OO, 4);
                OooO0OO(17, iArr, 0, this.f18100OooO00o, 24);
                OooO0OO(17, iArr, 0, this.f18100OooO00o, 32);
                int[] iArr7 = this.f18100OooO00o;
                iArr7[0] = iArr2[0];
                iArr7[1] = iArr2[1];
                iArr7[2] = iArr2[2];
                iArr7[3] = iArr2[3];
                OooO0OO(15, iArr2, 0, iArr7, 8);
                OooO0OO(15, iArr2, 0, this.OooO0OO, 0);
                OooO0OO(15, iArr2, 0, iArr4, 0);
                int[] iArr8 = this.f18100OooO00o;
                iArr8[16] = iArr4[0];
                iArr8[17] = iArr4[1];
                OooO0OO(15, iArr2, 0, iArr8, 20);
                OooO0Oo(34, iArr2, 0, this.f18100OooO00o, 28);
                OooO0OO(17, iArr2, 0, this.f18102OooO0O0, 4);
                return;
            }
            iArr5[4] = iArr[0];
            iArr5[5] = iArr[1];
            iArr5[6] = iArr[2];
            iArr5[7] = iArr[3];
            OooO00o(15, iArr, 0, this.f18100OooO00o, 28);
            OooO00o(30, iArr, 0, this.f18100OooO00o, 20);
            OooO00o(15, iArr, 0, iArr4, 0);
            int[] iArr9 = this.f18100OooO00o;
            iArr9[16] = iArr4[0];
            iArr9[17] = iArr4[1];
            OooO00o(17, iArr, 0, this.OooO0OO, 0);
            OooO00o(17, iArr, 0, this.f18100OooO00o, 8);
            OooO00o(17, iArr, 0, this.f18100OooO00o, 0);
            int[] iArr10 = this.f18100OooO00o;
            iArr10[34] = iArr2[0];
            iArr10[35] = iArr2[1];
            iArr10[32] = iArr2[2];
            iArr10[33] = iArr2[3];
            OooO00o(15, iArr2, 0, iArr10, 24);
            OooO00o(15, iArr2, 0, this.OooO0OO, 4);
            OooO00o(15, iArr2, 0, iArr4, 0);
            int[] iArr11 = this.f18100OooO00o;
            iArr11[18] = iArr4[2];
            iArr11[19] = iArr4[3];
            OooO00o(15, iArr2, 0, iArr11, 12);
            OooO0O0(34, iArr2, 0, this.f18100OooO00o, 4);
            OooO0OO(17, iArr2, 0, this.f18102OooO0O0, 0);
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            iArr3[i3] = iArr2[i3] ^ iArr[i3 + 4];
        }
        OooO00o(iArr3, OooO0o0, 8);
        int[] iArr12 = this.f18102OooO0O0;
        if (z) {
            iArr12[0] = iArr[0];
            iArr12[1] = iArr[1];
            iArr12[2] = iArr[2];
            iArr12[3] = iArr[3];
            OooO0Oo(45, iArr, 0, this.f18100OooO00o, 16);
            OooO0OO(15, iArr, 0, this.OooO0OO, 4);
            OooO0OO(17, iArr, 0, this.f18100OooO00o, 32);
            OooO0Oo(34, iArr, 0, this.f18100OooO00o, 44);
            OooO0OO(15, iArr, 4, this.f18100OooO00o, 4);
            OooO0OO(15, iArr, 4, this.OooO0OO, 0);
            OooO0OO(30, iArr, 4, this.f18100OooO00o, 24);
            OooO0Oo(34, iArr, 4, this.f18100OooO00o, 36);
            OooO0OO(15, iArr2, 0, this.f18100OooO00o, 8);
            OooO0OO(30, iArr2, 0, this.f18100OooO00o, 20);
            int[] iArr13 = this.OooO0OO;
            iArr13[8] = iArr2[1];
            iArr13[9] = iArr2[2];
            iArr13[10] = iArr2[3];
            iArr13[11] = iArr2[0];
            OooO0Oo(49, iArr2, 0, this.f18100OooO00o, 40);
            int[] iArr14 = this.f18100OooO00o;
            iArr14[0] = iArr3[0];
            iArr14[1] = iArr3[1];
            iArr14[2] = iArr3[2];
            iArr14[3] = iArr3[3];
            OooO0OO(30, iArr3, 0, iArr14, 12);
            OooO0OO(30, iArr3, 0, this.f18100OooO00o, 28);
            OooO0Oo(51, iArr3, 0, this.f18102OooO0O0, 4);
            return;
        }
        iArr12[4] = iArr[0];
        iArr12[5] = iArr[1];
        iArr12[6] = iArr[2];
        iArr12[7] = iArr[3];
        OooO0O0(45, iArr, 0, this.f18100OooO00o, 28);
        OooO00o(15, iArr, 0, this.OooO0OO, 4);
        OooO00o(17, iArr, 0, this.f18100OooO00o, 12);
        OooO0O0(34, iArr, 0, this.f18100OooO00o, 0);
        OooO00o(15, iArr, 4, this.f18100OooO00o, 40);
        OooO00o(15, iArr, 4, this.OooO0OO, 8);
        OooO00o(30, iArr, 4, this.f18100OooO00o, 20);
        OooO0O0(34, iArr, 4, this.f18100OooO00o, 8);
        OooO00o(15, iArr2, 0, this.f18100OooO00o, 36);
        OooO00o(30, iArr2, 0, this.f18100OooO00o, 24);
        int[] iArr15 = this.OooO0OO;
        iArr15[2] = iArr2[1];
        iArr15[3] = iArr2[2];
        iArr15[0] = iArr2[3];
        iArr15[1] = iArr2[0];
        OooO0O0(49, iArr2, 0, this.f18100OooO00o, 4);
        int[] iArr16 = this.f18100OooO00o;
        iArr16[46] = iArr3[0];
        iArr16[47] = iArr3[1];
        iArr16[44] = iArr3[2];
        iArr16[45] = iArr3[3];
        OooO00o(30, iArr3, 0, iArr16, 32);
        OooO00o(30, iArr3, 0, this.f18100OooO00o, 16);
        OooO0Oo(51, iArr3, 0, this.f18102OooO0O0, 0);
    }

    private void OooO00o(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0] ^ iArr2[i + 0];
        int OooO0OO2 = OooO0OO(i2 & 255) | (OooO0O0((i2 >>> 8) & 255) << 8) | (OooO00o((i2 >>> 16) & 255) << 16);
        byte[] bArr = f18098OooO00o;
        int i3 = iArr[1] ^ iArr2[i + 1];
        int OooO00o2 = OooO00o((bArr[i3 & 255] & 255) | (OooO0OO((i3 >>> 8) & 255) << 8) | (OooO0O0((i3 >>> 16) & 255) << 16) | (OooO00o((i3 >>> 24) & 255) << 24), 8);
        int i4 = (((bArr[(i2 >>> 24) & 255] & 255) << 24) | OooO0OO2) ^ OooO00o2;
        int OooO00o3 = OooO00o(OooO00o2, 8) ^ i4;
        int OooO0O02 = OooO0O0(i4, 8) ^ OooO00o3;
        iArr[2] = (OooO00o(OooO00o3, 16) ^ OooO0O02) ^ iArr[2];
        iArr[3] = OooO00o(OooO0O02, 8) ^ iArr[3];
        int i5 = iArr[2] ^ iArr2[i + 2];
        int OooO0OO3 = OooO0OO(i5 & 255) | (OooO0O0((i5 >>> 8) & 255) << 8) | (OooO00o((i5 >>> 16) & 255) << 16);
        byte[] bArr2 = f18098OooO00o;
        int i6 = ((bArr2[(i5 >>> 24) & 255] & 255) << 24) | OooO0OO3;
        int i7 = iArr2[i + 3] ^ iArr[3];
        int OooO00o4 = OooO00o((OooO00o((i7 >>> 24) & 255) << 24) | (bArr2[i7 & 255] & 255) | (OooO0OO((i7 >>> 8) & 255) << 8) | (OooO0O0((i7 >>> 16) & 255) << 16), 8);
        int i8 = i6 ^ OooO00o4;
        int OooO00o5 = OooO00o(OooO00o4, 8) ^ i8;
        int OooO0O03 = OooO0O0(i8, 8) ^ OooO00o5;
        iArr[0] = (OooO00o(OooO00o5, 16) ^ OooO0O03) ^ iArr[0];
        iArr[1] = iArr[1] ^ OooO00o(OooO0O03, 8);
    }

    private int OooO0O0(int i) {
        return OooO00o(f18098OooO00o[i], 7) & 255;
    }

    public static int OooO0O0(int i, int i2) {
        return (i >>> i2) + (i << (32 - i2));
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            this.OooO0Oo[i3] = OooO00o(bArr, (i3 * 4) + i);
            int[] iArr = this.OooO0Oo;
            iArr[i3] = iArr[i3] ^ this.f18102OooO0O0[i3];
        }
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 0);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 4);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 8);
        OooO0O0(this.OooO0Oo, this.OooO0OO, 0);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 12);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 16);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 20);
        OooO0O0(this.OooO0Oo, this.OooO0OO, 4);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 24);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 28);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 32);
        int[] iArr2 = this.OooO0Oo;
        int i4 = iArr2[2];
        int[] iArr3 = this.f18102OooO0O0;
        iArr2[2] = iArr3[4] ^ i4;
        iArr2[3] = iArr2[3] ^ iArr3[5];
        iArr2[0] = iArr2[0] ^ iArr3[6];
        iArr2[1] = iArr3[7] ^ iArr2[1];
        OooO00o(iArr2[2], bArr2, i2);
        OooO00o(this.OooO0Oo[3], bArr2, i2 + 4);
        OooO00o(this.OooO0Oo[0], bArr2, i2 + 8);
        OooO00o(this.OooO0Oo[1], bArr2, i2 + 12);
        return 16;
    }

    public static void OooO0O0(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i3 + 2;
        int i5 = i2 + 1;
        int i6 = i - 32;
        int i7 = i2 + 2;
        int i8 = 64 - i;
        iArr2[i4] = (iArr[i5] << i6) | (iArr[i7] >>> i8);
        int i9 = i3 + 3;
        int i10 = i2 + 3;
        iArr2[i9] = (iArr[i7] << i6) | (iArr[i10] >>> i8);
        int i11 = i3 + 0;
        int i12 = i2 + 0;
        iArr2[i11] = (iArr[i10] << i6) | (iArr[i12] >>> i8);
        int i13 = i3 + 1;
        iArr2[i13] = (iArr[i5] >>> i8) | (iArr[i12] << i6);
        iArr[i12] = iArr2[i4];
        iArr[i5] = iArr2[i9];
        iArr[i7] = iArr2[i11];
        iArr[i10] = iArr2[i13];
    }

    private void OooO0O0(int[] iArr, int[] iArr2, int i) {
        iArr[1] = iArr[1] ^ OooO00o(iArr[0] & iArr2[i + 0], 1);
        iArr[0] = iArr[0] ^ (iArr2[i + 1] | iArr[1]);
        iArr[2] = iArr[2] ^ (iArr2[i + 3] | iArr[3]);
        iArr[3] = OooO00o(iArr2[i + 2] & iArr[2], 1) ^ iArr[3];
    }

    private int OooO0OO(int i) {
        return f18098OooO00o[OooO00o((byte) i, 1) & 255] & 255;
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            this.OooO0Oo[i3] = OooO00o(bArr, (i3 * 4) + i);
            int[] iArr = this.OooO0Oo;
            iArr[i3] = iArr[i3] ^ this.f18102OooO0O0[i3];
        }
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 0);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 4);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 8);
        OooO0O0(this.OooO0Oo, this.OooO0OO, 0);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 12);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 16);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 20);
        OooO0O0(this.OooO0Oo, this.OooO0OO, 4);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 24);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 28);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 32);
        OooO0O0(this.OooO0Oo, this.OooO0OO, 8);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 36);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 40);
        OooO00o(this.OooO0Oo, this.f18100OooO00o, 44);
        int[] iArr2 = this.OooO0Oo;
        int i4 = iArr2[2];
        int[] iArr3 = this.f18102OooO0O0;
        iArr2[2] = i4 ^ iArr3[4];
        iArr2[3] = iArr2[3] ^ iArr3[5];
        iArr2[0] = iArr2[0] ^ iArr3[6];
        iArr2[1] = iArr3[7] ^ iArr2[1];
        OooO00o(iArr2[2], bArr2, i2);
        OooO00o(this.OooO0Oo[3], bArr2, i2 + 4);
        OooO00o(this.OooO0Oo[0], bArr2, i2 + 8);
        OooO00o(this.OooO0Oo[1], bArr2, i2 + 12);
        return 16;
    }

    public static void OooO0OO(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i3 + 0;
        int i5 = i2 + 0;
        int i6 = i2 + 1;
        int i7 = 32 - i;
        iArr2[i4] = (iArr[i5] << i) | (iArr[i6] >>> i7);
        int i8 = i3 + 1;
        int i9 = i2 + 2;
        iArr2[i8] = (iArr[i6] << i) | (iArr[i9] >>> i7);
        int i10 = i3 + 2;
        int i11 = i2 + 3;
        iArr2[i10] = (iArr[i9] << i) | (iArr[i11] >>> i7);
        int i12 = i3 + 3;
        iArr2[i12] = (iArr[i11] << i) | (iArr[i5] >>> i7);
        iArr[i5] = iArr2[i4];
        iArr[i6] = iArr2[i8];
        iArr[i9] = iArr2[i10];
        iArr[i11] = iArr2[i12];
    }

    public static void OooO0Oo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i3 + 0;
        int i5 = i2 + 1;
        int i6 = i - 32;
        int i7 = i2 + 2;
        int i8 = 64 - i;
        iArr2[i4] = (iArr[i5] << i6) | (iArr[i7] >>> i8);
        int i9 = i3 + 1;
        int i10 = i2 + 3;
        iArr2[i9] = (iArr[i7] << i6) | (iArr[i10] >>> i8);
        int i11 = i3 + 2;
        int i12 = i2 + 0;
        iArr2[i11] = (iArr[i10] << i6) | (iArr[i12] >>> i8);
        int i13 = i3 + 3;
        iArr2[i13] = (iArr[i5] >>> i8) | (iArr[i12] << i6);
        iArr[i12] = iArr2[i4];
        iArr[i5] = iArr2[i9];
        iArr[i7] = iArr2[i11];
        iArr[i10] = iArr2[i13];
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException {
        if (!this.f18099OooO00o) {
            throw new IllegalStateException("Camellia is not initialized");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            return this.f18101OooO0O0 ? OooO0O0(bArr, i, bArr2, i2) : OooO0OO(bArr, i, bArr2, i2);
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17407OooO00o() {
        return "Camellia";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        if (r3 instanceof C6642li1LI) {
            OooO00o(z, ((C6642li1LI) r3).OooO00o());
            this.f18099OooO00o = true;
            return;
        }
        throw new IllegalArgumentException("only simple KeyParameter expected.");
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
