package com.xiaomi.push;

/* renamed from: com.xiaomi.push.dw */
public class C4369dw {
    /* renamed from: a */
    public static void m12130a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    /* renamed from: a */
    public static byte[] m12131a(String str, byte[] bArr) {
        byte[] a = C4282bc.m11788a(str);
        try {
            m12130a(a);
            return C4475h.m12856a(a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m12132b(String str, byte[] bArr) {
        byte[] a = C4282bc.m11788a(str);
        try {
            m12130a(a);
            return C4475h.m12857b(a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
