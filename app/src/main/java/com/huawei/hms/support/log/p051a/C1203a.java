package com.huawei.hms.support.log.p051a;

import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.AbstractC6339ill;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.C8026oOO00oOo;
import com.p118pd.sdk.C8027oOO00oo;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.huawei.hms.support.log.a.a */
public final class C1203a {

    /* renamed from: a */
    public static final char[] f1306a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', AbstractC6339ill.OooO0OO, 'M', 'N', 'O', 'P', 'Q', AbstractC6339ill.OooO0o0, 'S', 'T', AbstractC6339ill.OooO0Oo, 'V', 'W', 'X', 'Y', AbstractC6339ill.OooO00o, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', C7490o0OoOO0o.OooO00o};

    /* renamed from: b */
    public static final byte[] f1307b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, C3587az.f9268l, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, C8027oOO00oo.OooO0Oo, C8026oOO00oOo.OooO00o, 29, 30, C3571am.f9204j, 32, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 35, 36, C8027oOO00oo.OooO0OO, 38, 39, 40, 41, ExifInterface.OooO00o, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: a */
    public static String m1321a(byte[] bArr) {
        return m1322a(bArr, bArr.length);
    }

    /* renamed from: b */
    public static int m1324b(String str) {
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt > 255 || f1307b[charAt] < 0) {
                length--;
            }
        }
        return length;
    }

    /* renamed from: a */
    public static String m1322a(byte[] bArr, int i) {
        boolean z;
        char[] cArr = new char[(((i + 2) / 3) * 4)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = (bArr[i2] & 255) << 8;
            int i5 = i2 + 1;
            boolean z2 = true;
            if (i5 < i) {
                i4 |= bArr[i5] & 255;
                z = true;
            } else {
                z = false;
            }
            int i6 = i4 << 8;
            int i7 = i2 + 2;
            if (i7 < i) {
                i6 |= bArr[i7] & 255;
            } else {
                z2 = false;
            }
            int i8 = 64;
            cArr[i3 + 3] = f1306a[z2 ? i6 & 63 : 64];
            int i9 = i6 >> 6;
            int i10 = i3 + 2;
            char[] cArr2 = f1306a;
            if (z) {
                i8 = i9 & 63;
            }
            cArr[i10] = cArr2[i8];
            int i11 = i9 >> 6;
            char[] cArr3 = f1306a;
            cArr[i3 + 1] = cArr3[i11 & 63];
            cArr[i3 + 0] = cArr3[(i11 >> 6) & 63];
            i2 += 3;
            i3 += 4;
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m1323a(String str) {
        byte b;
        int b2 = m1324b(str);
        int i = (b2 / 4) * 3;
        int i2 = b2 % 4;
        if (i2 == 3) {
            i += 2;
        }
        if (i2 == 2) {
            i++;
        }
        byte[] bArr = new byte[i];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (charAt > 255) {
                b = -1;
            } else {
                b = f1307b[charAt];
            }
            if (b >= 0) {
                i5 += 6;
                i4 = (i4 << 6) | b;
                if (i5 >= 8) {
                    i5 -= 8;
                    bArr[i3] = (byte) (255 & (i4 >> i5));
                    i3++;
                }
            }
        }
        return i3 != i ? new byte[0] : bArr;
    }
}
