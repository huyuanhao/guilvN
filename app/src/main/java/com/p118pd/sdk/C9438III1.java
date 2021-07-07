package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.丨I丨II1  reason: invalid class name and case insensitive filesystem */
public class C9438III1 implements li1l11I1 {
    public static final int OooO00o = 16;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f22983OooO00o = {-42, -112, -23, -2, -52, ExifInterface.OooOOo, 61, -73, 22, -74, 20, ExifInterface.OooO0o, 40, -5, 44, 5, 43, 103, -102, 118, ExifInterface.OooO00o, -66, 4, ExifInterface.OooO0oO, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, ExifInterface.OooOOOo, -84, 98, -28, -77, C8026oOO00oOo.OooO00o, -87, ExifInterface.OooOO0O, 8, -24, -107, O0O00O.OooO00o, -33, -108, -6, 117, -113, 63, -90, C8027oOO00oo.OooO0O0, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, C3587az.f9268l, 94, 99, 88, -47, -94, C8027oOO00oo.OooO0OO, 34, 124, 59, 1, PublicSuffixDatabase.EXCEPTION_MARKER, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, ExifInterface.OooOO0, 56, -75, -93, -9, -14, ExifInterface.OooOOOO, -7, 97, 21, -95, C3571am.f9205k, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, C3571am.f9202h, 102, ExifInterface.OooOO0o, 96, ExifInterface.OooO0Oo, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, C8027oOO00oo.OooO0Oo, -81, -110, -69, -35, C9684lIl.OooO0O0, O0O00O.OooO0O0, 17, -39, 92, C8027oOO00oo.OooO00o, C3571am.f9204j, 16, 90, ExifInterface.OooO0OO, 10, ExifInterface.OooO0o0, 49, -120, -91, ExifInterface.OooOOO, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, ExifInterface.OooO0oo, 110, ExifInterface.OooO, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, ExifInterface.OooOOO0, 57, 72};
    public static final int[] OooO0OO = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    public static final int[] OooO0Oo = {-1548633402, 1453994832, 1736282519, -1301273892};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f22984OooO00o = new int[4];
    public int[] OooO0O0;

    private int OooO00o(int i) {
        return OooO00o(i, 24) ^ (((OooO00o(i, 2) ^ i) ^ OooO00o(i, 10)) ^ OooO00o(i, 18));
    }

    private int OooO00o(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private int OooO00o(int[] iArr, int i) {
        return OooO0OO((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i) ^ iArr[0];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m21475OooO00o(int[] iArr, int i) {
        int i2 = i + 1;
        int i3 = i + 2;
        int i4 = i + 3;
        iArr[i] = iArr[i] ^ iArr[i4];
        iArr[i4] = iArr[i] ^ iArr[i4];
        iArr[i] = iArr[i4] ^ iArr[i];
        iArr[i2] = iArr[i2] ^ iArr[i3];
        iArr[i3] = iArr[i2] ^ iArr[i3];
        iArr[i2] = iArr[i2] ^ iArr[i3];
    }

    private int[] OooO00o(boolean z, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {AbstractC6464l1l.OooO00o(bArr, 0), AbstractC6464l1l.OooO00o(bArr, 4), AbstractC6464l1l.OooO00o(bArr, 8), AbstractC6464l1l.OooO00o(bArr, 12)};
        int i = iArr2[0];
        int[] iArr3 = OooO0Oo;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z) {
            iArr[0] = iArr4[0] ^ OooO0Oo(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ OooO0OO[0]);
            iArr[1] = iArr4[1] ^ OooO0Oo(((iArr4[2] ^ iArr4[3]) ^ iArr[0]) ^ OooO0OO[1]);
            iArr[2] = iArr4[2] ^ OooO0Oo(((iArr4[3] ^ iArr[0]) ^ iArr[1]) ^ OooO0OO[2]);
            iArr[3] = iArr4[3] ^ OooO0Oo(((iArr[0] ^ iArr[1]) ^ iArr[2]) ^ OooO0OO[3]);
            for (int i2 = 4; i2 < 32; i2++) {
                iArr[i2] = iArr[i2 - 4] ^ OooO0Oo(((iArr[i2 - 3] ^ iArr[i2 - 2]) ^ iArr[i2 - 1]) ^ OooO0OO[i2]);
            }
        } else {
            iArr[31] = iArr4[0] ^ OooO0Oo(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ OooO0OO[0]);
            iArr[30] = iArr4[1] ^ OooO0Oo(((iArr4[2] ^ iArr4[3]) ^ iArr[31]) ^ OooO0OO[1]);
            iArr[29] = iArr4[2] ^ OooO0Oo(((iArr4[3] ^ iArr[31]) ^ iArr[30]) ^ OooO0OO[2]);
            iArr[28] = iArr4[3] ^ OooO0Oo(((iArr[30] ^ iArr[31]) ^ iArr[29]) ^ OooO0OO[3]);
            for (int i3 = 27; i3 >= 0; i3--) {
                iArr[i3] = iArr[i3 + 4] ^ OooO0Oo(((iArr[i3 + 3] ^ iArr[i3 + 2]) ^ iArr[i3 + 1]) ^ OooO0OO[31 - i3]);
            }
        }
        return iArr;
    }

    private int OooO0O0(int i) {
        return OooO00o(i, 23) ^ (OooO00o(i, 13) ^ i);
    }

    private int OooO0O0(int[] iArr, int i) {
        return OooO0OO((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i) ^ iArr[1];
    }

    private int OooO0OO(int i) {
        return OooO00o(OooO0o0(i));
    }

    private int OooO0OO(int[] iArr, int i) {
        return OooO0OO((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i) ^ iArr[2];
    }

    private int OooO0Oo(int i) {
        return OooO0O0(OooO0o0(i));
    }

    private int OooO0Oo(int[] iArr, int i) {
        return OooO0OO((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i) ^ iArr[3];
    }

    private int OooO0o0(int i) {
        byte[] bArr = f22983OooO00o;
        return (bArr[i & 255] & 255) | ((bArr[(i >> 24) & 255] & 255) << 24) | ((bArr[(i >> 16) & 255] & 255) << 16) | ((bArr[(i >> 8) & 255] & 255) << 8);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.OooO0O0 == null) {
            throw new IllegalStateException("SM4 not initialised");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            this.f22984OooO00o[0] = AbstractC6464l1l.OooO00o(bArr, i);
            this.f22984OooO00o[1] = AbstractC6464l1l.OooO00o(bArr, i + 4);
            this.f22984OooO00o[2] = AbstractC6464l1l.OooO00o(bArr, i + 8);
            this.f22984OooO00o[3] = AbstractC6464l1l.OooO00o(bArr, i + 12);
            for (int i3 = 0; i3 < 32; i3 += 4) {
                int[] iArr = this.f22984OooO00o;
                iArr[0] = OooO00o(iArr, this.OooO0O0[i3]);
                int[] iArr2 = this.f22984OooO00o;
                iArr2[1] = OooO0O0(iArr2, this.OooO0O0[i3 + 1]);
                int[] iArr3 = this.f22984OooO00o;
                iArr3[2] = OooO0OO(iArr3, this.OooO0O0[i3 + 2]);
                int[] iArr4 = this.f22984OooO00o;
                iArr4[3] = OooO0Oo(iArr4, this.OooO0O0[i3 + 3]);
            }
            m21475OooO00o(this.f22984OooO00o, 0);
            AbstractC6464l1l.OooO00o(this.f22984OooO00o[0], bArr2, i2);
            AbstractC6464l1l.OooO00o(this.f22984OooO00o[1], bArr2, i2 + 4);
            AbstractC6464l1l.OooO00o(this.f22984OooO00o[2], bArr2, i2 + 8);
            AbstractC6464l1l.OooO00o(this.f22984OooO00o[3], bArr2, i2 + 12);
            return 16;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21476OooO00o() {
        return "SM4";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) throws IllegalArgumentException {
        if (r4 instanceof C6642li1LI) {
            byte[] OooO00o2 = ((C6642li1LI) r4).OooO00o();
            if (OooO00o2.length == 16) {
                this.OooO0O0 = OooO00o(z, OooO00o2);
                return;
            }
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
