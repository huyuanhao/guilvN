package com.huawei.hms.p037c;

/* renamed from: com.huawei.hms.c.d */
public final class C1134d {

    /* renamed from: a */
    public static final char[] f1170a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final char[] f1171b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static char[] m1066a(byte[] bArr, boolean z) {
        return m1067a(bArr, z ? f1171b : f1170a);
    }

    /* renamed from: b */
    public static String m1068b(byte[] bArr, boolean z) {
        return new String(m1066a(bArr, z));
    }

    /* renamed from: a */
    public static char[] m1067a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }
}
