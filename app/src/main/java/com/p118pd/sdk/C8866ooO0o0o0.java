package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ooO0o0o0  reason: case insensitive filesystem */
public class C8866ooO0o0o0 {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean[] m20504OooO00o(byte[] bArr) {
        boolean[] zArr = new boolean[(bArr.length * 8)];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = 0;
            while (i3 <= 7) {
                int i4 = i + 1;
                boolean z = true;
                if (((bArr[i2] & (1 << i3)) >> i3) != 1) {
                    z = false;
                }
                zArr[i] = z;
                i3++;
                i = i4;
            }
        }
        return zArr;
    }

    public static String OooO00o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append((b >> 7) & 1);
            stringBuffer.append((b >> 6) & 1);
            stringBuffer.append((b >> 5) & 1);
            stringBuffer.append((b >> 4) & 1);
            stringBuffer.append((b >> 3) & 1);
            stringBuffer.append((b >> 2) & 1);
            stringBuffer.append((b >> 1) & 1);
            stringBuffer.append(b & 1);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }
}
