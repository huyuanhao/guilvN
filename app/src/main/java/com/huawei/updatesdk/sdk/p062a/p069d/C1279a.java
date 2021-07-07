package com.huawei.updatesdk.sdk.p062a.p069d;

import com.p118pd.sdk.AbstractC6339ill;
import com.p118pd.sdk.C7490o0OoOO0o;

/* renamed from: com.huawei.updatesdk.sdk.a.d.a */
public class C1279a {

    /* renamed from: a */
    public static char[] f1428a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', AbstractC6339ill.OooO0OO, 'M', 'N', 'O', 'P', 'Q', AbstractC6339ill.OooO0o0, 'S', 'T', AbstractC6339ill.OooO0Oo, 'V', 'W', 'X', 'Y', AbstractC6339ill.OooO00o, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', C7490o0OoOO0o.OooO00o};

    /* renamed from: a */
    public static String m1585a(byte[] bArr) {
        return m1586a(bArr, bArr.length);
    }

    /* renamed from: a */
    public static String m1586a(byte[] bArr, int i) {
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
            cArr[i3 + 3] = f1428a[z2 ? i6 & 63 : 64];
            int i9 = i6 >> 6;
            int i10 = i3 + 2;
            char[] cArr2 = f1428a;
            if (z) {
                i8 = i9 & 63;
            }
            cArr[i10] = cArr2[i8];
            int i11 = i9 >> 6;
            char[] cArr3 = f1428a;
            cArr[i3 + 1] = cArr3[i11 & 63];
            cArr[i3 + 0] = cArr3[(i11 >> 6) & 63];
            i2 += 3;
            i3 += 4;
        }
        return new String(cArr);
    }
}
