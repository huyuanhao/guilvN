package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.imageutils.JfifUtil;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import java.lang.reflect.Array;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.IIL1 */
public class IIL1 implements li1l11I1 {
    public static final int[] OooO00o = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, JfifUtil.MARKER_SOI, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, C7531o0Oooo0o.OooO0O0, 250, 239, Lillilli.ooOO, 145};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static byte[][] f15470OooO00o = {new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, 24, 32}};
    public static byte[][] OooO0O0 = {new byte[]{0, 24, 16, 8}, new byte[]{0, 32, 24, 16}, new byte[]{0, 40, 32, 24}, new byte[]{0, 48, 40, 24}, new byte[]{0, 56, 40, 32}};
    public static final byte[] OooO0OO = {0, 0, 25, 1, 50, 2, 26, ExifInterface.OooO, 75, ExifInterface.OooOO0, C8027oOO00oo.OooO0Oo, 104, 51, -18, -33, 3, 100, 4, C3571am.f9205k, C3587az.f9268l, 52, -115, -127, -17, 76, 113, 8, -56, -8, 105, C8026oOO00oOo.OooO00o, ExifInterface.OooO0o0, 125, ExifInterface.OooO0o, 29, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, ExifInterface.OooOO0O, 9, 120, 101, 47, -118, 5, PublicSuffixDatabase.EXCEPTION_MARKER, 15, ExifInterface.OooOOo, 36, 18, -16, C3571am.f9202h, 69, 53, -109, -38, -114, -106, -113, -37, -67, 54, -48, ExifInterface.OooOOOO, -108, 19, 92, -46, -15, 64, 70, -125, 56, 102, -35, -3, 48, -65, 6, -117, 98, -77, C8027oOO00oo.OooO0OO, -30, -104, 34, -120, -111, 16, 126, 110, 72, ExifInterface.OooO0oO, -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, 61, -70, 43, 121, 10, 21, -101, -97, 94, ExifInterface.OooOO0o, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 11, -11, 89, ExifInterface.OooOOO0, 95, -80, -100, -87, 81, -96, O0O00O.OooO0O0, 12, -10, 111, 23, -60, 73, -20, ExifInterface.OooO0OO, 67, C3571am.f9204j, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, C9684lIl.OooO0O0, -107, ExifInterface.OooOOOo, ExifInterface.OooOOO, 55, 63, 91, -47, 83, 57, -124, 60, C8027oOO00oo.OooO00o, -94, 109, C8027oOO00oo.OooO0O0, 20, ExifInterface.OooO00o, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, -34, ExifInterface.OooO0oo, 49, -2, 24, 13, 99, -116, O0O00O.OooO00o, ExifInterface.OooO0Oo, -9, 112, 7};
    public static final int OooO0Oo = 14;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final byte[] f15471OooO0Oo = {0, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, ExifInterface.OooOOo, 56, 72, ExifInterface.OooO0OO, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, ExifInterface.OooOOO, 76, -44, 103, -87, C3571am.f9205k, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, O0O00O.OooO0O0, -127, -104, -77, ExifInterface.OooOOOO, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, ExifInterface.OooO0o, 93, -25, 50, 86, -6, 21, 63, C8027oOO00oo.OooO00o, ExifInterface.OooO0oO, 94, -30, 61, C8027oOO00oo.OooO0O0, ExifInterface.OooOO0O, 64, ExifInterface.OooO0Oo, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, ExifInterface.OooO00o, 126, C3571am.f9202h, -99, C9684lIl.OooO0O0, -33, 122, -114, -119, O0O00O.OooO00o, -101, -74, ExifInterface.OooO0o0, 88, -24, 35, 101, -81, -22, C8027oOO00oo.OooO0OO, 111, -79, -56, 67, ExifInterface.OooO0oo, 84, -4, C3571am.f9204j, PublicSuffixDatabase.EXCEPTION_MARKER, 99, -91, -12, 7, 9, C8027oOO00oo.OooO0Oo, 45, 119, -103, -80, ExifInterface.OooOOO0, 70, ExifInterface.OooOO0o, 69, ExifInterface.OooOOOo, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, ExifInterface.OooO, 81, -13, C3587az.f9268l, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, C8026oOO00oOo.OooO00o, 36, 108, -76, ExifInterface.OooOO0, 82, -10, 1, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, ExifInterface.OooOOo, 56, 72, ExifInterface.OooO0OO, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, ExifInterface.OooOOO, 76, -44, 103, -87, C3571am.f9205k, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, O0O00O.OooO0O0, -127, -104, -77, ExifInterface.OooOOOO, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, ExifInterface.OooO0o, 93, -25, 50, 86, -6, 21, 63, C8027oOO00oo.OooO00o, ExifInterface.OooO0oO, 94, -30, 61, C8027oOO00oo.OooO0O0, ExifInterface.OooOO0O, 64, ExifInterface.OooO0Oo, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, ExifInterface.OooO00o, 126, C3571am.f9202h, -99, C9684lIl.OooO0O0, -33, 122, -114, -119, O0O00O.OooO00o, -101, -74, ExifInterface.OooO0o0, 88, -24, 35, 101, -81, -22, C8027oOO00oo.OooO0OO, 111, -79, -56, 67, ExifInterface.OooO0oo, 84, -4, C3571am.f9204j, PublicSuffixDatabase.EXCEPTION_MARKER, 99, -91, -12, 7, 9, C8027oOO00oo.OooO0Oo, 45, 119, -103, -80, ExifInterface.OooOOO0, 70, ExifInterface.OooOO0o, 69, ExifInterface.OooOOOo, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, ExifInterface.OooO, 81, -13, C3587az.f9268l, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, C8026oOO00oOo.OooO00o, 36, 108, -76, ExifInterface.OooOO0, 82, -10, 1};
    public static final byte[] OooO0o = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, C3571am.f9202h, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, ExifInterface.OooOOO0, 84, 123, -108, 50, -90, ExifInterface.OooO0o, 35, 61, -18, 76, -107, 11, 66, -6, ExifInterface.OooO0oO, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, C8027oOO00oo.OooO0OO, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, ExifInterface.OooO0OO, -85, 0, -116, C9684lIl.OooO0O0, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, ExifInterface.OooOO0o, 63, 15, 2, ExifInterface.OooO0o0, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, C8027oOO00oo.OooO00o, 79, 103, -36, -22, -105, -14, ExifInterface.OooOOOo, ExifInterface.OooOOOO, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, C8026oOO00oOo.OooO00o, 117, -33, 110, C8027oOO00oo.OooO0O0, -15, 26, 113, 29, 41, ExifInterface.OooO0oo, -119, 111, -73, 98, C3587az.f9268l, -86, 24, -66, C8027oOO00oo.OooO0Oo, -4, 86, 62, 75, ExifInterface.OooO, -46, 121, 32, -102, -37, ExifInterface.OooO0Oo, -2, 120, ExifInterface.OooOOO, 90, -12, C3571am.f9204j, -35, -88, 51, -120, 7, ExifInterface.OooOO0, 49, -79, 18, 16, 89, 39, O0O00O.OooO00o, -20, 95, 96, 81, O0O00O.OooO0O0, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, ExifInterface.OooOO0O, -100, -17, -96, C3571am.f9205k, 59, 77, -82, ExifInterface.OooO00o, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, ExifInterface.OooOOo, 105, 20, 99, 85, PublicSuffixDatabase.EXCEPTION_MARKER, 12, 125};
    public static final int OooO0o0 = 64;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final byte[] f15472OooO0o0 = {99, 124, 119, 123, -14, 107, 111, ExifInterface.OooO0oo, 48, 1, 103, 43, -2, -41, -85, 118, ExifInterface.OooOO0o, C3571am.f9202h, ExifInterface.OooOO0O, 125, -6, 89, C8027oOO00oo.OooO0O0, -16, -83, -44, -94, -81, -100, -92, 114, ExifInterface.OooO0Oo, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, ExifInterface.OooO0OO, 49, 21, 4, ExifInterface.OooOO0, 35, ExifInterface.OooO0oO, 24, -106, 5, -102, 7, 18, O0O00O.OooO00o, -30, -21, 39, -78, 117, 9, -125, 44, 26, C8027oOO00oo.OooO0Oo, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, ExifInterface.OooOOO0, -66, 57, 74, 76, 88, ExifInterface.OooOOOo, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, O0O00O.OooO0O0, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, C9684lIl.OooO0O0, -74, -38, PublicSuffixDatabase.EXCEPTION_MARKER, 16, -1, -13, -46, ExifInterface.OooOOO, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, ExifInterface.OooO00o, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, C3571am.f9205k, 50, 58, 10, 73, 6, 36, 92, ExifInterface.OooO0o, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, C8027oOO00oo.OooO0OO, 46, C8026oOO00oOo.OooO00o, -90, -76, ExifInterface.OooO, -24, -35, 116, C3571am.f9204j, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, C3587az.f9268l, 97, 53, 87, -71, -122, ExifInterface.OooO0o0, 29, -98, ExifInterface.OooOOo, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, ExifInterface.OooOOOO, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, C8027oOO00oo.OooO00o, -103, 45, 15, -80, 84, -69, 22};

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15473OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f15474OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15475OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15476OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[][] f15477OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f15478OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f15479OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15480OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f15481OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long f15482OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public long f15483OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public long f15484OooO0o0;

    public IIL1() {
        this(128);
    }

    public IIL1(int i) {
        if (i == 128) {
            this.f15473OooO00o = 32;
            this.f15474OooO00o = 4294967295L;
            this.f15476OooO00o = f15470OooO00o[0];
            this.f15480OooO0O0 = OooO0O0[0];
        } else if (i == 160) {
            this.f15473OooO00o = 40;
            this.f15474OooO00o = 1099511627775L;
            this.f15476OooO00o = f15470OooO00o[1];
            this.f15480OooO0O0 = OooO0O0[1];
        } else if (i == 192) {
            this.f15473OooO00o = 48;
            this.f15474OooO00o = C6440l1I.OooO0OO;
            this.f15476OooO00o = f15470OooO00o[2];
            this.f15480OooO0O0 = OooO0O0[2];
        } else if (i == 224) {
            this.f15473OooO00o = 56;
            this.f15474OooO00o = 72057594037927935L;
            this.f15476OooO00o = f15470OooO00o[3];
            this.f15480OooO0O0 = OooO0O0[3];
        } else if (i == 256) {
            this.f15473OooO00o = 64;
            this.f15474OooO00o = -1;
            this.f15476OooO00o = f15470OooO00o[4];
            this.f15480OooO0O0 = OooO0O0[4];
        } else {
            throw new IllegalArgumentException("unknown blocksize to Rijndael");
        }
        this.f15481OooO0OO = i;
    }

    private byte OooO00o(int i) {
        if (i != 0) {
            return f15471OooO0Oo[(OooO0OO[i] & 255) + 25];
        }
        return 0;
    }

    private long OooO00o(long j, int i) {
        return ((j << (this.f15473OooO00o - i)) | (j >>> i)) & this.f15474OooO00o;
    }

    private long OooO00o(long j, byte[] bArr) {
        long j2 = 0;
        for (int i = 0; i < this.f15473OooO00o; i += 8) {
            j2 |= ((long) (bArr[(int) ((j >> i) & 255)] & 255)) << i;
        }
        return j2;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    private void OooO00o() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < this.f15473OooO00o; i += 8) {
            int i2 = (int) ((this.f15479OooO0O0 >> i) & 255);
            int i3 = (int) ((this.f15482OooO0OO >> i) & 255);
            int i4 = (int) ((this.f15483OooO0Oo >> i) & 255);
            int i5 = (int) ((this.f15484OooO0o0 >> i) & 255);
            int i6 = -1;
            int i7 = i2 != 0 ? OooO0OO[i2 & 255] & 255 : -1;
            int i8 = i3 != 0 ? OooO0OO[i3 & 255] & 255 : -1;
            int i9 = i4 != 0 ? OooO0OO[i4 & 255] & 255 : -1;
            if (i5 != 0) {
                i6 = OooO0OO[i5 & 255] & 255;
            }
            j |= ((long) ((((OooO0o(i7) ^ OooO0Oo(i8)) ^ OooO0o0(i9)) ^ OooO0OO(i6)) & 255)) << i;
            j2 |= ((long) ((((OooO0o(i8) ^ OooO0Oo(i9)) ^ OooO0o0(i6)) ^ OooO0OO(i7)) & 255)) << i;
            j3 |= ((long) ((((OooO0o(i9) ^ OooO0Oo(i6)) ^ OooO0o0(i7)) ^ OooO0OO(i8)) & 255)) << i;
            j4 |= ((long) ((((OooO0o(i6) ^ OooO0Oo(i7)) ^ OooO0o0(i8)) ^ OooO0OO(i9)) & 255)) << i;
        }
        this.f15479OooO0O0 = j;
        this.f15482OooO0OO = j2;
        this.f15483OooO0Oo = j3;
        this.f15484OooO0o0 = j4;
    }

    private void OooO00o(byte[] bArr) {
        this.f15482OooO0OO = OooO00o(this.f15482OooO0OO, bArr[1]);
        this.f15483OooO0Oo = OooO00o(this.f15483OooO0Oo, bArr[2]);
        this.f15484OooO0o0 = OooO00o(this.f15484OooO0o0, bArr[3]);
    }

    private void OooO00o(byte[] bArr, int i) {
        for (int i2 = 0; i2 != this.f15473OooO00o; i2 += 8) {
            int i3 = i + 1;
            bArr[i] = (byte) ((int) (this.f15479OooO0O0 >> i2));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) (this.f15482OooO0OO >> i2));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (this.f15483OooO0Oo >> i2));
            i = i5 + 1;
            bArr[i5] = (byte) ((int) (this.f15484OooO0o0 >> i2));
        }
    }

    private void OooO00o(long[] jArr) {
        this.f15479OooO0O0 ^= jArr[0];
        this.f15482OooO0OO ^= jArr[1];
        this.f15483OooO0Oo ^= jArr[2];
        this.f15484OooO0o0 ^= jArr[3];
    }

    private void OooO00o(long[][] jArr) {
        OooO00o(jArr[this.f15478OooO0O0]);
        OooO0O0(OooO0o);
        OooO00o(this.f15480OooO0O0);
        for (int i = this.f15478OooO0O0 - 1; i > 0; i--) {
            OooO00o(jArr[i]);
            OooO00o();
            OooO0O0(OooO0o);
            OooO00o(this.f15480OooO0O0);
        }
        OooO00o(jArr[0]);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private long[][] m15375OooO00o(byte[] bArr) {
        int i;
        int i2;
        int i3 = 8;
        int length = bArr.length * 8;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance(long.class, 15, 4);
        int i4 = 4;
        if (length == 128) {
            i = 4;
        } else if (length == 160) {
            i = 5;
        } else if (length == 192) {
            i = 6;
        } else if (length == 224) {
            i = 7;
        } else if (length == 256) {
            i = 8;
        } else {
            throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
        }
        this.f15478OooO0O0 = length >= this.f15481OooO0OO ? i + 6 : (this.f15473OooO00o / 8) + 6;
        char c = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < bArr.length) {
            bArr2[i5 % 4][i5 / 4] = bArr[i6];
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < i && i8 < (this.f15478OooO0O0 + 1) * (this.f15473OooO00o / 8)) {
            int i9 = 0;
            while (i9 < i4) {
                int i10 = this.f15473OooO00o;
                long[] jArr2 = jArr[i8 / (i10 / 8)];
                jArr2[i9] = (((long) (bArr2[i9][i7] & 255)) << ((i8 * 8) % i10)) | jArr2[i9];
                i9++;
                i4 = 4;
            }
            i7++;
            i8++;
            i4 = 4;
        }
        int i11 = 0;
        while (i8 < (this.f15478OooO0O0 + 1) * (this.f15473OooO00o / i3)) {
            int i12 = 0;
            while (i12 < 4) {
                byte[] bArr3 = bArr2[i12];
                i12++;
                bArr3[c] = (byte) (bArr3[c] ^ f15472OooO0o0[bArr2[i12 % 4][i - 1] & 255]);
            }
            byte[] bArr4 = bArr2[c];
            int i13 = i11 + 1;
            bArr4[c] = (byte) (OooO00o[i11] ^ bArr4[c]);
            int i14 = 1;
            if (i <= 6) {
                while (i14 < i) {
                    for (int i15 = 0; i15 < 4; i15++) {
                        byte[] bArr5 = bArr2[i15];
                        bArr5[i14] = (byte) (bArr5[i14] ^ bArr2[i15][i14 - 1]);
                    }
                    i14++;
                }
            } else {
                while (true) {
                    i2 = 4;
                    if (i14 >= 4) {
                        break;
                    }
                    int i16 = 0;
                    while (i16 < i2) {
                        byte[] bArr6 = bArr2[i16];
                        bArr6[i14] = (byte) (bArr6[i14] ^ bArr2[i16][i14 - 1]);
                        i16++;
                        i2 = 4;
                    }
                    i14++;
                }
                for (int i17 = 0; i17 < 4; i17++) {
                    byte[] bArr7 = bArr2[i17];
                    bArr7[4] = (byte) (bArr7[4] ^ f15472OooO0o0[bArr2[i17][3] & 255]);
                }
                int i18 = 5;
                while (i18 < i) {
                    int i19 = 0;
                    while (i19 < i2) {
                        byte[] bArr8 = bArr2[i19];
                        bArr8[i18] = (byte) (bArr8[i18] ^ bArr2[i19][i18 - 1]);
                        i19++;
                        i2 = 4;
                    }
                    i18++;
                    i2 = 4;
                }
            }
            int i20 = 0;
            while (i20 < i && i8 < (this.f15478OooO0O0 + 1) * (this.f15473OooO00o / i3)) {
                for (int i21 = 0; i21 < 4; i21++) {
                    int i22 = this.f15473OooO00o;
                    long[] jArr3 = jArr[i8 / (i22 / 8)];
                    jArr3[i21] = (((long) (bArr2[i21][i20] & 255)) << ((i8 * 8) % i22)) | jArr3[i21];
                }
                i20++;
                i8++;
                i3 = 8;
            }
            i11 = i13;
            c = 0;
            i3 = 8;
        }
        return jArr;
    }

    private byte OooO0O0(int i) {
        if (i != 0) {
            return f15471OooO0Oo[(OooO0OO[i] & 255) + 1];
        }
        return 0;
    }

    private void OooO0O0() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < this.f15473OooO00o; i += 8) {
            int i2 = (int) ((this.f15479OooO0O0 >> i) & 255);
            int i3 = (int) ((this.f15482OooO0OO >> i) & 255);
            int i4 = (int) ((this.f15483OooO0Oo >> i) & 255);
            int i5 = (int) ((this.f15484OooO0o0 >> i) & 255);
            j |= ((long) ((((OooO00o(i2) ^ OooO0O0(i3)) ^ i4) ^ i5) & 255)) << i;
            j2 |= ((long) ((((OooO00o(i3) ^ OooO0O0(i4)) ^ i5) ^ i2) & 255)) << i;
            j3 |= ((long) ((((OooO00o(i4) ^ OooO0O0(i5)) ^ i2) ^ i3) & 255)) << i;
            j4 |= ((long) ((((OooO00o(i5) ^ OooO0O0(i2)) ^ i3) ^ i4) & 255)) << i;
        }
        this.f15479OooO0O0 = j;
        this.f15482OooO0OO = j2;
        this.f15483OooO0Oo = j3;
        this.f15484OooO0o0 = j4;
    }

    private void OooO0O0(byte[] bArr) {
        this.f15479OooO0O0 = OooO00o(this.f15479OooO0O0, bArr);
        this.f15482OooO0OO = OooO00o(this.f15482OooO0OO, bArr);
        this.f15483OooO0Oo = OooO00o(this.f15483OooO0Oo, bArr);
        this.f15484OooO0o0 = OooO00o(this.f15484OooO0o0, bArr);
    }

    private void OooO0O0(byte[] bArr, int i) {
        int i2 = i + 1;
        this.f15479OooO0O0 = (long) (bArr[i] & 255);
        int i3 = i2 + 1;
        this.f15482OooO0OO = (long) (bArr[i2] & 255);
        int i4 = i3 + 1;
        this.f15483OooO0Oo = (long) (bArr[i3] & 255);
        int i5 = i4 + 1;
        this.f15484OooO0o0 = (long) (bArr[i4] & 255);
        for (int i6 = 8; i6 != this.f15473OooO00o; i6 += 8) {
            int i7 = i5 + 1;
            this.f15479OooO0O0 |= ((long) (bArr[i5] & 255)) << i6;
            int i8 = i7 + 1;
            this.f15482OooO0OO |= ((long) (bArr[i7] & 255)) << i6;
            int i9 = i8 + 1;
            this.f15483OooO0Oo |= ((long) (bArr[i8] & 255)) << i6;
            i5 = i9 + 1;
            this.f15484OooO0o0 |= ((long) (bArr[i9] & 255)) << i6;
        }
    }

    private void OooO0O0(long[][] jArr) {
        OooO00o(jArr[0]);
        for (int i = 1; i < this.f15478OooO0O0; i++) {
            OooO0O0(f15472OooO0o0);
            OooO00o(this.f15476OooO00o);
            OooO0O0();
            OooO00o(jArr[i]);
        }
        OooO0O0(f15472OooO0o0);
        OooO00o(this.f15476OooO00o);
        OooO00o(jArr[this.f15478OooO0O0]);
    }

    private byte OooO0OO(int i) {
        if (i >= 0) {
            return f15471OooO0Oo[i + 199];
        }
        return 0;
    }

    private byte OooO0Oo(int i) {
        if (i >= 0) {
            return f15471OooO0Oo[i + 104];
        }
        return 0;
    }

    private byte OooO0o(int i) {
        if (i >= 0) {
            return f15471OooO0Oo[i + 223];
        }
        return 0;
    }

    private byte OooO0o0(int i) {
        if (i >= 0) {
            return f15471OooO0Oo[i + 238];
        }
        return 0;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15376OooO00o() {
        return this.f15473OooO00o / 2;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f15477OooO00o != null) {
            int i3 = this.f15473OooO00o;
            if ((i3 / 2) + i > bArr.length) {
                throw new DataLengthException("input buffer too short");
            } else if ((i3 / 2) + i2 <= bArr2.length) {
                boolean z = this.f15475OooO00o;
                OooO0O0(bArr, i);
                long[][] jArr = this.f15477OooO00o;
                if (z) {
                    OooO0O0(jArr);
                } else {
                    OooO00o(jArr);
                }
                OooO00o(bArr2, i2);
                return this.f15473OooO00o / 2;
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new IllegalStateException("Rijndael engine not initialised");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15377OooO00o() {
        return "Rijndael";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            this.f15477OooO00o = m15375OooO00o(((C6642li1LI) r4).OooO00o());
            this.f15475OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to Rijndael init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
