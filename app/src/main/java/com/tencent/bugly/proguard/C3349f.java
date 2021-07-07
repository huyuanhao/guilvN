package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.f */
public class C3349f {

    /* renamed from: a */
    public static final byte[] f8203a = new byte[0];

    /* renamed from: b */
    public static final char[] f8204b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m8504a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f8204b;
            cArr[i2 + 1] = cArr2[b & 15];
            cArr[i2 + 0] = cArr2[((byte) (b >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
