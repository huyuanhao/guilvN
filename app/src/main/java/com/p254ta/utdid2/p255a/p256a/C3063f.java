package com.p254ta.utdid2.p255a.p256a;

/* renamed from: com.ta.utdid2.a.a.f */
public class C3063f {

    /* renamed from: com.ta.utdid2.a.a.f$a */
    public static class C3065a {

        /* renamed from: d */
        public int[] f6762d;

        /* renamed from: x */
        public int f6763x;

        /* renamed from: y */
        public int f6764y;

        public C3065a() {
            this.f6762d = new int[256];
        }
    }

    /* renamed from: a */
    public static byte[] m7130a(byte[] bArr) {
        C3065a a;
        if (bArr == null || (a = m7129a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return m7131a(bArr, a);
    }

    /* renamed from: a */
    public static C3065a m7129a(String str) {
        if (str == null) {
            return null;
        }
        C3065a aVar = new C3065a();
        for (int i = 0; i < 256; i++) {
            aVar.f6762d[i] = i;
        }
        aVar.f6763x = 0;
        aVar.f6764y = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            try {
                i3 = ((str.charAt(i2) + aVar.f6762d[i4]) + i3) % 256;
                int i5 = aVar.f6762d[i4];
                aVar.f6762d[i4] = aVar.f6762d[i3];
                aVar.f6762d[i3] = i5;
                i2 = (i2 + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static byte[] m7131a(byte[] bArr, C3065a aVar) {
        if (bArr == null || aVar == null) {
            return null;
        }
        int i = aVar.f6763x;
        int i2 = aVar.f6764y;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            int[] iArr = aVar.f6762d;
            i2 = (iArr[i] + i2) % 256;
            int i4 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i4;
            bArr[i3] = (byte) (iArr[(iArr[i] + iArr[i2]) % 256] ^ bArr[i3]);
        }
        aVar.f6763x = i;
        aVar.f6764y = i2;
        return bArr;
    }
}
