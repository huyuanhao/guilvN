package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.pd.sdk.LLli1i */
public class LLli1i implements lIL1i11, AbstractC6186iLi1 {
    public static final int OooO0Oo = 16;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final byte[] f16508OooO0Oo = {41, 46, 67, ExifInterface.OooOO0O, -94, ExifInterface.OooO0OO, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, ExifInterface.OooO0Oo, ExifInterface.OooOO0, 115, -116, -104, -109, 43, -39, C9684lIl.OooO0O0, 76, C3571am.f9202h, ExifInterface.OooOO0o, 30, -101, 87, 60, -3, -44, C3571am.f9205k, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, ExifInterface.OooO0o, 16, -119, 11, 34, 95, PublicSuffixDatabase.EXCEPTION_MARKER, O0O00O.OooO00o, O0O00O.OooO0O0, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, ExifInterface.OooO00o, -84, 86, -86, ExifInterface.OooO, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, ExifInterface.OooOOOo, 101, -26, 45, -88, 2, C8027oOO00oo.OooO0Oo, 96, C8027oOO00oo.OooO0OO, -83, -82, -80, -71, -10, C8026oOO00oOo.OooO00o, 70, 97, 105, 52, 64, 126, 15, 85, C8027oOO00oo.OooO0O0, -93, 35, -35, 81, -81, 58, ExifInterface.OooO0oO, 92, -7, ExifInterface.OooOOOO, -70, ExifInterface.OooO0oo, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, ExifInterface.OooOOO, -12, C8027oOO00oo.OooO00o, -127, 77, 82, 106, -36, 55, -56, 108, ExifInterface.OooO0o0, -85, -6, 36, ExifInterface.OooOOo, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, ExifInterface.OooOOO0, -43, -2, 59, 0, 29, 57, -14, -17, -73, C3587az.f9268l, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, C3571am.f9204j, 26, -37, -103, -115, 51, -97, 17, -125, 20};
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16509OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16510OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f16511OooO0OO;

    public LLli1i() {
        this.f16509OooO00o = new byte[48];
        this.f16510OooO0O0 = new byte[16];
        this.f16511OooO0OO = new byte[16];
        reset();
    }

    public LLli1i(LLli1i lLli1i) {
        this.f16509OooO00o = new byte[48];
        this.f16510OooO0O0 = new byte[16];
        this.f16511OooO0OO = new byte[16];
        OooO00o(lLli1i);
    }

    private void OooO00o(LLli1i lLli1i) {
        byte[] bArr = lLli1i.f16509OooO00o;
        System.arraycopy(bArr, 0, this.f16509OooO00o, 0, bArr.length);
        this.OooO00o = lLli1i.OooO00o;
        byte[] bArr2 = lLli1i.f16510OooO0O0;
        System.arraycopy(bArr2, 0, this.f16510OooO0O0, 0, bArr2.length);
        this.OooO0O0 = lLli1i.OooO0O0;
        byte[] bArr3 = lLli1i.f16511OooO0OO;
        System.arraycopy(bArr3, 0, this.f16511OooO0OO, 0, bArr3.length);
        this.OooO0OO = lLli1i.OooO0OO;
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public int OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        int length = this.f16510OooO0O0.length;
        int i2 = this.OooO0O0;
        byte b = (byte) (length - i2);
        while (true) {
            byte[] bArr2 = this.f16510OooO0O0;
            if (i2 < bArr2.length) {
                bArr2[i2] = b;
                i2++;
            } else {
                OooO0O0(bArr2);
                OooO00o(this.f16510OooO0O0);
                OooO00o(this.f16511OooO0OO);
                System.arraycopy(this.f16509OooO00o, this.OooO00o, bArr, i, 16);
                reset();
                return 16;
            }
        }
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6186iLi1 m16243OooO00o() {
        return new LLli1i(this);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16244OooO00o() {
        return "MD2";
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        OooO00o((LLli1i) r1);
    }

    public void OooO00o(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f16509OooO00o;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr3 = this.f16509OooO00o;
                byte b = (byte) (f16508OooO0Oo[i2] ^ bArr3[i4]);
                bArr3[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return 16;
    }

    public void OooO0O0(byte[] bArr) {
        byte b = this.f16511OooO0OO[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f16511OooO0OO;
            bArr2[i] = (byte) (f16508OooO0Oo[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            b = bArr2[i];
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.OooO00o = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f16509OooO00o;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.OooO0O0 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f16510OooO0O0;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.OooO0OO = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f16511OooO0OO;
            if (i3 != bArr3.length) {
                bArr3[i3] = 0;
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        byte[] bArr = this.f16510OooO0O0;
        int i = this.OooO0O0;
        int i2 = i + 1;
        this.OooO0O0 = i2;
        bArr[i] = b;
        if (i2 == 16) {
            OooO0O0(bArr);
            OooO00o(this.f16510OooO0O0);
            this.OooO0O0 = 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        while (this.OooO0O0 != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > 16) {
            System.arraycopy(bArr, i, this.f16510OooO0O0, 0, 16);
            OooO0O0(this.f16510OooO0O0);
            OooO00o(this.f16510OooO0O0);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
