package com.qiyukf.basesdk.p138c.p142c;

/* renamed from: com.qiyukf.basesdk.c.c.a */
public final class C1848a {

    /* renamed from: a */
    public static final char[] f3402a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final int[] f3403b = {60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0};

    /* renamed from: a */
    public static int m3504a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static String m3505a(byte b) {
        long j = (long) b;
        StringBuilder sb = new StringBuilder(2);
        for (int i = 0; i < 2; i++) {
            sb.append(f3402a[(int) ((j >> f3403b[i + 14]) & 15)]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m3506a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(m3505a(b));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m3507a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int a = m3504a(str.charAt(i2));
            int a2 = m3504a(str.charAt(i2 + 1));
            if (a == -1 || a2 == -1) {
                return null;
            }
            bArr[i] = (byte) ((a << 4) + a2);
        }
        return bArr;
    }
}
