package com.xiaomi.push;

import android.content.Context;

/* renamed from: com.xiaomi.push.af */
public class C4248af {

    /* renamed from: a */
    public static final char[] f11351a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m11633a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 255;
            sb.append(f11351a[i4 >> 4]);
            sb.append(f11351a[i4 & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m11634a(Context context) {
        return C4247ae.f11350a;
    }
}
