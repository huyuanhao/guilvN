package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.pd.sdk.iiI丨  reason: invalid class name and case insensitive filesystem */
public class C6235iiI implements iiIi11 {
    public byte OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17864OooO00o = {-69, 44, 98, O0O00O.OooO0O0, -75, -86, -44, 13, -127, -2, -78, C3571am.f9202h, ExifInterface.OooOOO0, -96, -95, 8, 24, 113, 86, -24, 73, 2, 16, -60, -34, 53, -91, -20, O0O00O.OooO00o, 18, -72, 105, -38, 47, 117, -52, -94, 9, 54, 3, 97, 45, -3, C3571am.f9205k, -35, 5, 67, -112, -83, -56, ExifInterface.OooOOo, -81, 87, -101, 76, ExifInterface.OooO0OO, 81, -82, 80, -123, 60, 10, -28, -13, -100, 38, 35, 83, ExifInterface.OooOO0O, -125, -105, 70, -79, -103, 100, 49, 119, -43, 29, -42, 120, -67, 94, -80, -118, 34, 56, -8, 104, 43, ExifInterface.OooO00o, ExifInterface.OooO0oo, -45, -9, C9684lIl.OooO0O0, 111, -33, 4, -27, -107, 62, C8027oOO00oo.OooO0OO, -122, -90, 11, -113, -15, 36, C3587az.f9268l, -41, 64, -77, ExifInterface.OooOOOo, 126, 6, 21, -102, 77, C8026oOO00oOo.OooO00o, -93, -37, 50, -110, 88, 17, 39, -12, 89, -48, 78, 106, 23, 91, -84, -1, 7, ExifInterface.OooO0Oo, 101, 121, -4, ExifInterface.OooOO0, ExifInterface.OooOOO, 118, 66, 93, -25, 58, 52, 122, 48, 40, 15, 115, 1, -7, -47, -46, 25, -23, -111, -71, 90, -19, C8027oOO00oo.OooO00o, 109, -76, ExifInterface.OooO0oO, -98, -65, 99, -6, C3571am.f9204j, 51, 96, C8027oOO00oo.OooO0O0, -119, -16, -106, 26, 95, -109, 61, 55, 75, -39, -88, ExifInterface.OooO0o0, C8027oOO00oo.OooO0Oo, -10, 57, -117, -73, 12, 32, ExifInterface.OooOOOO, -120, 110, -74, 116, -114, -115, 22, 41, -14, -121, -11, -21, 112, -29, -5, 85, -97, ExifInterface.OooO, 68, 74, 69, 125, -30, 107, 92, 108, 102, -87, -116, -18, -124, 19, -89, 30, -99, -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, PublicSuffixDatabase.EXCEPTION_MARKER, -17, -22, -66, ExifInterface.OooOO0o, 114, 79, 82, -104, 63, ExifInterface.OooO0o, 20, 123, 59, 84};
    public byte OooO0O0 = -66;

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(long j) {
        OooO00o(AbstractC6464l1l.OooO00o(j));
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(byte[] bArr) {
        for (byte b : bArr) {
            byte[] bArr2 = this.f17864OooO00o;
            byte b2 = this.OooO0O0;
            byte b3 = this.OooO00o;
            byte b4 = bArr2[(b2 + bArr2[b3 & 255] + b) & 255];
            this.OooO0O0 = b4;
            byte b5 = bArr2[b3 & 255];
            bArr2[b3 & 255] = bArr2[b4 & 255];
            bArr2[b4 & 255] = b5;
            this.OooO00o = (byte) ((b3 + 1) & 255);
        }
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(byte[] bArr, int i, int i2) {
        synchronized (this.f17864OooO00o) {
            int i3 = i2 + i;
            while (i != i3) {
                byte b = this.f17864OooO00o[(this.OooO0O0 + this.f17864OooO00o[this.OooO00o & 255]) & 255];
                this.OooO0O0 = b;
                bArr[i] = this.f17864OooO00o[(this.f17864OooO00o[this.f17864OooO00o[b & 255] & 255] + 1) & 255];
                byte b2 = this.f17864OooO00o[this.OooO00o & 255];
                this.f17864OooO00o[this.OooO00o & 255] = this.f17864OooO00o[b & 255];
                this.f17864OooO00o[b & 255] = b2;
                this.OooO00o = (byte) ((this.OooO00o + 1) & 255);
                i++;
            }
        }
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO0O0(byte[] bArr) {
        OooO00o(bArr, 0, bArr.length);
    }
}
